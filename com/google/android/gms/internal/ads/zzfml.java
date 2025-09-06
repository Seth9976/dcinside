package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzfml {
    public static String zza(View view0) {
        if(view0.isAttachedToWindow()) {
            int v = view0.getVisibility();
            if(v == 8) {
                return "viewGone";
            }
            switch(v) {
                case 0: {
                    return view0.getAlpha() == 0.0f ? "viewAlphaZero" : null;
                }
                case 4: {
                    return "viewInvisible";
                }
                default: {
                    return "viewNotVisible";
                }
            }
        }
        return "notAttached";
    }
}

