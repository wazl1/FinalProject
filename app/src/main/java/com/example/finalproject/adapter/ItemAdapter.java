//Mason Kjolso
package com.example.finalproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.finalproject.R;
import com.example.finalproject.model.CardViewModel;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    Context context;
    ArrayList<CardViewModel> cardViewModels;

    public ItemAdapter(Context context, ArrayList<CardViewModel> cardViewModels){
        this.context = context;
        this.cardViewModels = cardViewModels;
    }

    @NonNull
    @Override
    public ItemAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.custom_row, parent, false);

        return new ItemAdapter.ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ItemViewHolder holder, int position) {
        holder.title.setText(cardViewModels.get(position).getBookTitle());
        holder.description.setText(cardViewModels.get(position).getBookDescription());
    }

    @Override
    public int getItemCount() {
        return cardViewModels.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title;
        TextView description;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.book_title);
            description = itemView.findViewById(R.id.book_description);
        }
    }
}


