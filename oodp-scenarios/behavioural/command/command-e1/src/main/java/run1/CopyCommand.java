package run1;


public class CopyCommand implements Command {
    private Editor editor;

    public CopyCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.clipboard = editor.textField.getSelectedText();
    }

    @Override
    public void undo() {
        // Copy action does not modify text, so undo might not be needed.
    }
}

