package com.cep.burgerjoint.mvp.views

import com.cep.burgerjoint.data.vos.BurgerVO

interface BurgerDetailsView : BaseView {
    fun displayBurgerDetails(burger : BurgerVO)
}