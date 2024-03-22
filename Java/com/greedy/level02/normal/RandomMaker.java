package com.greedy.level02.normal;

import java.util.SplittableRandom;

public class RandomMaker {
    public int randomNumber(int min ,int max){

        return (int)((Math.random()*(max-min))+min);


    }
    public String randomUpperAlphabet(int length){
        String alpa="";
        for (int i=0;i<5;i++){
            int index1=(int)(Math.random()*25)+65;
            alpa+=(char)index1;

        }
        return alpa;




    }
    public String rockPaperScissors(){
        String[] ropasc ={"가위","바위","보"};
        int ropascIndex=(int)(Math.random()*ropasc.length);
        return ropasc[ropascIndex];
    }
    public String tossCoin(){
        String[] coin = {"앞면","뒷면"};
        int coinIndex = (int) (Math.random()*coin.length);
        return coin[coinIndex];
    }

}
