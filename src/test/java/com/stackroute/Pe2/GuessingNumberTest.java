package com.stackroute.Pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessingNumberTest {
    GuessingNumber guessingNumber;
    @Before
    public void setUp() throws Exception {
        guessingNumber=new GuessingNumber();
    }

    @After
    public void tearDown() throws Exception {
        guessingNumber=null;
    }

    @Test
    public void givenTwoInputShouldReturnLessThanOutput() {
        String actualResult=guessingNumber.numberGuess(10,2);
        assertEquals("Number guessed is less than original number",actualResult);
    }
    @Test
    public void givenTwoInputShouldReturnMoreThanOutput() {
        String actualResult=guessingNumber.numberGuess(10,20);
        assertEquals("Number guessed is more than original number",actualResult);
    }
    @Test
    public void givenTwoInputShouldReturnEqualOutput() {
        String actualResult=guessingNumber.numberGuess(10,10);
        assertEquals("You have guessed correctly",actualResult);
    }

}