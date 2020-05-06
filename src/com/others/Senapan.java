package com.others;

public class Senapan extends Senjata{

    public void tembak(){
        if(peluru>0){
            System.out.println("trrrrttt..trrrtt..trrrtt");
            peluru -= 3;
        }else{
            System.out.println("please reload!");
        }
    }

    public void reload(int peluru){
        if(peluru>20){
            this.peluru = 20;
        }else{
            this.peluru = peluru;
        }
        if(peluru<0){
            System.out.println("Peluru minal 1");
        }
    }
}
