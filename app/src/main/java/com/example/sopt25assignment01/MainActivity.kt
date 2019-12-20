package com.example.sopt25assignment01

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sopt25assignment01.DB.SharedPreferenceController
import com.example.sopt25assignment01.Follower.FollowerActivity
import com.example.sopt25assignment01.SignIn_Up.SignInActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_in.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragment1=DummyFragment()
        fragment1.name="frag1"

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container_some,fragment1)

        transaction.commit()
        val userInfo=SharedPreferenceController.getSignUpINfo(this)
        if(userInfo[0]!="") login.text= "follower"

        login.setOnClickListener {
            if(userInfo[0]!=""){
                val intent = Intent(this, FollowerActivity::class.java)
                startActivity(intent)
            }
            else {
                val intent = Intent(this, SignInActivity::class.java)
                startActivity(intent)
            }
        }
        goToMyProfile.setOnClickListener {
            val intent2 = Intent(this,MyPageActivity::class.java)
            startActivity(intent2)
        }
    }
}
