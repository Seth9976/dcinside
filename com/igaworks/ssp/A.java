package com.igaworks.ssp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

public abstract class a {
    public static void a(View view0) {
        if(view0 == null) {
            return;
        }
        view0.setBackgroundDrawable(null);
        if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                a.a(((ViewGroup)view0).getChildAt(v1));
            }
            if(!(view0 instanceof AdapterView)) {
                ((ViewGroup)view0).removeAllViews();
            }
        }
        if(view0 instanceof ImageView) {
            ((ImageView)view0).setImageDrawable(null);
        }
    }
}

