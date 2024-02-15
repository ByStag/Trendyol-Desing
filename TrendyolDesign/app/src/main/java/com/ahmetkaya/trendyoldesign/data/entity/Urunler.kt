package com.ahmetkaya.trendyoldesign.data.entity

import java.io.Serializable

data class Urunler(var urun_id:Int,
                   var urun_fiyat:String,
                   var urun_resim:String) : Serializable {
}