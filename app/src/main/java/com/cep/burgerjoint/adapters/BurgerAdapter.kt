package com.cep.burgerjoint.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.cep.burgerjoint.R
import com.cep.burgerjoint.data.vos.BurgerVO
import com.cep.burgerjoint.delegates.BurgerViewHolderActionDelegate
import com.cep.burgerjoint.viewholders.BurgerViewHolder

class BurgerAdapter(private val mDelegate : BurgerViewHolderActionDelegate) : BaseRecyclerAdapter<BurgerViewHolder, BurgerVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BurgerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_burger,parent,false)
        return BurgerViewHolder(view, mDelegate)
    }
}