package com.example.astrology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CreatingANatalChart extends AppCompatActivity {

    int date1;
    int month1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_creating_anatal_chart2);
            ConstraintLayout titleConstraint = (ConstraintLayout) findViewById(R.id.TitleConstr);
            ImageView Title = (ImageView) findViewById(R.id.Title);
            Title.setBackgroundResource(R.drawable.astrology);
            titleConstraint.setBackgroundResource(R.drawable.starrysky);
            EditText txtDate = (EditText) findViewById(R.id.date);
            EditText txtMonth = (EditText) findViewById(R.id.month);
            TextView who = (TextView) findViewById(R.id.who);
            Button enter = (Button) findViewById(R.id.enter);
            Button btnAboutZodiac = (Button) findViewById(R.id.aboutZodiac);
            btnAboutZodiac.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent switcher = new Intent(CreatingANatalChart.this, AboutZodiacSign.class);
                    CreatingANatalChart.this.startActivity(switcher);
                }
            });
            ImageView imageZodiac = (ImageView) findViewById(R.id.imageZodiac);
            enter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    date1 = Integer.parseInt(txtDate.getText().toString());
                    month1 = Integer.parseInt(txtMonth.getText().toString());
                    if ((date1 >= 21 && date1 <=31) && month1 == 3 || (date1 >=1 && date1 <= 19) && month1 == 4)
                    {
                        imageZodiac.setVisibility(View.VISIBLE);
                        who.setVisibility(View.VISIBLE);
                        btnAboutZodiac.setVisibility(View.VISIBLE);
                        who.setText("Вы - Овен!");
                        imageZodiac.setBackgroundResource(R.drawable.aries);
                    }
                    else if ((date1 >= 20 && date1 <=30) && month1 == 4 || (date1 >=1 && date1 <= 20) && month1 == 5)
                    {
                        imageZodiac.setVisibility(View.VISIBLE);
                        who.setVisibility(View.VISIBLE);
                        btnAboutZodiac.setVisibility(View.VISIBLE);
                        who.setText("Вы - Телец!");
                        imageZodiac.setBackgroundResource(R.drawable.taurus);
                    }
                    else if ((date1 >= 21 && date1 <=31) && month1 == 5 || (date1 >=1 && date1 <= 21) && month1 == 6)
                    {
                        imageZodiac.setVisibility(View.VISIBLE);
                        who.setVisibility(View.VISIBLE);
                        btnAboutZodiac.setVisibility(View.VISIBLE);
                        who.setText("Вы - Близнецы!");
                        imageZodiac.setBackgroundResource(R.drawable.gemini);
                    }
                    else if ((date1 >= 22 && date1 <=30) && month1 == 6 || (date1 >=1 && date1 <= 22) && month1 == 7)
                    {
                        imageZodiac.setVisibility(View.VISIBLE);
                        who.setVisibility(View.VISIBLE);
                        btnAboutZodiac.setVisibility(View.VISIBLE);
                        who.setText("Вы - Рак!");
                        imageZodiac.setBackgroundResource(R.drawable.cancer);
                    }
                    else if ((date1 >= 23 && date1 <=31) && month1 == 7 || (date1 >=1 && date1 <= 22) && month1 == 8)
                    {
                        imageZodiac.setVisibility(View.VISIBLE);
                        who.setVisibility(View.VISIBLE);
                        btnAboutZodiac.setVisibility(View.VISIBLE);
                        who.setText("Вы - Лев!");
                        imageZodiac.setBackgroundResource(R.drawable.leo);
                    }
                    else if ((date1 >= 23 && date1 <=31) && month1 == 8 || (date1 >=1 && date1 <= 22) && month1 == 9)
                    {
                        imageZodiac.setVisibility(View.VISIBLE);
                        who.setVisibility(View.VISIBLE);
                        btnAboutZodiac.setVisibility(View.VISIBLE);
                        who.setText("Вы - Дева!");
                        imageZodiac.setBackgroundResource(R.drawable.virgo);
                    }
                    else if ((date1 >= 23 && date1 <=30) && month1 == 9 || (date1 >=1 && date1 <= 23) && month1 == 10)
                    {
                        imageZodiac.setVisibility(View.VISIBLE);
                        who.setVisibility(View.VISIBLE);
                        btnAboutZodiac.setVisibility(View.VISIBLE);
                        who.setText("Вы - Весы!");
                        imageZodiac.setBackgroundResource(R.drawable.libra);
                    }
                    else if ((date1 >= 24 && date1 <=31) && month1 == 10 || (date1 >=1 && date1 <= 22) && month1 == 11)
                    {
                        imageZodiac.setVisibility(View.VISIBLE);
                        who.setVisibility(View.VISIBLE);
                        btnAboutZodiac.setVisibility(View.VISIBLE);
                        who.setText("Вы - Скорпион!");
                        imageZodiac.setBackgroundResource(R.drawable.scorpio);
                    }
                    else if ((date1 >= 23 && date1 <=30) && month1 == 11 || (date1 >=1 && date1 <= 21) && month1 == 12)
                    {
                        imageZodiac.setVisibility(View.VISIBLE);
                        who.setVisibility(View.VISIBLE);
                        btnAboutZodiac.setVisibility(View.VISIBLE);
                        who.setText("Вы - Стрелец!");
                        imageZodiac.setBackgroundResource(R.drawable.sagittarius);
                    }
                    else if ((date1 >= 22 && date1 <=31) && month1 == 12 || (date1 >=1 && date1 <= 20) && month1 == 1)
                    {
                        imageZodiac.setVisibility(View.VISIBLE);
                        who.setVisibility(View.VISIBLE);
                        btnAboutZodiac.setVisibility(View.VISIBLE);
                        who.setText("Вы - Козерог!");
                        imageZodiac.setBackgroundResource(R.drawable.capricorn);
                    }
                    else if ((date1 >= 21 && date1 <=31) && month1 == 1 || (date1 >=1 && date1 <= 18) && month1 == 2)
                    {
                        imageZodiac.setVisibility(View.VISIBLE);
                        who.setVisibility(View.VISIBLE);
                        btnAboutZodiac.setVisibility(View.VISIBLE);
                        who.setText("Вы - Водолей!");
                        imageZodiac.setBackgroundResource(R.drawable.aquarius);
                    }
                    else if ((date1 >= 19 && date1 <=29) && month1 == 2 || (date1 >=1 && date1 <= 20) && month1 == 3)
                    {
                        imageZodiac.setVisibility(View.VISIBLE);
                        who.setVisibility(View.VISIBLE);
                        btnAboutZodiac.setVisibility(View.VISIBLE);
                        who.setText("Вы - Рыбы!");
                        imageZodiac.setBackgroundResource(R.drawable.pisces);
                    }
                    else
                    {
                        who.setVisibility(View.VISIBLE);
                        imageZodiac.setVisibility(View.GONE);
                        btnAboutZodiac.setVisibility(View.GONE);
                        who.setText("Введены некорректные данные");
                    }
                }
            });
        }


    }