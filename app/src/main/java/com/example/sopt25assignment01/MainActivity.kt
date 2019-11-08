package com.example.sopt25assignment01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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


        button.setOnClickListener {
            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent2 = Intent(this,MyPageActivity::class.java)
            startActivity(intent2)
        }
    }
}
