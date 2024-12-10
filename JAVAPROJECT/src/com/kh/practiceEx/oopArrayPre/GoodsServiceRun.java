package com.kh.practiceEx.oopArrayPre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodsServiceRun {
    public static void main(String[] args) {
        GoodsService goodsService = new GoodsService();
        Scanner scanner = new Scanner(System.in);

        //false가 될 때 까지 반복
        while (true) {
            System.out.println("\n===== 상품 설정 시스템 =====");
            System.out.println("1.상품추가하기");
            System.out.println("2.모든상품보기");
            System.out.println("3.원하는 상품보기(상품번호로 조회)");
            System.out.println("4.원하는 상품보기(상품명으로 조회)");
            System.out.println("5.상품제거하기(상품번호로 제거)");
            System.out.println("6.종료하기");
            System.out.print("번호를 선택 하세요: ");



            try {
                int choice = scanner.nextInt();
                scanner.nextLine();//줄바꿈 버퍼 제거

                switch (choice) {
                    case 1:
                        System.out.println("추가할 상품을 입력");
                        System.out.print("상품번호 입력: ");
                        int inputId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("상품명 입력: ");
                        String inputName = scanner.nextLine();
                        System.out.print("상품 가격 입력: ");
                        double inputPrice = scanner.nextDouble();
                        System.out.print("상품 수량 입력: ");
                        int inputQuantity = scanner.nextInt();
                        Goods goodsInput = new Goods(inputId, inputName, inputPrice, inputQuantity);
                        goodsService.addGoods(goodsInput);
                        break;
                    case 2:
                        goodsService.displayAllGoods();
                        break;
                    case 3:
                        System.out.print("검색할 상품번호를 입력하세요: ");
                        int searchId = scanner.nextInt();
                        Goods goods = goodsService.getGoodsbyId(searchId);
                        if (goods != null) {
                            System.out.println(goods.toString());
                        }
                        break;
                        case 4:
                            System.out.print("검색할 상품명를 입력하세요: ");
                            String searchName = scanner.nextLine();
                            Goods goods2 = goodsService.getGoodsByName(searchName);
                            if (goods2 != null) {
                                System.out.println(goods2.toString());
                            }
                            break;
                    case 5:
                        System.out.print("제거할 상품 번호를 입력하세요: ");
                        int removeId = scanner.nextInt();
                        goodsService.removeGoods(removeId);
                        break;
                    case 6:
                        System.out.println("시스템 종료를 선택하셨습니다.");
                        return;
                    default:
                        System.out.println("잘못된 입력입니다.숫자만 입력가능");
                        break;
                }

            }catch (InputMismatchException e){//숫자칸에 문자를 넣었을때 보여줄 출력문
                System.out.println("숫자형식만 가능합니다. "+ e.getMessage());
                scanner.nextLine(); //예외발생이 입력 버퍼에 남아있던 잘못된 값을 비우기

            }catch (Exception e) {
                // 숫자형식에 글자를 넣었을 문제 이외 다른 문제가 발생했을 경우
                // 표기할 출력문 작성
                System.out.println("문제가 발생하였습니다. "+e.getMessage());
            } finally { //실행하는 반복문이 우선이기 때문에 동작 X
                System.out.println("프로그램을 종료합니다.");
            }
        }
    }
}
