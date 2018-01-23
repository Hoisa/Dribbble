package com.hoisa.kotlin.dribbble.util

import android.widget.Toast
import com.hoisa.kotlin.dribbble.app.AppContext

/**
 * Created by hoisa on 2018/1/23.
 */
class ToastUtil{
    companion object {
        fun showMessage(s:String){
            Toast.makeText(AppContext.instance,s,Toast.LENGTH_SHORT).show()
        }
    }
}