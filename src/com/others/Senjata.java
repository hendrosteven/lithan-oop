package com.others;

public class Senjata {
    int peluru;

    public Senjata(){
    }

    public Senjata(int peluru){
        this.reload(peluru);
    }

    public void tembak(){
        if(peluru>0){
            System.out.println("doorr..");
            --peluru;
        }else{
            System.out.println("please reload!");
        }
    }

    public void reload(int peluru){
        this.peluru = peluru;
    }
}
