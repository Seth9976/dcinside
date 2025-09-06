package com.hjq.toast;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

final class m {
    class a implements Runnable {
        final m a;

        // 检测为 Lambda 实现
        private void b() [...]

        @Override
        @SuppressLint({"WrongConstant"})
        public void run() {
            WindowManager windowManager0 = m.this.b.a();
            if(windowManager0 == null) {
                return;
            }
            WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
            windowManager$LayoutParams0.height = -2;
            windowManager$LayoutParams0.width = -2;
            windowManager$LayoutParams0.format = -3;
            windowManager$LayoutParams0.flags = 0x98;
            windowManager$LayoutParams0.packageName = m.this.c;
            windowManager$LayoutParams0.gravity = m.this.a.getGravity();
            windowManager$LayoutParams0.x = m.this.a.getXOffset();
            windowManager$LayoutParams0.y = m.this.a.getYOffset();
            windowManager$LayoutParams0.verticalMargin = m.this.a.getVerticalMargin();
            windowManager$LayoutParams0.horizontalMargin = m.this.a.getHorizontalMargin();
            windowManager$LayoutParams0.windowAnimations = m.this.a.b();
            if(m.this.e) {
                if(Build.VERSION.SDK_INT >= 26) {
                    windowManager$LayoutParams0.type = 0x7F6;
                    windowManager$LayoutParams0.flags &= -17;
                }
                else {
                    windowManager$LayoutParams0.type = 2003;
                }
            }
            try {
                windowManager0.addView(m.this.a.getView(), windowManager$LayoutParams0);
                m.h.postDelayed(() -> m.this.g(), ((long)(m.this.a.getDuration() == 1 ? m.this.a.c() : m.this.a.d())));
                m.this.b.b(m.this);
                m.this.j(true);
                m.this.l(m.this.a.getView());
                return;
            }
            catch(IllegalStateException | WindowManager.BadTokenException illegalStateException0) {
            }
            illegalStateException0.printStackTrace();
        }
    }

    class b implements Runnable {
        final m a;

        @Override
        public void run() {
            try {
                WindowManager windowManager0 = m.this.b.a();
                if(windowManager0 != null) {
                    windowManager0.removeViewImmediate(m.this.a.getView());
                }
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                illegalArgumentException0.printStackTrace();
            }
            finally {
                m.this.b.c();
                m.this.j(false);
            }
        }
    }

    private final c a;
    private u b;
    private final String c;
    private boolean d;
    private boolean e;
    private final Runnable f;
    private final Runnable g;
    private static final Handler h;

    static {
        m.h = new Handler(Looper.getMainLooper());
    }

    m(Activity activity0, c c0) {
        this(activity0, c0);
        this.e = false;
        this.b = new u(activity0);
    }

    m(Application application0, c c0) {
        this(application0, c0);
        this.e = true;
        this.b = new u(application0);
    }

    private m(Context context0, c c0) {
        this.f = new a(this);
        this.g = new b(this);
        this.a = c0;
        this.c = "com.dcinside.app.android";
    }

    void g() {
        if(!this.i()) {
            return;
        }
        Handler handler0 = m.h;
        handler0.removeCallbacks(this.f);
        if(this.h()) {
            this.g.run();
            return;
        }
        handler0.removeCallbacks(this.g);
        handler0.post(this.g);
    }

    private boolean h() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    boolean i() {
        return this.d;
    }

    void j(boolean z) {
        this.d = z;
    }

    void k() {
        if(this.i()) {
            return;
        }
        if(this.h()) {
            this.f.run();
            return;
        }
        m.h.removeCallbacks(this.f);
        m.h.post(this.f);
    }

    private void l(View view0) {
        AccessibilityEvent accessibilityEvent0;
        AccessibilityManager accessibilityManager0 = (AccessibilityManager)view0.getContext().getSystemService("accessibility");
        if(!accessibilityManager0.isEnabled()) {
            return;
        }
        if(Build.VERSION.SDK_INT >= 30) {
            accessibilityEvent0 = k.a();
            accessibilityEvent0.setEventType(0x40);
        }
        else {
            accessibilityEvent0 = AccessibilityEvent.obtain(0x40);
        }
        accessibilityEvent0.setClassName("android.widget.Toast");
        accessibilityEvent0.setPackageName("com.dcinside.app.android");
        view0.dispatchPopulateAccessibilityEvent(accessibilityEvent0);
        accessibilityManager0.sendAccessibilityEvent(accessibilityEvent0);
    }
}

