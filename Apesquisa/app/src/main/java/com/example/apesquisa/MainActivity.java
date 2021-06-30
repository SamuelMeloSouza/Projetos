package com.example.apesquisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNome;
    private RadioGroup radioGroup;
    private Spinner spinner;
    private TextView textViewResultado;
    private Button buttonMostrar, buttonNovaPesquisa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //referencias
        editTextNome = findViewById(R.id.editTextNome);
        radioGroup = findViewById(R.id.radioGroup);
        spinner = findViewById(R.id.spinner);
        textViewResultado = findViewById(R.id.textViewResultado);
        buttonMostrar = findViewById(R.id.buttonMostrar);
        buttonNovaPesquisa = findViewById(R.id.buttonNovaPesquisa);

        //Criar um ebento para o botão Mostrar
        buttonMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String genero = null;
                String regiao = null;
                int idGenero = radioGroup.getCheckedRadioButtonId();
                if (idGenero == R.id.radioButtonMasculino) genero = "Masculino";
                else  genero = "Feminino";
                regiao = spinner.getSelectedItem().toString();
                if (!editTextNome.getText().toString().isEmpty()) {
                    //objeto da classe pessoa
                    Pessoa pessoa = new Pessoa(editTextNome.getText().toString(), genero, regiao);
                    textViewResultado.setText("Resultado da Pesquisa: " + pessoa.mostrarDados());
                }else Toast.makeText(MainActivity.this, "Preencha o nome!", Toast.LENGTH_SHORT);
            }
        });
        buttonNovaPesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        })
    }
}