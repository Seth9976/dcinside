package com.unity3d.ads.core.extensions;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import y4.m;

public final class ViewExtensionsKt {
    public static final void removeViewFromParent(@m View view0) {
        ViewGroup viewGroup0 = null;
        ViewParent viewParent0 = view0 == null ? null : view0.getParent();
        if(viewParent0 instanceof ViewGroup) {
            viewGroup0 = (ViewGroup)viewParent0;
        }
        if(viewGroup0 != null) {
            viewGroup0.removeView(view0);
        }
    }
}

