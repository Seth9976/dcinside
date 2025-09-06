package com.facebook.fresco.animation.bitmap.wrapper;

import com.facebook.fresco.animation.backend.d;
import kotlin.jvm.internal.L;
import y4.l;

public final class a implements d {
    @l
    private final com.facebook.imagepipeline.animated.base.a c;

    public a(@l com.facebook.imagepipeline.animated.base.a a0) {
        L.p(a0, "animatedDrawableBackend");
        super();
        this.c = a0;
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int a() {
        return this.c.a();
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int b() {
        return this.c.b();
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int c() {
        return this.c.d();
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int h() {
        return this.c.getHeight();
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int k(int v) {
        return this.c.h(v);
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int m() {
        return this.c.getWidth();
    }
}

