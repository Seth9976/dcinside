package androidx.core.view;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver;

public final class OneShotPreDrawListener implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;

    private OneShotPreDrawListener(View view0, Runnable runnable0) {
        this.a = view0;
        this.b = view0.getViewTreeObserver();
        this.c = runnable0;
    }

    public static OneShotPreDrawListener a(View view0, Runnable runnable0) {
        if(view0 == null) {
            throw new NullPointerException("view == null");
        }
        if(runnable0 == null) {
            throw new NullPointerException("runnable == null");
        }
        OneShotPreDrawListener oneShotPreDrawListener0 = new OneShotPreDrawListener(view0, runnable0);
        view0.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener0);
        view0.addOnAttachStateChangeListener(oneShotPreDrawListener0);
        return oneShotPreDrawListener0;
    }

    public void b() {
        if(this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        }
        else {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public boolean onPreDraw() {
        this.b();
        this.c.run();
        return true;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view0) {
        this.b = view0.getViewTreeObserver();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view0) {
        this.b();
    }
}

