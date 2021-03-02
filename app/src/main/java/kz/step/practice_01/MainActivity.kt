package kz.step.practice_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var btnClickMe: Button? = null
    private val lastName: String = "Лущенко"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeListeners()
    }


    fun initializeViews(){
        btnClickMe = findViewById(R.id.btn_click_me)
    }

    fun initializeListeners() {
        btnClickMe?.setOnClickListener {
            var intent: Intent = Intent(this, ShowLastNameActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, lastName)
            }
            startActivity(intent)
        }
    }
}