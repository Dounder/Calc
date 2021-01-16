package model;

public class Subtract {

    private Integer firsNum;
    private Integer secondNum;

    public Subtract(Integer firsNum, Integer secondNum) {
        this.firsNum = firsNum;
        this.secondNum = secondNum;
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

    public Integer subtractNum(){
        return firsNum - secondNum;
    }
}
