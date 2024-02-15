package com.ahmetkaya.trendyoldesign.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahmetkaya.trendyoldesign.data.entity.Kategoriler
import com.ahmetkaya.trendyoldesign.databinding.KategoriTasarimBinding

class KategoriAdapter(var mContext:Context, var kategoriListesi:List<Kategoriler>) :
    RecyclerView.Adapter<KategoriAdapter.KategoriTasarimTutucu>() {

    inner class KategoriTasarimTutucu(var tasarim:KategoriTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategoriTasarimTutucu {
        val binding = KategoriTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return KategoriTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: KategoriTasarimTutucu, position: Int) {
        val kategori = kategoriListesi.get(position)
        val k = holder.tasarim

        k.kategoriTV.text = kategori.kategori_ad
    }

    override fun getItemCount(): Int {
        return kategoriListesi.size
    }


}