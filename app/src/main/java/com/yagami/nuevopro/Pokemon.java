package com.yagami.nuevopro;

import java.util.ArrayList;

public class Pokemon {
    public int number;
    public String name;
    public String url;


    public  void SetNumber (int number) {
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public void SetName (String name){
        this.name = name;
    }

    public  String getName(){
        return name;
    }

    public void SetUrl (String url){
        this.url = url;
    }

    public String getUrl(){
        return url;
    }
}
