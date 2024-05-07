module org.example.cameratests {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.bytedeco.javacv;
    requires org.bytedeco.opencv;
    requires java.desktop;


    opens org.example.cameratests to javafx.fxml;
    exports org.example.cameratests;
}