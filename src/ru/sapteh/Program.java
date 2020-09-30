package ru.sapteh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String name = bufferedReader.readLine();
        System.out.println("Введите возраст: ");
        int age = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Введите дату: ");
        int date = Integer.parseInt(bufferedReader.readLine());

        Person person = new Person(name,age,date);

        System.out.println(personIsEmpty(person));
    }

    public static String personIsEmpty(Person person){
        String err = "";

        if (person.getName().isEmpty()) err += "Имя не заполнено ";
        if (person.getAge() == 0) err += "Возраст не заполнен ";
        if (person.getDate() == 0) err += "Дата не заполнена ";

        if (!err.isEmpty()) return err;

        return "Объект " + person.getClass() +
                " инициализирован\n" + person.toString();
    }
}
