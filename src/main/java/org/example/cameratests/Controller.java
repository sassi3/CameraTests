package org.example.cameratests;

import javafx.fxml.FXML;
import org.bytedeco.javacv.CameraDevice;

public class Controller {
    Camera camera;

    public void initialize() {
        camera = new Camera(new CameraDevice.SettingsImplementation());
        System.out.println(camera.getCameraSettings());
    }
}