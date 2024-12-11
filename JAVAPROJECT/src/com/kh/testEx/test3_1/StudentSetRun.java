package com.kh.testEx.test3_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentSetRun {
    public static void main(String[] args) {
        Set<String> studentSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("학생 관리 프로그램");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 출력");
            System.out.println("4. 특정 학생 존재 여부 확인");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("=== [1]학생추가===");
                    System.out.print("추가할 학생을 입력: ");
                    String name = scanner.nextLine();
                    /*
                    if (studentSet.contains(name)) {
                        System.out.println("이미 존재하는 학생입니다.");
                    }else {
                        studentSet.add(name);
                        System.out.println("추가를 완료했습니다.");
                    }

                     */
                    if(studentSet.add(name)) {
                        System.out.println(name + "이(가) 추가되었습니다.");
                    }else {
                        System.out.println(name+"은 이미 존재하는 학생입니다.");
                    }
                    break;
                case 2:
                    System.out.println("=== [2]학생삭제===");
                    System.out.print("삭제할 학생을 입력: ");
                    String removeName = scanner.nextLine();
                    /*
                    if (studentSet.contains(removeName)) {
                        studentSet.remove(removeName);
                        System.out.println("삭제를 완료하였습니다.");
                    }else {
                        System.out.println("존재하지 않는 학생입니다.");
                    }

                     */
                    if(studentSet.remove(removeName)) {
                        System.out.println(removeName+"이(가) 삭제되었습니다.");
                    }else {
                        System.out.println("존재하지 않는 학생입니다.");
                    }
                    break;
                case 3:
                    System.out.println("=== [3]학생목록===");
                    if(studentSet.isEmpty()) {
                        System.out.println("학생목록이 비어있습니다.");
                    }else {
                        for (String outName : studentSet){
                            System.out.println(outName);
                        }
                    }
                    break;
                case 4:
                    System.out.println("=== [4]특정학생조회===");
                    System.out.print("검색할 학생 입력: ");
                    String searchName = scanner.nextLine();
                    if (studentSet.contains(searchName)) {
                        System.out.println(searchName+"은(는) 존재하는 학생입니다.");
                    }else {
                        System.out.println(searchName + "은(는) 목록에 존재하지 않는 학생입니다.");
                    }
                    break;
                case 5:
                    System.out.println("프로그램 종료할거임");
                    exit = true;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
