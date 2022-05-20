package com.mobdeve.s12.lazaro.jose.exercise2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Post> dataPost;
    private RecyclerView rvPosts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initNav();
        this.initComponents();
    }

    private void initComponents(){
        DataHelper helper = new DataHelper();

        this.dataPost = helper.initializeData();
        this.rvPosts = findViewById(R.id.rv_Posts);

        this.rvPosts.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        this.rvPosts.setAdapter(new PostsAdapter(this.dataPost));
    }

    private void initNav(){
        final  int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(uiOptions);
    }
}