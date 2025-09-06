package com.facebook.fresco.animation.bitmap.preparation;

import I0.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface a {
    public static final class com.facebook.fresco.animation.bitmap.preparation.a.a {
        public static void a(@l a a0) {
        }

        @m
        public static com.facebook.common.references.a b(@l a a0, int v, int v1, int v2) [...] // Inlined contents

        public static void c(@l a a0) {
        }

        public static void d(@l a a0, int v, int v1, @m A3.a a1) {
        }

        public static void e(@l a a0, @l b b0, @l d d0, @l com.facebook.fresco.animation.backend.a a1, int v, @m A3.a a2) {
            L.p(b0, "bitmapFramePreparer");
            L.p(d0, "bitmapFrameCache");
            L.p(a1, "animationBackend");
        }

        public static void f(a a0, b b0, d d0, com.facebook.fresco.animation.backend.a a1, int v, A3.a a2, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareFrames");
            }
            if((v1 & 16) != 0) {
                a2 = null;
            }
            a0.d(b0, d0, a1, v, a2);
        }
    }

    void a(int arg1, int arg2, @m A3.a arg3);

    @m
    com.facebook.common.references.a b(int arg1, int arg2, int arg3);

    void c();

    void d(@l b arg1, @l d arg2, @l com.facebook.fresco.animation.backend.a arg3, int arg4, @m A3.a arg5);

    void onStop();
}

