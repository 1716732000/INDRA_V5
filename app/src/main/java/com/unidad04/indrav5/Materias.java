package com.unidad04.indrav5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Materias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materias);
    }

    public void MostrarMateriasListar(View view){
        Intent MML = new Intent(this, Materias_Listar.class);
        startActivity(MML);
    }

    public void MostrarMateriasGestionar(View view){
        Intent MMG = new Intent(this, Materias_Gestionar.class);
        startActivity(MMG);
    }

    public void MateriasRetornar(View view){
        finish();
    }
}