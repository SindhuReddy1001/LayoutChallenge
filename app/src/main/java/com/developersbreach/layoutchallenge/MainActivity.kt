package com.developersbreach.layoutchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horizontal_line)

        setContentView(R.layout.music_dark_background)
        setContentView(R.layout.music_light_background)


    }
}
