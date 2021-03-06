package com.example.telegaapp.utilits

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.telegaapp.R
import com.example.telegaapp.activities.RegisterActivity
import com.example.telegaapp.ui.fragments.ChatFragment

fun Fragment.showToast(message:String){
    Toast.makeText(this.context, message, Toast.LENGTH_SHORT).show()
}

fun AppCompatActivity.replaceActivity(activity: AppCompatActivity){
    val intent = Intent(this, activity::class.java)
    startActivity(intent)
    this.finish()
}

fun AppCompatActivity.replaceFragment(fragment: Fragment){
    supportFragmentManager.beginTransaction().addToBackStack(null)
        .replace(R.id.dataContainer, fragment).commit()

}

fun Fragment.replaceFragment(fragment: Fragment){
    this.fragmentManager?.beginTransaction()?.addToBackStack(null)
        ?.replace(R.id.dataContainer, fragment)?.commit()

}
