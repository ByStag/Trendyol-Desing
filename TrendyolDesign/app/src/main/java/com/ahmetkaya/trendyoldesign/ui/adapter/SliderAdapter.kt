package com.ahmetkaya.trendyoldesign.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahmetkaya.trendyoldesign.data.entity.Slider
import com.ahmetkaya.trendyoldesign.databinding.SliderTasarimBinding

class SliderAdapter(var mContext:Context, var sliderListesi:List<Slider>) :
    RecyclerView.Adapter<SliderAdapter.SliderTasarimTutucu>(){

    inner class SliderTasarimTutucu(var tasarim: SliderTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderTasarimTutucu {
        val binding = SliderTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return SliderTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: SliderTasarimTutucu, position: Int) {
        var slider = sliderListesi.get(position)
        val s = holder.tasarim

        s.sliderIV.setImageResource(
            mContext.resources.getIdentifier(slider.slider_resim,"drawable",mContext.packageName)
        )
    }

    override fun getItemCount(): Int {
        return sliderListesi.size
    }


}