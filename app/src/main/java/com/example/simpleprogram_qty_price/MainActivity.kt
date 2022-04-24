package com.example.simpleprogram_qty_price

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDisplay.setOnClickListener {
            var name = edtName.text.toString()
            var qty = edtQty.text.toString().toInt()
            var price = edtPrice.text.toString().toInt()
            var total = qty * price
            tvTotalPrice.setText("Total Price of $name is $total")
            Toast.makeText(this,"Total price of $name is $total",Toast.LENGTH_LONG).show()

            var prefer=getSharedPreferences("MyPref", MODE_PRIVATE)
            var editor=prefer.edit()
            editor.putString("Total","Total Price of $name is $total")
            editor.commit()
            var intent=Intent(applicationContext,DisplayActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}
