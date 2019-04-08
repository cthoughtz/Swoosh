package com.example.hp.swooshdemoproject.Controller

import android.support.v7.app.AppCompatActivity
import com.example.hp.swooshdemoproject.R
import android.os.Bundle
import com.example.hp.swooshdemoproject.Model.Player
import kotlinx.android.synthetic.main.activity_finishctivity.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finishctivity)

        val player = intent.getParcelableExtra<Player>(com.example.hp.swooshdemoproject.Utilities.EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league}  ${player.skill} league near you"
    }
}
