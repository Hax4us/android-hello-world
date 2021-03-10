package com.mycompany.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i("MyTag", "Inside onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MyTag", "Inside onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyTag", "Inside onResume()");
    }

    @Override 
    protected void onPause() {
        super.onPause();
        Log.i("MyTag", "Inside onPaused()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyTag", "Inside onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MyTag", "Inside onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyTag", "Inside onDestroy()");
    }
}
