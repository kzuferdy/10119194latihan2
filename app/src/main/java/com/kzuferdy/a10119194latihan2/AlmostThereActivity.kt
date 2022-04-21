package com.kzuferdy.a10119194latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_almost_there.*
import kotlinx.android.synthetic.main.activity_register.*

class AlmostThereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)

        btn_login.setOnClickListener(){
            var intent = Intent(this@AlmostThereActivity, VerifycationActivity::class.java)
            startActivity(intent)
        }

    }
}