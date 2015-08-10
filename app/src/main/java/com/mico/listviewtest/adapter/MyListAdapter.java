package com.mico.listviewtest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.mico.listviewtest.R;

import java.util.List;

/**
 * @author micolvy
 *         Created by micolvy on 15/8/8.
 */
public class MyListAdapter extends BaseAdapter {

    private List<String> items;
    private LayoutInflater inflater;

    public MyListAdapter(Context context, List<String> items) {
        this.items = items;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.listview, parent, false);

        return convertView;
    }
}
