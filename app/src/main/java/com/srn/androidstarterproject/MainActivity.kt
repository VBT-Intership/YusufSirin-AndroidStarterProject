package com.srn.androidstarterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
fun String.isEmail(): Boolean = android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
fun Boolean.emailToastMessage():String=if (this) "Successful" else "Wrong !"
