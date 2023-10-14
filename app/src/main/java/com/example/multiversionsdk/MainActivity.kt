package com.example.multiversionsdk

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.anew.Sdk210
import com.example.old.Sdk207

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.oldSdkVersion).text = "Old v." + Sdk207.version
        findViewById<TextView>(R.id.newSdkVersion).text = "New v." + Sdk210.version
    }
}