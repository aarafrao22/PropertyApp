package com.aarafrao.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_property.*
import kotlinx.android.synthetic.main.activity_property.status
import kotlinx.android.synthetic.main.activity_property.txtBathroom
import kotlinx.android.synthetic.main.activity_property.txtBedroom
import kotlinx.android.synthetic.main.activity_property.txtName
import kotlinx.android.synthetic.main.activity_property.txtSqf
import kotlinx.android.synthetic.main.suggestedpropertyitem.*

class PropertyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_property)
        imageView.setImageResource(R.drawable.img1)
        BottomSheetBehavior.from(sheet).apply {
            peekHeight = 400
            this.state = BottomSheetBehavior.STATE_HALF_EXPANDED
        }

        status.text = intent.getStringExtra("status")
        txtName.text = intent.getStringExtra("name")
        txtBedroom.text = intent.getIntExtra("bedroom",0).toString()
        txtBathroom.text = intent.getIntExtra("bathroom",0).toString()
        txtSqf.text = intent.getIntExtra("sqf",0).toString()
//        txtPrice.text = intent.getIntExtra("price",0).toString()
//        imageView.setImageResource(intent.getIntExtra("image",0))

    }
}