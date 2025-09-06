package com.dcinside.app.util;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.StringRes;

public final class gl {
    public static void a(View view0) {
    }

    private static void b(View view0) {
    }

    public static void c(Activity activity0) {
        gl.e(activity0, null, false);
    }

    public static void d(Activity activity0, @StringRes int v) {
        gl.e(activity0, activity0.getString(v), false);
    }

    public static void e(Activity activity0, String s, boolean z) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            gl.h(((FrameLayout)window0.getDecorView()), s, z);
        }
    }

    public static void f(ViewGroup viewGroup0) {
        gl.h(viewGroup0, null, false);
    }

    public static void g(ViewGroup viewGroup0, @StringRes int v) {
        gl.h(viewGroup0, viewGroup0.getContext().getString(v), false);
    }

    public static void h(ViewGroup viewGroup0, String s, boolean z) {
        try {
            View view0 = (View)viewGroup0.getTag(0x7F0B0FF2);  // id:type_decor_progress
            if(view0 == null) {
                View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0244, viewGroup0, false);  // layout:view_progressor
                view1.setClickable(true);
                view1.setOnClickListener(new fl());
                if(z) {
                    view1.setBackgroundColor(0);
                }
                viewGroup0.addView(view1);
                viewGroup0.setTag(0x7F0B0FF2, view1);  // id:type_decor_progress
                return;
            }
            if(view0.getParent() == null) {
                viewGroup0.addView(view0);
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    public static void i(Activity activity0) {
        gl.e(activity0, null, true);
    }

    public static void j(Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            gl.k(((FrameLayout)window0.getDecorView()));
        }
    }

    public static void k(ViewGroup viewGroup0) {
        try {
            View view0 = (View)viewGroup0.getTag(0x7F0B0FF2);  // id:type_decor_progress
            if(view0 != null && view0.getParent() != null) {
                viewGroup0.removeView(view0);
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }
}

