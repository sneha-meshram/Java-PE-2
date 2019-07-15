package com.stackroute.Pe2;

import org.junit.After;
import org.junit.Before;

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

    public void chechpowerof(){
        //act
        String Result=checkpowerOf.CheckPower(16);
        //assert
        assert("its a power of 4", Result);
        //act
         Result =checkpowerOf.CheckPower(15);
        //assert
        assert("its not a power of 4", Result);
    }



}