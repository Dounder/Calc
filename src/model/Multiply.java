package model;

public class Multiply {

    private Double firsNum;
    private Double secondNum;

    public Multiply(Double firsNum, Double secondNum) {
        this.firsNum = firsNum;
        this.secondNum = secondNum;
    }

    public Multiply() {

    }

    public Double getFirsNum() {
        return firsNum;
    }

    public void setFirsNum(Double firsNum) {
        this.firsNum = firsNum;
    }

    public Double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(Double secondNum) {
        this.secondNum = secondNum;
    }

    public static Double multiplyNum(Double firsNum, Double secondNum){
        return firsNum * secondNum;
    }

}
