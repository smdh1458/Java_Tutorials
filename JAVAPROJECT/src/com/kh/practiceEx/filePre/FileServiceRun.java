package com.kh.practiceEx.filePre;

import java.io.File;

public class FileServiceRun {
    public static void main(String[] args) {
        FileService fileService = new FileService();

        //파일에 작성할 내용
        //맛있는 음식 목록: 줄바꿈 - 피자 줄바꿈 - 치킨 줄바꿈 - 초밥 - 줄바꿈 - 파스타
        //createFile 기능 호출 자료형 없는 매개변수명으로 파일 작성내용 넣어주기
        String content = "\n피자 \n치킨 \n초밥 \n파스타";
        fileService.createFile(content);


        fileService.readFile();

        String content2 = "\n - 햄버거 \n- 돈까스 \n - 쌀국수 \n- 카레";
        fileService.appendToFile(content2);

        fileService.readFile();
    }
}
