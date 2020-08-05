package com.hsb.gradlecompile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gyf.immersionbar.ImmersionBar
import com.hsb.androidlb2.test
import com.hsb.kotlinlib.MyClass
import okhttp3.OkHttpClient

//import com.hsb.androidlib.fullScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        fullScreen(this)
        ImmersionBar.with(this).fullScreen(true).init()

        OkHttpClient.Builder().build()
        test()

        MyClass()
    }
}