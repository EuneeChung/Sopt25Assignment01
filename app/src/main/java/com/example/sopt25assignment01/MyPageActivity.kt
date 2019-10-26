package com.example.sopt25assignment01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_page_activity.*

class MyPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page_activity)

    intro.text="안녕하세요 저는 25기 OB 정은이입니다.덕성여자대학교 IT미디어공학과 3학년 재학중이고 23살입니다.고양이 놀아주는 게 취미구요 고양이를 정말 좋아해요 싫어하는것은 지금 시험기간이라..시험...???이번기수 잘 부탁드립니다! "
    }
}
