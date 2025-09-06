package com.gomfactory.adpie.sdk.util;

import android.content.Context;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

public class DisplayUtil {
    private static final AtomicInteger sNextGeneratedId;

    static {
        DisplayUtil.sNextGeneratedId = new AtomicInteger(1);
    }

    public static int dpToPx(Context context0, int v) {
        return (int)(((float)v) * context0.getResources().getDisplayMetrics().density + 0.5f);
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getDeviceHeight(Context context0) {
        return context0.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getDeviceWidth(Context context0) {
        return context0.getResources().getDisplayMetrics().widthPixels;
    }

    public static int pxToDp(Context context0, int v) {
        return (int)(((float)v) / context0.getResources().getDisplayMetrics().density);
    }
}

