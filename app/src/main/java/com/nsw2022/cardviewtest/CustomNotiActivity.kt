package com.nsw2022.cardviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.nsw2022.cardviewtest.databinding.ActivityCustimNotiBinding
import com.nsw2022.cardviewtest.databinding.ActivityMainBinding

class CustomNotiActivity : AppCompatActivity() {
    lateinit var binding: ActivityCustimNotiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        binding= ActivityCustimNotiBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}