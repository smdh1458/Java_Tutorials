package com.kh.polymorphismEx;
/*
* 다형성 : 다양한 형태를 지니는 성질
*
*
* 1.상속 관계의 자식 객체의 모습이 여러 모습을 보임
*   자식 객체, 부모 객체, Object 객체 등으로 변하는 것처럼 보임
*
* 2. 오버로딩
*   같은 클래스에서 같은 이름의 메서드를 여러 번 작성하는 기술
*   조건 : 메서드명 동일, 매개변수 개수, 타입 순서하나라도 달라야함
*   목적 : 전달 받은 매개변수에 따른 상황별 처리 방법 구현
*
* sum(a,b)    -> 두 수 더하기
* sum(a,b,c)  -> 세 수 더하기
* sum(배열)   -> 내열 내 요소 모두 더하기
*
* */
public class PolymorphismEx {

    // 오버로링문제
    //public void sum 명칭 변경 X
    // 하나는 두 수끼리 더하기
    // 하나는 세 수끼리 더하기
    // 하나는 두 실수끼리 더하기
    // 하나는 두 문자형끼리 더하기
    /*
    public void sum(int a,int b){
        System.out.println(a+b);
    };
    public void sum(int a,int b,int c){
        System.out.println(a+b+c);
    };
    public void sum(double a,double b){
        System.out.println(a+b);
    };
    public void sum(String a,String b){
        System.out.println(a+b);
    };
    */

}
