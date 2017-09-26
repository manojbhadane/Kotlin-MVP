package com.manojbhadane.kotlinmvpdemo.Login

/**
 * Created by manoj.bhadane on 26-09-2017.
 */
interface LoginPresenter {
    fun processLogin(strUname: String, strPass: String)
}