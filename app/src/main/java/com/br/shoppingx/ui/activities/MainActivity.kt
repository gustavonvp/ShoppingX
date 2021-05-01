package com.br.shoppingx.ui.activities

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.br.shoppingx.R
import com.br.shoppingx.utils.Constants
import kotlinx.android.synthetic.main.activity_main.*

internal class MainActivity : AppCompatActivity() {
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sharedPreferences = getSharedPreferences(Constants.SHOPX_PREFERENCES, Context.MODE_PRIVATE)
        val username = sharedPreferences.getString(Constants.LOGGED_IN_USERNAME, "")!!
        tv_main.text="Hello $username."
    }
}