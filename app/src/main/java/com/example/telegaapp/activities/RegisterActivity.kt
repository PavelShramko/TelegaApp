package com.example.telegaapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.telegaapp.R
import com.example.telegaapp.databinding.ActivityRegisterBinding
import com.example.telegaapp.ui.fragments.EnterPhoneNumberFragment
import com.example.telegaapp.utilits.replaceFragment

class RegisterActivity : AppCompatActivity() {

    private lateinit var mBinding : ActivityRegisterBinding
    private lateinit var mToolbar: androidx.appcompat.widget.Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        mToolbar = mBinding.registerToolbar
        setSupportActionBar(mToolbar)
        title = getString(R.string.registe_title_your_phone)

        replaceFragment(EnterPhoneNumberFragment())
    }
}