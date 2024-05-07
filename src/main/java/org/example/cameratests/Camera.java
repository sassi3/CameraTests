package org.example.cameratests;

import org.bytedeco.javacv.CameraDevice;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import org.bytedeco.javacv.ProjectiveDevice;

public class Camera {
    CameraDevice camera;
    CameraDevice.Settings cameraSettings;

    public Camera(CameraDevice.Settings cameraSettings) {
        try {
            this.cameraSettings = cameraSettings;
            this.camera = new CameraDevice(cameraSettings);
        } catch (ProjectiveDevice.Exception e) {
            System.err.println("Error creating CameraDevice.");
            throw new RuntimeException(e);
        }
        cameraSettings.setFrameGrabber(OpenCVFrameGrabber.class);
    }

    public CameraDevice getCamera() {
        return camera;
    }

    public CameraDevice.Settings getCameraSettings() {
        return cameraSettings;
    }

    public void setCameraSettings(CameraDevice.Settings cameraSettings) {
        this.cameraSettings = cameraSettings;
    }
}
