package com.mahesh;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestNumbersHelper {

    @Test
    public void testAdd() {
        assertEquals(com.mahesh.NumbersHelper.add(2,3), 5, "add fail");
    }
    @Test
    public void testSub() {
        assertEquals(com.mahesh.NumbersHelper.sub(3,1), 2, "sub fail");
    }
    @Test
    public void testMul() {
        assertEquals(com.mahesh.NumbersHelper.mul(2,3), 6, "mul fail");
    }
    @Test
    public void testDiv() {
        assertEquals(com.mahesh.NumbersHelper.div(4,2), 2, "div fail");
    }

}