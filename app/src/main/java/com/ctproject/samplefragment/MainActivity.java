package com.ctproject.samplefragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {

    private Button tombol1,tombol2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnClickListener listener = new OnClickListener() {
            public void onClick(View view) {
                Fragment fragment = null;
                if(view == findViewById(R.id.tombol1)){
                    fragment = new Fragment1();
                }
                if(view == findViewById(R.id.tombol2)){
                    fragment = new Fragment2();
                }
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.my_layout, fragment);
                transaction.commit();
            }
        };

        tombol1 = (Button) findViewById(R.id.tombol1);
        tombol1.setOnClickListener(listener);
        tombol2 = (Button) findViewById(R.id.tombol2);
        tombol2.setOnClickListener(listener);

    }
}
