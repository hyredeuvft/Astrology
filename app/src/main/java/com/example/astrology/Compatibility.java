package com.example.astrology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Compatibility extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compatibility);

        ConstraintLayout TitleConstr = (ConstraintLayout) findViewById(R.id.TitleConstr);
        ImageView Title = (ImageView) findViewById(R.id.Title);
        Title.setBackgroundResource(R.drawable.astrology);
        TitleConstr.setBackgroundResource(R.drawable.starrysky);
        EditText zodiacW = (EditText) findViewById(R.id.zodiacW);
        EditText zodiacM = (EditText) findViewById(R.id.zodiacM);
        Button send = (Button) findViewById(R.id.send);
        TextView procCompatibility = (TextView) findViewById(R.id.procCompatibility);
        TextView aboutCompatibility = (TextView) findViewById(R.id.aboutCompatibility);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Овен") ||
                        zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Стрелец") ||
                        zodiacW.getText().toString().equals("Телец") && zodiacM.getText().toString().equals("Лев") ||
                        zodiacW.getText().toString().equals("Телец") && zodiacM.getText().toString().equals("Дева") ||
                        zodiacW.getText().toString().equals("Телец") && zodiacM.getText().toString().equals("Весы") ||
                        zodiacW.getText().toString().equals("Телец") && zodiacM.getText().toString().equals("Козерог") ||
                        zodiacW.getText().toString().equals("Телец") && zodiacM.getText().toString().equals("Рыбы") ||
                        zodiacW.getText().toString().equals("Близнецы") && zodiacM.getText().toString().equals("Дева") ||
                        zodiacW.getText().toString().equals("Близнецы") && zodiacM.getText().toString().equals("Весы") ||
                        zodiacW.getText().toString().equals("Близнецы") && zodiacM.getText().toString().equals("Скорпион") ||
                        zodiacW.getText().toString().equals("Близнецы") && zodiacM.getText().toString().equals("Водолей") ||
                        zodiacW.getText().toString().equals("Рак") && zodiacM.getText().toString().equals("Овен") ||
                        zodiacW.getText().toString().equals("Рак") && zodiacM.getText().toString().equals("Телец") ||
                        zodiacW.getText().toString().equals("Рак") && zodiacM.getText().toString().equals("Весы") ||
                        zodiacW.getText().toString().equals("Рак") && zodiacM.getText().toString().equals("Скорпион") ||
                        zodiacW.getText().toString().equals("Рак") && zodiacM.getText().toString().equals("Рыбы") ||
                        zodiacW.getText().toString().equals("Лев") && zodiacM.getText().toString().equals("Телец") ||
                        zodiacW.getText().toString().equals("Лев") && zodiacM.getText().toString().equals("Стрелец") ||
                        zodiacW.getText().toString().equals("Весы") && zodiacM.getText().toString().equals("Телец") ||
                        zodiacW.getText().toString().equals("Весы") && zodiacM.getText().toString().equals("Лев") ||
                        zodiacW.getText().toString().equals("Весы") && zodiacM.getText().toString().equals("Весы") ||
                        zodiacW.getText().toString().equals("Весы") && zodiacM.getText().toString().equals("Козерог") ||
                        zodiacW.getText().toString().equals("Скорпион") && zodiacM.getText().toString().equals("Рак") ||
                        zodiacW.getText().toString().equals("Скорпион") && zodiacM.getText().toString().equals("Лев") ||
                        zodiacW.getText().toString().equals("Скорпион") && zodiacM.getText().toString().equals("Скорпион") ||
                        zodiacW.getText().toString().equals("Скорпион") && zodiacM.getText().toString().equals("Стрелец") ||
                        zodiacW.getText().toString().equals("Стрелец") && zodiacM.getText().toString().equals("Весы") ||
                        zodiacW.getText().toString().equals("Козерог") && zodiacM.getText().toString().equals("Стрелец") ||
                        zodiacW.getText().toString().equals("Водолей") && zodiacM.getText().toString().equals("Близнецы") ||
                        zodiacW.getText().toString().equals("Водолей") && zodiacM.getText().toString().equals("Лев") ||
                        zodiacW.getText().toString().equals("Водолей") && zodiacM.getText().toString().equals("Скорпион") ||
                        zodiacW.getText().toString().equals("Водолей") && zodiacM.getText().toString().equals("Козерог") ||
                        zodiacW.getText().toString().equals("Рыбы") && zodiacM.getText().toString().equals("Лев") ||
                        zodiacW.getText().toString().equals("Рыбы") && zodiacM.getText().toString().equals("Козерог") ||
                        zodiacW.getText().toString().equals("Рыбы") && zodiacM.getText().toString().equals("Водолей")
                )
                {
                    procCompatibility.setText("Совместимы на 91%.");
                }
                else if (zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Телец") ||
                        zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Рак") ||
                        zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Козерог") ||
                        zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Водолей") ||
                        zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Стрелец") ||
                        zodiacW.getText().toString().equals("Близнецы") && zodiacM.getText().toString().equals("Лев") ||
                        zodiacW.getText().toString().equals("Близнецы") && zodiacM.getText().toString().equals("Рыбы") ||
                        zodiacW.getText().toString().equals("Рак") && zodiacM.getText().toString().equals("Стрелец") ||
                        zodiacW.getText().toString().equals("Лев") && zodiacM.getText().toString().equals("Весы") ||
                        zodiacW.getText().toString().equals("Дева") && zodiacM.getText().toString().equals("Рак") ||
                        zodiacW.getText().toString().equals("Весы") && zodiacM.getText().toString().equals("Овен") ||
                        zodiacW.getText().toString().equals("Весы") && zodiacM.getText().toString().equals("Рак") ||
                        zodiacW.getText().toString().equals("Весы") && zodiacM.getText().toString().equals("Дева") ||
                        zodiacW.getText().toString().equals("Стрелец") && zodiacM.getText().toString().equals("Овен") ||
                        zodiacW.getText().toString().equals("Козерог") && zodiacM.getText().toString().equals("Овен") ||
                        zodiacW.getText().toString().equals("Козерог") && zodiacM.getText().toString().equals("Телец") ||
                        zodiacW.getText().toString().equals("Козерог") && zodiacM.getText().toString().equals("Рак") ||
                        zodiacW.getText().toString().equals("Козерог") && zodiacM.getText().toString().equals("Лев") ||
                        zodiacW.getText().toString().equals("Козерог") && zodiacM.getText().toString().equals("Дева") ||
                        zodiacW.getText().toString().equals("Козерог") && zodiacM.getText().toString().equals("Весы") ||
                        zodiacW.getText().toString().equals("Козерог") && zodiacM.getText().toString().equals("Козерог") ||
                        zodiacW.getText().toString().equals("Козерог") && zodiacM.getText().toString().equals("Водолей")
                )
                {
                    procCompatibility.setText("Совместимы на 81%.");
                }
                else if (zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Близнецы") ||
                        zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Скорпион") ||
                        zodiacW.getText().toString().equals("Телец") && zodiacM.getText().toString().equals("Овен") ||
                        zodiacW.getText().toString().equals("Телец") && zodiacM.getText().toString().equals("Близнецы") ||
                        zodiacW.getText().toString().equals("Близнецы") && zodiacM.getText().toString().equals("Телец") ||
                        zodiacW.getText().toString().equals("Лев") && zodiacM.getText().toString().equals("Рак") ||
                        zodiacW.getText().toString().equals("Лев") && zodiacM.getText().toString().equals("Козерог") ||
                        zodiacW.getText().toString().equals("Дева") && zodiacM.getText().toString().equals("Овен") ||
                        zodiacW.getText().toString().equals("Дева") && zodiacM.getText().toString().equals("Телец") ||
                        zodiacW.getText().toString().equals("Дева") && zodiacM.getText().toString().equals("Близнецы") ||
                        zodiacW.getText().toString().equals("Дева") && zodiacM.getText().toString().equals("Лев") ||
                        zodiacW.getText().toString().equals("Дева") && zodiacM.getText().toString().equals("Дева") ||
                        zodiacW.getText().toString().equals("Дева") && zodiacM.getText().toString().equals("Весы") ||
                        zodiacW.getText().toString().equals("Дева") && zodiacM.getText().toString().equals("Стрелец") ||
                        zodiacW.getText().toString().equals("Дева") && zodiacM.getText().toString().equals("Водолей") ||
                        zodiacW.getText().toString().equals("Скорпион") && zodiacM.getText().toString().equals("Овен") ||
                        zodiacW.getText().toString().equals("Скорпион") && zodiacM.getText().toString().equals("Дева") ||
                        zodiacW.getText().toString().equals("Скорпион") && zodiacM.getText().toString().equals("Весы") ||
                        zodiacW.getText().toString().equals("Стрелец") && zodiacM.getText().toString().equals("Телец") ||
                        zodiacW.getText().toString().equals("Стрелец") && zodiacM.getText().toString().equals("Рак") ||
                        zodiacW.getText().toString().equals("Стрелец") && zodiacM.getText().toString().equals("Рыбы") ||
                        zodiacW.getText().toString().equals("Козерог") && zodiacM.getText().toString().equals("Близнецы") ||
                        zodiacW.getText().toString().equals("Водолей") && zodiacM.getText().toString().equals("Водолей") ||
                        zodiacW.getText().toString().equals("Рыбы") && zodiacM.getText().toString().equals("Стрелец")
                )
                {
                    procCompatibility.setText("Совместимы на 72%.");
                }
                else if (zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Лев") ||
                        zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Скорпион") ||
                        zodiacW.getText().toString().equals("Близнецы") && zodiacM.getText().toString().equals("Стрелец") ||
                                zodiacW.getText().toString().equals("Рак") && zodiacM.getText().toString().equals("Близнецы") ||
                                zodiacW.getText().toString().equals("Рак") && zodiacM.getText().toString().equals("Козерог") ||
                                zodiacW.getText().toString().equals("Весы") && zodiacM.getText().toString().equals("Водолей") ||
                                zodiacW.getText().toString().equals("Скорпион") && zodiacM.getText().toString().equals("Рыбы")
                )
                {
                    procCompatibility.setText("Совместимы на 97%.");
                }
                else if (zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Дева") ||
                        zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Весы") ||
                        zodiacW.getText().toString().equals("Овен") && zodiacM.getText().toString().equals("Рыбы") ||
                        zodiacW.getText().toString().equals("Телец") && zodiacM.getText().toString().equals("Телец") ||
                        zodiacW.getText().toString().equals("Телец") && zodiacM.getText().toString().equals("Рак") ||
                        zodiacW.getText().toString().equals("Телец") && zodiacM.getText().toString().equals("Водолей") ||
                        zodiacW.getText().toString().equals("Близнецы") && zodiacM.getText().toString().equals("Овен") ||
                        zodiacW.getText().toString().equals("Близнецы") && zodiacM.getText().toString().equals("Близнецы") ||
                        zodiacW.getText().toString().equals("Близнецы") && zodiacM.getText().toString().equals("Козерог") ||
                        zodiacW.getText().toString().equals("Рак") && zodiacM.getText().toString().equals("Рак") ||
                        zodiacW.getText().toString().equals("Рак") && zodiacM.getText().toString().equals("Лев") ||
                        zodiacW.getText().toString().equals("Рак") && zodiacM.getText().toString().equals("Дева") ||
                        zodiacW.getText().toString().equals("Рак") && zodiacM.getText().toString().equals("Водолей") ||
                        zodiacW.getText().toString().equals("Лев") && zodiacM.getText().toString().equals("Лев") ||
                        zodiacW.getText().toString().equals("Лев") && zodiacM.getText().toString().equals("Дева") ||
                        zodiacW.getText().toString().equals("Лев") && zodiacM.getText().toString().equals("Рыбы") ||
                        zodiacW.getText().toString().equals("Весы") && zodiacM.getText().toString().equals("Стрелец") ||
                        zodiacW.getText().toString().equals("Весы") && zodiacM.getText().toString().equals("Рыбы") ||
                        zodiacW.getText().toString().equals("Скорпион") && zodiacM.getText().toString().equals("Водолей") ||
                        zodiacW.getText().toString().equals("Стрелец") && zodiacM.getText().toString().equals("Дева") ||
                        zodiacW.getText().toString().equals("Стрелец") && zodiacM.getText().toString().equals("Козерог") ||
                        zodiacW.getText().toString().equals("Водолей") && zodiacM.getText().toString().equals("Телец") ||
                        zodiacW.getText().toString().equals("Рыбы") && zodiacM.getText().toString().equals("Овен") ||
                        zodiacW.getText().toString().equals("Рыбы") && zodiacM.getText().toString().equals("Телец") ||
                        zodiacW.getText().toString().equals("Рыбы") && zodiacM.getText().toString().equals("Близнецы") ||
                        zodiacW.getText().toString().equals("Рыбы") && zodiacM.getText().toString().equals("Рак")
                )
                {
                    procCompatibility.setText("Совместимы на 84%.");
                }
                else if (zodiacW.getText().toString().equals("Близнецы") && zodiacM.getText().toString().equals("Рак") ||
                        zodiacW.getText().toString().equals("Лев") && zodiacM.getText().toString().equals("Близнецы") ||
                        zodiacW.getText().toString().equals("Дева") && zodiacM.getText().toString().equals("Козерог") ||
                        zodiacW.getText().toString().equals("Дева") && zodiacM.getText().toString().equals("Рыбы") ||
                        zodiacW.getText().toString().equals("Весы") && zodiacM.getText().toString().equals("Скорпион") ||
                        zodiacW.getText().toString().equals("Скорпион") && zodiacM.getText().toString().equals("Телец") ||
                        zodiacW.getText().toString().equals("Козерог") && zodiacM.getText().toString().equals("Рыбы") ||
                        zodiacW.getText().toString().equals("Водолей") && zodiacM.getText().toString().equals("Рак") ||
                        zodiacW.getText().toString().equals("Водолей") && zodiacM.getText().toString().equals("Дева")
                        )
                {
                    procCompatibility.setText("Совместимы на 67%.");
                }
                else if (zodiacW.getText().toString().equals("Лев") && zodiacM.getText().toString().equals("Овен") ||
                        zodiacW.getText().toString().equals("Лев") && zodiacM.getText().toString().equals("Скорпион") ||
                        zodiacW.getText().toString().equals("Лев") && zodiacM.getText().toString().equals("Водолей") ||
                        zodiacW.getText().toString().equals("Дева") && zodiacM.getText().toString().equals("Скорпион") ||
                        zodiacW.getText().toString().equals("Скорпион") && zodiacM.getText().toString().equals("Козерог") ||
                        zodiacW.getText().toString().equals("Стрелец") && zodiacM.getText().toString().equals("Близнецы") ||
                        zodiacW.getText().toString().equals("Стрелец") && zodiacM.getText().toString().equals("Лев") ||
                        zodiacW.getText().toString().equals("Стрелец") && zodiacM.getText().toString().equals("Скорпион") ||
                        zodiacW.getText().toString().equals("Стрелец") && zodiacM.getText().toString().equals("Стрелец") ||
                        zodiacW.getText().toString().equals("Стрелец") && zodiacM.getText().toString().equals("Водолей") ||
                        zodiacW.getText().toString().equals("Козерог") && zodiacM.getText().toString().equals("Скорпион") ||
                        zodiacW.getText().toString().equals("Водолей") && zodiacM.getText().toString().equals("Овен") ||
                        zodiacW.getText().toString().equals("Водолей") && zodiacM.getText().toString().equals("Весы") ||
                        zodiacW.getText().toString().equals("Водолей") && zodiacM.getText().toString().equals("Стрелец") ||
                        zodiacW.getText().toString().equals("Водолей") && zodiacM.getText().toString().equals("Рыбы") ||
                        zodiacW.getText().toString().equals("Рыбы") && zodiacM.getText().toString().equals("Дева") ||
                        zodiacW.getText().toString().equals("Рыбы") && zodiacM.getText().toString().equals("Весы") ||
                        zodiacW.getText().toString().equals("Рыбы") && zodiacM.getText().toString().equals("Скорпион") ||
                        zodiacW.getText().toString().equals("Рыбы") && zodiacM.getText().toString().equals("Рыбы")
                )
                {
                    procCompatibility.setText("Совместимы на 99%.");
                }
                else if (zodiacW.getText().toString().equals("Скорпион") && zodiacM.getText().toString().equals("Близнецы")
                )
                {
                    procCompatibility.setText("Совместимы на 58%.");
                }
                else
                {
                    procCompatibility.setText("Неверно введеные данные");
                }
            }
        });

    }
}