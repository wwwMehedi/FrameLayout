package com.tolet.sajib.framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 private ImageView imageView1,imageView2,im3,im4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1=findViewById(R.id.im1);
        imageView2=findViewById(R.id.im2);
//        im3=findViewById(R.id.im3);
//        im4=findViewById(R.id.im4);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
//        im3.setOnClickListener(this);
//        im4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.im1){
            imageView1.setVisibility(View.GONE);
            imageView2.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.im2){
            imageView2.setVisibility(View.GONE);
            imageView1.setVisibility(View.VISIBLE);
        }
//        if(v.getId()==R.id.im3){
//            im3.setVisibility(View.GONE);
//            im4.setVisibility(View.VISIBLE);
//        }
//        if(v.getId()==R.id.im4){
//            im4.setVisibility(View.GONE);
//            im1.setVisibility(View.VISIBLE);
//        }

    }
}
