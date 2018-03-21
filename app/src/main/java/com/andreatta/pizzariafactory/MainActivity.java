package com.andreatta.pizzariafactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void FazerCasa(View view) {

        PizzaFactory fabrica = new ModaDaCasaFactory();
        Pizza pizza = new Pizza();
        pizza.setTamanho(fabrica.definirTamanho());
        pizza.setSabor(fabrica.definirSabor());
        pizza.setBorda(fabrica.definirBorda());

        TextView texto = findViewById(R.id.textView);
        texto.setText("Tamanho : " + pizza.getTamanho() + "\n\n Sabor: " + pizza.getSabor() + "\n\n Borda: " + pizza.getBorda());

    }

    public void FazerChefe(View view){
        PizzaFactory fabrica = new ModaDoChefeFactory();
        Pizza pizza = new Pizza();
        pizza.setTamanho(fabrica.definirTamanho());
        pizza.setSabor(fabrica.definirSabor());
        pizza.setBorda(fabrica.definirBorda());

        TextView texto = findViewById(R.id.textView);
        texto.setText("Tamanho : " + pizza.getTamanho() + "\n\n Sabor: " + pizza.getSabor() + "\n\n Borda: " + pizza.getBorda());
    }
}
