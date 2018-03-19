package com.andreatta.pizzariafactory;

/**
 * Created by Andreatta on 18/03/2018.
 */

public class ModaDoChefeFactory extends PizzaFactory {

    public Tamanho definirTamanho() {
        return new TamanhoPequena();
    }

    public Sabor definirSabor() {
        return new SaborFrango();
    }

    public Borda definirBorda() {
        return new BordaRecheada();
    }
}
