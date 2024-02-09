package run1;

public class RemoteControl2 {
    private Command onCommand;
    private Command offCommand;

    public RemoteControl2() {
    }

    public void setCommands(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void pressOnButton() {
        onCommand.execute();
    }

    public void pressOffButton() {
        offCommand.execute();
    }
}
