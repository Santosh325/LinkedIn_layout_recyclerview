package com.example.linkedin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycleview);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        String[] name= {"Ram","Arjun","John","Gopal","Doe","Harry","David","Kyale","Silva","Alexander","steven","Laxman","Anup","Samir","Helen"};
        String[] profile= {"DataScientis","android devloper","webdeveloper","Machine Learning","Hacker","DataScientis","android devloper","webdeveloper","Machine Learning","Hacker","DataScientis","android devloper","webdeveloper","Machine Learning","Hacker"};
        int[] images = {
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four,
                R.drawable.five,
                R.drawable.six,
                R.drawable.seven,
                R.drawable.eight,
                R.drawable.nine,
                R.drawable.ten,
                R.drawable.eleven,
                R.drawable.twelve,
                R.drawable.one,
                R.drawable.two,
                R.drawable.three
        };
        mRecyclerView.setAdapter(new LinkedIn(name,profile,images));
    }
}
