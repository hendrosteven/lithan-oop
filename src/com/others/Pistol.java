package com.others;

public class Pistol extends Senjata{

    public void reload(int peluru){
        if(peluru>6){
            this.peluru = 6;
        }else{
            this.peluru = peluru;
        }
        if(peluru<0){
            System.out.println("Peluru minal 1");
        }
    }

}
