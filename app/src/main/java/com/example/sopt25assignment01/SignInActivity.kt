package com.example.sopt25assignment01

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_in.*


class SignInActivity : AppCompatActivity() {

    val REQUEST_CODE_LOGIN_ACTIVITY =1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 레이아웃 파일을 메모리로 로드한다.
        setContentView(R.layout.activity_sign_in)

        //TODO 로그인 하기
        btnSignInSignUp?.setOnClickListener(
            //if you are user new, go to sign up page
            object : View.OnClickListener{
                override fun onClick(p0: View?) {
                    // 버튼.setOnClickListener 이렇게 하는 코드의 실질적인 내부 구현
                    // 파라미터는 클린 view의 참조 (https://developer.android.com/reference/android/view/View.OnClickListener)
                    val intent= Intent(this@SignInActivity,SignUpActivity::class.java)
                    startActivityForResult(intent,REQUEST_CODE_LOGIN_ACTIVITY)
                }
            })
        btnSignIn?.setOnClickListener {
            val id= edtSignInID?.text.toString()
            val pw = edtSignInPw.text.toString()

            if(id.isEmpty()|| pw.isEmpty()){
                //ID 또는 PW가 비워져있다면 toast로 사용자에게 알려준다
                Toast.makeText(this,"아이디나 비밀번호를 입력해주세요",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            // 로그인 요청하기 //
            // 회원가입 정보에 있나 확인하기 있으면-> request true
            if(requestSignIn(id,pw)==true){
                val signInIntent = Intent(this, MainActivity::class.java)
                // 로그인에 성공한 아이디를 넘겨주자.
                signInIntent.putExtra("login", id)

                startActivity(signInIntent)
            }
            else{
                Toast.makeText(this,"로그인에 실패하였습니다.",Toast.LENGTH_SHORT).show()
                edtSignInID?.requestFocus()
            }

        }



    }
    private fun requestSignIn(id: String, pw:String): Boolean{
        // 회원가입 정보에 있나 확인하기 있으면-> request true
        val list=SharedPreferenceController.getSignUpINfo(this)
        if (id==list[2]){
            //SharedPreferences에 임시로 회원가입한 데이터 저장있으면 true
            pw==list[3]
            return true
        }
        else {
            //아니면 false
            Toast.makeText(this, "아이디나 비밀번호가 일치하지 않습니다. 다시 입력해주세요", Toast.LENGTH_SHORT).show()
            return false
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==REQUEST_CODE_LOGIN_ACTIVITY){
            if(resultCode==Activity.RESULT_OK){
                val id=data!!.getStringExtra("ID")
                val pw=data!!.getStringExtra("PW")
                edtSignInID.setText(id)
                edtSignInPw.setText(pw)
            }
        }

    }

}
