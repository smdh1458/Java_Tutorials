package com.kh.conditionEx;

public class ConditionPre {
    public void method1(int month) {
        String result = "";//계절에 따른 결과
        
        //중괄호를 생략해서 마지막의 계절의 결과 표기
        if(month == 12 || month == 1 || month ==2)result = "겨울";
        else if (month == 3 || month ==4 || month ==5 )result = "봄";
        //else if (month >= 3 && month <=5 )result = "봄";
        else if (month ==6 || month ==7 || month ==8)result = "여름";
        //else if (month >=6 && month <=8)result = "여름";
        else if (month ==9 || month ==10 ||month ==11)result="가을";
        //else if (month >=9 && month <=11)result="가을";

        else System.out.println("잘못된 입력임");
        //여기에 겨울

        System.out.println(month + "월의 계절은 ["+result+"] 입니다.");
    }
}
