package com.ohgiraffers.assignment01;

public class Application2 {
    /* 사각형의 넓이와 둘레를 구하여 출력합니다.
     * 너비 12.5 높이 36.4를 변수에 저장하고,
     * 넓이와 둘레를 계산한 뒤 변수에 담아 아래와 같이 출력하세요.
     *
     * -- 출력 예시 --
     * 면적 : 455.0
     * 둘레 : 97.8
     *  */
    public void method2(){
        double num1 = 12.5;
        double num2 = 36.4;

        double area = num1*num2;
        double cfe = (num1*2)+(num2*2);

        System.out.println("면적 : "+area);
        System.out.println("둘레 : "+cfe);

    }
}
