package com.suleymaniseri.anadolubank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Veri hazırlığı

        val touristPlace = arrayListOf<TouristPlace>(TouristPlace("Ulu Cami",R.drawable.ulucami),
            TouristPlace("Kutahya Castle",R.drawable.ktahyakalesi),
            TouristPlace("Bodrum Castle",R.drawable.thumbs_b_c_9ae574daa5892a1644e8b7691e8a410b),
            TouristPlace("Kaunos King Tombs",R.drawable.kapak_111629),
            TouristPlace("Afrodisias Ancient City",R.drawable.arena))

    }
}