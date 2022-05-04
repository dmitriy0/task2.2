package com.example.task22

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AlertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("AlertActivity", "onCreate")
        setContentView(R.layout.activity_alert)

        Toast.makeText(this,"ddfsfd",Toast.LENGTH_LONG).show()
        val alertFragment = AlertFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.layout, alertFragment)
        transaction.commit()
    }
    override fun onStart() {
        super.onStart()
        Log.i("AlertActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("AlertActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("AlertActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("AlertActivity", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("AlertActivity", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("AlertActivity", "onDestroy")
    }
}