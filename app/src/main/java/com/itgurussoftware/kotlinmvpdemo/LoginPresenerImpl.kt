package com.itgurussoftware.kotlinmvpdemo

/**
 * Created by manoj.bhadane on 26-09-2017.
 */
class LoginPresenerImpl(view: LoginView) : LoginPresenter {

    private var mView: LoginView? = view

    override fun processLogin(strUname: String, strPass: String) {
        if (strUname.length == 0) {
            mView!!.showEmptyNameError(); return
        }

        if (strPass.length == 0) {
            mView!!.showEmptyPassError(); return
        }

        mView!!.showUserSaved()
    }
}