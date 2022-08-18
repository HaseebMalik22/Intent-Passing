package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class nextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        Intent frmActivity = getIntent();
        String title= frmActivity.getStringExtra("title");
        String studentName= frmActivity.getStringExtra("student name");
        Integer rollNo= frmActivity.getIntExtra("roll no",0);

        TextView Studentdetails;
        Studentdetails = findViewById(R.id.Studentdetail);
        Studentdetails.setText("roll no:"+rollNo+ "Name" +studentName);

        getSupportActionBar().setTitle(title);




    }
}