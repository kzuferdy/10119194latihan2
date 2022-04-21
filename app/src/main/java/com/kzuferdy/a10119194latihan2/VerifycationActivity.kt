package com.kzuferdy.a10119194latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_verify.*

class VerifycationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

         btn_send.setOnClickListener(){
             var intent = Intent(this@VerifycationActivity, HomeActivity::class.java)
             startActivity(intent)
         }

    }
}