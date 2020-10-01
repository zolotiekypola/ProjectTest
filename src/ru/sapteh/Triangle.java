package ru.sapteh;

public class Triangle  extends shape{
    private int base;
    private int height;

    public Triangle(String color,int x, int y, int base, int height){
        super(color, x, y);
        this.base = base;
        this.height = height;
    }

    public int getBase(){
        return base;
    }
    public int getHeight(){
        return height;
    }

    @Override
    public double area() {
        return base * height;
    }

    @Override
    public String draw() {
        return "Draw Triangle";
    }
    @Override
    public String toString(){
        return "Color: " + getColor() + "\n" +
                "X: " + getX() + "\n" +
                "Y: " + getY() + "\n" +
                "Base: " + getBase() + "\n" +
                "Height: " + getHeight() + "\n" +
                "Area: " + area() + "\n" +
                "Draw: " + draw();
    }
}
