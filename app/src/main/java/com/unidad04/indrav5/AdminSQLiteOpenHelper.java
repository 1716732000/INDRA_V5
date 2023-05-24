package com.unidad04.indrav5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
//Crear los metodos y el constructor

    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDatos) {
        //Tabla Materias
        BaseDatos.execSQL("create table tblMaterias(" +
                "idMateria int primary key," +
                "codMateria text," +
                "nomMateria text)");

        //Tabla Niveles
        BaseDatos.execSQL("create table  tblNiveles(" +
                "idNivel int primary key," +
                "codNivel text," +
                "nomNivel text)");

        //Tabla Alumnos
        BaseDatos.execSQL("CREATE TABLE tblAlumnos(" +
                "idAlumno int primary key," +
                "codAlumno text," +
                "codNivel text," +
                "nomNivel text)");

        //Tabla Notas
        BaseDatos.execSQL("CREATE TABLE tblNotas(" +
                "idNotas int primary key," +
                "codAlumno text," +
                "codNivel text," +
                "codMateria text," +
                "p1n1 real," +
                "p1n2 real," +
                "p1n2 real," +
                "p1pr real," +

                "p2n1 real," +
                "p2n2 real," +
                "p2n3 real," +
                "p2pr real," +

                "p3n1 real," +
                "p3n2 real," +
                "p3n3 real," +
                "p3pr real," +

                "pgr real)");

    }//onCreate


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
