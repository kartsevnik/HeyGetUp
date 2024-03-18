package com.example.heygetup;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView thirdText = findViewById(R.id.third_text);
        final TextView secondText = findViewById(R.id.second_text);
        final TextView firstText = findViewById(R.id.first_text);
        final TextView forthText = findViewById(R.id.forth_text);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView rightBottomImage = findViewById(R.id.bottom_image);
        Animation flickerAnimation = AnimationUtils.loadAnimation(this, R.anim.flicker);
        rightBottomImage.startAnimation(flickerAnimation);
        // Получаем Intent, который запустил эту активность
        Intent intent = getIntent();
        // Извлекаем строку по ключу "lang"
        String language = intent.getStringExtra("lang");
        String name  = intent.getStringExtra("name");
        List<String> phrases; // Пустой список по умолчанию
        if (Objects.equals(language, "RU")) {
            thirdText.setText(name + ", ты спишь?");
            phrases = fillPhrasesListRU(name);
        } else if (Objects.equals(language, "IT")) {
            thirdText.setText(name + ", stai dormendo??");
            phrases = fillPhrasesListIT(name);
        } else if (Objects.equals(language, "EN")) {
            thirdText.setText(name + ", are you asleep??");
            phrases = fillPhrasesListEN(name);
        } else {
            phrases = new ArrayList<>();
        }

        secondText.setText(phrases.get(0));
        firstText.setText(phrases.get(1));
        forthText.setText(phrases.get(2));


        // Обработчик нажатий
        rightBottomImage.setOnClickListener(v -> {
            Collections.shuffle(phrases);
            // Выводим в текстовые метки
            secondText.setText(phrases.get(0));
            firstText.setText(phrases.get(1));
            forthText.setText(phrases.get(2));
        });
    }

    private List<String> fillPhrasesListRU(String name) {
        List<String> phrases = new ArrayList<>();
        phrases.add("Уже 6 часов утра, " + name);
        phrases.add("Вставай, мы там всё уронили");
        phrases.add("Мы уронили вообще всё, "+ name + ", честно");
        phrases.add(name + ", ты чё опять лежишь?");
        phrases.add("Часики-то тикают");
        phrases.add("Мужика-то хоть нашла себе?");
        phrases.add("Уже дитачек пора рожать вообще-то");
        phrases.add(name + ", уже все встали");
        phrases.add("Ты одна еще спишь");
        phrases.add("Солнце уже высоко");
        phrases.add("Птички поют, а ты все спишь");
        phrases.add("Весь мир на работе, а "+ name + " дома");
        phrases.add("Кофе уже остыл");
        phrases.add("Завтрак пропадает");
        phrases.add("Цветы без воды остались");
        phrases.add("Телефон заряжен, а ты нет");
        phrases.add("Утро добрым не бывает");
        phrases.add("Соседи уже пошумели");
        phrases.add("Дверь в ванную свободна");
        phrases.add("Тапочки ждут");
        phrases.add("Завтрак на столе");
        phrases.add("Мир без тебя не тот");
        phrases.add("Кот уже проснулся");
        phrases.add("Цветы на подоконнике уже политы");
        phrases.add("Кофе варится");
        phrases.add("Деньги на телефоне заканчиваются");
        phrases.add("Утро в золоте");
        phrases.add("Вечером будет дождь");
        return phrases;
    }
    private List<String> fillPhrasesListIT(String name) {
        List<String> phrases = new ArrayList<>();
        phrases.add("Sono già le 6 del mattino, "+ name);
        phrases.add("Svegliati, abbiamo lasciato cadere tutto");
        phrases.add("Abbiamo davvero lasciato cadere tutto, "+ name +", davvero");
        phrases.add(name + ", perché sei ancora a letto?");
        phrases.add("Gli orologi stanno ticchettando");
        phrases.add("Hai trovato un uomo?");
        phrases.add("È già ora di avere dei bambini");
        phrases.add("Natasha, tutti sono già alzati");
        phrases.add("Sei l'unica che dorme ancora");
        phrases.add("Il sole è già alto");
        phrases.add("Gli uccelli cantano e tu dormi ancora");
        phrases.add("Tutto il mondo è al lavoro, e "+ name + " è a casa");
        phrases.add("Il caffè si è già raffreddato");
        phrases.add("La colazione sta scomparendo");
        phrases.add("I fiori sono rimasti senza acqua");
        phrases.add("Il telefono è carico, e tu no");
        phrases.add("Il mattino non è mai gentile");
        phrases.add("I vicini hanno già fatto rumore");
        phrases.add("Il bagno è libero");
        phrases.add("Le pantofole ti aspettano");
        phrases.add("La colazione è pronta");
        phrases.add("Il mondo non è lo stesso senza di te");
        phrases.add("Il gatto si è già svegliato");
        phrases.add("I fiori sul davanzale sono già stati annaffiati");
        phrases.add("Il caffè sta bollendo");
        phrases.add("I soldi sul telefono stanno finendo");
        phrases.add("La mattina è d'oro");
        phrases.add("Ci sarà pioggia stasera");
        return phrases;
    }
    private List<String> fillPhrasesListEN(String name) {
        List<String> phrases = new ArrayList<>();
        phrases.add("It's already 6 in the morning, " + name);
        phrases.add("Get up, we've dropped everything there");
        phrases.add("We've actually dropped everything, "+ name + ", honestly");
        phrases.add("Natasha, why are you still lying down?");
        phrases.add("The clocks are ticking");
        phrases.add("Have you found a man for yourself?");
        phrases.add("It's already time to have babies");
        phrases.add("Natasha, everyone is already up");
        phrases.add("You're the only one still sleeping");
        phrases.add("The sun is already high");
        phrases.add("The birds are singing, and you're still sleeping");
        phrases.add("The whole world is at work, and "+ name + " is at home");
        phrases.add("The coffee has already cooled down");
        phrases.add("Breakfast is disappearing");
        phrases.add("The flowers are left without water");
        phrases.add("The phone is charged, and you're not");
        phrases.add("Morning is never kind");
        phrases.add("The neighbors have already made noise");
        phrases.add("The bathroom door is free");
        phrases.add("The slippers are waiting");
        phrases.add("Breakfast is on the table");
        phrases.add("The world is not the same without you");
        phrases.add("The cat has already woken up");
        phrases.add("The flowers on the windowsill have already been watered");
        phrases.add("The coffee is brewing");
        phrases.add("The money on the phone is running out");
        phrases.add("The morning is golden");
        phrases.add("It will rain in the evening");
        return phrases;
    }

    void shuffleArray(String[] ar){
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
