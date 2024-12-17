package com.example.photodiary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.photodiary.ui.detail.DetailFragment
import com.example.photodiary.ui.home.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav: BottomNavigationView = findViewById(R.id.bottomNavigation)

        // Load the Home fragment by default when the app starts
        if (savedInstanceState == null) {
            loadFragment(HomeFragment()) // Load HomeFragment on startup
        }

        // Handle navigation item selection
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    loadFragment(HomeFragment()) // Load HomeFragment
                    true
                }
                R.id.nav_stream -> {
                    loadFragment(StreamFragment()) // Load StreamFragment
                    true
                }
                R.id.nav_detail -> {
                    loadFragment(DetailFragment()) // Load DetailFragment
                    true
                }
                else -> false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment) // Replace fragment in the container
        transaction.addToBackStack(null)  // Optional, for back navigation
        transaction.commit()
    }
}
