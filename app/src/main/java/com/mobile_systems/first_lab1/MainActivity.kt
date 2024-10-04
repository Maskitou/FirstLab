package com.mobile_systems.first_lab1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var dayNumberInput: EditText
    private lateinit var dayNameOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dayNumberInput = findViewById(R.id.dayNumberInput)
        dayNameOutput = findViewById(R.id.dayNameOutput)
        val showDayButton: Button = findViewById(R.id.showDayButton)

        showDayButton.setOnClickListener {
            val dayNumber = dayNumberInput.text.toString().toIntOrNull()
            dayNameOutput.text = dayNumber?.let { getDayName(it) } ?: "Введите корректный номер дня!"
        }
    }

    private fun getDayName(dayNumber: Int): String {
        return when (dayNumber) {
            1 -> "Понедельник"
            2 -> "Вторник"
            3 -> "Среда"
            4 -> "Четверг"
            5 -> "Пятница"
            6 -> "Суббота"
            7 -> "Воскресенье"
            else -> "Неверный номер дня! Пожалуйста, введите число от 1 до 7."
        }
    }
}