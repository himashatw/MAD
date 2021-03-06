package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Lifecycle", "OnCreate() invoked");

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);


    }

    public void onStart() {
        super.onStart();
        Log.i("LifeCycle", "OnStart() invoked");
    }

    public void onRestart() {
        super.onRestart();
        Log.i("LifeCycle", "OnRestart() invoked");
    }

    public void onResume() {
        super.onResume();
        Log.i("LifeCycle", "OnResume() invoked");
    }

    public void onPause() {
        super.onPause();
        Log.i("LifeCycle", "OnPause() invoked");
    }

    public void onStop() {
        super.onStop();
        Log.i("LifeCycle", "OnStop() invoked");

    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle", "OnDestroy() invoked");
    }

}