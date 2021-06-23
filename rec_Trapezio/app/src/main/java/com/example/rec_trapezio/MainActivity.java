package com.example.rec_trapezio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private EditText editTextBaseMenor;
 private EditText editTextBaseMaior;
 private EditText editTextAltura;
 private Button btnCalcular;
 private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //referencias
        editTextBaseMenor = findViewById(R.id.editTextBaseMenor);
        editTextBaseMaior = findViewById(R.id.editTextBaseMaior);
        editTextAltura = findViewById(R.id.editTextAltura);
        btnCalcular = findViewById(R.id.btn_Calcular);
        textViewResultado = findViewById(R.id.txtView_Resultado);

        //criar evento do botão
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pegar os valores do ediText
                double baseMenor = Double.parseDouble(editTextBaseMenor.getText().toString());
                double baseMaior = Double.parseDouble(editTextBaseMaior.getText().toString());
                double altura = Double.parseDouble(editTextAltura.getText().toString());
                //objeto da classe trapezio
                Trapezio trapezio = new Trapezio(baseMenor,baseMaior,altura);
                //colocar o método no Resultado
                textViewResultado.setText("Resultado: "+trapezio.calcularArea());
            }
        });
    }
}