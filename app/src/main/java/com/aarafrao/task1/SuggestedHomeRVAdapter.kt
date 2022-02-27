package com.aarafrao.task1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuggestedHomeRVAdapter(
    val context:Context,
    val item:List<SuggestedHomeModel>


) : RecyclerView.Adapter<SuggestedHomeRVAdapter.VH>() {

    inner class VH(itemView: View): RecyclerView.ViewHolder(itemView) {

        var status: TextView = itemView.findViewById<TextView>(R.id.status)
        var name: TextView = itemView.findViewById<TextView>(R.id.txtName)
        var bedroom: TextView = itemView.findViewById<TextView>(R.id.txtBedroom)
        var bathroom: TextView = itemView.findViewById<TextView>(R.id.txtBathroom)
        var squareFeet: TextView = itemView.findViewById<TextView>(R.id.txtSqf)
        var price: TextView = itemView.findViewById<TextView>(R.id.txtPrice)
        var imageView: ImageView = itemView.findViewById<ImageView>(R.id.imgProperty)

        fun setData(name: String?,
                    imageView: Int,
                    propertyStatus:String,
                    bedroom:Int?,
                    bathroom:Int?,
                    squareFeet:Int?,
                    price:Int?){

            this.status.text = propertyStatus.toString()
            this.name.text = name.toString()
            this.bedroom.text = bedroom.toString()
            this.bathroom.text = bathroom.toString()
            this.squareFeet.text = squareFeet.toString()
            this.price.text = price.toString()
            this.imageView.setImageResource(item[position].image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuggestedHomeRVAdapter.VH {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val  view:View = layoutInflater.inflate(R.layout.suggestedpropertyitem,parent,false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: SuggestedHomeRVAdapter.VH, position: Int) {

        holder.setData(item[position].name, item[position].image,
            item[position].propertyStatus,item[position].bedroom,
            item[position].bathroom,item[position].sqf,item[position].price)

    }

    override fun getItemCount(): Int {
        return item.size
    }
}