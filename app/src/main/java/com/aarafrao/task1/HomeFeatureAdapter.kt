package com.aarafrao.task1

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aarafrao.task1.HomeFeatureAdapter.*

class HomeFeatureAdapter(
    val context: Context,
    val item:List<HomeFeatureModel>
): RecyclerView.Adapter<ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var feature: TextView = itemView.findViewById<TextView>(R.id.feature)
        var availablity: TextView = itemView.findViewById<TextView>(R.id.availability)
        var icon: ImageView = itemView.findViewById<ImageView>(R.id.icon)

        fun setData(feature: String?,
                    icon: Int,
                    availability:String?){

            this.feature.text = feature.toString()
            this.availablity.text = availability.toString()
            this.icon.setImageResource(item[position].icon)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val  view:View = layoutInflater.inflate(R.layout.homefeatureitem,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(item[position].feature,item[position].icon,item[position].availability)
    }

    override fun getItemCount(): Int {
        return item.size
    }
}