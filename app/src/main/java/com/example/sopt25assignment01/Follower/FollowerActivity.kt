package com.example.sopt25assignment01.Follower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt25assignment01.Data.Followers
import com.example.sopt25assignment01.MyProfileFragment
import com.example.sopt25assignment01.R

class FollowerActivity : AppCompatActivity() {

    private lateinit var rvFollower: RecyclerView
    private lateinit var followerViewAdapter : FollowerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_follower)

        rvFollower=findViewById(R.id.rvFollower)
        followerViewAdapter = FollowerViewAdapter(this)

        rvFollower.adapter = followerViewAdapter
        rvFollower.layoutManager =LinearLayoutManager(this)
        followerViewAdapter.data = listOf(
            Followers(
                name="신승민",
                userName="greedy0110"
            ),
            Followers(
                name="신승민",
                userName="greedy0110"
            ),
            Followers(
                name="신승민",
                userName="greedy0110"
            )


        )
        followerViewAdapter.notifyDataSetChanged()


    }
}
