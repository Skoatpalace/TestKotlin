package com.example.skoatpalace.testkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)

        val a: Int = 2
        val b: Int = 3
        button_test.setOnClickListener {
            Toast.makeText(this@MainActivity, a + b, Toast.LENGTH_LONG).show()
        }


    }

    fun FuzzBizz(args: Array<String>) = (1..100).map {
        StringBuilder().apply {
            if (it % 3 == 0) append("Fizz")
            if (it % 5 == 0) append("Buzz")
            if (isEmpty()) append(it)
        }.toString()

    }.forEach {

        // V
        println(it)

    }
}
