package run1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor {
    public JTextArea textField;
    public String clipboard = "";
    private CommandHistory history = new CommandHistory();

    public void init() {
        JFrame frame = new JFrame("Text editor (type & use buttons, Luke!)");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");
        JButton ctrlY = new JButton("Ctrl+Y"); // For redo functionality

        ctrlC.addActionListener(e -> executeCommand(new CopyCommand(this)));
        ctrlX.addActionListener(e -> executeCommand(new CutCommand(this)));
        ctrlV.addActionListener(e -> executeCommand(new PasteCommand(this)));
        ctrlZ.addActionListener(e -> undo());
        ctrlY.addActionListener(e -> redo());

        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        buttons.add(ctrlY); // Add redo button to the UI
        content.add(buttons);

        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        history.executeCommand(command);
    }

    private void undo() {
        history.undo();
    }

    private void redo() {
        history.redo();
    }

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}

