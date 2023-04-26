module com.example.projekt_lenuska2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projekt_lenuska2 to javafx.fxml;
    exports com.example.projekt_lenuska2;
}