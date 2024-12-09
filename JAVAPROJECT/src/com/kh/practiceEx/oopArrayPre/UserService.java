package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public  void setSaveAllUser(){
        Scanner sc = new Scanner(System.in);
        User u = new User();

        System.out.println("사용자를 등록합니다.");
        System.out.print("이름을 입력하세요(2자이상 5자 이하 작성가능): ");
        String inputName = sc.nextLine();

        if (inputName != null && inputName.length() <= 6 && inputName.length() >= 2) {
            u.setName(inputName);//String 변수명 = u.setUserName형식으로 변수명에 저장 불가
            System.out.println("[" + u.getName() + "]저장되었습니다.");
        }else {
            System.out.println("이름은 빈칸이거나 1글자 미만 6글자 이상 작성할 수 없습니다.");
            return;//이메일, 나이 작성 못하게 돌려보내기
        }


        //나이를 입력하세요 (0~100 입력가능) 아무값도 입력이 안됐을 때 생기는
        //예외 처리 빈칸으로 입력할 수 없습니다.
       System.out.print("나이를 입력하세요 (0~100입력가능): ");
        int inputAge = sc.nextInt();
        sc.nextLine();
        try {
            if (0 < inputAge && inputAge < 100) {
                u.setAge(inputAge); //int 변수명 u.setAge형식으로 변수명에 저장 불가
                System.out.println("[" + u.getAge() + "] 저장되엇습니다.");
            } else {
                System.out.println("나이는 1이상 100미만으로 작성 가능합니다");
                return;
            }
        } catch (Exception e) {
            System.out.println("나이는 숫자만 입력 가능합니다.");
            return;
        }

        //8글자 이상
        System.out.print("이메일을 입력하세요: ");
        String inputEmail = sc.nextLine();
        if (inputEmail != null && inputEmail.length() < 30 && inputEmail.length() >= 8) {
            u.setEmail(inputEmail);//String 변수명 = u.setEmail 형식으로 변수명에 저장 불가
            System.out.println("["+u.getEmail()+"] 저장되었습니다.");
        }else {
            System.out.println("이메일은 빈칸이거나 8글자 이하, 30글자 이상 작성불가합니다!");
            return;
        }


        ArrayList<User> userList = new ArrayList<User>();

        System.out.println(u.toString());
    }

    //메서드 명칭 : void 기능 paraNameEmail()
    //Scanner 사용
    //매개변수 생성자 통해서 저장 나이는 필수가 아님
    //매개변수 생성자 -> 이름 / 이메일만 필수로 받도록 수정

    //나이를 입력하시겠습니까? yes / no 대소문자 구분없이 입력받기

    //yes했다면 setAge을 통해 입력받은 이메일 값저장
    public void paraNameEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력: ");
        String inputName = sc.nextLine();
        System.out.print("이메일을 입력: ");
        String inputEmail = sc.nextLine();
        User u1 = new User(inputName, inputEmail);

        System.out.print("나이을 입력하시겠습니까?(yes / no): ");
        String inputAnswer = sc.nextLine();
        if (inputAnswer.equalsIgnoreCase("yes")) {
            System.out.print("그렇다면 나이를 입력: ");
            int inputAge = sc.nextInt();
            sc.nextLine();
            if (0 < inputAge && inputAge < 100) {
                u1.setAge(inputAge); //int 변수명 u.setAge형식으로 변수명에 저장 불가
                System.out.println("나이가 성공적으로 저장되엇습니다.");
            } else {
                System.out.println("나이는 1이상 100미만으로 작성 가능합니다");
                return;
            }
        }else if (inputAnswer.equalsIgnoreCase("no")) {
            System.out.println("입력안함을 선택함");
        }else {//yes no 이외 다른 글자를 입력했을 시
            System.out.println("잘못된 입력임");
            return;
        }

        System.out.println("====저장된 결과 출력=====");
        System.out.println(u1.toString());
    }
}
