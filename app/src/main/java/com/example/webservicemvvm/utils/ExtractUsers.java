package com.example.webservicemvvm.utils;

import com.example.webservicemvvm.model.Coffe;
import com.example.webservicemvvm.model.User;

import java.util.List;
import java.util.stream.Collectors;

public class ExtractUsers {

    public static String[] getNames(List<Object> list) {

        if (list.get(0).getClass().equals(User.class)){

            String[]  names = new String[list.size()] ;
            for(int i=0 ; i<list.size() ; i++){
               User user  = (User)list.get(i);
               names[i] = user.getLogin() ;
            }
            return  names ;
        }
        else{
            String[] names = new String[list.size()] ;
            for (int i = 0 ;i<list.size();i++){
                Coffe coffe = (Coffe) list.get(i) ;
                names[i] = coffe.getNom() ;
            }
            return  names ;
        }
    }
    public  static String[] getDescription(List<Object> list){

        if(list.get(0).getClass().equals(User.class)){
            String[]  desc = new String[list.size()] ;
            for(int i=0 ; i<list.size() ; i++){
                User user  = (User)list.get(i);
                desc[i] = user.getType() ;
            }
            return  desc ;
        }else{
            String[]  desc = new String[list.size()] ;
            for(int i=0 ; i<list.size() ; i++){
                Coffe  coffee  = (Coffe) list.get(i);
                desc[i] = coffee.getAdresse() ;
            }
            return  desc ;
        }
    }

    public  static String[] getPics(List<Object> list){

        if(list.get(0).getClass().equals(User.class)){
            String[] pics = new String[list.size()] ;
            for(int i=0;i<list.size();i++){
                User user = (User) list.get(i) ;
                pics[i] = user.getAvatar() ;
            }
            return  pics ;
        }else{
            String[] pics = new String[list.size()] ;
            for(int i=0;i<list.size();i++){
                Coffe coffe = (Coffe) list.get(i) ;
                pics[i] = coffe.getImage();
            }
            return  pics ;
        }


    }
}
