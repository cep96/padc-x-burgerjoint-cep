package com.cep.burgerjoint.mvp.presenters.impls

import com.maex.shared.mvp.presenters.BasePresenter
import com.cep.burgerjoint.mvp.presenters.AbstractBasePresenter
import com.cep.burgerjoint.mvp.views.BaseView

abstract class BaseAppPresenterImpl<V : BaseView> : AbstractBasePresenter<V>(), BasePresenter<V>
