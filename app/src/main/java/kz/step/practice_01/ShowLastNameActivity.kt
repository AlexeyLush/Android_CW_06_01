package kz.step.practice_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class ShowLastNameActivity : AppCompatActivity() {

    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_last_name)
        initializeViews()
    }

    private fun initializeViews(){
        textView = findViewById(R.id.textview_last_name)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        textView?.text = message
    }


}