package com.itgurussoftware.kotlinmvpdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity(), LoginView {

    //    private val mBtnLogin: Button? = null
    //    private var mEdtPass: EditText? = null
    //    private var mEdtUsername: EditText? = null
    private var presenter: LoginPresenerImpl? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = LoginPresenerImpl(this)

        val mEdtPass = findViewById(R.id.editText2) as EditText
        val mBtnLogin = findViewById(R.id.button_login) as Button
        val mEdtUsername = findViewById(R.id.editText) as EditText

        mBtnLogin.setOnClickListener() {
            presenter?.processLogin(mEdtUsername.text.toString(), mEdtPass.text.toString())
        }
    }

    override fun showEmptyNameError() {
        showToast(getString(R.string.enter_username))
    }

    override fun showEmptyPassError() {
        showToast(getString(R.string.enter_password))
    }

    override fun showUserSaved() {
        showToast(getString(R.string.user_saved))
    }

    override fun showUserDetails() {
    }

    fun showToast(str: String) {
        Toast.makeText(this, "$str", Toast.LENGTH_SHORT).show()
    }
}
