package model;

public class Multiply {

    private Integer firsNum;
    private Integer secondNum;

    public Multiply(Integer firsNum, Integer secondNum) {
        this.firsNum = firsNum;
        this.secondNum = secondNum;
    }

    public Multiply() {

    }

    public Integer getFirsNum() {
        return firsNum;
    }

    public void setFirsNum(Integer firsNum) {
        this.firsNum = firsNum;
    }

    public Integer getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(Integer secondNum) {
        this.secondNum = secondNum;
    }

    public static Integer multiplyNum(Integer firsNum, Integer secondNum){
        return firsNum * secondNum;
    }

}
