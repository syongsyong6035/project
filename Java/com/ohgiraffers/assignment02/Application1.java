package com.ohgiraffers.assignment02;

import java.util.Scanner;

public class Application1 {
    /*
     * 토까가 당근 홀짝 게임에 참여했습니다.
     * 당근 갯수를 선언하고,
     * 선언한 당근 갯수가 짝수이면 "짝이군!",
     * 짝수가 아니면 "홀이군!"을 출력하세요.
     *
     * ------- 출력 결과 화면 ----------
     * 예) 정수 7를 선언한 경우
     *
     * 홀이군!
     * */
    public void method1(){
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
