package com.example.deeplinkdemonstrationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonNextScreen).setOnClickListener(
            View.OnClickListener {
                MainActivity@this.startActivity(Intent(MainActivity@this, ProductDetailScreen::class.java))
            }
        )
    }

}