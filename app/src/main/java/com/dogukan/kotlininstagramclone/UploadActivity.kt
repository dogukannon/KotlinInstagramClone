package com.dogukan.kotlininstagramclone

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dogukan.kotlininstagramclone.databinding.ActivityUploadBinding

class UploadActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityUploadBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUploadBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun selectImage(view: View){

    }

    fun upload(view: View){

    }

}