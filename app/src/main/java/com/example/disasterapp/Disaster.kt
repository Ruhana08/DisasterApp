package com.example.disasterapp

data class Disaster(
    val nameDisaster: String = "",
    val disasterType: String = "",
    val imageDisaster: Int = 0
)

fun generateDummy(): List<Disaster> {
    return listOf(
        Disaster("Tsunami", "Bencana Alam", R.drawable.tsunami),
        Disaster("Letusan Gunung Berapi", "Bencana Alam", R.drawable.gunung_meletus),
        Disaster("Gempa Bumi", "Bencana Alam", R.drawable.gempa_bumi),
        Disaster("Banjir", "Bencana Alam", R.drawable.banjir),
        Disaster("Kebakaran", "Bencana", R.drawable.kebakaran),
        Disaster("Kecelakaan Nuklir", "Bencana", R.drawable.kecelakaan_nuklir),
        Disaster("Serangan Teroris", "Bencana", R.drawable.serangan_teroris),
        Disaster("Perang", "Bencana", R.drawable.war)
    )
}