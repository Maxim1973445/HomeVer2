package org.example;

import org.junit.Assert;
import org.junit.Test;

public class GreetingImplTest {

            @Test
            /**
             * Проверяет возврощаемое значение
             */
            public void testInfo1() {
                GreetingImpl greetingImpl = new GreetingImpl("Максим", 30, "Мужской");
                String expected = "name: Максим, age: 30.0, gender: Мужской";
                String actual = greetingImpl.info1();
                Assert.assertEquals(expected, actual);
            }

        }

