package com.dyahexample.myloginapp.ui.adapter.batik;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dyahexample.myloginapp.R;
import com.dyahexample.myloginapp.data.batik.BatikEntity;
import com.dyahexample.myloginapp.ui.ragam.detailActivity;

import java.util.ArrayList;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder> {
    private ArrayList<BatikEntity> listBatik;
    public GridAdapter(ArrayList<BatikEntity>list){
        this.listBatik = list;
    }

    @NonNull
    @Override
    public GridAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_batik,parent,false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.GridViewHolder holder, int position) {
        BatikEntity batikEntity = listBatik.get(position);
         Glide.with(holder.itemView.getContext())
                .load(batikEntity.getGambar())
                .into(holder.imgBatik);
        holder.txtBatik.setText(batikEntity.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), detailActivity.class);
                intent.putExtra("BATIK",batikEntity);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBatik.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBatik;
        TextView txtBatik;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBatik = itemView.findViewById(R.id.imgKawung);
            txtBatik = itemView.findViewById(R.id.txt_kawung);

        }
    }
}
