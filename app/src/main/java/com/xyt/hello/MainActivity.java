package com.xyt.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    static{
        System.loadLibrary("jnitest");
    }

    private void init() {
        Button btn = (Button) findViewById(R.id.button);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Hello!");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = (TextView) findViewById(R.id.textView);

                NdkJniUtils jni = new NdkJniUtils();
                tv.setText(jni.getCLanguageString());
            }
        });
    }
}
