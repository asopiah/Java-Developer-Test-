package com.intellisoft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
* unit test class
* */
public class MyUnitTest {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("unit", "test");

        assertEquals("unitest", result);

    }
}
