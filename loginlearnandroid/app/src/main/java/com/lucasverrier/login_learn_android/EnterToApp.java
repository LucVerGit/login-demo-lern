package com.lucasverrier.login_learn_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class EnterToApp extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_enter_to_app);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ///mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);



        ArrayList<Cartepokemon> exampleList = new ArrayList<>();
        exampleList.add(new Cartepokemon(R.drawable.ic_android_black, "Carapuce", "jet"));
        exampleList.add(new Cartepokemon(R.drawable.ic_android_black, "Legumos", "epine"));
        exampleList.add(new Cartepokemon(R.drawable.ic_android_black, "ChatChien", "griffe"));
        
    }
}
