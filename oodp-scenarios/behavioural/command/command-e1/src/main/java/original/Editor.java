package original;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor {
    public JTextArea textField;
    public String clipboard;

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
        Editor editor = this;
        String backup = "";

        ctrlC.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                editor.clipboard = editor.textField.getSelectedText();
            }
        });
        ctrlX.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!editor.textField.getSelectedText().isEmpty()) {
                    backup();
                    String source = editor.textField.getText();
                    editor.clipboard = editor.textField.getSelectedText();
                    editor.textField.setText(cutString(source));
                }
            }

            private String cutString(String source) {
                String start = source.substring(0, editor.textField.getSelectionStart());
                String end = source.substring(editor.textField.getSelectionEnd());
                return start + end;
            }

        });
        ctrlV.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (editor.clipboard != null && !editor.clipboard.isEmpty()) {
                    backup();
                    textField.insert(editor.clipboard, editor.textField.getCaretPosition());
                }
            }
        });
        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!editor.textField.getSelectedText().isEmpty()) {
                    backup();
                    String source = editor.textField.getText();
                    editor.clipboard = editor.textField.getSelectedText();
                    editor.textField.setText(cutString(source));
                }
            }

            private String cutString(String source) {
                String start = source.substring(0, editor.textField.getSelectionStart());
                String end = source.substring(editor.textField.getSelectionEnd());
                return start + end;
            }
        });
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void backup() {
        clipboard = textField.getText();
    }

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }

}
