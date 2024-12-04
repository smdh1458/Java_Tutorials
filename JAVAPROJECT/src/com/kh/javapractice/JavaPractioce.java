package com.kh.javapractice;

import java.io.*;
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
        /*
        * ArrayList<String> names = new ArrayList<>();
        * names.add("Alice");
        * names.add("Bob");
        * names.add("Andrew");
        * names.add("Eve");
        *
        * */
        /*
        * String 참조 자료형에 들어있는 기능
        * 맨 앞에 변수명으로는 boolean 을 쓸 수 있음
        * startWith(String prefix) = prefix 로 시작하는 글자가 있는지 확인
        * 예제) boolean startWord = String으로들어있는변수명.startWith("시작하는단어글자");
        *
        * endWith(String suffix) = suffix 로 끝나는 글자가 있는지 확인
        * 예제) boolean endWord = String으로들어있는변수명.endWith("끝나는단어글자");
        *
        *
        * prefix = 시작하는 접두사
        * suffix = 끝나는   접미사
        * 접두사 = 접할 접 머리 두 언어 사
        * 접미사 = 접할 접 꼬리 미 언어 사 (사는 축사 축하하는 말씀 할 때 쓰는 사)
        * */
        for (String name : names) {
            if(name.startsWith("A")) {
                System.out.print(name+ " ");
            }
        }
    }

    public void method3() {
        System.out.print("첫번째 정수를 입력: ");
        int a = sc.nextInt();
        System.out.print("두번째 정수를 입력: ");
        int b = sc.nextInt();

        /*
        try{
            int result = a / b;
            System.out.println("결과: "+result);
        }catch(ArithmeticException e){
            System.out.println("오류");
        }
       */
        if (b!=0){
            int result = a/b;
            System.out.println(result);
        }else{
            System.out.println("Cannot divide by zero");
        }
    }

    public void method5() {
        String path = System.getProperty("user.home")+"/Desktop/";
        String readFile = "numbers.txt";
        int sum= 0;
        //파일 쓰기 = File(경로랑 파일이름 가져오기) / FileWriter(가져온 파일에 글자 작성하기)
        // 파일 읽기 = FileReader(읽어올 파일의 경로와 이름가져오기) / BufferedReader (FileReader를 도와주는 객체)

        //File은 try catch 안에 들어있지 않아도 됨
        //FileWriter , FileReader, BufferedReader 는 try 내부에 들어있어야함 try{} try()
        try (FileReader file = new FileReader(path + readFile);
             BufferedReader reader = new BufferedReader(file)){
            String line;
            while ((line = reader.readLine()) != null) {
                //window 컴퓨터의 경우 뒤에 숨겨진 공백이 존재하기 때문에
                //trim() 양쪽 공백 제거를 이용해서 한 번 제거를 진행해야함
                //우리 눈에는 공백이지만 \r과 같은 공백이 포함되어 있음  [\r -> 왼쪽 끝으로 키보드 커서 이동]
                sum += Integer.parseInt(line.trim());
            }
        } catch (Exception e) {
           System.out.println("예상치 못한 문제로 파일을 읽을 수 없습니다."+e.getMessage());
        }
        // 위는 numbers.txt 내부에 들어있는 숫자들을 모두 더하는 기능

        // 아래는 모두 더해진 숫자를 result.txt 작성하는 기능
        try (FileWriter writer = new FileWriter(path + "result.txt")){
            writer.write("Sum: "+sum);
            System.out.println("더한 결과 작성 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
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
        int div = 0; //num2의 값이 0이 오면 0으로 숫자를 나눌수 없습니다 예외 발생
        try {
            div = num1/num2;
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
        int mod = num1%num2;

        System.out.println("합:" +plus + "\n차: "+minus+"\n곱: "+multi+"\n몫: "+div+"\n나머지: "+mod);

    }
    public static void main(String[] args) {
        JavaPractioce jp = new JavaPractioce();
        BankAccount bank = new BankAccount();
        System.out.println("====홀수 합출력====");
        jp.method1();
        System.out.println("====첫 번째 글자가 A로 시작하는 단어 찾기====");
        jp.method2();
        System.out.println("\n====나눗셈 결과 출력====");
        jp.method3();
        System.out.println("====파일안에 있는 숫자 더하고, 더한 숫자 result.txt 저장하기====");
        jp.method5();
        bank.setAccountNumber(123456789);
        bank.setBalance(100);
        System.out.println("====계산기 실행하기====");
        jp.method7();
        //아직 미완성입니다.

    }
}

