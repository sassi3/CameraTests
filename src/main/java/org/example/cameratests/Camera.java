package org.example.cameratests;

import org.bytedeco.javacv.*;
import org.bytedeco.opencv.opencv_core.FileStorage;

import java.util.ArrayList;
import java.util.List;

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

    public OpenCVFrameGrabber getOpenCVFrameGrabber() {
        return frameGrabber;
    }
    // ------ GETTERS AND SETTERS
    public OpenCVFrameGrabber getGrabber() {
        return frameGrabber;
    }


    public void setGrabber(OpenCVFrameGrabber grabber) {
        this.frameGrabber = grabber;
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

    // ----- FRAMEGRABBER METHODS -------
    public void createDefaultOpenCVFrameGrabber() {
        this.frameGrabber = new OpenCVFrameGrabber(0);
    }

    public static OpenCVFrameGrabber createOpenCvFrameGrabber(int index) throws FrameGrabber.Exception {
        return OpenCVFrameGrabber.createDefault(index);
    }

    //Should be tested, could be moved into a dedicated thread
    public static List<OpenCVFrameGrabber> createOpenCvFrameGrabberList(int index) {
        List<OpenCVFrameGrabber> list = new ArrayList<>();
        int i = 0;
        while(true){
            try {
                list.add(createOpenCvFrameGrabber(i));
            }
            catch (FrameGrabber.Exception e){
                break;
            }
            ++i;
        }
        return list;
    }

    // ----- FRAMERECORDER METHODS -------

    // -------- START AND STOP -----------
    public void frameGrabberStart() throws FrameGrabber.Exception {
        frameGrabber.start();
    }

    public void frameGrabberStop() throws FrameGrabber.Exception {
        frameGrabber.stop();
    }
    public void frameRecorderStart() throws FrameRecorder.Exception {
        frameRecorder.start();
    }
    public void frameRecorderStop() throws FrameRecorder.Exception {
        frameRecorder.stop();
    }

}
