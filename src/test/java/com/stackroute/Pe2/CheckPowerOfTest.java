package com.stackroute.Pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPowerOfTest {

    CheckPowerOf checkpowerOf;

    @Before
    public void setup() {
        this.checkpowerOf = new CheckPowerOf();
    }

    @After
    public void teardown() {
        checkpowerOf = null;
    }

    //This test case check whether the given input is power of 4 or not

    @Test
    public void givenInputIsPowerOf() {
        //act
        String result = checkpowerOf.CheckPower(16);
        //assert
        assertEquals("its a power of 4", result);
    }
        @Test
        public void givenInputIsNotPowerOf(){
        //act
         String result =checkpowerOf.CheckPower(15);
        //assert
        assertEquals("its not a power of 4", result);
    }

     @Test
    public void givenNegativeNumberShouldReturnErrorMessage(){
        //act
         String result=checkpowerOf.CheckPower(-16);
         //assert
         assertEquals("error",result);
     }

}