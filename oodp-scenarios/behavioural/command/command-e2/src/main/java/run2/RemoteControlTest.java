package run2;

import original.Device;
import original.Stereo;
import original.TV;

public class RemoteControlTest {
    public static void main(String[] args) {
        // Create the devices
        Device tv = new TV();
        Device stereo = new Stereo();

        // Create the remote control
        RemoteControl remote = new RemoteControl();

        // Turn the TV on and off
        Command tvOn = new TurnOnCommand(tv);
        Command tvOff = new TurnOffCommand(tv);
        remote.setCommand(tvOn); // Set the command to turn the TV on
        remote.pressButton();    // Simulate pressing the button
        remote.setCommand(tvOff); // Set the command to turn the TV off
        remote.pressButton();     // Simulate pressing the button

        // Turn the Stereo on and off
        Command stereoOn = new TurnOnCommand(stereo);
        Command stereoOff = new TurnOffCommand(stereo);
        remote.setCommand(stereoOn); // Set the command to turn the Stereo on
        remote.pressButton();        // Simulate pressing the button
        remote.setCommand(stereoOff); // Set the command to turn the Stereo off
        remote.pressButton();         // Simulate pressing the button
    }
}
