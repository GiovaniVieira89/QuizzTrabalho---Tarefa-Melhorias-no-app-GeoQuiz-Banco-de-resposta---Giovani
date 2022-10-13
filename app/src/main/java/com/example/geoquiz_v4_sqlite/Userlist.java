package com.example.geoquiz_v4_sqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class Userlist extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> id_id, uuid_id, reposta_correta_id, resposta_apresentada_id, colou;
    RespostaDB mRespostaDB;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);
        mRespostaDB = new RespostaDB(this);
        id_id = new ArrayList<>();
        uuid_id = new ArrayList<>();
        reposta_correta_id = new ArrayList<>();
        resposta_apresentada_id = new ArrayList<>();
        colou = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new MyAdapter(this, id_id, uuid_id,reposta_correta_id,resposta_apresentada_id, colou );
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //displaydata();

    }


    //222
/*
    private void displaydata() {


    }
*/
    //333
}