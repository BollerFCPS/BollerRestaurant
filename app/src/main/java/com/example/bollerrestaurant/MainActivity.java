package com.example.bollerrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView orderOnlineTV;
        FloatingActionButton mapFAB;

        orderOnlineTV = (TextView) findViewById(R.id.OrderOnline);
        mapFAB = (FloatingActionButton) findViewById(R.id.map_FAB);

        orderOnlineTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent runQuiz = new Intent(MainActivity.this, OrderOnlineActivity.class);
                startActivity(runQuiz);
            }
        });
        mapFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?q=Plaza+Mexico+of+Frederick"));
                startActivity(intent);
            }
        });


    }
}