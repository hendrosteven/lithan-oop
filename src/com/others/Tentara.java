package com.others;

public class Tentara {
    String name;
    Senjata senjata;

    public Tentara(){

    }

    public Tentara(String name){
       this.setName(name);
    }

    public Tentara (String name, Senjata senjata){
        this.setName(name);
        this.setSenjata(senjata);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSenjata(Senjata senjata){
        this.senjata = senjata;
    }

    public void menembak(){
        if(this.senjata!=null){
            System.out.println(this.name+" menembak");
            this.senjata.tembak();
        }else{
            System.out.println("Silahkan pilih senjata!");
        }
    }

    public void mereload(int peluru){
        if(this.senjata!=null){
            System.out.println(this.name+" mereload");
            this.senjata.reload(peluru);
        }else{
            System.out.println("Silahkan pilih senjata!");
        }
    }

}
