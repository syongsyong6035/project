package com.greedy.level01.basic;

import java.util.Scanner;

public class Calculator {
    int a;
    int b;
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }
    public int sum1to10(){
        int num =0;
        for (int i=1;i<11;i++){
            num+=i;

        }
        return num;
    }
    public void checkMaxNumber(int a,int b){
        this.a=a;
        this.b=b;

        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }

    }

    public int sumTwoNumber(int a,int b){
        this.a=a;
        this.b=b;
        return a+b;
    }
    public int minusTwoNumber(int a ,int b){
        this.a=a;
        this.b=b;
        return a-b;
    }
}
