package com.hoisa.kotlin.dribbble.base

/**
 * Created by hoisa on 2018/1/23.
 */
abstract class BaseMvpFragment<V : BaseMvpView, P : BaseMvpPresenter<V>> : BaseFragment() {

    protected val mPresenter by lazy { createPresenter() }

    protected abstract fun createPresenter(): P
}