package org.example.cameratests;

import javafx.fxml.FXML;
import org.bytedeco.javacv.CameraDevice;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import org.bytedeco.javacv.ProjectiveDevice;

public class Controller {
    Camera camera;

    public void initialize() {
        try {
            camera = new Camera(new CameraDevice.SettingsImplementation());
        } catch (ProjectiveDevice.Exception e) {
            throw new RuntimeException(e);
        }

    }
}