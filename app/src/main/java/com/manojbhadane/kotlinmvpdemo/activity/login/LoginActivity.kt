package com.manojbhadane.kotlinmvpdemo.activity.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.manojbhadane.kotlinmvpdemo.R
import com.manojbhadane.kotlinmvpdemo.activity.BaseActivity
import com.manojbhadane.kotlinmvpdemo.activity.dashboard.DashBoardActivity
import com.muddzdev.styleabletoastlibrary.StyleableToast

class LoginActivity : BaseActivity(), LoginView {

    lateinit var mBtnLogin: Button
    lateinit var mToolbar: Toolbar
    private var presenter: LoginPresenerImpl? = null

    override fun getLayoutResId(): Int {
        return R.layout.activity_main;
    }

    override fun init() {
        presenter = LoginPresenerImpl(this)

        mToolbar = findViewById(R.id.toolbar) as Toolbar
        mBtnLogin = findViewById(R.id.button_login) as Button
        val mEdtPass = findViewById(R.id.editText2) as EditText
        val mEdtUsername = findViewById(R.id.editText) as EditText

        setSupportActionBar(mToolbar);
        mToolbar.setTitle("Login")

        mBtnLogin.setOnClickListener() {
            presenter?.processLogin(mEdtUsername.text.toString(), mEdtPass.text.toString())
        }
    }

    override fun proceedToNext() {
        startActivity(Intent(this, DashBoardActivity::class.java))
    }

    override fun showMessage(resid: Int) {
        StyleableToast.makeText(this, getString(resid), Toast.LENGTH_LONG, R.style.ErrorToast).show();
    }
}
