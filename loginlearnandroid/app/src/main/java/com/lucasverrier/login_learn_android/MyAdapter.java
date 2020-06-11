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

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView nameTextView;


        private TextView description;
        private TextView attacks;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            description = (TextView) itemView.findViewById(R.id.mladescription);
            attacks = (TextView) itemView.findViewById(R.id.mlattacks);

        }
    }
}
