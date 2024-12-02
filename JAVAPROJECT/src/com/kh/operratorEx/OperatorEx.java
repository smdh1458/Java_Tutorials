package com.kh.operratorEx;

public class OperatorEx {
    /*
     산술 연산자 (Arithmetic Operators)
     +  덧셈  -  뺄셈    * 곱셈    /몫 계산하는 나눗셈     % 나머지 연산

     할당 연산자 (Assignment Operators)
      = 대입
     += 덧셈 후 대입
     -=뺄셈후 대입
     *= 곱셈 후 대입
     /= 나눗셈 후 대입
     %= 나머지 연산 후 대입

     비교 연산자(Relational Operators)
     == 값이 같으면 참
     != 값이 다르면 참
     > 왼쪽이 크면 참
     < 오른쪽이 크면 참
     >= 왼쪽이 크거나 같으면 참
     <= 오른쪽이 크거나 같으면 참

    논리 연산자(Logical Operators)
    &&  AND (모두 참이면 참)
    ||   OR (하나라도 참이면 참)
    !   NOT (값을 반전시킨다.)

    단항 연산자(Unary Operators)
    +   양수
    -   음수
    ++  1증가(전위 / 후위)
    --  1감소(전위 / 후위)
    !   논리 부정           ->!true => false

    *** 전위 연산자 (++변수명  / --변수명)
        연산이 먼저 진행된 후, 연산이 완료된 값을 사용
    *** 후위 연산자
        현재 값을 먼저 사용하고, 이후에 변수의 값이 증가 또는 감소의 연산을 진행

    변수명++ //= 변수명에 +1이외에 대입하거나 값을 넣어줘야 할 일 X
    ++변수명 //= 변수명에 +1이외에 대입하거나 값을 넣어줘야 할 일 X
    int result = ++변수명; // 변수명 +1을 해준 다음 +1이 된 변수명을 result넣어줌
    --- 위 셋은 변수명과 result의 결과값이 같음

    int result = 변수명++;
    -- result 에 +1을 안한 변수명을 넣어주고, 그 다음에 변수명에 +1을 해주기 때문에
       result 가 변수명보다 값이 1 적음


    삼항 연산자(Ternary Operators)
    (   )          ?       true      :    false
         조건이 참이면 첫 번째 값 반환 거짓이면 두번째 값 반환

    기타 연산자
    .      멤버 접근 연산자            ex.method1()    ex 내부에 있는 method1() 기능 호출
    []     배열 요소 접근              arr[0]             첫번째 요소 접근
    ()     매서드 호출 또는 우선순위   sum(5, 3)          5랑 3먼저 가져오기 실행
    new    객체 생성 연산자                               새로운 객체 생성
    */
}
