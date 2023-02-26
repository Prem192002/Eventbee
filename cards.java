package com.example.eventbee;



import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;

import android.widget.Toast;



public class cards extends AppCompatActivity {

    CardView cardView1,cardView2,cardView3,cardView4,cardView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

        cardView1 = findViewById(R.id.card1);
        cardView2 = findViewById(R.id.card2);
        cardView3 = findViewById(R.id.card3);
        cardView4 = findViewById(R.id.card4);
        cardView5 = findViewById(R.id.card5);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cards.this, "Delhi", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(cards.this,com.example.eventbee.cultural_club.class));
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cards.this, "Bhopal", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(cards.this, com.example.eventbee.robotic_club.class));

            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(cards.this, "lucknow", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(cards.this, com.example.eventbee.dance_club.class));

            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(cards.this, "Kolkata", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(cards.this,com.example.eventbee.coding_club.class));


            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(cards.this, "Jaipur", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(cards.this,com.example.eventbee.english_club.class));

            }
        });




    }
}