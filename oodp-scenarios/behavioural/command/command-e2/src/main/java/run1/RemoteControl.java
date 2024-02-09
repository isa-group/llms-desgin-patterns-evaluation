package run1;

public class RemoteControl {
    private Command onCommand;
    private Command offCommand;
    private Command changeChannelCommand;
    private Command adjustVolumeCommand;

    // Constructors and other methods remain the same

    public void setChangeChannelCommand(Command changeChannelCommand) {
        this.changeChannelCommand = changeChannelCommand;
    }

    public void setAdjustVolumeCommand(Command adjustVolumeCommand) {
        this.adjustVolumeCommand = adjustVolumeCommand;
    }

    public void pressChangeChannelButton() {
        changeChannelCommand.execute();
    }

    public void pressAdjustVolumeButton() {
        adjustVolumeCommand.execute();
    }
}
