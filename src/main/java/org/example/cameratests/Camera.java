package org.example.cameratests;

import org.bytedeco.javacv.CameraDevice;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import org.bytedeco.opencv.opencv_core.FileStorage;

public class Camera extends CameraDevice {
    OpenCVFrameGrabber grabber;

    //------ CONSTRUCTOR ------
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
        return grabber;
    }
    // ----- FRAMEGRABBER METHODS -------
    public void createDefaultOpenCVFrameGrabber() {
        this.grabber = new OpenCVFrameGrabber(0);
    }

    public OpenCVFrameGrabber getGrabber() {
        return grabber;
    }

    public OpenCVFrameGrabber createOpenCvFrameGrabber(int index) throws FrameGrabber.Exception {
        return new OpenCVFrameGrabber(index);
    }


}
