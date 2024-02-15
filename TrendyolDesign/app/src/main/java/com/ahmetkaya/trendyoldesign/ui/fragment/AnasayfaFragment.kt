package com.ahmetkaya.trendyoldesign.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ahmetkaya.trendyoldesign.R
import com.ahmetkaya.trendyoldesign.data.entity.Kategoriler
import com.ahmetkaya.trendyoldesign.data.entity.Slider
import com.ahmetkaya.trendyoldesign.data.entity.Urunler
import com.ahmetkaya.trendyoldesign.databinding.FragmentAnasayfaBinding
import com.ahmetkaya.trendyoldesign.ui.adapter.KategoriAdapter
import com.ahmetkaya.trendyoldesign.ui.adapter.SliderAdapter
import com.ahmetkaya.trendyoldesign.ui.adapter.UrunAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.kategoriRV.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.sliderRV.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.urunRV.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        val kategoriListesi = ArrayList<Kategoriler>()
        val k1 = Kategoriler(1,"Erkek")
        val k2 = Kategoriler(2,"Kadın")
        val k3 = Kategoriler(3,"Moda")
        val k4 = Kategoriler(4,"Ev & Yaşam")
        val k5 = Kategoriler(5,"Spor & Outdoor")
        val k6 = Kategoriler(6,"Elektronik")
        val k7 = Kategoriler(7,"Kozmetik")
        kategoriListesi.add(k1)
        kategoriListesi.add(k2)
        kategoriListesi.add(k3)
        kategoriListesi.add(k4)
        kategoriListesi.add(k5)
        kategoriListesi.add(k6)
        kategoriListesi.add(k7)
        val kategoriAdapter = KategoriAdapter(requireContext(),kategoriListesi)
        binding.kategoriRV.adapter = kategoriAdapter


        val sliderListesi = ArrayList<Slider>()
        val s1 = Slider(1, "slider1")
        val s2 = Slider(2, "slider3")
        val s3 = Slider(3, "slider2")
        sliderListesi.add(s1)
        sliderListesi.add(s2)
        sliderListesi.add(s3)
        val sliderAdapter = SliderAdapter(requireContext(),sliderListesi)
        binding.sliderRV.adapter = sliderAdapter


        val urunListesi = ArrayList<Urunler>()
        val u1 = Urunler(1,"xx ₺","urun1")
        val u2 = Urunler(2,"xx ₺","urun2")
        val u3 = Urunler(3,"xx ₺","urun3")
        val u4 = Urunler(4,"xx ₺","urun4")
        val u5 = Urunler(5,"xx ₺","urun5")
        val u6 = Urunler(6,"xx ₺","urun6")
        urunListesi.add(u1)
        urunListesi.add(u2)
        urunListesi.add(u3)
        urunListesi.add(u4)
        urunListesi.add(u5)
        urunListesi.add(u6)
        val urunAdapter = UrunAdapter(requireContext(),urunListesi)
        binding.urunRV.adapter = urunAdapter


        return view
    }

}