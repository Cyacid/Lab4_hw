package com.example.lab4_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnChoose : Button = findViewById(R.id.button)
        val i  = Intent(this,Main2Activity :: class.java)
        btnChoose.setOnClickListener(View.OnClickListener {
            startActivityForResult(i,1)
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(data == null) return
        if(requestCode == 1){
            if(resultCode == 100){
                val b : Bundle? = data.extras
                val str1 : String? = b?.getString("drink")
                val str2 : String? = b?.getString("Sugar")
                val str3 : String? = b?.getString("ice")
                val textView4 : TextView = findViewById(R.id.textView4)
                textView4.setText(String.format("飲料:%s\n\n甜度:%s\n\n冰塊:%s\n\n",str1,str2,str3))
            }
        }
    }
}
