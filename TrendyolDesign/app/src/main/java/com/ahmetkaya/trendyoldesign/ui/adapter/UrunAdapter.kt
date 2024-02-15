package com.ahmetkaya.trendyoldesign.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahmetkaya.trendyoldesign.data.entity.Urunler
import com.ahmetkaya.trendyoldesign.databinding.UrunTasarimBinding

class UrunAdapter(var mContext: Context, var urunListesi:List<Urunler>) :
    RecyclerView.Adapter<UrunAdapter.UrunTasarimTutucu>(){

    inner class UrunTasarimTutucu(var tasarim:UrunTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UrunTasarimTutucu {
        val binding = UrunTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return UrunTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: UrunTasarimTutucu, position: Int) {
        val urun = urunListesi.get(position)
        val u = holder.tasarim

        u.urunTV.text = urun.urun_fiyat

        u.urunIV.setImageResource(
            mContext.resources.getIdentifier(urun.urun_resim,"drawable",mContext.packageName)
        )
    }

    override fun getItemCount(): Int {
        return urunListesi.size
    }
}