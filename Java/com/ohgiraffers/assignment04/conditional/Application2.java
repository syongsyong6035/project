package com.ohgiraffers.assignment04.conditional;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /* 토끼가 이벤트 부스에서 짝홀 게임 진행을 맡았습니다.
         *
         * "짝홀, 그 결과는?"을 출력하고, 당근 갯수를 정수로 입력받아
         * 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요.
         *
         * 짝수인 경우 "짝수입니다~!" 출력, 홀수인 경우 "홀수입니다~!" 출력
         *
         * -- 입력 예시 --
         * 짝홀, 그 결과는? 7
         *
         * -- 출력 예시 --
         * 홀수입니다~!
         * */

        Scanner sc=new Scanner(System.in);
        System.out.println("짝 홀 그 결과는?");
        int carrot=sc.nextInt();
        if(carrot%2==0){
            System.out.println("짝수 입니다~!");
        }
        else{
            System.out.println("홀수 입니다~!");
        }

    }
}
