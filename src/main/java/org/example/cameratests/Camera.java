package org.example.cameratests;

import org.bytedeco.javacv.CameraDevice;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import org.bytedeco.opencv.opencv_core.FileStorage;

import java.util.ArrayList;
import java.util.List;

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
    // ------ GETTERS AND SETTERS
    public OpenCVFrameGrabber getGrabber() {
        return grabber;
    }

    public void setGrabber(OpenCVFrameGrabber grabber) {
        this.grabber = grabber;
    }
    // ----- FRAMEGRABBER METHODS -------
    public void createDefaultOpenCVFrameGrabber() {
        this.grabber = new OpenCVFrameGrabber(0);
    }

    public OpenCVFrameGrabber createOpenCvFrameGrabber(int index) throws FrameGrabber.Exception {
        return OpenCVFrameGrabber.createDefault(index);
    }

    //Should be tested
    public List<OpenCVFrameGrabber> createOpenCvFrameGrabberList(int index) {
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


}
