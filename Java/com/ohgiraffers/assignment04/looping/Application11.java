package com.ohgiraffers.assignment04.looping;

import java.util.Scanner;

public class Application11 {
    public static void main(String[] args) {

        /* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
         *
         * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
         * 지폐외 동전을 구분하여 단위를 표기하세요.
         *
         * -- 입력 예시 --
         * 받으신 금액을 입력하세요 : 100000
         * 상품 가격을 입력하세요 : 22340
         *
         * -- 출력 예시 --
         * ============================
         * 50000원권 지폐 1장
         * 10000원권 지폐 2장
         * 5000원권 지폐 1장
         * 1000원권 지폐 2장
         * 500원권 동전 1개
         * 100원권 동전 1개
         * 50원권 동전 1개
         * 10원권 동전 1개
         * ============================
         * 거스름돈 : 77660원
         * */
        Scanner sc=new Scanner(System.in);
        System.out.print("받으신 금액을 입력하세요 : ");
        int money = sc.nextInt();
        System.out.print("상품의 가격을 입력하세요 : ");
        int price = sc.nextInt();
        int su = money-price;
        int num=su;
        System.out.println("===============================");

        while (num>10){
            if(num>50000){
                num=su%50000;
                System.out.println("50000원권 지폐 "+su/50000+"장");
                continue;
            }
            else if(num>10000){
                System.out.println("10000원권 지폐 "+num/10000+"장");
                num=num%10000;
                continue;

            }
            else if(num>5000){
                System.out.println("5000원권 지폐 "+num/5000+"장");
                num=num%5000;
                continue;
            }
            else if(num>1000){
                System.out.println("1000원권 지폐 "+num/1000+"장");
                num=num%1000;
                continue;
            }
            else if(num>500){
                System.out.println("500원권 동전 "+num/500+"개");
                num=num%500;
                continue;

            }
            else if(num>100){
                System.out.println("100원권 동전 "+num/100+"개");
                num=num%100;
                continue;

            }
            else if(num>50){
                System.out.println("50원권 동전 "+num/50+"개");
                num=num%50;
                continue;

            }
            else if(num>10){
                System.out.println("10원권 동전 "+num/10+"개");
                num=num%10;
                continue;

            }
        }
        System.out.println("=======================");
        System.out.println("거스름돈 : "+su);



    }
}
