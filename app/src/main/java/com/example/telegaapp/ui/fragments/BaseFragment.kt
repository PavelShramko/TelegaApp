package com.example.telegaapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


open class BaseFragment(layout:Int) : Fragment(layout) {

    private lateinit var mRootView: View

    override fun onStart() {
        super.onStart()
    }
}