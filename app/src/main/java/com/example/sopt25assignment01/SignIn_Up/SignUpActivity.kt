package com.example.sopt25assignment01.SignIn_Up

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.sopt25assignment01.R
import com.example.sopt25assignment01.DB.SharedPreferenceController
import kotlinx.android.synthetic.main.activity_sign_up.*


class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnSignUP.setOnClickListener {
            //TODO 회원가입버튼을 누르면 로그인 페이지로 넘어간다
            var setUser= mutableListOf<String>("1","name","id","pw")
            //일단 회원넘버 일로 지정

            setUser[1]=edtSignUpName?.text.toString()
            setUser[2]= edtSignUpId?.text.toString()
            setUser[3] = edtSignUpPw.text.toString()
            val pwCheck=edtSignUpPwCheck.text.toString()

            if(setUser[1].isEmpty()||setUser[2].isEmpty()|| setUser[3].isEmpty()){
                //비어있는지 확인한다
                Toast.makeText(this,"모두 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(setUser[3]!=pwCheck){
                //패스워드 확인
                Toast.makeText(this,"패스워드 확인을 다시 해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            //데베에 저장
            SharedPreferenceController.setSignUp(this, setUser)
            //로그인 으로 넘어가자
            val list= SharedPreferenceController.getSignUpINfo(this)
            Log.e("user",list[0])
            Log.e("user",list[1])

            val intent =Intent()
            intent.putExtra("ID",setUser[2])
            intent.putExtra("PW",setUser[3])
            setResult(Activity.RESULT_OK,intent)


            finish()
        }

    }
}
