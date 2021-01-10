package com.example.mytestliberary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculation.Calculation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Calculation.add(4,5)
    }
}