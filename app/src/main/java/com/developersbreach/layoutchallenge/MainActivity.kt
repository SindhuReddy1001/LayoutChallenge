package com.developersbreach.layoutchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * Change the layout file name below to see how it looks after you run in app.
         *
         * Also you can refer to preview images in drawable folder -> res/drawable/.
         * Once you complete building the two layouts commit those changes to the repository.
         */
        setContentView(R.layout.music_dark_background)
    }
}