package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;

public class ProductService {
    //products(제품들) = 제품목록 저장할 배열 리스트
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + "제품이 추가되었습니다.");
    }
    //제품 목록 보기
    public void viewProduct() {
        if(products.size() > 0) {
            System.out.println("========제품 목록========");
            for (Product p : products) {
                System.out.println(p);
                System.out.println("---------------");
            }
        }
    }

    //특정 제품 검색 기능
    public Product searchProduct(String name) {
        for (Product p : products) {// 제품목록을 순회하며
            if (p.getName().equalsIgnoreCase(name)){ //검색한 이름과 목록에 적혀있는 이름이 일치하면
                return p; //찾는 이름과 존재하는 이름이 일치하는 제품정보를 전달
            }
        }
        return null;// 찾는 정보가 없으면 null값 전달
    }
}
