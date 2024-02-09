package run2;

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
            // Copy command does not modify the text, so undo does nothing.
        }
    
}
