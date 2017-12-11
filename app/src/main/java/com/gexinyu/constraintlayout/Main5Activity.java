package com.gexinyu.constraintlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

//宽高比例

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
