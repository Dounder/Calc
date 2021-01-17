package model;

public class Divide {

    private Integer firsNum;
    private Integer secondNum;

    public Divide(Integer firsNum, Integer secondNum) {
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

    public static Integer divideNum(Integer firsNum, Integer secondNum){
        return firsNum / secondNum;
    }

}
