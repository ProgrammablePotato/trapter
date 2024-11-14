package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
    private Double a;
    private Double b;
    private Double c;
    private Double d;
    private Double area;

    @FXML
    private TextField ain;

    @FXML
    private TextField bin;

    @FXML
    private Button calcbutton;

    @FXML
    private TextField cin;

    @FXML
    private TextField din;

    @FXML
    private TextField sol;

    public void tryCalculateArea() throws Exception {
        a = Double.parseDouble(ain.getText());
        b = Double.parseDouble(bin.getText());
        c = Double.parseDouble(cin.getText());
        d = Double.parseDouble(din.getText());
        //Wikipédia szerint a 4-szeres szorzó után zárójel helyett abszolútérték is mehet, így ha a és c fordítva van megadva se lesz baj
        area = (a+c)/(4*Math.abs(a-c))*Math.sqrt((a+b-c+d)*(a-b-c+d)*(a+b-c-d)*(-a+b+c+d));
        //Nullával való osztás kezelése (ha a és c ugyanaz)
        if (Double.isNaN(area)) {
            sol.setText("Incorrect input!");
        }
        else {
            sol.setText(area.toString());
        }
    }

    public void CalculateArea() {
        try {
            tryCalculateArea();
        } catch (Exception e) {
            sol.setText("Incorrect input!");
        }
    }

    public void calcArea() {
        CalculateArea();
    }
}
