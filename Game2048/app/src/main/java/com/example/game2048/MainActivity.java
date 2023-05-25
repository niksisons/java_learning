package com.example.game2048;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button BPlay;
    private ImageView Settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BPlay = findViewById(R.id.button);
        Settings = findViewById(R.id.imageView2);
        BPlay.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, Play.class);
            startActivity(intent);
        });
        Settings.setOnClickListener(v ->
        {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
        });
    }
}
