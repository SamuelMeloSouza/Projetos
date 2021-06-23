package com.example.escolalinguas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBoxIngles, checkBoxEspanhol, checkBoxAvista;
    private Button buttonCalcular;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //referencias
        checkBoxIngles = findViewById(R.id.checkBoxIngles);
        checkBoxEspanhol = findViewById(R.id.checkBoxEspanhol);
        checkBoxAvista = findViewById(R.id.checkBoxAvista);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        //evento do botão Calcular
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tipoCurso = null;
                String tipoPagamento = null;
                if (checkBoxIngles.isChecked() && checkBoxEspanhol.isChecked()){
                    tipoCurso = "COMBO";
                }else{
                    if (checkBoxIngles.isChecked()){
                        tipoCurso = "INGLES";
                    }else tipoCurso = "ESPANHOL";
                    }
                if (checkBoxAvista.isChecked()) tipoPagamento = "VISTA";
                else tipoPagamento = "PRAZO";//final do ONCLICK
                //objeto da classe curso
                Curso curso = new Curso(tipoCurso, tipoPagamento);
                textViewResultado.setText("resultado: " + curso.calculoPrecoCurso());
            }
        });
    }
}