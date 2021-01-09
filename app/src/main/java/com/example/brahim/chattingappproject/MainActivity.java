package com.example.brahim.chattingappproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.userimage, R.drawable.userimage, R.drawable.userimage, R.drawable.userimage, R.drawable.userimage, R.drawable.userimage,
            R.drawable.userimage, R.drawable.userimage, R.drawable.userimage, R.drawable.userimage,R.drawable.userimage, R.drawable.userimage, R.drawable.userimage,
            R.drawable.userimage, R.drawable.userimage, R.drawable.userimage,
            R.drawable.userimage, R.drawable.userimage, R.drawable.userimage, R.drawable.userimage,};

    // Preview all the users + old chats + time Stamp in an Recycler view
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.users);
        s2 = getResources().getStringArray(R.array.Timestamp);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
