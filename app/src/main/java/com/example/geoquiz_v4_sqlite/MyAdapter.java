package com.example.geoquiz_v4_sqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private Context context;
    private ArrayList id_id, uuid_id, reposta_correta_id, resposta_apresentada_id, colou;

    public MyAdapter(Context context, ArrayList id_id, ArrayList uuid_id, ArrayList reposta_correta_id, ArrayList resposta_apresentada_id, ArrayList colou) {
        this.context = context;
        this.id_id = id_id;
        this.uuid_id = uuid_id;
        this.reposta_correta_id = reposta_correta_id;
        this.resposta_apresentada_id = resposta_apresentada_id;
        this.colou = colou;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.userentry,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.id_id.setText(String.valueOf(id_id.get(position)));
        holder.uuid_id.setText(String.valueOf(uuid_id.get(position)));
        holder.reposta_correta_id.setText(String.valueOf(reposta_correta_id.get(position)));
        holder.resposta_apresentada_id.setText(String.valueOf(resposta_apresentada_id.get(position)));
        holder.colou.setText(String.valueOf(colou.get(position)));

    }

    @Override
    public int getItemCount() {
        return id_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView id_id, uuid_id, reposta_correta_id, resposta_apresentada_id, colou;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id_id = itemView.findViewById(R.id.idname);
            uuid_id = itemView.findViewById(R.id.uuidname);
            reposta_correta_id = itemView.findViewById(R.id.corretaname);
            resposta_apresentada_id = itemView.findViewById(R.id.apresentadaname);
            colou = itemView.findViewById(R.id.colouname);
        }
    }
}
