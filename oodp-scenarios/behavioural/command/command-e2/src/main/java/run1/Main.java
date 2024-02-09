package run1;

import original.Stereo;
import original.TV;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // Setup for TV
        TV tv = new TV();
        Command tvOn = new TurnOnCommand(tv);
        Command tvOff = new TurnOffCommand(tv);

        remote.setCommand(tvOn, tvOff);

        System.out.println("Using Remote on TV:");
        remote.pressOnButton();  // TV should turn on
        remote.pressOffButton(); // TV should turn off

        // Setup for Stereo
        Stereo stereo = new Stereo();
        Command stereoOn = new TurnOnCommand(stereo);
        Command stereoOff = new TurnOffCommand(stereo);

        // Re-configuring remote for Stereo
        remote.setCommand(stereoOn, stereoOff);

        System.out.println("\nUsing Remote on Stereo:");
        remote.pressOnButton();  // Stereo should turn on
        remote.pressOffButton(); // Stereo should turn off
    }
}
