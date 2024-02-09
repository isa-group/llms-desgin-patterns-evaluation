package run2;

public class PasteCommand implements Command {
    private Editor editor;
    private String backup;

    public PasteCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        backup = editor.textField.getText();
        editor.backup(); // Save current state for undo
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
    }

    @Override
    public void undo() {
        editor.textField.setText(backup);
    }
}
