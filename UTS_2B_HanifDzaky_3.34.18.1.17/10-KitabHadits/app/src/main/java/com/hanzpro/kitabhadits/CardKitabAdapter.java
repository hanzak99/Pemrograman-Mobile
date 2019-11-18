package com.hanzpro.kitabhadits;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardKitabAdapter extends RecyclerView.Adapter<CardKitabAdapter.ListViewHolder>{
    private ArrayList<Kitab> listKitab;
    private Context context;

    public CardKitabAdapter(Context context, ArrayList<Kitab> listKitab){
        this.listKitab = listKitab;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_kitab_hadits, parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Kitab kitab = listKitab.get(position);
        Glide.with(holder.itemView.getContext()).load(kitab.getPhoto()).apply(new RequestOptions().fitCenter()).into(holder.imgPhoto);

        holder.tvName.setText(kitab.getName());
        holder.tvDesc.setText(kitab.getDescription());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detail = new Intent(context, detailListKitab.class);
                detail.putExtra("kitab_id", kitab.getId());
                context.startActivity(detail);
            }
        });

    }

    @Override
    public int getItemCount() { return listKitab.size(); }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cardView;


        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_kitab_list);
            tvName = itemView.findViewById(R.id.nama_list_kitab);
            tvDesc = itemView.findViewById(R.id.desc_list_kitab);
            cardView = itemView.findViewById(R.id.cardview_item);
        }
    }
}

