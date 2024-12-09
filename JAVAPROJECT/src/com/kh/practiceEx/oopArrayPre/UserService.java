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
}
