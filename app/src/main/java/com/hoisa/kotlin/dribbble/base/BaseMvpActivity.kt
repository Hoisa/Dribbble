package com.hoisa.kotlin.dribbble.base

import android.os.Bundle

/**
 * Created by hoisa on 2018/1/23.
 */
abstract class BaseMvpActivity<V : BaseMvpView, P : BaseMvpPresenter<V>> : BaseActivity(),BaseMvpView {
    val mPresenter by lazy { createPresenter() }

    protected abstract fun createPresenter(): P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter.bindView(this as V)
    }
}