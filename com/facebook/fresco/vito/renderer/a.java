package com.facebook.fresco.vito.renderer;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.L;
import y4.l;

public final class a extends g {
    @l
    private final Animatable g;
    private final boolean h;

    public a(@l Drawable drawable0, @l Animatable animatable0, boolean z) {
        L.p(drawable0, "drawable");
        L.p(animatable0, "animatable");
        super(drawable0);
        this.g = animatable0;
        this.h = z;
    }

    @Override  // com.facebook.fresco.vito.renderer.h
    public void d() {
        if(this.h) {
            this.g.start();
        }
    }

    @Override  // com.facebook.fresco.vito.renderer.h
    public void e() {
        if(this.h) {
            this.g.stop();
        }
    }

    @l
    public final Animatable h() {
        return this.g;
    }

    public final boolean i() {
        return this.h;
    }
}

