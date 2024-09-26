package com.example.krasnovyd1;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find TextView and Buttons by their IDs
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);

        // Handle first button click: change the text of TextView
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Button clicked!");
            }
        });

        // Handle second button click: change the text color of TextView
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(Color.BLUE);
            }
        });
    }
}
