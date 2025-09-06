package com.facebook.fresco.vito.renderer;

import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class g extends h {
    @l
    private final Drawable d;
    private final int e;
    private final int f;

    public g(@l Drawable drawable0) {
        L.p(drawable0, "drawable");
        super(null);
        this.d = drawable0;
        int v = -1;
        this.e = drawable0 instanceof NinePatchDrawable ? -1 : drawable0.getIntrinsicWidth();
        if(!(drawable0 instanceof NinePatchDrawable)) {
            v = drawable0.getIntrinsicHeight();
        }
        this.f = v;
    }

    @Override  // com.facebook.fresco.vito.renderer.h
    public int b() {
        return this.f;
    }

    @Override  // com.facebook.fresco.vito.renderer.h
    public int c() {
        return this.e;
    }

    @Override  // com.facebook.fresco.vito.renderer.h
    public void f(@m Drawable.Callback drawable$Callback0) {
        this.d.setCallback(drawable$Callback0);
    }

    @l
    public final Drawable g() {
        return this.d;
    }
}

