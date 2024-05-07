package org.example.cameratests;

import org.bytedeco.javacv.CameraDevice;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import org.bytedeco.javacv.OpenCVFrameRecorder;
import org.bytedeco.opencv.opencv_core.FileStorage;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;

public class Camera extends CameraDevice {
    OpenCVFrameGrabber frameGrabber;
    OpenCVFrameRecorder frameRecorder;

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

    // ------ GETTERS AND SETTERS ------
    public OpenCVFrameGrabber getOpenCVFrameGrabber() {
        return frameGrabber;
    }

    public OpenCVFrameGrabber getGrabber() {
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

    // Should be tested
    public static List<OpenCVFrameGrabber> createOpenCvFrameGrabberList(int index) {
        List<OpenCVFrameGrabber> grabbers = new ArrayList<>();
        try {
            for (int deviceIndex = 0; deviceIndex < MAX_VALUE; deviceIndex++) {
                grabbers.addLast(OpenCVFrameGrabber.createDefault(deviceIndex));
            }
        }
        catch (FrameGrabber.Exception e){
            return grabbers;
        }
        return grabbers;
    }
}
