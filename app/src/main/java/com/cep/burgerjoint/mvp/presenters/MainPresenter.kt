package com.cep.burgerjoint.mvp.presenters

import com.maex.shared.mvp.presenters.BasePresenter
import com.cep.burgerjoint.delegates.BurgerViewHolderActionDelegate
import com.cep.burgerjoint.mvp.views.MainView

interface MainPresenter :  BasePresenter<MainView>,BurgerViewHolderActionDelegate{
    fun onTapCart()
}