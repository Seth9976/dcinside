package com.karumi.dexter.listener;

import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar.s;
import com.google.android.material.snackbar.Snackbar;

public class SnackbarUtils {
    public static void show(View view0, String s, int v, String s1, View.OnClickListener view$OnClickListener0, s baseTransientBottomBar$s0) {
        Snackbar snackbar0 = Snackbar.E0(view0, s, v);
        if(s1 != null && view$OnClickListener0 != null) {
            snackbar0.H0(s1, view$OnClickListener0);
        }
        if(baseTransientBottomBar$s0 != null) {
            snackbar0.u(baseTransientBottomBar$s0);
        }
        snackbar0.m0();
    }
}

