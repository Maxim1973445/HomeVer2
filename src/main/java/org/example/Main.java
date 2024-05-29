package org.example;

public class Main {
    /**
     *Передаёт и выводит значения
     * @param args
     */
    public static void main(String[] args) {
        GreetingImpl greetingImpl1 = new GreetingImpl("Максим",30,"Мужской");

        String res1 = greetingImpl1.info1();
        System.out.println(res1);

    }
}
