package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import kotlin.V;
import kotlin.jvm.internal.L;
import y4.l;

public final class y {
    @l
    public static final y INSTANCE;

    static {
        y.INSTANCE = new y();
    }

    public final int dpToPixels(@l Context context0, int v) {
        L.p(context0, "context");
        return (int)(((float)v) * context0.getResources().getDisplayMetrics().density + 0.5f);
    }

    @l
    public final V getDeviceWidthAndHeightWithOrientation(@l Context context0, int v) {
        L.p(context0, "context");
        Resources resources0 = context0.getApplicationContext().getResources();
        DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
        int v1 = resources0.getConfiguration().orientation;
        if(v == 0) {
            v = v1;
        }
        return v == v1 ? new V(Math.round(((float)displayMetrics0.widthPixels) / displayMetrics0.density), Math.round(((float)displayMetrics0.heightPixels) / displayMetrics0.density)) : new V(Math.round(((float)displayMetrics0.heightPixels) / displayMetrics0.density), Math.round(((float)displayMetrics0.widthPixels) / displayMetrics0.density));
    }

    @l
    public final WebView getWebView(@l Context context0) throws InstantiationException {
        L.p(context0, "context");
        try {
            return new WebView(context0);
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            throw new InstantiationException("Cannot instantiate WebView due to Resources.NotFoundException: " + resources$NotFoundException0 + ".message");
        }
        catch(Exception exception0) {
            throw new InstantiationException(exception0.getMessage());
        }
    }
}

