package com.example.album;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImage;
    private TextView mText;
    private int count=0;
    private int total;
    private String[] title;
    private int[] images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();//(1)
        initData();//(2)
    }
    private void initData(){
        title=new String[]{"first pic","second pic","third pic","forth pic"};
        images=new int[]{R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
        total=title.length;
        mImage.setImageResource(images[count]);
        mText.setText(title[count]);
    }
    private void initView(){
        mImage=findViewById(R.id.iv_show);
        mText=findViewById(R.id.tv_show);
        findViewById(R.id.btn_previous).setOnClickListener(this);
        findViewById(R.id.btn_next).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn_previous){
            if(count==0){
                count=total-1;
            }else{
                count--;
            }
        }else if(view.getId()==R.id.btn_next){
            if(count==total-1){
                count=0;
            }else{
                count++;
            }
        }
        updateImageAndTitle();
    }
    private void updateImageAndTitle(){
        mImage.setImageResource(images[count]);
        mText.setText(title[count]);
    }
}