package ru.sapteh;

public class Lorry extends Car{
    private int tonnage;

    public Lorry (String mark, int weight, int power, int tonnage){
        super(mark, weight, power);
        this.tonnage  = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
    public void setMark(String mark){
        super.setMark(mark);
    }

    @Override
    public String toString(){
        return "Mark: " + getMark() + "\n" +
                "Weight: " + getWeight() + "\n" +
                "Power: " + getPower() + "\n" +
                "Tonnage: " + getTonnage() + "\n";
    }
}
