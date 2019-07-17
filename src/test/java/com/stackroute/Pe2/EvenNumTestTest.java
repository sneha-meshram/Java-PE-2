package com.stackroute.Pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class EvenNumTestTest {

    EvenNumTest evennumtest;

    @Before
    public void setup() {
        this.evennumtest = new EvenNumTest();
    }

    @After
    public void teardown() {
        evennumtest = null;
    }
    //check input is even or not
    @Test
    public void EvenNumTest() {
        String result = evennumtest.checkInput(6);
        assertEquals("Even Number", result);
    }
    @Test
    public void EvenNumNotTest() {
        String result = evennumtest.checkInput(7);
        assertEquals("Odd Number", result);
    }

    //check null value exception
   /* @Test
    public void nullValueShouldReturnErrorMessage(){
        String result=evennumtest.checkInput(0);
        assertEquals("null value not allowed", result);
    }*/
    //check given input is negative

    @Test
    public void givenNegativeValueReturnMessage() {
        String result = evennumtest.checkInput(-7);
        assertEquals("negative value not allowed", result);
    }
    // check given input is Zero
    @Test
    public void givenValueZeroReturnMessage() {
        String result = evennumtest.checkInput(0);
        assertEquals("Zero value not allowed", result);
    }
}