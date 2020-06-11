package com.lucasverrier.login_learn_android;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public  class MyAdapter extends
        RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public MyAdapter(Cartepokemon cartepokemon) {
        ArrayList<Cartepokemon> exampleList = new ArrayList<>();
        exampleList.add(new Cartepokemon(R.drawable.ic_android_black, "Carapuce", "jet"));
        exampleList.add(new Cartepokemon(R.drawable.ic_android_black, "Legumos", "epine"));
        exampleList.add(new Cartepokemon(R.drawable.ic_android_black, "ChatChien", "griffe"));

        return exampleList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;


        private TextView description;
        private TextView attacks;


        public ViewHolder(View itemView) {

            super(itemView);

            description = (TextView) itemView.findViewById(R.id.mladescription);
            attacks = (TextView) itemView.findViewById(R.id.mlattacks);

        }
    }
}
