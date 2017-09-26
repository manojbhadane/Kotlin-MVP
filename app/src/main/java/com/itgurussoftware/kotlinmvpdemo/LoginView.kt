package com.itgurussoftware.kotlinmvpdemo

/**
 * Created by manoj.bhadane on 26-09-2017.
 */
interface LoginView {
    fun showEmptyNameError()
    fun showEmptyPassError()
    fun showUserSaved()
    fun showUserDetails()
}