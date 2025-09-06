package com.facebook.fresco.vito.renderer;

import android.graphics.Bitmap;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class b extends h {
    @l
    private final Bitmap d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;

    public b(@l Bitmap bitmap0, boolean z) {
        L.p(bitmap0, "bitmap");
        super(null);
        this.d = bitmap0;
        this.e = z;
        this.f = bitmap0.getWidth();
        this.g = bitmap0.getHeight();
        this.h = 6;
    }

    public b(Bitmap bitmap0, boolean z, int v, w w0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(bitmap0, z);
    }

    @Override  // com.facebook.fresco.vito.renderer.h
    public int a() {
        return this.h;
    }

    @Override  // com.facebook.fresco.vito.renderer.h
    public int b() {
        return this.g;
    }

    @Override  // com.facebook.fresco.vito.renderer.h
    public int c() {
        return this.f;
    }

    @l
    public final Bitmap g() {
        return this.d;
    }

    public final boolean h() {
        return this.e;
    }
}

