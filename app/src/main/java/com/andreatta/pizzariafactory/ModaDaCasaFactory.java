package com.andreatta.pizzariafactory;

/**
 * Created by Andreatta on 18/03/2018.
 */

public class ModaDaCasaFactory extends PizzaFactory {

    public Tamanho definirTamanho() {
        return new TamanhoGrande();
    }

    public Sabor definirSabor() {
        return new SaborCalabresa();
    }

    public Borda definirBorda() {
        return new BordaSimples();
    }
}
