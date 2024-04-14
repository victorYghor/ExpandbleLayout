package com.example.expandblelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import com.example.expandblelayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        val view = b.root
        setContentView(view)
        setContentView(R.layout.activity_main)

        b.cardView.setOnClickListener {
            b.txtDescription.visibility = if(b.txtDescription.visibility == View.GONE) View.VISIBLE else View.GONE

            TransitionManager.beginDelayedTransition(b.liearLayout, AutoTransition())
        }
//        b.liearLayout.setOnClickListener {
//            b.txtDescription.visibility = if(b.txtDescription.visibility == View.GONE) View.VISIBLE else View.GONE
//
//            TransitionManager.beginDelayedTransition(b.liearLayout, AutoTransition())
//        }
    }

}