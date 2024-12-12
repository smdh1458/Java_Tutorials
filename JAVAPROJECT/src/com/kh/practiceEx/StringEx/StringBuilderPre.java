package com.kh.practiceEx.StringEx;

public class StringBuilderPre {
    /*
    Todo String str = "Welcom";
    1. 작성된 개체를 StringBuilder sb로 변환해서 사용
    2. to Java 이어서 작성
    3. 8번째 자리에 the world of 글자 추가
    4. 4 ~ 11 come to 변경
    5. 20,25 삭제
    6. sb 뒤집기
    */
    public void method1(){
        StringBuilder sb = new StringBuilder("Welcom");
        System.out.println("1번 :"+sb);

        System.out.println("2번 이어서 작성하기: "+sb.append("to Java"));

        System.out.println("3번 8번째 자리에 the world of 글자 추가: "+sb.insert(8," the world of"));

        System.out.println("4번 4 ~ 11 come to 변경: "+sb.replace(4,11,"come to"));


        System.out.println("5번 20,25삭제: "+ sb.delete(20,25));

        System.out.println("6번 sb 뒤집기: "+sb.reverse());

    }

    public static void main(String[] args) {
        StringBuilderPre sb = new StringBuilderPre();
        sb.method1();
    }
}
