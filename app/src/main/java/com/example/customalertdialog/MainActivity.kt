package com.example.customalertdialog

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCustomAlertDialog.setOnClickListener(View.OnClickListener {
            val alertDialog = CustomAlertDialog(this@MainActivity, R.layout.custom_layout)
            alertDialog.show(supportFragmentManager, "custom dialog")
            alertDialog.isCancelable = false
        })
    }
}