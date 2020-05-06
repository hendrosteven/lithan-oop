package com.company;

import com.others.Pistol;
import com.others.Senapan;
import com.others.Senjata;
import com.others.Tentara;

public class Main {

    public static void main(String[] args) {
        Senjata senjata = new Senjata();

        Pistol pistol = new Pistol();
        Senapan senapan = new Senapan();

        Tentara tentara = new Tentara("Rambo");
        tentara.setSenjata(senapan);
        tentara.mereload(3);
        tentara.menembak();
        tentara.menembak();
        tentara.menembak();
        tentara.menembak();
    }


}
