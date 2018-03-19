package com.andreatta.pizzariafactory;

/**
 * Created by Andreatta on 18/03/2018.
 */

public abstract class PizzaFactory {
    public abstract Tamanho definirTamanho();
    public abstract  Sabor definirSabor();
    public abstract Borda definirBorda();


}
