package com.aarafrao.task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SuggestedHomeRVAdapter(): RecyclerView.Adapter<SuggestedHomeRVAdapter.VH>() {

    inner class VH(itemView: View): RecyclerView.ViewHolder(itemView) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuggestedHomeRVAdapter.VH {
        val layoutInflater: LayoutInflater =
    }

    override fun onBindViewHolder(holder: SuggestedHomeRVAdapter.VH, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}