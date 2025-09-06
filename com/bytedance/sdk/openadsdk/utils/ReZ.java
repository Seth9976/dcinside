package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class ReZ {
    public static int PjT = -1;

    static {
    }

    public static int PjT(Context context0, int v) {
        if(context0 == null) {
            return ReZ.PjT;
        }
        else {
            try {
                if(context0.getApplicationContext() != null) {
                    context0 = context0.getApplicationContext();
                }
                Resources resources0 = context0.getResources();
                if(resources0 != null) {
                    DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
                    if(displayMetrics0 != null) {
                        Configuration configuration0 = resources0.getConfiguration();
                        if(configuration0 != null) {
                            int v1 = configuration0.orientation;
                            if(v == 0) {
                                v = v1;
                            }
                            return v == v1 ? Math.round(((float)displayMetrics0.heightPixels) / displayMetrics0.density) : Math.round(((float)displayMetrics0.widthPixels) / displayMetrics0.density);
                        }
                    }
                }
                return ReZ.PjT;
            }
            catch(Throwable unused_ex) {
            }
        }
        return ReZ.PjT;
    }

    public static int PjT(Context context0, int v, int v1) {
        int v2 = ReZ.PjT(context0, v1);
        if(v2 == -1) {
            return ReZ.PjT;
        }
        int v3 = Math.min(90, Math.round(((float)v2) * 0.15f));
        if(v > 0x28F) {
            return Math.max(Math.min(Math.round(((float)v) / 728.0f * 90.0f), v3), 50);
        }
        if(v > 632) {
            return Math.max(Math.min(81, v3), 50);
        }
        if(v > 0x20E) {
            return Math.max(Math.min(Math.round(((float)v) / 468.0f * 60.0f), v3), 50);
        }
        return v <= 0x1B0 ? Math.max(Math.min(Math.round(((float)v) / 320.0f * 50.0f), v3), 50) : Math.max(Math.min(68, v3), 50);
    }
}

