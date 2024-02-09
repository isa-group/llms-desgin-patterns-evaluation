package run2;
public class CutCommand implements Command {
    private Editor editor;
    private String backup;

    public CutCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        backup = editor.textField.getSelectedText();
        if (backup != null && !backup.isEmpty()) {
            editor.backup(); // Save current state for undo
            String source = editor.textField.getText();
            editor.clipboard = backup;
            editor.textField.setText(cutString(source));
        }
    }

    @Override
    public void undo() {
        if (backup != null) {
            editor.textField.setText(backup);
        }
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}

