package com.manojbhadane.kotlinmvpdemo.activity.login

import com.manojbhadane.kotlinmvpdemo.R

/**
 * Created by manoj.bhadane on 26-09-2017.
 */
class LoginPresenerImpl(view: LoginView) : LoginPresenter {

    private var mView: LoginView? = view

    override fun processLogin(strUname: String, strPass: String) {

        if (strUname.isEmpty()) {
            mView!!.showMessage(R.string.enter_username); return
        }

        if (strPass.isEmpty()) {
            mView!!.showMessage(R.string.enter_password); return
        }

        mView!!.proceedToNext()
    }
}