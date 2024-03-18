package com.example.heygetup;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class nameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        final TextView textName = findViewById(R.id.textName);
        final EditText nameOfUser = findViewById(R.id.nameOfUser);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final Button btnGO = findViewById(R.id.btnGO);


        // Получаем Intent, который запустил эту активность
        Intent intent = getIntent();
        // Извлекаем строку по ключу "lang"
        String language = intent.getStringExtra("lang");

        if (Objects.equals(language, "RU")) {
            textName.setText("Напишите свое имя");
        } else if (Objects.equals(language, "IT")) {
            textName.setText("Scrivi il tuo nome");
        } else if (Objects.equals(language, "EN")) {
            textName.setText("Write your name");
        }
        String name = String.valueOf(nameOfUser.getText());
        btnGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = nameOfUser.getText().toString();

                // Проверяем, не пустое ли поле ввода
                if (userName.trim().isEmpty()) {
                    // Показываем предупреждение
                    Toast.makeText(nameActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                    // Завершаем работу метода, не переходя к следующей Activity
                    return;
                }
                Intent intent2 = new Intent(nameActivity.this, MainActivity.class);
                if (Objects.equals(language, "RU")) {
                    intent2.putExtra("lang", "RU");
                } else if (Objects.equals(language, "IT")) {
                    intent2.putExtra("lang", "IT");
                } else if (Objects.equals(language, "EN")) {
                    intent2.putExtra("lang", "EN");
                }

                intent2.putExtra("name", nameOfUser.getText().toString());
                startActivity(intent2);
            }
        });
    }
}


