package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//commento 1
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "onCreate()");

        TextView textView = findViewById(R.id.hello_text);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> Log.e(TAG, "Bottone Premuto"));
    }

    public void sendMessage(View view){
    }
}
