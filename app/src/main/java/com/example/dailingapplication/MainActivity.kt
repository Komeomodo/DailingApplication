package com.example.dailingapplication

import android.Manifest
import android.Manifest.permission.CALL_PHONE
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var call = findViewById<Button>(R.id.button)
        var inputNumber = findViewById<EditText>(R.id.phone)


        call.setOnClickListener {
            var value = inputNumber.text.toString()
//            Log.d("TAG", "First: $value")
          callPhone(value)

        }
    }

    fun callPhone(string: String ){
//       Log.d("TAG", "is#PASSED $string")
        var uri = Uri.encode(string)
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$uri"))
        startActivity(intent)
    }


}