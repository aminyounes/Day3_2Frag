package com.example.amin.day3_2frag;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends Activity implements communicator {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void respond (int data) {
        FragmentManager manager= getFragmentManager();
        Fragment_2 f2 = (Fragment_2) manager.findFragmentById(R.id.fragment9);
        f2.changedata(data);
    }



}
