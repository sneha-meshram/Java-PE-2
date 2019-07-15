package com.stackroute.Pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;


    @Before
    public void setup() {
        this.palindrome = new Palindrome();
    }

    @After
    public void teardown() {
        palindrome = null;
    }


    @Test
    public void givenIntegerShouldReturnNotAPalindrome() {
        //act
        String actualResult = palindrome.checkpalindrome(45634);
        //assert
        assertEquals("Not a palindrome", actualResult);
    }

    @Test
    public void shouldRecognizePalindrome() {
        //act
        String actualResult = palindrome.checkpalindrome("aba");
        //assert
        assertEquals("Is a palindrome", actualResult);
    }

}