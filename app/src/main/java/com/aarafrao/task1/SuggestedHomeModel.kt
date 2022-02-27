package com.aarafrao.task1

import android.content.Context

data class SuggestedHomeModel(
    val context:Context,
    val propertyStatus:String,
    val name:String?,
    val image:Int,
    val bedroom:Int?,
    val bathroom:Int?,
    val sqf:Int?,
    val price:Int?
) {
}