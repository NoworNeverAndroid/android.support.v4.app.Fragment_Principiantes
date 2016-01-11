package com.example.nowor_000.tabhosttutorial;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nowor_000 on 11/01/2016.
 */
public class Pes3Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.pes3, container, false);
        TextView tv1=(TextView) v.findViewById(R.id.textView);

        Resources res=getResources();

        tv1.setText(res.getText(R.string.pes3string));

        return v;

    }
}
