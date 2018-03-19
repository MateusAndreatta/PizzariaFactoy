package com.andreatta.pizzariafactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String tipo;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.pizzas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }

    private static Pizza FazerPizza(String tipo){
        PizzaFactory fabrica = null;
        switch (tipo){
            case "Chefe":
                fabrica = new ModaDoChefeFactory();
                break;

            case "Casa":
                fabrica = new ModaDaCasaFactory();
                break;
        }
        Pizza pizza = new Pizza();
        pizza.setTamanho(fabrica.definirTamanho());
        pizza.setSabor(fabrica.definirSabor());
        pizza.setBorda(fabrica.definirBorda());
        return pizza;
    }

    public void IniciarFabrica(View view) {

        PizzaFactory fabrica = new ModaDaCasaFactory();
        Pizza pizza = new Pizza();
        pizza.setTamanho(fabrica.definirTamanho());
        pizza.setSabor(fabrica.definirSabor());
        pizza.setBorda(fabrica.definirBorda());

        TextView texto = findViewById(R.id.textView);
        texto.setText(pizza.getBorda());

      //  if (spinner.getSelectedItem() == "Moda da casa"){
      //      tipo = "Casa";
      //  }
      //  if (spinner.getSelectedItem() == "Moda do chefe"){
      //      tipo = "Chefe";
      //  }
      //  FazerPizza(tipo);
    }
}
