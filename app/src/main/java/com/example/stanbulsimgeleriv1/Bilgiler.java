package com.example.stanbulsimgeleriv1;

import java.io.Serializable;

public class Bilgiler implements Serializable {
    String isim;
    String kent;
    String info;
    int resim;

    public Bilgiler(String isim , String kent , String info , int resim){
        this.isim = isim;
        this.kent = kent;
        this.info =info;
        this.resim= resim;
    }

}
