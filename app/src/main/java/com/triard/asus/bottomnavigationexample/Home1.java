package com.triard.asus.bottomnavigationexample;

public class Home1 {
    int image;
    String title, desc;

    public Home1(int image, String title, String desc){
        this.image = image;
        this.title = title;
        this.desc = desc;
    }

    public int getImage(){
        return image;
    }

    public String getTitle(){
        return title;
    }

    public String getDesc(){
        return desc;
    }
}
