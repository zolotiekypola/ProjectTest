package ru.sapteh;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        Triangle triangle = new Triangle("black",5,6,8,4);
        System.out.println(triangle.toString());
    }
}
