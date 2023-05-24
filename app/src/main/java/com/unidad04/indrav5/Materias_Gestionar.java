package com.unidad04.indrav5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Materias_Gestionar extends AppCompatActivity {

    public EditText edtCodigo, edtNombre;
    String txtCodigo, txtNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materias_gestionar);

        edtCodigo = findViewById(R.id.edtCodigoMateria);
        edtNombre = findViewById(R.id.edtNombreMateria);
    }

    //Agregar
    public void AgregarMaterias(View view){
        AdminSQLiteOpenHelper Admin = new AdminSQLiteOpenHelper(this, "indra", null, 1);
        SQLiteDatabase BaseDatos = Admin.getReadableDatabase();

        txtCodigo = edtCodigo.getText().toString();
        txtNombre = edtNombre.getText().toString();

        try{
            if(!txtCodigo.isEmpty() && !txtNombre.isEmpty()){
                ContentValues registro = new ContentValues();
                registro.put("codMateria", txtCodigo);
                registro.put("nomMateria", txtNombre);

                BaseDatos.insert("tblMaterias", null, registro);
                BaseDatos.close();

                //LimpiarCajas();
                edtCodigo.setText("");
                edtNombre.setText("");

            }else{
                Toast.makeText(this, "LLENAR TODOS LOS CAMPOS", Toast.LENGTH_LONG).show();
            }

        }catch (Exception e){
            Toast.makeText(this, "ERROR AL ADICIONAR", Toast.LENGTH_LONG).show();
        }
    }


}//Fin Clase