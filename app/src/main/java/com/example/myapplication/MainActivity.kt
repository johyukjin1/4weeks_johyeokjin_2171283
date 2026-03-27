package com.example.musicapp
import android.content.Intent
import com.example.myapplication.RecentActivity
import com.example.myapplication.MostPlayedActivity
import com.example.myapplication.RecentlyAddedActivity
import com.example.myapplication.LikedActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 버튼 연결
        val btnRecent = findViewById<Button>(R.id.btnRecent)
        val btnMostPlayed = findViewById<Button>(R.id.btnMostPlayed)
        val btnRecentlyAdded = findViewById<Button>(R.id.btnRecentlyAdded)
        val btnLiked = findViewById<Button>(R.id.btnLiked)

        // 클릭 이벤트
        btnRecent.setOnClickListener {
            startActivity(Intent(this, RecentActivity::class.java))
        }

        btnMostPlayed.setOnClickListener {
            startActivity(Intent(this, MostPlayedActivity::class.java))
        }

        btnRecentlyAdded.setOnClickListener {
            startActivity(Intent(this, RecentlyAddedActivity::class.java))
        }

        btnLiked.setOnClickListener {
            startActivity(Intent(this, LikedActivity::class.java))
        }
    }
}