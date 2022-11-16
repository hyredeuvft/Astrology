package com.example.astrology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutZodiacSign = (Button) findViewById(R.id.aboutZodiacSigns);
        ImageView Title = (ImageView) findViewById(R.id.Title);
        Title.setBackgroundResource(R.drawable.astrology);
        Button natalChart = (Button) findViewById(R.id.natalChart);
        Button compatibility = (Button) findViewById(R.id.compatibility);
        ConstraintLayout titleConstraint = (ConstraintLayout) findViewById(R.id.TitleConstr);
        titleConstraint.setBackgroundResource(R.drawable.starrysky);
        aboutZodiacSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(MainActivity.this, AboutZodiacSign.class);
                MainActivity.this.startActivity(switcher);
            }
        });
        natalChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(MainActivity.this, CreatingANatalChart.class);
                MainActivity.this.startActivity(switcher);
            }
        });
        compatibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(MainActivity.this, Compatibility.class);
                MainActivity.this.startActivity(switcher);
            }
        });
    }
}