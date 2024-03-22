package com.greedy.level02.normal;

public class Application {
    public static void main(String[] args) {
        RandomMaker rm = new RandomMaker();
        System.out.println(rm.randomNumber(-10,10));
        System.out.println();
        System.out.println(rm.randomUpperAlphabet(5));
        System.out.println();
        System.out.println(rm.rockPaperScissors());
        System.out.println();
        System.out.println(rm.tossCoin());
    }


}
