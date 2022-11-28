package com.app.krescepte

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.app.krescepte.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            signUp.setOnClickListener { view ->
                signUp.setBackground(getDrawable(R.drawable.switch_trcks))
                signUp.setTextColor(resources.getColor(R.color.black))
                logIn.setBackground(null)
                signUpInLayout.setVisibility(View.VISIBLE)
                logInLayout.setVisibility(View.GONE)
                logIn.setTextColor(resources.getColor(R.color.purple))
                logInButton.setVisibility(View.GONE)
                signUpButton.setVisibility(View.VISIBLE)
            }
            logIn.setOnClickListener { view ->
                signUp.setBackground(null)
                signUp.setTextColor(resources.getColor(R.color.purple))
                logIn.background = getDrawable(R.drawable.switch_trcks)
                signUpInLayout.setVisibility(View.GONE)
                logInLayout.setVisibility(View.VISIBLE)
                logIn.setTextColor(resources.getColor(R.color.black))
                logInButton.setVisibility(View.VISIBLE)
                signUpButton.setVisibility(View.GONE)
            }
        }

    }
}