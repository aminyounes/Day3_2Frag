package com.example.amin.day3_2frag;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_2 extends Fragment {

    TextView myText;
    public void changedata(int data){
        myText.setText("The Button clicked " + data + " Times");
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        myText = (TextView) getActivity().findViewById(R.id.textView);
        if (savedInstanceState != null)
            myText.setText(savedInstanceState.getString("CounterText"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_2, container, false);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("CounterText", myText.getText().toString());
    }

}
