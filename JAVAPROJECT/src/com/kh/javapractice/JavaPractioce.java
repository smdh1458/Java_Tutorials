package com.kh.javapractice;

import java.util.Scanner;

public class JavaPractioce {
    Scanner sc = new Scanner(System.in);

    int[] numbers = {1, 2, 3, 4, 5};
    public void method1() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 1) {
                sum = sum + numbers[i];
            }
        }
        System.out.println("홀수값의 합: "+sum);
    }
    String[] names={"Alice","Bob","Andrew","Eve"};
    public void method2() {
        for (String name : names) {
            if(name.startsWith("A")) {
                System.out.print(name+ " ");
            }
        }
    }

    public void method3() {
        System.out.println(" ");
        System.out.print("첫번째 정수를 입력: ");
        int a = sc.nextInt();
        System.out.print("두번째 정수를 입력: ");
        int b = sc.nextInt();
        if (b!=0){
            int result = a/b;
            System.out.println(result);
        }else{
            System.out.println("Cannot divide by zero");
        }
    }

    public void method7() {
        System.out.print("연산할 정수1를 입력: ");
        int num1 = sc.nextInt();
        System.out.print("연산할 정수2를 입력: ");
        int num2 = sc.nextInt();
        int plus = num1+num2;
        int minus = num1-num2;
        int multi = num1*num2;
        int div = num1/num2;
        int mod = num1%num2;

        System.out.println("합:" +plus + "\n차: "+minus+"\n곱: "+multi+"\n몫: "+div+"\n나머지: "+mod);

    }
    public static void main(String[] args) {
        JavaPractioce jp = new JavaPractioce();
        BankAccount bank = new BankAccount();
        jp.method1();
        jp.method2();
        jp.method3();
        bank.setAccountNumber(123-456-789);
        bank.setBalance(500);
        jp.method7();


    }
}

