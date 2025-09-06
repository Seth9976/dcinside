package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnDrawListener;
import java.util.concurrent.atomic.AtomicReference;

public class d implements ViewTreeObserver.OnDrawListener {
    @SuppressLint({"ThreadPoolCreation"})
    private final Handler a;
    private final AtomicReference b;
    private final Runnable c;

    private d(View view0, Runnable runnable0) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = new AtomicReference(view0);
        this.c = runnable0;
    }

    // 去混淆评级： 低(20)
    private static boolean b(View view0) {
        return view0.getViewTreeObserver().isAlive() && d.c(view0);
    }

    private static boolean c(View view0) {
        return view0.isAttachedToWindow();
    }

    // 检测为 Lambda 实现
    private void d(View view0) [...]

    public static void e(View view0, Runnable runnable0) {
        class a implements View.OnAttachStateChangeListener {
            final d a;

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                view0.getViewTreeObserver().addOnDrawListener(d.this);
                view0.removeOnAttachStateChangeListener(this);
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                view0.removeOnAttachStateChangeListener(this);
            }
        }

        d d0 = new d(view0, runnable0);
        if(Build.VERSION.SDK_INT < 26 && !d.b(view0)) {
            view0.addOnAttachStateChangeListener(new a(d0));
            return;
        }
        view0.getViewTreeObserver().addOnDrawListener(d0);
    }

    @Override  // android.view.ViewTreeObserver$OnDrawListener
    public void onDraw() {
        View view0 = (View)this.b.getAndSet(null);
        if(view0 == null) {
            return;
        }
        view0.getViewTreeObserver().addOnGlobalLayoutListener(() -> view0.getViewTreeObserver().removeOnDrawListener(this));
        this.a.postAtFrontOfQueue(this.c);
    }
}

