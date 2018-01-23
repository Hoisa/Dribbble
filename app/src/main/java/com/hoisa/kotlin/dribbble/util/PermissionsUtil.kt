package com.hoisa.kotlin.dribbble.util

import android.app.Activity
import com.tbruyelle.rxpermissions2.RxPermissions
import io.reactivex.observers.DisposableObserver

/**
 * Created by hoisa on 2018/1/23.
 */
class PermissionsUtil {
    companion object {
        fun requestPermissions(activity: Activity, vararg permissions: String, callback: () -> Unit) {
            RxPermissions(activity).request(*permissions)
                    .subscribeWith(object : DisposableObserver<Boolean>() {
                        override fun onComplete() {

                        }

                        override fun onNext(t: Boolean) {
                            if (t) {
                                callback()
                            } else {
                                ToastUtil.showMessage("请授予相应权限")
                            }
                        }

                        override fun onError(e: Throwable) {
                            e.printStackTrace()
                        }
                    })
        }
    }


}