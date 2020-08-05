package com.hsb.gradlecompile

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

/**
 *
 * @author gyq
 * @date 2020/8/4
 */
class BaseApplication :Application(){
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}