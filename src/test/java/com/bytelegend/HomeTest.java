package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void test() {
        Assertions.assertEquals("Cat(Black)", Home.newCat("Black").toString());
    }
}
