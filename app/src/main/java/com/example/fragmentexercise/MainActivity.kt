package edu.msudenver.cs3013.minfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fragmentexercise.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startFragment(view: View) {
//        val frameLayout = findViewById<FragmentContainerView>(R.id.fragment_container)
        val blueFragment = BlueFragment.newInstance("FIRST")

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, blueFragment)
            addToBackStack(null)
            commit()
        }
    }
}