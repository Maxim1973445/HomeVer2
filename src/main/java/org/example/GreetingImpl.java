package org.example;

public class GreetingImpl implements Greeting {
   public String name;
   public float age;
   public String gender;

    /**
     * Метод, который устанавливает полученные значние в переменные
     * @param name Максим
     * @param age 30
     * @param gender Мужской
     */
    public GreetingImpl(String name, float age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Метод, который вовзращает значения
     * @return Максим
     */
    public String info1() {
          String info1 = "name: " + name + ", age: " + age + ", gender: " + gender;
          return info1;
    }


    @Override
    /**
     * Метод, для отображения инофрмации
     */
    public void showGreeting() {
    }
}
