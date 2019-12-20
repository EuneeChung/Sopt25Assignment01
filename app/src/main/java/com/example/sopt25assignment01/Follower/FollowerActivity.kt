package com.example.sopt25assignment01.Follower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sopt25assignment01.MyProfileFragment
import com.example.sopt25assignment01.R

class FollowerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_follower)

        val myProfileFragment= MyProfileFragment()


    }
}
