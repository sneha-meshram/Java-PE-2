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
    public void givenInputIsPowerOf(){
        //act
        int result=checkpowerOf.CheckPower(16);
        //assert
        assert("its a power of 4", result);
        //act
         result =checkpowerOf.CheckPower(15);
        //assert
        assert("its not a power of 4", result);
    }

     @Test
    public void givenNegativeNumberShouldReturnErrorMessage(){
        //act
         int result=checkpowerOf.CheckPower(-16);
         //assert
         assert("error", result);
     }

}