package com.example.deliverymariah.interface_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deliverymariah.R
import com.example.deliverymariah.databinding.ActivityPrincipalBinding

class Principal : AppCompatActivity() {

    private lateinit var views: ActivityPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views= ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(views.root)
        showName(intent)
    }
    private fun showName(intent: Intent)
    {
        var  userName= intent.getStringExtra("name_user")
        views.name1.setText(userName)
        //var  userPassword= intent.getStringExtra("name_Password")
        //views.name2.setText(userPassword)
    }
}