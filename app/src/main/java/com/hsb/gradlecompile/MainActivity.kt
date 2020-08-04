package com.hsb.gradlecompile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gyf.immersionbar.ImmersionBar
//import com.hsb.androidlib.fullScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        fullScreen(this)
        ImmersionBar.with(this).fullScreen(true).init()
    }
}