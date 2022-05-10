package com.example.deliverymariah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.deliverymariah.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var views: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views= ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)
        initializacionListeners()
    }
    private fun initializacionListeners()
    {
        views.button.setOnClickListener {
            Toast.makeText( this,resources.getString(R.string.user)+ ": "+
                    views.editTextTextPersonName.text + "\n"+resources.getString(R.string.password)+": "+views.editTextTextPassword.text+"",
                  Toast.LENGTH_SHORT).show()
           // Toast.makeText( this,resources.getString(R.string.password)+ ": "+
          // views.editTextTextPassword.text, Toast.LENGTH_SHORT).show()

                  }
    }
}