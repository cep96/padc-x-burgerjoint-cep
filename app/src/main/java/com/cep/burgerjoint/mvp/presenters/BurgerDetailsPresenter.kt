package com.cep.burgerjoint.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.maex.shared.mvp.presenters.BasePresenter
import com.cep.burgerjoint.mvp.views.BurgerDetailsView

interface BurgerDetailsPresenter : BasePresenter<BurgerDetailsView> {
    fun onBurgerDetailsUiReady(lifecycleOwner: LifecycleOwner, burgerDetailsId: Int)
}