package com.example.smartsafebox

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kyleduo.switchbutton.SwitchButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 스위치 버튼 상태에 따라 문자열을 출력할 텍스트뷰
        val optionState = findViewById<View>(R.id.textView) as TextView

        // 스위치 버튼 코
        val switchButton =
            findViewById<View>(R.id.sb_use_listener) as SwitchButton
        switchButton.setOnCheckedChangeListener { buttonView, isChecked ->
            // 스위치 버튼이 체크되었는지 확인하여 각각의 상태를 출력
            if (isChecked) {
                optionState.text = "ON"
            } else {
                optionState.text = "OFF"
            }
        }
    }
}

