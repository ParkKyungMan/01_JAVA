package com.ohgiraffers.practice.practice;

import org.w3c.dom.ls.LSOutput;

public class practice3 {

//    국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤,
//    총점과 평균을 정수 형태로 출력하세요.
//
//-- 출력 예시 --
//    초 201
//    평균 : 67
public static void main(String[] args) {


    double G = 80.5;
    double M = 50.6;
    double E = 70.8;

    System.out.println("총점 : " + (int)(G + M + E));
    System.out.println("평균 : " + (int)((G + M + E)/3));

}

}
