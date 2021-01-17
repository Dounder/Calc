package model;

public class Add {

    private Integer firstNum;
    private Integer secondNum;

    public Add(Integer firstNum, Integer secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public Add() {
    }

    public Integer getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Integer firstNum) {
        this.firstNum = firstNum;
    }

    public Integer getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(Integer secondNum) {
        this.secondNum = secondNum;
    }

    public static Integer addNum(Integer firstNum, Integer secondNum){
         return firstNum + secondNum;
    }

}
