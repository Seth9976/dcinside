package com.iab.omid.library.vungle.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
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

    public static Activity b(View view0) {
        for(Context context0 = view0.getContext(); context0 instanceof ContextWrapper; context0 = ((ContextWrapper)context0).getBaseContext()) {
            if(context0 instanceof Activity) {
                return (Activity)context0;
            }
        }
        return null;
    }

    public static View c(View view0) {
        ViewParent viewParent0 = view0.getParent();
        return viewParent0 instanceof View ? ((View)viewParent0) : null;
    }

    public static float d(View view0) {
        return view0.getZ();
    }

    public static boolean e(View view0) {
        if(Build.VERSION.SDK_INT >= 24) {
            Activity activity0 = h.b(view0);
            return activity0 == null ? false : activity0.isInPictureInPictureMode();
        }
        return false;
    }

    public static boolean f(View view0) {
        return h.a(view0) == null;
    }

    public static boolean g(View view0) {
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
            view0 = h.c(view0);
        }
        return true;
    }
}

