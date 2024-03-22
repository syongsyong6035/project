package com.ohgiraffers.assignment02;

import java.util.Scanner;

public class Application3 {
    /*
     * 서울에서 패스트푸드의 늪에 빠진 토까가 몸무게를 잽니다.
     * 몸무게가 12kg 이상이면 비만이라고 출력되도록,
     * 아니면 정상이라고 출력되로록 작성하세요. (삼항 연산자 사용)
     *
     * 예) 7 입력
     *
     * ---- 출력 결과 ---
     * 정상!!!!!
     * */
    public void method3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("입력");
        double weight = sc.nextDouble();


        String we = (weight>12) ? "비만!!!":"정상!!!";

        System.out.println(we);
    }

}
