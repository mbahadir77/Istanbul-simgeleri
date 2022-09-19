package com.example.stanbulsimgeleriv1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.io.Serializable;
import java.util.ArrayList;

/*public class Adapter extends RecyclerView.Adapter<Adapter.AdapterHolder> {
    ArrayList<Bilgiler> bilgilerArrayList;

    public Adapter(ArrayList<Bilgiler> bilgilerArrayList) {
        this.bilgilerArrayList = bilgilerArrayList;
    }

    @NonNull
    @Override
    public AdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new AdapterHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.binding.RecyclerViewTextView.setText(bilgilerArrayList.get(position).isim);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),DetaylarActivity.class);
                intent.putExtra("Bilgiler", String.valueOf(bilgilerArrayList.get(position)));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return bilgilerArrayList.size();
    }

    public class AdapterHolder extends RecyclerView.ViewHolder{

         private RecyclerRowBinding binding;

        public AdapterHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
*/