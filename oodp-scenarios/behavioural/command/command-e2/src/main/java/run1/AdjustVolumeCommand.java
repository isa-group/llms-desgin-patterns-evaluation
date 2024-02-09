package run1;

import original.Device;
import original.Stereo;
import original.TV;

public class AdjustVolumeCommand implements Command {
    private Device device; // Use Device if both TV and Stereo can adjust volume

    public AdjustVolumeCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        if (device instanceof TV) {
            ((TV) device).adjustVolume();
        } else if (device instanceof Stereo) {
            ((Stereo) device).adjustVolume();
        }
    }
}
