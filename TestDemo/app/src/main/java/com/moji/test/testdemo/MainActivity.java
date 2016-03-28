package com.moji.test.testdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    private  static final  String ACTION_ABC = "com.test.moji.ABC";

    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button)findViewById(R.id.button);
        Log.d(TAG, "On onCreate");
        FirstFragment fi = new FirstFragment();
        getFragmentManager().beginTransaction().add(R.id.container,fi).commit();
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "On Click");
                ThirdFragment thf = new ThirdFragment();
          //      getFragmentManager().beginTransaction().hide(getFragmentManager().findFragmentById(R.id.first_fragment)).commit();
          //      getFragmentManager().beginTransaction().add(R.id.container,thf).commit();
                getFragmentManager().beginTransaction().replace(R.id.container,thf).commit();
            }
        });


    }

}
