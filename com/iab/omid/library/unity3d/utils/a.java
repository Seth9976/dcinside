package com.iab.omid.library.unity3d.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.unity3d.adsession.g;

public final class a {
    private static UiModeManager a;

    static {
    }

    public static g a() {
        UiModeManager uiModeManager0 = a.a;
        if(uiModeManager0 != null) {
            switch(uiModeManager0.getCurrentModeType()) {
                case 1: {
                    return g.c;
                }
                case 4: {
                    return g.b;
                }
                default: {
                    return g.d;
                }
            }
        }
        return g.d;
    }

    public static void b(Context context0) {
        if(context0 != null) {
            a.a = (UiModeManager)context0.getSystemService("uimode");
        }
    }
}

