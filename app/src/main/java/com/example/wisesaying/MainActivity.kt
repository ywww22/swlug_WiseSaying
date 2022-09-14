package com.example.wisesaying

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.wisesaying.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wsList = mutableListOf<String>()

        wsList.add("삶이 있는 한 희망은 있다.")
        wsList.add("언제나 현재에 집중할 수 있다면 행복할 것이다.")
        wsList.add("피할 수 없으면 즐겨라.")
        wsList.add("절대 어제를 후회하지 마라 . 인생은 오늘의 나 안에 있고 내일은 스스로 만드는 것이다.")
        wsList.add("내일은 내일의 태양이 뜬다.")
        wsList.add("꿈을 계속 간직하고 있으면 반드시 실현할 때가 온다.")
        wsList.add("그대의 하루 하루를 그대의 마지막 날이라고 생각하라.")
        wsList.add("겨울이 오면 봄이 멀지 않으리")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllBtn.setOnClickListener {
            val intent = Intent(this, WsActivity::class.java)
            startActivity(intent)
        }

        binding.wsTv.setText(wsList.random())
    }
}