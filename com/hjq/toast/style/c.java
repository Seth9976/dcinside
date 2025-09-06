package com.hjq.toast.style;

import android.content.Context;
import android.view.View;
import y2.f;

public class c implements f {
    private final f a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;
    private final float f;

    public c(f f0, int v) {
        this(f0, v, 0, 0, 0.0f, 0.0f);
    }

    public c(f f0, int v, int v1, int v2, float f1, float f2) {
        this.a = f0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = f1;
        this.f = f2;
    }

    @Override  // y2.f
    public View a(Context context0) {
        return this.a.a(context0);
    }

    @Override  // y2.f
    public int getGravity() {
        return this.b;
    }

    @Override  // y2.f
    public float getHorizontalMargin() {
        return this.e;
    }

    @Override  // y2.f
    public float getVerticalMargin() {
        return this.f;
    }

    @Override  // y2.f
    public int getXOffset() {
        return this.c;
    }

    @Override  // y2.f
    public int getYOffset() {
        return this.d;
    }
}

