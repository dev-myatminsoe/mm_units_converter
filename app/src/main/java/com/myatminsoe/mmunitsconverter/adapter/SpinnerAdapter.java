package com.myatminsoe.mmunitsconverter.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import mm.technomation.mmtext.*;

/**
 * Created by myatminsoe on 12/14/15.
 */
public class SpinnerAdapter extends ArrayAdapter<String> {

    Context context;

    public SpinnerAdapter(Context context, int resource, String[] objects) {
        super(context, android.R.layout.simple_spinner_dropdown_item, objects);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = super.getView(position, convertView, parent);
        mmtext.prepareView(context, v, mmtext.TEXT_UNICODE, true, true);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),
                "mymm.ttf");
        ((TextView) v).setTypeface(typeface);
        return v;
    }


    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v = super.getView(position, convertView, parent);
        mmtext.prepareView(context, v, mmtext.TEXT_UNICODE, true, true);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),
                "mymm.ttf");
        ((TextView) v).setTypeface(typeface);
        return v;
    }
}
