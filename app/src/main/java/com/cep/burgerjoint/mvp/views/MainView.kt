package com.cep.burgerjoint.mvp.views

import android.widget.ImageView
import com.cep.burgerjoint.data.vos.BurgerVO

interface MainView : BaseView{
    fun displayBurgerList(burgerList : List<BurgerVO>)
    fun navigateToBurgerDetailsScreenWithAnimation(burgerId : Int, burgerImageView: ImageView)
    fun navigateToCartScreen()
    fun animateAddBurgerToCart(burger : BurgerVO, burgerImageView : ImageView)
    fun displayCountInCart(burgersInCartCount : Int)

}