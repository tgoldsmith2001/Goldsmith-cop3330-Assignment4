module ucf.assignments {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires junit;
    requires org.junit.jupiter.api;


    opens ucf.assignments to javafx.fxml;
    exports ucf.assignments;
}