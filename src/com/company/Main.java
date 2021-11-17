package com.isvestine;

import com.bazine.ZmogusImpl;
import com.isvestine.isvestine.StatybininkasImpl;
public class Main {

    public static void main(String[] args) {
        /* sukuriami 4 vaiko klases objektai */
        StatybininkasImpl statybininkasImpl1 = new StatybininkasImpl("vyras", "3551256888", "Petka",
                "Petrovis", 25, 65, 185, "ruda", 15, "mechanioras",
                "aukstasis", 1555.55 );
        StatybininkasImpl statybininkasImpl2 = new StatybininkasImpl("vyr", "555555","Petacka",
                "Juozininis", 55, 89, 185, "red", 14,"driver",
                "zemas", 1000.12);
        StatybininkasImpl statybininkasImpl3 = new StatybininkasImpl("vyras", "3551256888", "Petka",
                "Petrovis", 25, 65, 185, "ruda", 15, "mechanioras",
                "mokykla", 1255.55 );
        StatybininkasImpl statybininkasImpl4 = new StatybininkasImpl("vyr", "555555","Petacka",
                "Juozininis", 55, 89, 185, "red", 14,"driver",
                "vidurine", 1100.12);

        /*sukuriami tevo klases objektai*/
        ZmogusImpl zmogusImpl1 = new ZmogusImpl("vyr", "356565656", "Juozas", "Aleks",
                45, 98, 189, "dark");
        ZmogusImpl zmogusImpl2 = new ZmogusImpl("vyr", "356565656", "Juozas", "Aleks",
                45, 98, 189, "green");
        ZmogusImpl zmogusImpl3 = new ZmogusImpl("vyr", "356565656", "Juozas", "Aleks",
                45, 98, 189, "yellow");
        ZmogusImpl zmogusImpl4 = new ZmogusImpl("vyr", "356565656", "Juozas", "Aleks",
                45, 98, 189, "black");

       /*sukuriamas tevines klases masyvas */
        ZmogusImpl [] sarasasStatybininkuZmoniu = {statybininkasImpl1, statybininkasImpl2, statybininkasImpl3, statybininkasImpl4,
                zmogusImpl1, zmogusImpl2, zmogusImpl3, zmogusImpl4};

        /*bus atspausdinta kiek uzdirba statybininkai kartu sumoje */
        double suma = 0;
        for (ZmogusImpl zmogus : sarasasStatybininkuZmoniu) {
            if(zmogus instanceof StatybininkasImpl) {
                StatybininkasImpl statybininkas = (StatybininkasImpl) zmogus;
                suma += statybininkas.getAtlyginimas();
            }

        }
        System.out.println("Statybininku atlyginimu suma: " +suma);
    }

}