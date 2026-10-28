package com.example.disasterapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.disasterapp.com.example.disasterapp.DisasterAdapter
import androidx.recyclerview.widget.GridLayoutManager
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val rvDisaster = findViewById<RecyclerView>(R.id.rv_disaster)

        ViewCompat.setOnApplyWindowInsetsListener(rvDisaster) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(
                view.paddingLeft,
                systemBars.top,
                view.paddingRight,
                systemBars.bottom
            )
            insets
        }

        val adapterDisaster = DisasterAdapter(generateDummy()) { disaster ->
            Toast.makeText(
                this@MainActivity,
                disaster.nameDisaster,
                Toast.LENGTH_SHORT
            ).show()
        }

        rvDisaster.layoutManager = GridLayoutManager(this@MainActivity, 2)
        rvDisaster.adapter = adapterDisaster
    }
}