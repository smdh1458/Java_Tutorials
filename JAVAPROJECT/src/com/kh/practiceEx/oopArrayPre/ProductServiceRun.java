package com.kh.practiceEx.oopArrayPre;

import java.awt.*;
import java.util.Scanner;

public class ProductServiceRun {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner sc = new Scanner(System.in);


        //제품명 가격 입력받기
        System.out.print("제품명 입력하기: ");
        String inputName = sc.nextLine();
        System.out.print("제품 가격 입력하기: ");
        int inputPrice = sc.nextInt();
        String inputDescription = null;
        String inputCategory = null;


        System.out.print("설명과 카테고리 입력하실건가요?(yes / no): ");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.print("설명을 입력하셈: ");
            inputDescription = sc.nextLine();
            sc.nextLine();
            System.out.print("카테고리를 입력하셈: ");
            inputCategory = sc.nextLine();
            System.out.println("설명과 카테고리 저장완료");
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("추후에 수정 가능합니다.");
            inputDescription = "제품설명이 존재하지 않습니다.";
            inputCategory = "없음";
        } else {
            System.out.println("잘못된 입력임");
        }
        Product p = new Product(inputName,inputPrice); //이렇게 해줄 경우 setName과 setPrice가 필요 없음
        p.setDescription(inputDescription);
        p.setCategory(inputCategory);
        productService.addProduct(p);

        //제품 설명과 카테고리는 입력유무를 물어본후 yes로 입력하면
        //제품설명과 카테고리 작성
        //no 입력하면 제품명과 가격만 저장


        /*
        //p1제품 추가
        Product p1 = new Product("스마트폰", 100000);
        p1.setDescription("최신 스마트폰입니다. 12/24 출고예정");
        p1.setCategory("전자기기");

        //p2제품 추가
        Product p2 = new Product("노트북", 150000);
        //p2에서 제품설명과 카테고리가 null값일 경우 없음으로 저장
        if (p2.getDescription() == null){//get에서 저장된 값이 없을 경우 null
            p2.setDescription("없음");
        }

        if (p2.getCategory() == null){
            p2.setCategory("없음");
        }

        productService.addProduct(p1);
        productService.addProduct(p2);
        */
        //제품목록보기
        productService.viewProduct();

        /*
        //제품명으로 제품검색
        //searchProduct 기능이 void가 아닌 return 값이 product 이기 때문에 Product 자료형으로 변수명 설정
        Product sp = productService.searchProduct("노트북");
        if(sp != null){
            System.out.println("검색된 제품: "+ sp);
        }else {
            System.out.println("해당 이름의 제품을 찾을 수 없습니다.");
        }
        */
    }
}
