package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.Add;
import model.Divide;
import model.Multiply;
import model.Subtract;

public class CalcController {

    @FXML
    private Button add;

    @FXML
    private Button multiply;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button subtract;

    @FXML
    private Button one;

    @FXML
    private Label display;

    @FXML
    private Button dot;

    @FXML
    private Button seven;

    @FXML
    private Button delete;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button result;

    @FXML
    private Button four;

    @FXML
    private Button divide;

    @FXML
    private Button five;

    private String operator;
    private Double num1;
    private Double num2;
    private Double r;

    //Métodos relacionados a los botones de la interfaz para hacer la operaciones aritméticas
    @FXML
    void deleteNum(ActionEvent event) {
        this.display.setText("");
    }

    @FXML
    void addNumber(ActionEvent event) {

        this.operator = "+";
        this.num1 = Double.parseDouble(this.display.getText());
        this.display.setText("");
    }

    @FXML
    void subtractNum(ActionEvent event) {
        this.num1 = Double.parseDouble(this.display.getText());
        this.operator = "-";
        this.display.setText("");
    }

    @FXML
    void multiplyNum(ActionEvent event) {

        this.num1 = Double.parseDouble(this.display.getText());
        this.operator = "*";
        this.display.setText("");
    }

    @FXML
    void divideNum(ActionEvent event) {
        this.num1 = Double.parseDouble(this.display.getText());
        this.operator = "/";
        this.display.setText("");
    }

    @FXML
    void displayResult(ActionEvent event) {

        this.num2 = Double.parseDouble(this.display.getText());

        switch (this.operator){
            case "+":
                this.display.setText(noZero(this.num1+this.num2));
                break;
            case "-":
                this.display.setText(noZero(this.num1-this.num2));
                break;
            case "*":
                this.display.setText(noZero(this.num1*this.num2));
                break;
            case "/":
                if (this.num2 == 0) this.display.setText("NOT DIVISIBLE BY ZERO");
                else this.display.setText(noZero(this.num1/this.num2));
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }

    //Método para dar formato a los números de display
    public String noZero(Double result){

        String r = Double.toString(result);

        if (result % 1 == 0) r = r.substring(0, r.length()-2);

        return r;
    }

    //Métodos para agregar los números en el display
    @FXML
    void addOne(ActionEvent event) {

        this.display.setText(this.display.getText() + "1");

    }

    @FXML
    void addTwo(ActionEvent event) {

        this.display.setText(this.display.getText() + "2");

    }

    @FXML
    void addThree(ActionEvent event) {

        this.display.setText(this.display.getText() + "3");

    }

    @FXML
    void addFour(ActionEvent event) {

        this.display.setText(this.display.getText() + "4");

    }

    @FXML
    void addFive(ActionEvent event) {
        this.display.setText(this.display.getText() + "5");

    }

    @FXML
    void addSix(ActionEvent event) {
        this.display.setText(this.display.getText() + "6");

    }

    @FXML
    void addSeven(ActionEvent event) {
        this.display.setText(this.display.getText() + "7");

    }

    @FXML
    void addEight(ActionEvent event) {
        this.display.setText(this.display.getText() + "8");

    }

    @FXML
    void addNine(ActionEvent event) {
        this.display.setText(this.display.getText() + "9");

    }

    @FXML
    void addZero(ActionEvent event) {
        this.display.setText(this.display.getText() + "0");

    }

    @FXML
    void addDot(ActionEvent event) {
        if (!(this.display.getText().contains("."))) this.display.setText(this.display.getText() + ".");
    }

}
