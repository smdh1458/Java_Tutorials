package com.kh.testEx.test3Pre;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentScoreManager {
    public static void main(String[] args) {
        //학생 이름과 점수를 저장할 map생성
        Map<String, Integer> studentScores = new HashMap<String, Integer>();
        StudentScoreManager ssm = new StudentScoreManager();

        //데이터 입력
        studentScores.put("김철수", 85);
       studentScores.put("이영희", 92);
       studentScores.put("박민수", 77);
       studentScores.put("최수진", 88);


       //학생 정보 출력
       System.out.println("학생 정보 출력");
       for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
           System.out.println(entry.getKey() + " : " + entry.getValue()+"점");
       }

       //합격 불합격 판단
        System.out.println("합격 / 불합격 판단");
       for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
           String status  = (entry.getValue() >= 80) ? "합격" : "불합격" ;
           System.out.println(entry.getKey()+":"+status);
       }


       //점수 수정
        String updateName = "박민수";
       if (studentScores.containsKey(updateName)) {
           studentScores.put(updateName, 82);
           System.out.println(updateName + "의 점수를 82점으로 수정합니다.");
       }else {
           System.out.println("존재하지 않는 학생입니다.");
       }

       //점수 수정후 합격 불합격 판단

        System.out.println("점수 수정호 합격/ 불합격 판단: ");
        ssm.printPassFailStudentScores(studentScores)

       //점수 출력 기능 메서드
        /***
         *
         */
        public void printPassFailStudentScores(Map<String, Integer> studentScores) {
            for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
                String status = (entry.getValue()>=80) ? "합격" : "불합격";
                System.out.println(entry.getKey()+":"+status);
            }
        }
    }
}
