package com.kh.practiceEx.oopArrayPre;

public class Product {
    private String name;
    private int price;
    private String description;
    private String category;

    //메서드 기본생성자 파라미터생성자 게터 세터 toString
    //파라미터 생성자는 name price만 생성

    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }



    //setter의 경우 저장
    //선택적으로 상품설명과 카테고리는 선택사항으로 저장유무 결정


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //getter의 경우 매개변수생성자(파라미터생성자)나
    //setter로 가져온 정보 반환
    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "제품명=" + name + ", \n제품가격=" + price + ", \n제품설명=" + description + ", \n카테고리=" + category;
    }
}
