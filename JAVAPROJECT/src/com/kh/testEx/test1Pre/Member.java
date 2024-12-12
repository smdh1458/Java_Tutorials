package com.kh.testEx.test1Pre;

public class Member {
    /*
    *  -: private       +: public
    * */
    private String id;
    private String name;
    private String password;

    //기본생성자 생성
    public Member() {
    }

    //+ Member(id:String, name:String,password:String)
    public Member(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String inputId, String inputPassword) {
        if (inputId.equals(id) && inputPassword.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

}
