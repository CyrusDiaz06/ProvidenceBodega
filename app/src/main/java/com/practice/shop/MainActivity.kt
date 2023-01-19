package com.practice.shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cafe(view: View) {}
    fun groceries(view: View) {}
    fun alcohol(view: View) {}
    fun other(view: View) {}
    fun purchase(view: View) {}
    fun emptyCart(view: View) {}
}