package com.stackroute.Pe2;

public class EvenNumTest {
    public String checkInput(int number) {
        if (number == 0) {
            return "Zero value not allowed";
        }
        else if(number%2==0)
        {
            return "Even Number";
        }
        else if(number%2==1)
        {
            return "Odd Number";
        }
        else if(number<0)
        {
            return "negative value not allowed";
        }

            return "null value not allowed";
    }
}
