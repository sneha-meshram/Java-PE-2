package com.stackroute.Pe2;

public class CheckPowerOf {
    public  String CheckPower(int number){
        while(number>0){
            if(number==1){
                return "its a power of 4";
            }

            if(number%4!=0){
                return "its not a power of 4";
            }else{
                number=number/4;
            }
        }

        return "error";
    }
}
