package com.example.webservicemvvm.utils;

import com.example.webservicemvvm.model.User;

import java.util.List;

public class ExtractUsers {

    public static String[] getNames(List<User> users) {
        String[]  names = new String[users.size()] ;
        for(int i=0 ; i<users.size() ; i++){
            names[i] = users.get(i).getLogin() ;
        }
        return  names ;
    }
    public  static String[] getDescription(List<User> users){
        String[]  desc = new String[users.size()] ;
        for(int i=0 ; i<users.size() ; i++){
            desc[i] = users.get(i).getType() ;
        }
        return  desc ;
    }

    public  static String[] getPics(List<User> users){
        String[]  pictures = new String[users.size()] ;
        for(int i=0 ; i<users.size() ; i++){
            pictures[i] = users.get(i).getAvatar() ;
        }
        return  pictures ;
    }
}
