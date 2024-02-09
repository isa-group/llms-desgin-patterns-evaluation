package run2;

public class RemoteControl {
    private Command command;

    // Set the command the remote will execute
    public void setCommand(Command command) {
        this.command = command;
    }

    // Executes the command
    public void pressButton() {
        command.execute();
    }
}
