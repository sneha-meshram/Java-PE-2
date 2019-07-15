package com.stackroute.Pe2;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class MemberInformationTest {

    MemberInformationTest memberInformationTest;

    @Before
    public void setup() {
        this.memberInformationTest = new MemberInformationTest();
    }

    @After
    public void teardown() {
        memberInformationTest = null;
    }

    public void memberinformation(){
        //act
        String Result=memberInformationTest.membersName("Harry Potter");
        //assert
        assertEquals("Harry Potter", Result);
        //act
         int Result1 = memberInformationTest.membersAge(30);
        //assert
        assertEquals(30, Result1);
        int Result2 = memberInformationTest.memberssalary(2500.3);
        //assert
        assertEquals(2500.3,Result2,0);
    }

}