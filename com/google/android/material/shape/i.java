package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

public class i {
    class a implements ViewTreeObserver.OnScrollChangedListener {
        final i a;

        @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
        public void onScrollChanged() {
            i.this.e();
        }
    }

    private View a;
    private k b;
    private ScrollView c;
    private final int[] d;
    private final int[] e;
    private final ViewTreeObserver.OnScrollChangedListener f;

    public i(View view0, k k0, ScrollView scrollView0) {
        this.d = new int[2];
        this.e = new int[2];
        this.f = () -> {
            ScrollView scrollView0 = i.this.c;
            if(scrollView0 == null) {
                return;
            }
            if(scrollView0.getChildCount() == 0) {
                throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
            }
            i.this.c.getLocationInWindow(i.this.d);
            i.this.c.getChildAt(0).getLocationInWindow(i.this.e);
            int v = i.this.a.getTop() - i.this.d[1] + i.this.e[1];
            int v1 = i.this.a.getHeight();
            int v2 = i.this.c.getHeight();
            if(v < 0) {
                i.this.b.q0(Math.max(0.0f, Math.min(1.0f, ((float)v) / ((float)v1) + 1.0f)));
                i.this.a.invalidate();
                return;
            }
            int v3 = v + v1;
            if(v3 > v2) {
                i.this.b.q0(Math.max(0.0f, Math.min(1.0f, 1.0f - ((float)(v3 - v2)) / ((float)v1))));
                i.this.a.invalidate();
                return;
            }
            if(i.this.b.A() != 1.0f) {
                i.this.b.q0(1.0f);
                i.this.a.invalidate();
            }
        };
        this.a = view0;
        this.b = k0;
        this.c = scrollView0;
    }

    public void a(ScrollView scrollView0) {
        this.c = scrollView0;
    }

    public void b(k k0) {
        this.b = k0;
    }

    public void c(@NonNull ViewTreeObserver viewTreeObserver0) {
        viewTreeObserver0.addOnScrollChangedListener(this.f);
    }

    public void d(@NonNull ViewTreeObserver viewTreeObserver0) {
        viewTreeObserver0.removeOnScrollChangedListener(this.f);
    }

    // 检测为 Lambda 实现
    public void e() [...]
}

