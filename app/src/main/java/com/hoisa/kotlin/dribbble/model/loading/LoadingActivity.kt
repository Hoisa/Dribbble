package com.hoisa.kotlin.dribbble.model.loading

import android.Manifest
import android.os.Bundle
import com.hoisa.kotlin.dribbble.R
import com.hoisa.kotlin.dribbble.base.BaseMvpActivity
import com.hoisa.kotlin.dribbble.util.PermissionsUtil
import com.hoisa.kotlin.dribbble.util.ToastUtil

/**
 * Created by hoisa on 2018/1/23.
 */
class LoadingActivity : BaseMvpActivity<LoadingConstract.LoadingView, LoadingPresenterImpl>(), LoadingConstract.LoadingView {

    override fun createPresenter() = LoadingPresenterImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PermissionsUtil.requestPermissions(this, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, callback = onSuccessGrant)
    }

    val onSuccessGrant = { ToastUtil.showMessage("Success") }
}