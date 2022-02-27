package com.aarafrao.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val items = ArrayList<SuggestedHomeModel>()
        items.add(SuggestedHomeModel(this,"Rent","Abdullah Plaza Scheme 33\nShahrah e Faisal",R.mipmap.ic_launcher,3,4,220,19990))
        items.add(SuggestedHomeModel(this,"Sale","Shakeel Corporation\nKarimabad",R.mipmap.ic_launcher,3,4,220,19990))
        items.add(SuggestedHomeModel(this,"Rent","Hafeez Center\nSadar Karachi",R.mipmap.ic_launcher,3,4,220,19990))
        items.add(SuggestedHomeModel(this,"Rent","Abdullah Plaza Scheme 33\nShahrah e Faisal",R.mipmap.ic_launcher,3,4,220,19990))
        val adapter: SuggestedHomeRVAdapter = SuggestedHomeRVAdapter(this,items)
        suggestedHomeRV.adapter = adapter
        suggestedHomeRV.layoutManager = LinearLayoutManager(this)
        adapter.notifyDataSetChanged()

    }
}