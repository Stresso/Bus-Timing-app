package com.example.mad_project;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class table11 extends AppCompatActivity {
    TableLayout t;
    TableRow tr;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table11);
        t=findViewById(R.id.tableLayout);
        String src =getIntent().getStringExtra("src");
        String dst =getIntent().getStringExtra("dst");


    }
}
