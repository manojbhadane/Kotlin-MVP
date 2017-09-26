package com.itgurussoftware.kotlinmvpdemo

/**
 * Created by manoj.bhadane on 26-09-2017.
 */
interface CreateUserView {
    fun showEmptyNameError()
    fun showEmptyPassError()
    fun showUserSaved()
    fun showUserDetails()
}