package com.manojbhadane.kotlinmvpdemo.Login

class LoginActivity : android.support.v7.app.AppCompatActivity(), LoginView {

    //    private val mBtnLogin: Button? = null
    //    private var mEdtPass: EditText? = null
    //    private var mEdtUsername: EditText? = null
    private var presenter: LoginPresenerImpl? = null

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.manojbhadane.kotlinmvpdemo.R.layout.activity_main)

        presenter = LoginPresenerImpl(this)

        val mEdtPass = findViewById(com.manojbhadane.kotlinmvpdemo.R.id.editText2) as android.widget.EditText
        val mBtnLogin = findViewById(com.manojbhadane.kotlinmvpdemo.R.id.button_login) as android.widget.Button
        val mEdtUsername = findViewById(com.manojbhadane.kotlinmvpdemo.R.id.editText) as android.widget.EditText

        mBtnLogin.setOnClickListener() {
            presenter?.processLogin(mEdtUsername.text.toString(), mEdtPass.text.toString())
        }
    }

    override fun showEmptyNameError() {
        showToast(getString(com.manojbhadane.kotlinmvpdemo.R.string.enter_username))
    }

    override fun showEmptyPassError() {
        showToast(getString(com.manojbhadane.kotlinmvpdemo.R.string.enter_password))
    }

    override fun showUserSaved() {
        showToast(getString(com.manojbhadane.kotlinmvpdemo.R.string.user_saved))
    }

    override fun showUserDetails() {
    }

    fun showToast(str: String) {
        android.widget.Toast.makeText(this, "$str", android.widget.Toast.LENGTH_SHORT).show()
    }
}
