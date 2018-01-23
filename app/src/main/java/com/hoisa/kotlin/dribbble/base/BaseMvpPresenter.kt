package com.hoisa.kotlin.dribbble.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by hoisa on 2018/1/23.
 */
abstract class BaseMvpPresenter<V : BaseMvpView> {
    var mView: V? = null
    var mDisposable: CompositeDisposable? = null

    fun addDisposable(disposable: Disposable) {
        if (mDisposable == null) {
            mDisposable = CompositeDisposable()
        }
        mDisposable?.add(disposable)
    }

    fun unSubscribe() {
        mDisposable?.dispose()
    }

    fun bindView(view: V) {
        mView = view
    }

    fun unBindView() {
        unSubscribe()
        mView = null
    }
}