package com.unity3d.scar.adapter.common;

import android.os.Handler;
import android.os.Looper;

public class m {
    public static void a(Runnable runnable0) {
        m.b(runnable0, 0L);
    }

    public static void b(Runnable runnable0, long v) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable0, v);
    }
}

