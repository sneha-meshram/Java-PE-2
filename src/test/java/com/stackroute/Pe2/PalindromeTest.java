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
    //check number is palindrome or not a palindrome

    @Test
    public void givenIntegerShouldReturnNotAPalindrome() {
        //act
        String actualResult = palindrome.checkPalindrome(45634);
        //assert
        assertEquals("Not a palindrome", actualResult);
    }

    @Test
    public void givenInputshouldRecognizePalindrome() {
        //act
        String actualResult = palindrome.checkPalindrome(121);
        //assert
        assertEquals("Is a palindrome", actualResult);
    }

    @Test
    public void givenNullShouldRecognizeNullValue(){
        //act
        String actualResult= palindrome.checkPalindrome(0);
        //assert
        assertNotNull("null value not allowed",actualResult);
    }
}