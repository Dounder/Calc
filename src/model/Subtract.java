package model;

public class Subtract {

    private Double firsNum;
    private Double secondNum;

    public Subtract(Double firsNum, Double secondNum) {
        this.firsNum = firsNum;
        this.secondNum = secondNum;
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

    public static Double subtractNum(Double firsNum, Double secondNum){
        return firsNum - secondNum;
    }
}
