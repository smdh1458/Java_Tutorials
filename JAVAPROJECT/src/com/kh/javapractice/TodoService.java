package com.kh.javapractice;

import java.util.Map;

public interface TodoService {
    /**
    * 할일 목록 반환 서비스
    * @return todoList + 완료개수
    *
    * */
    Map<String, String> todoListFullView();

    /**
    * 할일 추가 기능
    * @param title      할 일의 제목
    * @param detail     할 일의 상세내용
    * @return 추가된    할 일의 번호를 전달 / 전달 실패시 -1 뜸
    * */
    int todoAdd(String title, String detail);

    /***
     * 할 일 수정 기능
     * @param index     = 수정할 할 일의 번호
     * @param title     = 수정할 할 일의 제목
     * @param detail    = 수정할 할 일의 상세 내용
     * @return              할 일 수정 성공 실패 여부를 true / false 전달
     */
    boolean todoUpdate(int index, String title, String detail);
}
