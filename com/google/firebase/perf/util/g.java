package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.concurrent.atomic.AtomicReference;

public class g implements ViewTreeObserver.OnPreDrawListener {
    @SuppressLint({"ThreadPoolCreation"})
    private final Handler a;
    private final AtomicReference b;
    private final Runnable c;
    private final Runnable d;

    private g(View view0, Runnable runnable0, Runnable runnable1) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = new AtomicReference(view0);
        this.c = runnable0;
        this.d = runnable1;
    }

    public static void a(View view0, Runnable runnable0, Runnable runnable1) {
        g g0 = new g(view0, runnable0, runnable1);
        view0.getViewTreeObserver().addOnPreDrawListener(g0);
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public boolean onPreDraw() {
        View view0 = (View)this.b.getAndSet(null);
        if(view0 == null) {
            return true;
        }
        view0.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.post(this.c);
        this.a.postAtFrontOfQueue(this.d);
        return true;
    }
}

