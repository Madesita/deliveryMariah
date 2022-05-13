package com.example.deliverymariah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.deliverymariah.databinding.ActivityMainBinding
import com.example.deliverymariah.interface_user.Principal

class MainActivity : AppCompatActivity() {

    private lateinit var views: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)
        initializacionListeners()
    }
    private fun initializacionListeners()
    {
        views.button.setOnClickListener{

            val userText=views.editTextUserName2.text.toString()
            val passwordText=views.editTextTextPassword2.text.toString()

            userText?.let {
                passwordText?.let { itp ->
                    if (it.equals("made") && itp.equals("123"))
                    {
                        goToPrincipal(userText)
                    }
                }
            }
        }
    }
    private fun goToPrincipal(userText: String)
    {
        var  intent= Intent(this, Principal::class.java)
        intent.putExtra( "name_user",userText)
        intent.putExtra( "name_Password",userText)
        startActivity(intent)
    }
}