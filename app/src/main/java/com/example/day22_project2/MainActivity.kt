package com.example.day22_project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Kunal", "Neha", "Shraddha", "Niranjan", "Omkar", "Sara❤")

        val lastMsg = arrayOf("Patal zali re anya😂", "Me too", "Udya yein mi", "Clg la gelta ka", "Barobr ahe ka?", "Missing you🥺")

        val lastMsgTime = arrayOf("7:02 AM", "8:50 AM", "10:36 AM", "12:53 PM", "2:12 PM", "6:18 PM")

        val phoneNo = arrayOf("9617236554", "9901218562", "8856236510", "9401036577", "7201556531", "7589641333")

        val imgId = intArrayOf(R.drawable.pic0, R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5)

        userArrayList = ArrayList()

        for(eachIndex in name.indices) {
            val user = User(name[eachIndex], lastMsg[eachIndex], lastMsgTime[eachIndex], phoneNo[eachIndex], imgId[eachIndex])

            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.listView)
        listView.isClickable = true
        listView.adapter = MyAdapter(this, userArrayList)
    }
}