package com.example.hitungumurku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {

            //deklarasi edit text
            var tahunLahir = etInputUmur.text.toString().toInt()

            //get tahun saat ini dengan kalendar
            var tahun:Int = Calendar.getInstance().get(Calendar.YEAR)

            //get umur=tahun saat ini dikurang dengan input pada text
            var umur = tahun - tahunLahir

            //hasil
            tvUmur.text = "Umur = $umur tahun"
        }

    }
}
