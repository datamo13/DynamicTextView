package com.tm.dynamictextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<RelativeLayout>(R.id.root)

        // Create TextView programmatically.
        val textView = TextView(this)

        // setting height and width
        textView.layoutParams= RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        // setting text
        textView.setText("DYNAMICTEXTVIEW")
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
        textView.setTextColor(Color.MAGENTA)
        // onClick the text a message will be displayed "HELLO KOTLIN"
        textView.setOnClickListener()
        {
            Toast.makeText(this@MainActivity, "HELLO KOTLIN",
                    Toast.LENGTH_LONG).show()
        }

        // Add TextView to LinearLayout
        layout ?.addView(textView)
    }
}