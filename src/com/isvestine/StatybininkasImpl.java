package com.isvestine.isvestine;

import com.bazine.ZmogusImpl;

public class StatybininkasImpl extends ZmogusImpl implements com.isvestine.isvestine.Statybininkas {

    private int stazas;
    private String specializacija;
    private String issilavinimas;
    private double atlyginimas;

    public StatybininkasImpl(String lytis, String asmensKodas, String vardas, String pavarde, int amzius,
                             int svoris, int ugis, String plaukuSpalva, int stazas, String specializacija,
                             String issilavinimas, double atlyginimas)  {

        /* pirmiausia kvieciamas tevo konstruktorius ir perduodami tevo konstr parametrai */

        super(lytis, asmensKodas, vardas, pavarde, amzius, svoris, ugis, plaukuSpalva);
        this.stazas = stazas;
        this.specializacija = specializacija;
        this.issilavinimas = issilavinimas;
        this.atlyginimas = atlyginimas;
    }

    @Override
    public void setStazas(int stazas) {
        this.stazas = stazas;
    }

    @Override
    public int getStazas() {
        return stazas;
    }

    @Override
    public void setIssilavinimas(String issilavinimas) {
        this.issilavinimas = issilavinimas;
    }

    @Override
    public String getIssilavinimas() {
        return issilavinimas;
    }

    @Override
    public void setSpecializacija(String specializacija) {
        this.specializacija = specializacija;
    }

    @Override
    public String getSpecializacija() {
        return specializacija;
    }

    @Override
    public void setAtlyginimas(double atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    @Override
    public double getAtlyginimas() {
        return atlyginimas;
    }

    @Override
    public String toString() {
        return "Statybininkas{" +
                "stazas=" + stazas +
                ", specializacija='" + specializacija + '\'' +
                ", issilavinimas='" + issilavinimas + '\'' +
                ", atlyginimas=" + atlyginimas +
                '}';
    }
}
