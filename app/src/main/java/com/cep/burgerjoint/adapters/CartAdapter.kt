package com.cep.burgerjoint.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.cep.burgerjoint.R
import com.cep.burgerjoint.data.vos.BurgerVO
import com.cep.burgerjoint.delegates.CartViewHolderActionDelegate
import com.cep.burgerjoint.viewholders.CartViewHolder

class CartAdapter(private val mDelegate : CartViewHolderActionDelegate) : BaseRecyclerAdapter<CartViewHolder, BurgerVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_cart,parent,false)
        return CartViewHolder(view, mDelegate)
    }
}