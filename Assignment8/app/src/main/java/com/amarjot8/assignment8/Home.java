package com.amarjot8.assignment8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Launching Gameplay Acitvity
        Intent intent = new Intent(this, Gameplay.class);
        startActivity(intent);
    }
}
