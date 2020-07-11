package com.cep.burgerjoint.mvp.presenters.impls

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.cep.burgerjoint.data.model.impls.BurgerModelImpl
import com.cep.burgerjoint.data.vos.BurgerVO
import com.cep.burgerjoint.mvp.presenters.CartPresenter
import com.cep.burgerjoint.mvp.views.CartView

class CartPresenterImpl : CartPresenter, BaseAppPresenterImpl<CartView>() {


    private val mBurgerModel = BurgerModelImpl

    override fun onUIReady(owner: LifecycleOwner) {
        mBurgerModel
            .getBurgersInCart()
            .observe(owner, Observer {
                mView.displayItemsInCart(it)
            })
    }

    override fun onTapRemoveFromCart(burger: BurgerVO) {
        mBurgerModel
            .removeItemFromCart(burger)
    }

    override fun onTapCheckout() {
        mView.displayThankYouMessage()
    }

    override fun onTapCancelThankYouMessage() {
        mView.hideThankYouMessage()
    }
}