package com.cep.burgerjoint.delegates

import com.cep.burgerjoint.data.vos.BurgerVO

interface CartViewHolderActionDelegate {
    fun onTapRemoveFromCart(burger : BurgerVO)
}