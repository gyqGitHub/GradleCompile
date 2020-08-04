package com.hsb.androidlib

import androidx.appcompat.app.AppCompatActivity
import com.gyf.immersionbar.ImmersionBar

/**
 * 因为使用 implementation 引入的 ImmersionBar 依赖，app不能在编译时使用该依赖，但可以封装一下暴露出去
 */
fun fullScreen(activity:AppCompatActivity){
    ImmersionBar.with(activity).fullScreen(true).init()
}