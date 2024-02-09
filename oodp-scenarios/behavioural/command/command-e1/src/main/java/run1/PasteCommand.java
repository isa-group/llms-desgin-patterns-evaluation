package run1;


public class PasteCommand implements Command {
    private Editor editor;
    private String backup;

    public PasteCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        backup = editor.textField.getText();
        if (editor.clipboard != null && !editor.clipboard.isEmpty()) {
            editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        }
    }

    @Override
    public void undo() {
        editor.textField.setText(backup);
    }
}
