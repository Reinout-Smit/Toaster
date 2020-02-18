package com.example.firstapp

import android.graphics.Rect
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        btn_toast.setOnClickListener{

            val myToast = Toast.makeText(this, "Hello Kotlin", Toast.LENGTH_LONG)
            myToast.show()
        }

        btn_count.setOnClickListener{
            // get the TextView
            val showCountTextView = findViewById<TextView>(R.id.ticker)

            // Get the value of the text View.
            val countString = showCountTextView.text.toString()

            // Convert value to a number and Increment it
            var count: Int = Integer.parseInt(countString)
            count++

            // Display the  new value in the text view.
            showCountTextView.text = count.toString()
        }

        btn_random.setOnClickListener {
            // Get textview
            val showCountTextView = findViewById<TextView>(R.id.ticker)
            // create random numb
            val rand = (0 until 100).shuffled().last()
            // show random number in textview
            showCountTextView.text = rand.toString()

        }

    }
        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            // Inflate the menu; this adds items to the action bar if it is present.
            menuInflater.inflate(R.menu.menu_main, menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            return when (item.itemId) {
                R.id.action_settings -> true
                else -> super.onOptionsItemSelected(item)
            }
        }


}
