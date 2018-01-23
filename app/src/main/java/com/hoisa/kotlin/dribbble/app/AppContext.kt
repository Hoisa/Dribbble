package com.hoisa.kotlin.dribbble.app

import android.app.Application

/**
 * Created by hoisa on 2018/1/23.
 */
class AppContext : Application() {
    companion object {
         var instance:AppContext?=null

    }

    override fun onCreate() {
        super.onCreate()
        instance=this
    }
}