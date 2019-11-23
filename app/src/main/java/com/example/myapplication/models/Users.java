package com.example.myapplication.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Users {
    public String username;
    public String password;

    public static Boolean passwordIsValid(String User,
                                          String Password){
        for (Users i:getUsers() ) {
            if (i.username.equals(User)){
                if (i.password.equals(Password)){
                    return true;
                }
            }
        }
        return false;
    }
    public static List<Users> getUsers(){
        ArrayList<Users> list = new ArrayList<Users>();
        Users o = new Users();
        o.username = "bichito";
        o.password = "123456";
        list.add(o);
        Users t = new Users();
        t.username = "user01";
        t.password = "1234567";
        list.add(t);
        Users x = new Users();
        x.username = "user02";
        x.password = "12345678";
        list.add(x);
        Users y = new Users();
        y.username = "user03";
        y.password = "123456789";
        list.add(y);
        return  list;
    }
}
