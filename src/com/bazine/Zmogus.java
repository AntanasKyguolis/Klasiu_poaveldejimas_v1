package com.bazine;

public interface Zmogus {
    String getLytis();

    void setLytis(String lytis);

    String getAsmensKodas();

    String getVardas();

    void setVardas(String vardas);

    String getPavarde();

    void setPavarde(String pavarde);

    int getAmzius();

    void setAmzius(int amzius);

    int getSvoris();

    void setSvoris(int svoris);

    int getUgis();

    void setUgis(int ugis);

    String getPlaukuSpalva();

    default void setPlaukuSpalva(String plaukuSpalva) {

    }
}