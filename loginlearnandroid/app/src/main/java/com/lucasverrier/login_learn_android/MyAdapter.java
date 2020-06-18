package com.lucasverrier.login_learn_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public  class MyAdapter extends
        RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Cartepokemon> mCards;

    private LayoutInflater mInflater;

    private ItemClickListener mClickListener;



    public MyAdapter(List<Cartepokemon> mCards , Context context )
    {

        this.mInflater = LayoutInflater.from(context);
        this.mCards = mCards;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.pokemon_item, parent, false);
        /// permet de injecter un element pour charger la view dans le context du recycle view

        return new ViewHolder(view);

    }

    @Override
    public void onClick(View view) {
        if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Cartepokemon card  = mCards.get(position);
        holder.descriptionTextView.setText(card.getDescription());
        holder.attacksTextView.setText(card.getAttacks());


    }

    @Override
    public int getItemCount() {
        return mCards.size();
    }

    public void setClickListener(EnterToApp enterToApp) {

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {




        private TextView descriptionTextView;
        private TextView attacksTextView;
        private TextView mDeleteImage;


        public ViewHolder(View itemView) {

            super(itemView);

            descriptionTextView =  itemView.findViewById(R.id.mladescription);
            attacksTextView =  itemView.findViewById(R.id.mlattacks);

        }




    }
    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
