package org.example.cameratests;

import org.bytedeco.javacv.CameraDevice;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import org.bytedeco.javacv.OpenCVFrameRecorder;
import org.bytedeco.opencv.opencv_core.FileStorage;

public class Camera extends CameraDevice {
    OpenCVFrameGrabber frameGrabber;
    OpenCVFrameRecorder frameRecorder;

    public Camera(String name) {
        super(name);
    }

    public Camera(String name, String filename) throws Exception {
        super(name, filename);
    }

    public Camera(Settings settings) throws Exception {
        super(settings);
    }

    public Camera(String name, FileStorage fs) throws Exception {
        super(name, fs);
    }

    public OpenCVFrameGrabber getOpenCVFrameGrabber() {
        return frameGrabber;
    }

    public void setOpenCVFrameGrabber(OpenCVFrameGrabber frameGrabber) {
        this.frameGrabber = frameGrabber;
    }

    public OpenCVFrameRecorder getFrameRecorder() {
        return frameRecorder;
    }

    public void setFrameRecorder(OpenCVFrameRecorder frameRecorder) {
        this.frameRecorder = frameRecorder;
    }
}
