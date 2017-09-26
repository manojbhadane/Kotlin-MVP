package com.manojbhadane.kotlinmvpdemo.Login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.manojbhadane.kotlinmvpdemo.Dashboard.DashBoardActivity
import com.manojbhadane.kotlinmvpdemo.R

class LoginActivity : AppCompatActivity(), LoginView {

    lateinit var mBtnLogin: Button

    private var presenter: LoginPresenerImpl? = null

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = LoginPresenerImpl(this)

        mBtnLogin = findViewById(R.id.button_login) as Button
        val mEdtPass = findViewById(R.id.editText2) as EditText
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
        startActivity(Intent(this, DashBoardActivity::class.java))
    }

    override fun showUserDetails() {
    }

    fun showToast(str: String) {
        Toast.makeText(this, "$str", android.widget.Toast.LENGTH_SHORT).show()
    }
}
