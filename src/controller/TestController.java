package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Add;

import java.awt.event.ActionEvent;

public class TestController {

    @FXML
    private TextField result;

    @FXML
    private Button btnSubstraction;

    @FXML
    private Button btnAdd;

    @FXML
    private TextField secondNum;

    @FXML
    private Button btnMultiplication;

    @FXML
    private Button btnDivision;

    @FXML
    private TextField firstNum;

    @FXML
    void add(ActionEvent event) {

        Integer num1 = Integer.parseInt(this.firstNum.getText());
        Integer num2 = Integer.parseInt(this.secondNum.getText());

        Add a = new Add(num1, num2);

        Integer result = a.addNum();

        this.result.setText(result.toString());

    }

    @FXML
    void subtract(ActionEvent event) {

    }

    @FXML
    void divide(ActionEvent event) {

    }

    @FXML
    void multiply(ActionEvent event) {

    }

}
