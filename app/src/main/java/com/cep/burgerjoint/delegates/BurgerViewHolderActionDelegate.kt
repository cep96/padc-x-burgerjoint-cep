package com.cep.burgerjoint.delegates

import android.widget.ImageView
import com.cep.burgerjoint.data.vos.BurgerVO

interface BurgerViewHolderActionDelegate {
    fun onTapBurger(burger : BurgerVO, burgerImageView: ImageView)
    fun onTapAddToCart(burger : BurgerVO, burgerImageView: ImageView)
}