package com.kzuferdy.a10119194latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        regist_btn.setOnClickListener(){
        var intent = Intent(this@LoginActivity, RegisterActivity::class.java)
           startActivity(intent)
        }
    }
}