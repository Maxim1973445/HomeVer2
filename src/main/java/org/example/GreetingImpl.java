package org.example;

public class GreetingImpl implements Greeting {
    public GreetingImpl(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String name;
    public void info1() {

        String info1 = ("name: " + name);
    }

    public int age;
    public void info2() {

        String info2 =("age: " + age);
    }

    public String gender;
    public void info3() {

        String info3 =("gender: " + gender);
    }

    @Override
    public void showGreeting() {
    }
}
