package com.cep.burgerjoint.mvp.presenters

import com.maex.shared.mvp.presenters.BasePresenter
import com.cep.burgerjoint.delegates.CartViewHolderActionDelegate
import com.cep.burgerjoint.mvp.views.CartView

interface CartPresenter : BasePresenter<CartView>, CartViewHolderActionDelegate {
    fun onTapCheckout()
    fun onTapCancelThankYouMessage()
}