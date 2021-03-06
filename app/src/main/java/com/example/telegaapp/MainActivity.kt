package com.example.telegaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.telegaapp.activities.RegisterActivity
import com.example.telegaapp.databinding.ActivityMainBinding
import com.example.telegaapp.ui.fragments.ChatFragment
import com.example.telegaapp.ui.objects.AppDrawer
import com.example.telegaapp.utilits.AUTH
import com.example.telegaapp.utilits.replaceActivity
import com.example.telegaapp.utilits.replaceFragment
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mAppDrawer: AppDrawer
    private lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }

    private fun initFunc() {
        if(AUTH.currentUser!=null){
        setSupportActionBar(mToolbar)
        mAppDrawer.create()
        replaceFragment(ChatFragment())
        } else {
            replaceActivity(RegisterActivity())
        }

    }



    private fun initFields() {
        mToolbar = mBinding.mainToolbar
        mAppDrawer = AppDrawer(this, mToolbar)
        AUTH = FirebaseAuth.getInstance()
    }
}