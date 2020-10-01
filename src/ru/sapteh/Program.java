package ru.sapteh;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
    Lorry lorry = new Lorry("MAZ",2000,400,5);
        System.out.println(lorry.toString());
    }
}
