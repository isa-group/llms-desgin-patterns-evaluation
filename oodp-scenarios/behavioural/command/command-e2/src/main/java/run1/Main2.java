package run1;

import original.Device;
import original.Stereo;
import original.TV;

public class Main2 {
    
        public static void main(String[] args) {
            // Initialize the remote control
            RemoteControl2 remote = new RemoteControl2();
    
            // Setup for the TV
            Device tv = new TV();
            Command turnTVOn = new TurnOnCommand(tv);
            Command turnTVOff = new TurnOffCommand(tv);
    
            // Setting commands for TV
            remote.setCommands(turnTVOn, turnTVOff);
    
            System.out.println("Using Remote on TV:");
            remote.pressOnButton(); // Should print "TV is now on"
            remote.pressOffButton(); // Should print "TV is now off"
    
            // Setup for the Stereo
            Device stereo = new Stereo();
            Command turnStereoOn = new TurnOnCommand(stereo);
            Command turnStereoOff = new TurnOffCommand(stereo);
    
            // Setting commands for Stereo
            remote.setCommands(turnStereoOn, turnStereoOff);
    
            System.out.println("\nUsing Remote on Stereo:");
            remote.pressOnButton(); // Should print "Stereo is now on"
            remote.pressOffButton(); // Should print "Stereo is now off"
        }
    }
