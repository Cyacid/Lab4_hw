package com.example.lab4_hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val rg0 : RadioGroup = findViewById(R.id.radioGroup)
        val rg1 : RadioGroup = findViewById(R.id.radioGroup3)
        val btnSend : Button = findViewById(R.id.btn_send)
        var sugar = "無糖"
        var ice = "微冰"

        btnSend.setOnClickListener(View.OnClickListener {
            val etDrink : EditText = findViewById(R.id.et_drink)
            val drink : String = etDrink.text.toString()
            val bundle = Bundle()
            val intent = Intent()
            bundle.putString("Sugar",sugar)
            bundle.putString("drink",drink)
            bundle.putString("ice",ice)
            intent.putExtras(bundle)
            setResult(100,intent)
            finish()
        })
        rg0.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
            when (i){
                R.id.radioButton ->  sugar = "無糖"
                R.id.radioButton2 -> sugar = "少糖"
                R.id.radioButton3 -> sugar = "半糖"
                R.id.radioButton4 -> sugar = "全糖"
            }
        })
        rg1.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
            when (i){
                R.id.radioButton8 ->  ice = "微冰"
                R.id.radioButton9 ->  ice = "少冰"
                R.id.radioButton10 -> ice = "正常冰"
            }
        })
    }
}
