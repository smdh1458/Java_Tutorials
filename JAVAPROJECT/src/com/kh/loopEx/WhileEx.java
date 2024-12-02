package com.kh.loopEx;

public class WhileEx {
    /*
    * while(조건이 true일때 실행)
    *
    * }
    *
    * while을 멈추는 방법 1
    *   특정 조건에서 return
    *
    * while을 멈추는 방법2
    *  변수명에 논리값(true / false)를 담고
    *  멈추고자 하는 특정 조건에서 논리값을 false로 변경
    * boolean is = true;
    *   while(is){
    *       is = false;
    * }
    *
    * while을 멈추는 방법3
    * 조건을 false로 변경
    * while(조건){
    *   조건이 false가 될 때 까지 수행
    *
    * }
    * */

    //Scanner로 input값을 전달받고 전달받은 값을 method1에 넣어준 후
    // 넣은 값에 대한 결과를 method1 실행
    // Scanner는 Run에서만 사용할것
    public void method1(int input){
        int sum = 0;// 합계 누적용 변수
        //int input = 0; // 입력값을 저장할 변수

        while(input != -1){//입력값이 -1이 아니면 반복
            System.out.print("-----반복시작----");

            if(input != -1) sum += input; //-1이 입력된 경우 제외
            //입력한 값 갱신을 위해 설정하는 input
            //input = new Scanner(System.in).nextInt();
        }
        System.out.println("합계: "+sum);
    }
}
