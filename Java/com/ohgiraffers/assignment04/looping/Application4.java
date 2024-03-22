package com.ohgiraffers.assignment04.looping;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /* 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요.
         * 참고) 문자열의 길이는 String 클래스의 length() 메소드를 이용할 수 있습니다.
         *
         * -- 입력 예시 --
         * 문자열을 입력하세요 : apple
         *
         * -- 출력 예시 --
         * 0 : a
         * 1 : p
         * 2 : p
         * 3 : l
         * 4 : e
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하시요: ");
        String ch = sc.nextLine();
        for(int i=0;i<ch.length();i++){
            char ch2 =ch.charAt(i);
            /*charAt 은 내가 원하는 인덱스를 넣으면 그 인덱스에 해당하는 문자 하나만 출력한다!!!!!!!!!!!*/
            System.out.println(i+":"+ch2);
        }

    }
}
