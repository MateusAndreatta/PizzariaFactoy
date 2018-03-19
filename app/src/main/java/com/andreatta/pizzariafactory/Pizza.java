package com.andreatta.pizzariafactory;

/**
 * Created by Andreatta on 18/03/2018.
 */

public class Pizza {
    Tamanho tamanho;
    Sabor sabor;
    Borda borda;

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public void setBorda(Borda borda) {
        this.borda = borda;
    }

    public String getTamanho() {
        return tamanho.toString();
    }

    public String getSabor() {
        return sabor.toString();
    }

    public String getBorda() {
        return borda.toString();
    }
}
