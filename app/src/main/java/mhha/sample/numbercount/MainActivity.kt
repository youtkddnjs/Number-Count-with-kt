package mhha.sample.numbercount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Activity_info" , "onCreat")
        val numberTV = findViewById<TextView>(R.id.textView)
        val initBT = findViewById<Button>(R.id.button)
        val startBT = findViewById<Button>(R.id.button2)

        if (data.num_data != null ) {
            number = data.num_data
            Log.i("Activity_info", number.toString())
            numberTV.text = number.toString()
        }

//        if (number > 0 ){numberTV.text = number.toString()}


        initBT.setOnClickListener {
            number = 0
            data.num_data = number
            numberTV.text = number.toString()
        } //initBT.setOnClickListener

        startBT.setOnClickListener {
            number += 1
            data.num_data = number
            Log.i("Activity_info", number.toString() + " : "  + data.num_data.toString() )
            numberTV.text = number.toString()
        }
    } //onCreate

    override fun onStart() {
        super.onStart()
        Log.i("Activity_info" , "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Activity_info" , "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity_info" , "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity_info" , "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity_info" , "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Activity_info" , "onDestroy")
    }

} //MainActivity