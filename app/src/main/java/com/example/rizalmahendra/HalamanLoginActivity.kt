package com.example.rizalmahendra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rizalmahendra.databinding.ActivityHalamanLoginBinding

class HalamanLoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHalamanLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamanLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loginButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()
            val gagal: String= "gagal login"
            if ( username == "stmiklombok" && password == "1234"){
                val moveIntent = Intent(this@HalamanLoginActivity, HitungLuasActivity::class.java)
                startActivity(moveIntent)
            }else{
                binding.tulisan.text = gagal
            }
        }
    }
}