package com.example.simpleprogram_qty_price

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_display.*

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        var txtview: TextView =findViewById(R.id.edtTotalPrice)
        var prefer=getSharedPreferences("MyPref", MODE_PRIVATE)
        var str=prefer.getString("Total","wrong")
        txtview.append(str)
    }
}