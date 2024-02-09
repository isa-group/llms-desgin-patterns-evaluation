package run1;


public class CutCommand implements Command {
    private Editor editor;
    private String backup;

    public CutCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        backup = editor.textField.getText();
        if (!editor.textField.getSelectedText().isEmpty()) {
            editor.clipboard = editor.textField.getSelectedText();
            editor.textField.setText(cutString(backup));
        }
    }

    @Override
    public void undo() {
        editor.textField.setText(backup);
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}

