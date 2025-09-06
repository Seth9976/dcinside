package com.hjq.toast.style;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import y2.f;

public class b implements f {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;
    private final float f;

    public b(int v) {
        this(v, 17);
    }

    public b(int v, int v1) {
        this(v, v1, 0, 0);
    }

    public b(int v, int v1, int v2, int v3) {
        this(v, v1, v2, v3, 0.0f, 0.0f);
    }

    public b(int v, int v1, int v2, int v3, float f, float f1) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = f;
        this.f = f1;
    }

    @Override  // y2.f
    public View a(Context context0) {
        return LayoutInflater.from(context0).inflate(this.a, null);
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

