package com.example.latfragmentsederhana

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnFragmentSatu = findViewById<Button>(R.id.btnFragmentSatu)
        val btnFragmentDua = findViewById<Button>(R.id.btnFragmentDua)

        if (savedInstanceState == null) {
            replaceFragment(fSatu())
        }

        btnFragmentSatu.setOnClickListener {
            replaceFragment(fSatu())
        }
        btnFragmentDua.setOnClickListener {
            replaceFragment(fDua())
        }
    }

    private fun replaceFragment (fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}