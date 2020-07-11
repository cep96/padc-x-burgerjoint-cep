package com.cep.burgerjoint.mvp.views

import com.cep.burgerjoint.data.vos.BurgerVO

interface CartView : BaseView {
    fun displayItemsInCart(burgers : List<BurgerVO>)
    fun displayThankYouMessage()
    fun hideThankYouMessage()
}