//package controller;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
//import model.Add;
//import model.Divide;
//import model.Multiply;
//import model.Subtract;
//
//
//public class Controller {
//
//    @FXML
//    private TextField result;
//
//    @FXML
//    private Button add;
//
//    @FXML
//    private TextField secondNum;
//
//    @FXML
//    private Button subtract;
//
//    @FXML
//    private Button divide;
//
//    @FXML
//    private Button multiply;
//
//    @FXML
//    private TextField firstNum;
//
//    @FXML
//    void addNum(ActionEvent event) {
//
//        try {
//
//            Double num1 = Double.parseDouble(this.firstNum.getText());
//            Double num2 = Double.parseDouble(this.secondNum.getText());
//
//            Add a = new Add();
//
//            Double result = a.addNum();
//
//            this.result.setText(result.toString());
//
//        }catch (NumberFormatException e){
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setHeaderText(null);
//            alert.setTitle("ERROR");
//            alert.setContentText("Formato Incorrecto. \n Debes ingresar un número.");
//            alert.showAndWait();
//        }
//
//    }
//
//    @FXML
//    void subtracNum(ActionEvent event) {
//
//        try {
//
//            Double num1 = Double.parseDouble(this.firstNum.getText());
//            Double num2 = Double.parseDouble(this.secondNum.getText());
//
//            Subtract s = new Subtract(num1, num2);
//
//            Double result = s.subtractNum();
//
//            this.result.setText(result.toString());
//
//        }catch (NumberFormatException e){
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setHeaderText(null);
//            alert.setTitle("ERROR");
//            alert.setContentText("Formato Incorrecto. \n Debes ingresar un número.");
//            alert.showAndWait();
//        }
//
//    }
//
//    @FXML
//    void multiplyNum(ActionEvent event) {
//
//        try {
//
//            Double num1 = Double.parseDouble(this.firstNum.getText());
//            Double num2 = Double.parseDouble(this.secondNum.getText());
//
//            Multiply m = new Multiply();
//
//            Double result = m.multiplyNum();
//
//            this.result.setText(result.toString());
//
//        }catch (NumberFormatException e){
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setHeaderText(null);
//            alert.setTitle("ERROR");
//            alert.setContentText("Formato Incorrecto. \n Debes ingresar un número.");
//            alert.showAndWait();
//        }
//
//    }
//
//    @FXML
//    void divideNum(ActionEvent event) {
//
//        try {
//
//            Double num1 = Double.parseDouble(this.firstNum.getText());
//            Double num2 = Double.parseDouble(this.secondNum.getText());
//
//            Divide d = new Divide(num1, num2);
//
//            Double result = d.divideNum();
//
//            this.result.setText(result.toString());
//
//        }catch (NumberFormatException e){
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setHeaderText(null);
//            alert.setTitle("ERROR");
//            alert.setContentText("Formato Incorrecto. \n Debes ingresar un número.");
//            alert.showAndWait();
//        }
//
//    }
//
//}
