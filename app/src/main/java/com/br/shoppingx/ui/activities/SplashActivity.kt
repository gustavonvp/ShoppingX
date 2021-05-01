package com.br.shoppingx.ui.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.br.shoppingx.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val mHandler = Handler()
        mHandler.postDelayed({
            val intent = Intent(this@SplashActivity, LoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        }, 1500)


//        val typeface: Typeface = Typeface.createFromAsset(getAssets(), "Montserrat-Bold.ttf")
//        tv_app_name.typeface = typeface
    }



}