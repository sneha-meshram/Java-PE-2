package com.stackroute.Pe2;

public class Palindrome {
    public String checkPalindrome(int number) {
        int n = number;
        int sum = 0, r;
        int temp = n;
        while(n>0)
        {
            r = n % 10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum)
            return "Is a palindrome";
        else
            return "Not a palindrome";
    }
}

