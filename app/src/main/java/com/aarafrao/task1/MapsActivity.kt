package com.aarafrao.task1

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.location.Location
import android.location.LocationManager
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.aarafrao.task1.databinding.ActivityMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private var mMap: GoogleMap? = null
    private var binding: ActivityMapsBinding? = null
    private var dropOff: LinearLayout? = null

    private val locationManager: LocationManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding!!.root)


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val locationManager = getSystemService(LOCATION_SERVICE) as LocationManager
        val location3: Location = locationManager.getLastKnownLocation(LocationManager.PASSIVE_PROVIDER)

        val longitude = location3.longitude
        val latitude = location3.latitude

        val myLocation = LatLng(latitude, longitude)
        val sydney1 = LatLng(24.920569, 67.046729)
        val sydney2 = LatLng(24.920464, 67.047681)
        val sydney3 = LatLng(24.920943, 67.047053)

        mMap!!.addMarker(MarkerOptions().position(myLocation).title("My Location"))
        mMap!!.addMarker(
            MarkerOptions().position(sydney1).title("Bykea 2").icon(
                bitmapDescriptorFromVector(
                    this,
                    R.drawable.ic_baseline_location_on_24
                )
            )
        )
        mMap!!.addMarker(
            MarkerOptions().position(sydney2).title("Bykea 3").icon(
                bitmapDescriptorFromVector(
                    this,
                    R.drawable.ic_baseline_location_on_24
                )
            )
        )
        mMap!!.addMarker(
            MarkerOptions().position(sydney3).title("Bykea 4").icon(
                bitmapDescriptorFromVector(
                    this,
                    R.drawable.ic_baseline_location_on_24
                )
            )
        )
        mMap!!.moveCamera(CameraUpdateFactory.newLatLng(myLocation))
        mMap!!.setMinZoomPreference(18f)
        val circleOptions =
            CircleOptions().center(myLocation).radius(40.0).strokeWidth(4f).strokeColor(
                Color.rgb(255, 0, 0)
            ).fillColor(Color.argb(80, 255, 0, 0))
        mMap!!.addCircle(circleOptions)





    }
    fun bitmapDescriptorFromVector(context: Context, vector: Int): BitmapDescriptor? {
        val drawable = ContextCompat.getDrawable(context, vector)
        drawable!!.setBounds(0, 0, drawable!!.intrinsicWidth, drawable!!.intrinsicHeight)
        val bitmap = Bitmap.createBitmap(
            drawable!!.intrinsicWidth,
            drawable!!.intrinsicHeight,
            Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)
        drawable!!.draw(canvas)
        return BitmapDescriptorFactory.fromBitmap(bitmap)
    }
}