package run2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

public class Editor {
    public JTextArea textField;
    public String clipboard = "";
    private Stack<Command> undoStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

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
        JButton ctrlZ = new JButton("Undo");
        JButton ctrlY = new JButton("Redo"); // Added redo button

        ctrlC.addActionListener(e -> {
            // Implement CopyCommand and its logic
        });

        ctrlX.addActionListener(e -> {
            Command cut = new CutCommand(this);
            executeCommand(cut);
        });

        ctrlV.addActionListener(e -> {
            Command paste = new PasteCommand(this);
            executeCommand(paste);
        });

        ctrlZ.addActionListener(e -> performUndo());

        ctrlY.addActionListener(e -> performRedo()); // Handle redo

        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        buttons.add(ctrlY); // Add redo button
        content.add(buttons);

        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void executeCommand(Command command) {
        command.execute();
        undoStack.push(command);
        redoStack.clear(); // Clear redo stack after new command is executed
    }

    public void performUndo() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    public void performRedo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute(); // Re-execute the command for redo
            undoStack.push(command); // Push it back to undo stack
        }
    }

    public void backup() {
        // Implement backup logic if needed
    }

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}

