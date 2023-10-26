package aba.lab19;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label rez;
    @FXML
    private TextField a;
    @FXML
    private TextField b;
    @FXML
    private TextField c;

    @FXML
    public void square(){
        double a1 = Double.parseDouble(a.getText());
        double b1 = Double.parseDouble(b.getText());
        double c1 = Double.parseDouble(c.getText());
        double p1 = (a1 + b1 + c1) / 2;
        double s = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
        rez.setText("Результат равен "+s);
    }
}