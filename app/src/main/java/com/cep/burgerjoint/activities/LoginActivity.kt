package com.cep.burgerjoint.activities

import android.os.Bundle
import com.cep.burgerjoint.R
import com.cep.burgerjoint.mvp.presenters.LoginPresenterImpl
import com.cep.burgerjoint.mvp.presenters.impls.LoginPresenter
import com.cep.burgerjoint.mvp.views.LoginView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity(), LoginView {


    private lateinit var mPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setUpPresenter()
        setUpListeners()
    }

    private fun setUpPresenter() {
        mPresenter = getPresenter<LoginPresenterImpl, LoginView>()
    }

    private fun setUpListeners() {
        btnLogin.setOnClickListener {
            mPresenter.onTapLogin(etUserName.text.toString(), etPassword.text.toString())
        }
    }

    override fun navigateToMainScreen() {
        startActivity(MainActivity.newIntent(this))
    }

    override fun showErrorMessage(message: String) {
        Snackbar.make(window.decorView, message, Snackbar.LENGTH_LONG).show()
    }
}