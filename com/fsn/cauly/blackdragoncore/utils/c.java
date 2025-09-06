package com.fsn.cauly.blackdragoncore.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class c {
    public static ImageButton a(Context context0, Bitmap bitmap0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        ImageButton imageButton0 = new ImageButton(context0);
        imageButton0.setLayoutParams(viewGroup$LayoutParams0);
        imageButton0.setBackgroundColor(0);
        imageButton0.setImageBitmap(bitmap0);
        return imageButton0;
    }

    public static LinearLayout.LayoutParams a() {
        return new LinearLayout.LayoutParams(-1, -1);
    }

    public static LinearLayout.LayoutParams a(int v, int v1) {
        return new LinearLayout.LayoutParams(v, v1);
    }

    public static LinearLayout a(Context context0, boolean z, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        LinearLayout linearLayout0 = new LinearLayout(context0);
        if(z) {
            linearLayout0.setOrientation(0);
        }
        else {
            linearLayout0.setOrientation(1);
        }
        linearLayout0.setLayoutParams(viewGroup$LayoutParams0);
        linearLayout0.setBackgroundColor(0);
        return linearLayout0;
    }

    public static RelativeLayout a(Context context0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        RelativeLayout relativeLayout0 = new RelativeLayout(context0);
        relativeLayout0.setLayoutParams(viewGroup$LayoutParams0);
        relativeLayout0.setBackgroundColor(0);
        return relativeLayout0;
    }

    public static void a(View view0) {
        if(view0 == null) {
            return;
        }
        if(view0 instanceof ViewGroup) {
            ViewGroup viewGroup0 = (ViewGroup)view0;
            int v = viewGroup0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                c.a(viewGroup0.getChildAt(v1));
            }
            try {
                viewGroup0.removeAllViews();
            }
            catch(Throwable unused_ex) {
            }
        }
        try {
            view0.setOnClickListener(null);
        }
        catch(Throwable unused_ex) {
        }
        try {
            view0.setOnCreateContextMenuListener(null);
        }
        catch(Throwable unused_ex) {
        }
        try {
            view0.setOnFocusChangeListener(null);
        }
        catch(Throwable unused_ex) {
        }
        try {
            view0.setOnKeyListener(null);
        }
        catch(Throwable unused_ex) {
        }
        try {
            view0.setOnLongClickListener(null);
        }
        catch(Throwable unused_ex) {
        }
        try {
            view0.setOnClickListener(null);
        }
        catch(Throwable unused_ex) {
        }
        Drawable drawable0 = view0.getBackground();
        if(drawable0 != null) {
            drawable0.setCallback(null);
        }
        if(view0 instanceof ImageView) {
            Drawable drawable1 = ((ImageView)view0).getDrawable();
            if(drawable1 != null) {
                drawable1.setCallback(null);
            }
            ((ImageView)view0).setImageDrawable(null);
            ((ImageView)view0).setBackgroundDrawable(null);
        }
        if(view0 instanceof TextView) {
            ((TextView)view0).setText(null);
        }
        if(view0 instanceof WebView) {
            ((WebView)view0).destroyDrawingCache();
            ((WebView)view0).destroy();
        }
    }

    public static RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public static RelativeLayout.LayoutParams c() {
        return new RelativeLayout.LayoutParams(-2, -2);
    }
}

