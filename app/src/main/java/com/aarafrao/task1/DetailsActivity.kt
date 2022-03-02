package com.aarafrao.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_maps.*

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


        val item = ArrayList<SuggestedHomeModel>()
        item.add(SuggestedHomeModel(this,"Rent","Abdullah Plaza Scheme 33\nShahrah e Faisal",R.drawable.img1,3,14,220,19990))
        item.add(SuggestedHomeModel(this,"Sale","Shakeel Corporation\nKarimabad",R.drawable.img2,1,4,220,19990))
        item.add(SuggestedHomeModel(this,"Rent","Hafeez Center\nSadar Karachi",R.drawable.img3,310,4,220,19990))
        item.add(SuggestedHomeModel(this,"Rent","Abdullah Plaza Scheme 33\nShahrah e Faisal",R.drawable.img4,3,4,220,19990))

        val adapter2: SuggestedHomeRVAdapter = SuggestedHomeRVAdapter(this,item)
        upperRv.adapter = adapter2
        upperRv.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        adapter2.notifyDataSetChanged()

    }
}