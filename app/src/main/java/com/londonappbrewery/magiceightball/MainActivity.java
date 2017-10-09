package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askbutton;
        askbutton=(Button)findViewById(R.id.askbutton);
        final ImageView ball=(ImageView)findViewById(R.id.imageball);
        final int[] myArr= {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,
                        R.drawable.ball5};
        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magicball","created successfully");
                Random n=new Random();
                int num=n.nextInt(5);
                ball.setImageResource(myArr[num]);
            }
        });
    }
}
