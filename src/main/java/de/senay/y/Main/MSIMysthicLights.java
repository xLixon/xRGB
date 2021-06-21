package de.senay.y.Main;

import de.matthiasfisch.mysticlight4j.Device;
import de.matthiasfisch.mysticlight4j.LED;
import de.matthiasfisch.mysticlight4j.MysticLight4j;

import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;

public class MSIMysthicLights {

    public static void changeColor() {
        MysticLight4j lights = new MysticLight4j(Paths.get("D:\\AllRGBSoftware\\DLLs\\MSI"));

        Collection<Device> devices = lights.getAllAvailableDevices();
        for (Device device : devices) {
            String id = device.getIdentifier(); // Unique ID of the device
            String name = device.getName(); // Display name of the device
            List<LED> leds = device.getLEDs(); // The LED groups on the device
        }
        System.out.println(devices);
    }
}
