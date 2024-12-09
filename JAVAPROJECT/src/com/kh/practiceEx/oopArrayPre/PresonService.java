package com.kh.practiceEx.oopArrayPre;

import java.util.Scanner;

public class PresonService {
    public static void main(String[] args) {
        //person 에 대한 배열 생성
        Person[] peaple = new Person[4];

        Scanner sc = new Scanner(System.in);

        //scanner 객체를 이용해서 사용자에게 키보드로 정보를 입력받고 배열 초기화
        //for문을 이용해서
        //oo번째 사람의 이름을 입력하세요
        //ㅇㅇ번째 사람의 나이를 입력하세요 이름입력 입력한 내용이
        //preson ㅇㅇ번째 객체 생성 및 배열에 저장
        //저장을 완료할 경우 for문을 탈출해서 모든 사람이 등록되었습니다 출력문 결과 출력

        for (int i = 0; i < peaple.length; i++) {
            System.out.print(i+"번째 사람의 이름을 입력하세요: ");
            String name = sc.nextLine();
            System.out.print(i+"번째 사람의 나이를 입력하세요: ");
            int age = sc.nextInt();
            sc.nextLine(); //int 남아있는 줄바꿈 버퍼 비우귀
            peaple[i] = new Person(name, age);
        }
        System.out.println("모든 사람이 등록되었습니다.");


        /*
        //person 배열의 각 값을 객체로 초기화
        peaple[0] = new Person("홍길동",20);
        peaple[1] = new Person("박길자",30);
        peaple[2] = new Person("오성순",40);
        peaple[3] = new Person("강하석",50);

         */

        //각 배열의 값을 출력 1일반 for문 2 향상된 for문으로 만들기

        //1 일반 for문
        for (int i = 0;i< peaple.length;i++){
            System.out.println(peaple[i]);
        }
/*
        //2 향상된 for문 (for-each문)
        for (Person p : peaple){
            System.out.println(p);
        }
        */
    }
}
