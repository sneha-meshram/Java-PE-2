package com.stackroute.Pe2;

public class GuessingNumber {
    public String numberGuess(int number, int input) {

        if (input<number) return ("Number guessed is less than original number");
        else if (input>number) return ("Number guessed is more than original number");
        else return ("You have guessed correctly");
    }
}
