package com.example.album;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();//(1)
        initData();//(2)
    }
    private void initData(){
        String[] title={"first pic","second pic","third pic","forth pic"};
        int[] images={R.d};
    }
    private void initView(){
        mImage=findViewById(R.id.iv_show);
        findViewById(R.id.btn_previous).setOnClickListener(this);
        findViewById(R.id.btn_next).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}