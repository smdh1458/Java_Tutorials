package com.kh.javapractice;

public class AnimalRun {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        System.out.println("\n=======================");
        System.out.println("Cat은 Animal에 적혀있는 동물 소리까지 출력하도록");
        System.out.println("기능을 작성했기 때문에 Animal에 적혀있는 \"동물소리출력\" ");
        System.out.println("[동물소리] 가 출력되는 것을 제거하고 싶다면");
        System.out.println("Cat.java에서 makeSound()에 적혀있는");
        System.out.println("super.makeSound()를 제거하면 [동물소리 출력이 사라짐]");
        System.out.println("=======================");
        Cat cat = new Cat();
        cat.makeSound();

    }
}
