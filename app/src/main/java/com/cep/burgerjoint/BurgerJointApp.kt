package com.cep.burgerjoint

import android.app.Application
import com.cep.burgerjoint.data.model.impls.BurgerModelImpl
import com.cep.burgerjoint.dummy.getDummyBurgers
import com.cep.burgerjoint.persistence.BurgerJointDatabase

class BurgerJointApp : Application() {
    override fun onCreate() {
        super.onCreate()
        BurgerModelImpl.init(applicationContext)
        deleteAllBurgers()
        prepopulateBurgers()
    }

    private fun deleteAllBurgers(){
        BurgerJointDatabase.getInstance(applicationContext)
            .getBurgerDao()
            .deleteAllBurgers()
    }

    private fun prepopulateBurgers(){
        BurgerJointDatabase.getInstance(applicationContext)
            .getBurgerDao()
            .insertBurgers(getDummyBurgers())
    }
}