package com.ohgiraffers.assignment04.looping;

public class Application5 {
    public static void main(String[] args) {

        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요.
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz
         * */
        char c = 'a';
        while(c<='z'){



            System.out.print((char) c);
            c+=1;
        }

    }
}
