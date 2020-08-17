package com.srn.androidstarterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.srn.androidstarterproject.Extension.emailToastMessage
import com.srn.androidstarterproject.Extension.isEmail
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonCheck.setOnClickListener {
            Toast.makeText(this, emailtext.text.toString().isEmail().emailToastMessage(),Toast.LENGTH_LONG).show()
        }

    }

}

