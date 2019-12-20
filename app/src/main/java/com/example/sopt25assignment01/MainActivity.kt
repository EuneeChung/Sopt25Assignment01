package com.example.sopt25assignment01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sopt25assignment01.SignIn_Up.SignInActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1=DummyFragment()
        fragment1.name="frag1"

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container_some,fragment1)

        transaction.commit()


        login.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
        goToMyProfile.setOnClickListener {
            val intent2 = Intent(this,MyPageActivity::class.java)
            startActivity(intent2)
        }
    }
}
