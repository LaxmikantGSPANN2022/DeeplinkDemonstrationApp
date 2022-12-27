package com.example.deeplinkdemonstrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ProductDetailScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail_screen);

        Uri data = getIntent().getData();
        TextView textView = findViewById(R.id.textViewProductName);

        List<String> segments;
        if (data!=null){
            segments = data.getPathSegments();

            textView.setText(""+segments.get(segments.size()-1));

//            startActivity(new Intent(ProductDetailScreen.this, MainActivity.class));
        }
    }
}