package com.stackroute.Pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class ReadContentTest {

    ReadContent readContent;

    @Before
    public void setup(){
        readContent= new ReadContent();
    }

    @After
    public void tearDown(){
        readContent=null;
    }

    //Read the content of a text file and convert into uppercase

    @Test
    public void textFileReadandConvertIntoUpperCase(){
        //act
        String Result= readContent.textFileReadAndConvertIntoUpperCase("this is java test cases");
        //assert
        assertEquals("THIS IS JAVA TEST CASES", Result);
    }

    /**
     * Test for readFile() to throw FileNotFoundException
     * when the wrong(non-existent) file path is given.
     */
    @Test(expected = FileNotFoundException.class)
    public void testReadFileFailureGivenFileNameAndExtensionShouldReturnFileNotFoundException() {
        readContent.readFile("test1", "txt");
    }

}