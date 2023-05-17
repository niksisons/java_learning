package com.example.game2048;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Button Play;
    private ImageButton exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        binding.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAnchorView(R.id.fab)
//                        .setAction("Action", null).show();
//            }
//        });
        Play = findViewById(R.id.button);
        Play.setOnClickListener(v -> {
            setContentView(R.layout.wind_game);
            exit = findViewById(R.id.imageButton2);
        });

    }


}