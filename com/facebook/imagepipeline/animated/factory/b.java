package com.facebook.imagepipeline.animated.factory;

import com.facebook.common.executors.h;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.bitmaps.e;
import com.facebook.imagepipeline.cache.q;
import com.facebook.imagepipeline.core.p;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class b {
    @l
    public static final b a;
    private static boolean b;
    @m
    private static a c;

    static {
        b.a = new b();
    }

    @m
    @n
    public static final a a(@m e e0, @m p p0, @m q q0, boolean z, boolean z1, int v, int v1, @m ExecutorService executorService0) {
        if(!b.b) {
            AnimatedFactoryV2Impl animatedFactoryV2Impl0 = new AnimatedFactoryV2Impl(e0, p0, q0, z, z1, v, v1, ((h)executorService0));
            L.n(animatedFactoryV2Impl0, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
            b.c = animatedFactoryV2Impl0;
            if(b.c != null) {
                b.b = true;
            }
        }
        return b.c;
    }
}

