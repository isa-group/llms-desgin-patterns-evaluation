package run1;

import original.Stereo;
import original.TV;

public class RemoteControlDemo {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // For TV
        TV tv = new TV();
        Command tvOn = new TurnOnCommand(tv);
        Command tvOff = new TurnOffCommand(tv);
        Command tvChangeChannel = new ChangeChannelCommand(tv);
        Command tvAdjustVolume = new AdjustVolumeCommand(tv);

        remote.setCommand(tvOn, tvOff);
        remote.setChangeChannelCommand(tvChangeChannel);
        remote.setAdjustVolumeCommand(tvAdjustVolume);

        System.out.println("Using Remote on TV:");
        remote.pressOnButton();
        remote.pressChangeChannelButton();
        remote.pressAdjustVolumeButton();
        remote.pressOffButton();

        // For Stereo
        Stereo stereo = new Stereo();
        Command stereoOn = new TurnOnCommand(stereo);
        Command stereoOff = new TurnOffCommand(stereo);
        Command stereoAdjustVolume = new AdjustVolumeCommand(stereo);

        // Reuse the remote for Stereo by changing commands
        remote.setCommand(stereoOn, stereoOff);
        // Change channel command is not applicable for Stereo, adjust volume remains the same
        remote.setAdjustVolumeCommand(stereoAdjustVolume);

        System.out.println("\nUsing Remote on Stereo:");
        remote.pressOnButton();
        remote.pressAdjustVolumeButton();
        remote.pressOffButton();
    }
}
