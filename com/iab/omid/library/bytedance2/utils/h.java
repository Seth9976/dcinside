package com.iab.omid.library.bytedance2.utils;

import android.view.View;
import android.view.ViewParent;

public final class h {
    public static String a(View view0) {
        if(!view0.isAttachedToWindow()) {
            return "notAttached";
        }
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

    public static View b(View view0) {
        ViewParent viewParent0 = view0.getParent();
        return viewParent0 instanceof View ? ((View)viewParent0) : null;
    }

    public static float c(View view0) {
        return view0.getZ();
    }

    public static boolean d(View view0) {
        return h.a(view0) == null;
    }

    public static boolean e(View view0) {
        if(!view0.isAttachedToWindow()) {
            return false;
        }
        if(!view0.isShown()) {
            return false;
        }
        while(view0 != null) {
            if(view0.getAlpha() == 0.0f) {
                return false;
            }
            view0 = h.b(view0);
        }
        return true;
    }
}

