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

    @Test
    //assert
    public void EvenNumTest() {
        assertEquals(true, 6);
        assertEquals(false,7);
    }

}