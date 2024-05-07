package org.example.cameratests;

import org.bytedeco.javacv.CameraDevice;
import org.bytedeco.javacv.ProjectiveDevice;

public class Controller {
    Camera camera;

    public void initialize() {
        try {
            camera = new Camera(new CameraDevice.SettingsImplementation());
            camera.setOpenCVFrameGrabber(0);
        } catch (ProjectiveDevice.Exception e) {
            System.err.println("Error initializing Camera");
            System.exit(1);
        }

    }
}