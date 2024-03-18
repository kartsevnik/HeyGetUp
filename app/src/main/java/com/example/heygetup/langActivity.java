package com.example.heygetup;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class langActivity extends AppCompatActivity implements View.OnClickListener  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang);
        final Button btnIT = findViewById(R.id.btnIT);
        final Button btnEN = findViewById(R.id.btnEN);
        final Button btnRU = findViewById(R.id.btnRU);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final TextView textLang = findViewById(R.id.textName);

        Animation animBtn = AnimationUtils.loadAnimation(this, R.anim.mycombo);
        Animation animText = AnimationUtils.loadAnimation(this, R.anim.myscale);

        // Запускаем анимацию для компонента tv
        btnIT.startAnimation(animBtn);
        btnEN.startAnimation(animBtn);
        btnRU.startAnimation(animBtn);
        textLang.startAnimation(animText);

        btnIT.setOnClickListener(this);
        btnEN.setOnClickListener(this);
        btnRU.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int choice = v.getId();
        if (choice == R.id.btnIT) {
            Intent intent = new Intent(this, nameActivity.class);
            intent.putExtra("lang", "IT");
            startActivity(intent);}
        else if (choice == R.id.btnEN) {
            Intent intent = new Intent(this, nameActivity.class);
            intent.putExtra("lang", "EN");
            startActivity(intent);}
        else if (choice == R.id.btnRU) {
            Intent intent = new Intent(this, nameActivity.class);
            intent.putExtra("lang", "RU");
            startActivity(intent);}
    }
}


