package org.example.cameratests;

import org.bytedeco.javacv.CameraDevice;
import org.bytedeco.javacv.ProjectiveDevice;

public class Controller {
    Camera camera;

    public void initialize() {
        try {
            camera = new Camera(new CameraDevice.SettingsImplementation());
            camera.createDefaultOpenCVFrameGrabber();
        } catch (ProjectiveDevice.Exception e) {
            throw new RuntimeException(e);
        }

    }
}