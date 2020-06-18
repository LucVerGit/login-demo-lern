package com.lucasverrier.login_learn_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class EnterToApp extends AppCompatActivity {

    MyAdapter adapter;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_enter_to_app);
       ArrayList<Cartepokemon> cards  = new ArrayList<>();
       cards.add(new Cartepokemon(R.drawable.ic_android_black,"carpuce","electric"));
        cards.add(new Cartepokemon(R.drawable.ic_baseline_child_care_24,"miaous","griffe"));
        cards.add(new Cartepokemon(R.drawable.ic_baseline_emoji_nature_24,"feurisar","charge"));
        cards.add(new Cartepokemon(R.drawable.ic_baseline_nature_people_24,"cobrazar","decharge"));
        cards.add(new Cartepokemon(R.drawable.ic_baseline_offline_bolt_24,"poulpe","recharge"));
        cards.add(new Cartepokemon(R.drawable.ic_baseline_power_24,"conbinator","surcharge"));



        RecyclerView recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(cards ,this );
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);









    }
}
