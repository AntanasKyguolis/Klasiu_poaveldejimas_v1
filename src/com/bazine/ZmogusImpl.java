package com.bazine;

public class ZmogusImpl implements Zmogus {
    private String lytis;
    private String asmensKodas;
    private String vardas;
    private String pavarde;
    private int amzius;
    private int svoris;
    private int ugis;
    private String plaukuSpalva;

    public ZmogusImpl(String lytis, String asmensKodas, String vardas, String pavarde, int amzius, int svoris, int ugis, String plaukuSpalva) {
        this.lytis = lytis;
        this.asmensKodas = asmensKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.svoris = svoris;
        this.ugis = ugis;
        this.plaukuSpalva = plaukuSpalva;
    }

    @Override
    public String toString() {
        return "Zmogus{" +
                "lytis='" + lytis + '\'' +
                ", asmensKodas=" + asmensKodas +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", amzius=" + amzius +
                ", svoris=" + svoris +
                ", ugis=" + ugis +
                ", plaukuSpalva='" + plaukuSpalva + '\'' +
                '}';
    }

    @Override
    public String getLytis() {
        return lytis;
    }

    @Override
    public void setLytis(String lytis) {
        this.lytis = lytis;
    }

    @Override
    public String getAsmensKodas() {
        return asmensKodas;
    }

    @Override
    public String getVardas() {
        return vardas;
    }

    @Override
    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    @Override
    public String getPavarde() {
        return pavarde;
    }

    @Override
    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    @Override
    public int getAmzius() {
        return amzius;
    }

    @Override
    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    @Override
    public int getSvoris() {
        return svoris;
    }

    @Override
    public void setSvoris(int svoris) {
        this.svoris = svoris;
    }

    @Override
    public int getUgis() {
        return ugis;
    }

    @Override
    public void setUgis(int ugis) {
        this.ugis = ugis;
    }

    @Override
    public String getPlaukuSpalva() {
        return plaukuSpalva;
    }

    @Override
    public void setPlaukuSpalva(String plaukuSpalva) {
        this.plaukuSpalva = plaukuSpalva;
    }

}