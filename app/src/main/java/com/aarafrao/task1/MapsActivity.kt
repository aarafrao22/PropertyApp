package com.aarafrao.task1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aarafrao.task1.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_maps.*

internal class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        val items = ArrayList<SuggestedHomeModel>()
        items.add(SuggestedHomeModel(this,"Rent","Abdullah Plaza Scheme 33\nShahrah e Faisal",R.drawable.img1,3,14,220,19990))
        items.add(SuggestedHomeModel(this,"Sale","Shakeel Corporation\nKarimabad",R.drawable.img2,1,4,220,19990))
        items.add(SuggestedHomeModel(this,"Rent","Hafeez Center\nSadar Karachi",R.drawable.img3,310,4,220,19990))
        items.add(SuggestedHomeModel(this,"Rent","Abdullah Plaza Scheme 33\nShahrah e Faisal",R.drawable.img4,3,4,220,19990))

        val adapter: SuggestedHomeRVAdapter = SuggestedHomeRVAdapter(this,items)
        mapRV.adapter = adapter
        mapRV.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        adapter.notifyDataSetChanged()
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions()
            .position(sydney)
            .title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }
}

      