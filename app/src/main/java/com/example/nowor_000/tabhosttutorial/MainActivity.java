package com.example.nowor_000.tabhosttutorial;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {


    private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarTabs();
    }

    private void inicializarTabs() {
        tabHost=(FragmentTabHost) findViewById(R.id.tabHost);
        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        Resources res= getResources();

       TabHost.TabSpec tab1= tabHost.newTabSpec("tab1");
        TabHost.TabSpec tab2= tabHost.newTabSpec("tab2");
        TabHost.TabSpec tab3= tabHost.newTabSpec("tab3");

       tab1.setIndicator(res.getString(R.string.pes1string),null);
       tab2.setIndicator(res.getString(R.string.pes2string),null);
       tab3.setIndicator(res.getString(R.string.pes3string),null);



        tabHost.addTab(tab1, Pes1Fragment.class, null);
        tabHost.addTab(tab2, Pes2Fragment.class, null);
        tabHost.addTab(tab3, Pes3Fragment.class, null);




    }


}


