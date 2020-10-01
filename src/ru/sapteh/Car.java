package ru.sapteh;

public class Car {
    private String mark;
    private int weight;
    private int power;

    public Car (String mark, int weight, int power){
        this.mark = mark;
        this.weight = weight;
        this.power = power;
    }

    public String getMark() {
        return mark;
    }

    public int getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

}
