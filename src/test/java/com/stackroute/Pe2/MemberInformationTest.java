package com.stackroute.Pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberInformationTest {

    MemberInformation memberInformation;

    @Before
    public void setup() {
        this.memberInformation = new MemberInformation();
    }

    @After
    public void teardown() {
        memberInformation = null;
    }

    //check the member information is correct or not

    @Test
    public void memberinformation(){
        //act
        String Result=memberInformation.membersName("Harry Potter");
        //assert
        assertEquals("Harry Potter", Result);
        //act
         int Result1 = memberInformation.membersAge(30);
        //assert
        assertEquals(30, Result1);
        int Result2 = memberInformation.membersSalary(2500.3);
        //assert
        assertEquals(2500.3,Result2,0);
    }

}