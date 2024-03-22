package com.ohgiraffers.assignment04.conditional;

import java.util.Scanner;

public class Application7 {
    public static void main(String[] args) {

        /* 토끼는 축제 부스에서 일한 뒤, 인사평가 점수를 받았습니다.
         *
         * 성실, 서비스, 미소 점수를 입력받아
         * 평균 점수가 60점 이상이면서 각 항목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
         *
         * 단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해 주어야 합니다.
         * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다."라고 출력하고,
         * 항목당 과락 점수가 있는 경우 "xx 항목의 점수 미달로 불합격 입니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 성실 점수 : 60
         * 서비스 점수 : 30
         * 미소 점수 : 20
         *
         * -- 출력 예시 --
         * 평균 점수 미달로 불합격입니다.
         * 서비스 점수 미달로 불합격입니다.
         * 미소 점수 미달로 불합격입니다.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("성실 점수 : ");
        int score1 = sc.nextInt();
        System.out.print("서비스 점수 : ");
        int score2 = sc.nextInt();
        System.out.print("미소 점수 : ");
        int score3 = sc.nextInt();

        double avg = (score1+score2+score3)/3;
        if (score1>=40 && score2>=40 && score3>=40 && avg>=60){
            System.out.println("합격입니다");

        }
        else {
            if(score1<40 ){
                System.out.println("성실 점수 미달로 불합격입니다");
            }
            if(score2<40 ){
                System.out.println("서비스 점수 미달로 불합격입니다");
            }
            if(score3<40 ){
                System.out.println("미소 점수 미달로 불합격입니다");
            }
            if(avg<60 ){
                System.out.println("평균 점수 미달로 불합격입니다");
            }
        }



    }

}
