package com.adak.hi5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.gms.common.SignInButton
import daos.PostDao

class CreatePostActivity : AppCompatActivity() {

    private lateinit var postDao: PostDao
    private lateinit var postbut: Button
    private lateinit var writepost: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        postDao = PostDao()

        //for OnClickListener
        postbut = findViewById(R.id.postButton)
        writepost = findViewById(R.id.postInput)

        postbut.setOnClickListener {
            val input = writepost.text.toString().trim()
            if(input.isNotEmpty()) {
                postDao.addPost(input)
                finish()
            }
        }

        //setUpRecyclerView()
    }

   /* private fun setUpRecyclerView() {

    } */
}