package com.example.sopt25assignment01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FollowerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_follower)

        val myProfileFragment=MyProfileFragment()


        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container_profile,myProfileFragment)
        transaction.commit()
    }
}
