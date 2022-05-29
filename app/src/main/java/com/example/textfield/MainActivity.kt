package com.example.textfield

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns.*
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import com.example.textfield.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener{
            if(EMAIL_ADDRESS.matcher(binding.editText.text.toString()).matches()) {
                binding.textView.text = binding.editText.text
                binding.textLayout.isErrorEnabled = false
            } else {
                binding.textLayout.error = getString(R.string.email_error)
            }
        }
    }
}