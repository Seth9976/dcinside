package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.common.executors.j;
import com.facebook.common.internal.f;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.animated.base.g;
import com.facebook.imagepipeline.animated.factory.d;
import com.facebook.imagepipeline.animated.impl.b;
import com.facebook.imagepipeline.bitmaps.e;
import com.facebook.imagepipeline.cache.q;
import com.facebook.imagepipeline.core.p;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.image.r;
import k1.n.a;
import k1.n;
import o3.h;
import p3.c;

@f
@n(a.a)
@c
public class AnimatedFactoryV2Impl implements com.facebook.imagepipeline.animated.factory.a {
    private final e a;
    private final p b;
    private final q c;
    private final boolean d;
    @h
    private d e;
    @h
    private b f;
    @h
    private a1.a g;
    @h
    private c1.a h;
    @h
    private com.facebook.common.executors.h i;
    private int j;
    private final boolean k;
    private int l;
    private static final int m = 3;

    @f
    public AnimatedFactoryV2Impl(e e0, p p0, q q0, boolean z, boolean z1, int v, int v1, @h com.facebook.common.executors.h h0) {
        this.a = e0;
        this.b = p0;
        this.c = q0;
        this.j = v;
        this.k = z1;
        this.d = z;
        this.i = h0;
        this.l = v1;
    }

    @Override  // com.facebook.imagepipeline.animated.factory.a
    @h
    public c1.a a(@h Context context0) {
        if(this.h == null) {
            this.h = this.k();
        }
        return this.h;
    }

    @Override  // com.facebook.imagepipeline.animated.factory.a
    public com.facebook.imagepipeline.decoder.c b() {
        return (l l0, int v, r r0, com.facebook.imagepipeline.common.d d0) -> this.n().b(l0, d0, d0.i);
    }

    @Override  // com.facebook.imagepipeline.animated.factory.a
    public com.facebook.imagepipeline.decoder.c c() {
        class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.a implements com.facebook.imagepipeline.decoder.c {
            final AnimatedFactoryV2Impl a;

            @Override  // com.facebook.imagepipeline.decoder.c
            @h
            public com.facebook.imagepipeline.image.e a(l l0, int v, r r0, com.facebook.imagepipeline.common.d d0) {
                return AnimatedFactoryV2Impl.this.n().a(l0, d0, d0.i);
            }
        }

        return new com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.a(this);
    }

    private d j() {
        class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.c implements b {
            final AnimatedFactoryV2Impl a;

            @Override  // com.facebook.imagepipeline.animated.impl.b
            public com.facebook.imagepipeline.animated.base.a a(g g0, @h Rect rect0) {
                return new com.facebook.imagepipeline.animated.impl.a(AnimatedFactoryV2Impl.this.m(), g0, rect0, AnimatedFactoryV2Impl.this.d);
            }
        }

        return new com.facebook.imagepipeline.animated.factory.e(new com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.c(this), this.a, this.k);
    }

    private com.facebook.fresco.animation.factory.d k() {
        com.facebook.fresco.animation.factory.b b0 = () -> 2;
        com.facebook.common.executors.h h0 = this.i;
        if(h0 == null) {
            h0 = new com.facebook.common.executors.d(this.b.g());
        }
        com.facebook.fresco.animation.factory.c c0 = () -> 3;
        b b1 = this.l();
        j j0 = j.f();
        com.facebook.common.internal.q q0 = com.facebook.common.internal.r.a(Boolean.valueOf(this.k));
        com.facebook.common.internal.q q1 = com.facebook.common.internal.r.a(Boolean.valueOf(this.d));
        com.facebook.common.internal.q q2 = com.facebook.common.internal.r.a(this.j);
        com.facebook.common.internal.q q3 = com.facebook.common.internal.r.a(this.l);
        return new com.facebook.fresco.animation.factory.d(b1, j0, h0, RealtimeSinceBootClock.get(), this.a, this.c, b0, c0, com.facebook.common.internal.r.b, q0, q1, q2, q3);
    }

    private b l() {
        class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.b implements b {
            final AnimatedFactoryV2Impl a;

            @Override  // com.facebook.imagepipeline.animated.impl.b
            public com.facebook.imagepipeline.animated.base.a a(g g0, @h Rect rect0) {
                return new com.facebook.imagepipeline.animated.impl.a(AnimatedFactoryV2Impl.this.m(), g0, rect0, AnimatedFactoryV2Impl.this.d);
            }
        }

        if(this.f == null) {
            this.f = new com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.b(this);
        }
        return this.f;
    }

    private a1.a m() {
        if(this.g == null) {
            this.g = new a1.a();
        }
        return this.g;
    }

    private d n() {
        if(this.e == null) {
            this.e = this.j();
        }
        return this.e;
    }

    // 检测为 Lambda 实现
    private static Integer o() [...]

    // 检测为 Lambda 实现
    private static Integer p() [...]

    // 检测为 Lambda 实现
    private com.facebook.imagepipeline.image.e q(l l0, int v, r r0, com.facebook.imagepipeline.common.d d0) [...]
}

