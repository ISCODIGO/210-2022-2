module com.unah.ejemplojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.unah.ejemplojavafx to javafx.fxml;
    exports com.unah.ejemplojavafx;
}
