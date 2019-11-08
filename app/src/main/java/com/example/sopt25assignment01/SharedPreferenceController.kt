package com.example.sopt25assignment01

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceController {
    val signUpUserInfo = mutableListOf<String>("no.user","name","id","pw")

    fun setSignUp(ctx: Context, signUpUserInfo:MutableList<String>){

        val preference:SharedPreferences=ctx.getSharedPreferences("UserInfo",Context.MODE_PRIVATE)
        val editor:SharedPreferences.Editor=preference.edit()

        //회원 number
        //editor.putString("NO.USER",signUpUserInfo[0])
        //회원 이름
        editor.putString("NAME",signUpUserInfo[1])
        //아이디
        editor.putString("ID",signUpUserInfo[2])
        //PW 설정
        editor.putString("PW",signUpUserInfo[3])
        //적용하자
        //editor.apply()
        editor.commit()
    }

    fun getSignUpINfo(ctx: Context):List<String>{
        val preference:SharedPreferences=ctx.getSharedPreferences("UserInfo",Context.MODE_PRIVATE)
        var list = mutableListOf<String>("","")

        list[0]=preference.getString("ID","")!!
        list[1]=preference.getString("PW","")!!

        return list
    }
}