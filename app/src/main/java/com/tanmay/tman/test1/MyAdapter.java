package com.tanmay.tman.test1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by tanmay on 1/11/17.
 */

public class MyAdapter extends BaseAdapter {

    String[] dataSource;
    Context context;
    LayoutInflater inflater;
    int[] marksData;

    public MyAdapter(String[] dataInputSource,
                     int[] marks,
                     Context inputContext) {
        dataSource = dataInputSource;
        context = inputContext;
        marksData = marks;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
       return marksData.length;
        //return dataSource.length;
    }

    @Override
    public Object getItem(int i) {
        return dataSource[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //String currentData = "value to be displayed";
        String currentData = dataSource[i];

        if (view == null) {
            view = inflater.inflate(R.layout.item_view, viewGroup, false);
        }

        TextView title = (TextView) view.findViewById(R.id.title);
        TextView subtitle = (TextView) view.findViewById(R.id.subTitle);

        title.setText(currentData);
        subtitle.setText("" + marksData[i]);

        return view;
    }
}
