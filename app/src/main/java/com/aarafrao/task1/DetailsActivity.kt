package com.aarafrao.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_main.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val items = ArrayList<HomeFeatureModel>()
        items.add(HomeFeatureModel("Available","Rent",R.drawable.ic_baseline_chat_bubble_24))
        items.add(HomeFeatureModel("Available","Rent",R.drawable.ic_baseline_person_24))
        items.add(HomeFeatureModel("Available","Rent",R.drawable.ic_baseline_calendar_today_24))
        items.add(HomeFeatureModel("Available","Rent",R.drawable.ic_baseline_person_24))
        items.add(HomeFeatureModel("Available","Rent",R.drawable.ic_baseline_local_phone_24))
        items.add(HomeFeatureModel("Available","Rent",R.drawable.ic_baseline_map_24))
        val adapter:HomeFeatureAdapter = HomeFeatureAdapter(this,items)
        homeFeaturesRV.adapter = adapter
        homeFeaturesRV.layoutManager= GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
        adapter.notifyDataSetChanged()

    }
}