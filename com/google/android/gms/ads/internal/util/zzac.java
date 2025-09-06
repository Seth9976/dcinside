package com.google.android.gms.ads.internal.util;

import android.view.View;
import android.view.ViewParent;

public final class zzac {
    public static boolean zza(View view0) {
        for(ViewParent viewParent0 = view0.getParent(); viewParent0 != null; viewParent0 = viewParent0.getParent()) {
            if(viewParent0.getClass().getName().startsWith("androidx.compose.ui")) {
                return true;
            }
        }
        return false;
    }
}

