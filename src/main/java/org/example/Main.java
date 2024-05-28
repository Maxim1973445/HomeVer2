package org.example;

public class Main {
    public static void main(String[] args) {
        GreetingImpl greetingImpl1 = new GreetingImpl("Максим",30,"Мужской");

        String res1 = greetingImpl1.name;
        System.out.println(res1);

        int res2 = greetingImpl1.age;
        System.out.println(res2);

        String res3 = greetingImpl1.gender;
        System.out.println(res3);
    }
}
