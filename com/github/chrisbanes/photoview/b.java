package com.github.chrisbanes.photoview;

import android.annotation.TargetApi;
import android.view.View;

class b {
    private static final int a = 16;

    public static void a(View view0, Runnable runnable0) {
        b.b(view0, runnable0);
    }

    @TargetApi(16)
    private static void b(View view0, Runnable runnable0) {
        view0.postOnAnimation(runnable0);
    }
}

