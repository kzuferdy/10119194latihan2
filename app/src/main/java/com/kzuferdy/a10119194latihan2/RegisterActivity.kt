package com.kzuferdy.a10119194latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        btn_regist.setOnClickListener(){
            var intent = Intent(this@RegisterActivity, AlmostThereActivity::class.java)
            startActivity(intent)
        }

    }
}