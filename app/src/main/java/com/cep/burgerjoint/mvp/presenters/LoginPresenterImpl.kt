package com.cep.burgerjoint.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.cep.burgerjoint.mvp.presenters.impls.BaseAppPresenterImpl
import com.cep.burgerjoint.mvp.presenters.impls.LoginPresenter
import com.cep.burgerjoint.mvp.views.LoginView
import com.cep.burgerjoint.utils.EM_LOGIN_FAIL_ERROR_MESSAGE

class LoginPresenterImpl : LoginPresenter, BaseAppPresenterImpl<LoginView>() {
    override fun onUIReady(owner: LifecycleOwner) {}

    override fun onTapLogin(userName: String, password: String) {
        if(userName.isNotEmpty() || password.isNotEmpty()){
            mView.navigateToMainScreen()
        } else {
            mView.showErrorMessage(EM_LOGIN_FAIL_ERROR_MESSAGE)
        }
    }
}