package ru.sapteh;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Ivan",15,1111);
        Person person1 = new Person("Roma",17,1510);
        Person person2 = new Person("Max",20,1803);
        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());

    }
}
