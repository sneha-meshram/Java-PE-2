package com.stackroute.Pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberInformationTest {

    MemberInformation memberInformation;


    @Before
    public void setUp() throws Exception {
        memberInformation = new MemberInformation();
    }

    @After
    public void tearDown() throws Exception {
        memberInformation = null;
    }

    /**
     * Test to check if Member name is returned.
     */
    @Test
    public void givenMemberDetailsShouldDisplayMemberName() {
        memberInformation.memberNameCreate("Harry Potter", 30, 2500.3);
        assertEquals("Harry Potter", memberInformation.getMemberName());
    }

    /**
     * Method should return Age of the member
     */
    @Test
    public void givenMemberDetailsShouldReturnMemberAge() {
        memberInformation.memberNameCreate("Harry Potter", 30, 2500.3);
        assertEquals(30, memberInformation.getMemberAge());
    }

    /**
     * Method should return Salary of the member
     */
    @Test
    public void givenMemberDetailsShouldReturnMemberSalary() {
        memberInformation.memberNameCreate("Harry Potter", 30, 2500.3);
        assertEquals(2500.3, memberInformation.getMemberSalary(), 0.0);
    }
}