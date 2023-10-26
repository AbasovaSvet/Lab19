module aba.lab19 {
    requires javafx.controls;
    requires javafx.fxml;


    opens aba.lab19 to javafx.fxml;
    exports aba.lab19;
}