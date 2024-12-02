package com.kh.loopEx;

import java.util.Scanner;

public class LoofRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ForEx forex = new ForEx();
        //forex.method1();
        //forex.method2();

        WhileEx whileEx = new WhileEx();
        System.out.print("숫자를 입력: ");
        int input = sc.nextInt();
        whileEx.method1(input);
    }
}
