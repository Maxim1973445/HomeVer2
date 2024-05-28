package org.example;

import org.junit.Assert;
import org.junit.Test;

public class GreetingImplTest {

    @Test
    public void testGreetingImplConst() {
        GreetingImpl greetingImpl = new GreetingImpl("Максим", 30, "Мужской");

        Assert.assertEquals("Максим", greetingImpl.name);
        Assert.assertEquals(30, greetingImpl.age);
        Assert.assertEquals("Мужской", greetingImpl.gender);

    }
}
