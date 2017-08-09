package com.example.myviewproject.project01;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myviewproject.R;

public class View01MainActivity extends AppCompatActivity {

    public static void startActivity(Context context){
        Intent intent = new Intent(context, View01MainActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view01_main);
    }
}
