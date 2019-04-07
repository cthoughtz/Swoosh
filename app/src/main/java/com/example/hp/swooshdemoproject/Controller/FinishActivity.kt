package com.example.hp.swooshdemoproject.Controller

import android.support.v7.app.AppCompatActivity
import com.example.hp.swooshdemoproject.R
import android.os.Bundle
import com.example.hp.swooshdemoproject.Utilities.EXTRA_LEAGUE
import com.example.hp.swooshdemoproject.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finishctivity.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finishctivity)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill  = intent.getStringExtra(EXTRA_SKILL )

        searchLeaguesText.text = "Looking for $league  $skill league near you"
    }
}
