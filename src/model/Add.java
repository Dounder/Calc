package model;

public class Add {

    private Double firstNum;
    private Double secondNum;

    public Add(Double firstNum, Double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public Add() {
    }

    public Double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Double firstNum) {
        this.firstNum = firstNum;
    }

    public Double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(Double secondNum) {
        this.secondNum = secondNum;
    }

    public static Double addNum(Double firstNum, Double secondNum){
         return firstNum + secondNum;
    }

}
