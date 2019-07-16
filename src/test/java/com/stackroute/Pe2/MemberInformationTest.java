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
    public void givenInputshouldReturnName() {
        //act
        String ResultNAme = memberInformation.membersName("Harry Potter");
        //assert
        assertEquals("Harry Potter", ResultName);
    }
      @Test
         public void givenInputShouldReturnAge() {
          //act
          int ResultAge = memberInformation.membersAge(30);
          //assert
          assertEquals(30, ResultAge);
      }
        @Test
        public void givenInputShouldReturnSalary(){
       //act
        float ResultSalary = memberInformation.membersSalary(2500.3);
        //assert
        assertEquals(2500.3,ResultSalary,0);
    }

}