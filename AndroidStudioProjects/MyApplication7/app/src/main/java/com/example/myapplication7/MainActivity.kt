package com.example.myapplication7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvMessage.setText("안녕하세요 이정규입니다.")
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}