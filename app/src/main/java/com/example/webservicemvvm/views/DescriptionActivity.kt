package com.example.webservicemvvm.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.webservicemvvm.R

class DescriptionActivity : AppCompatActivity() {

     val data:ArrayList<String>? = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        //Toast.makeText(applicationContext,data?.get(0).toString(),Toast.LENGTH_SHORT).show()
    }
}
