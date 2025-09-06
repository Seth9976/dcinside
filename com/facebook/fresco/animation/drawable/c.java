package com.facebook.fresco.animation.drawable;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class c implements b {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private int a;
    private int b;
    private int c;
    private int d;
    @l
    public static final a e;
    @l
    private static final Class f;

    static {
        c.e = new a(null);
        c.f = c.class;
    }

    public c() {
        this.a = -1;
    }

    @Override  // com.facebook.fresco.animation.drawable.b$b
    public void a(@l com.facebook.fresco.animation.drawable.b b0, @l M0.b b1, int v, boolean z, boolean z1, long v1, long v2, long v3, long v4, long v5, long v6, long v7) {
        L.p(b0, "animatedDrawable");
        L.p(b1, "frameScheduler");
        com.facebook.fresco.animation.backend.a a0 = b0.g();
        if(a0 != null) {
            int v8 = a0.b();
            ++this.d;
            int v9 = this.a;
            int v10 = (v9 + 1) % v8;
            if(v10 != v) {
                if(v9 == v) {
                    ++this.c;
                }
                else {
                    int v11 = (v - v10) % v8;
                    if(v11 < 0) {
                        v11 += v8;
                    }
                    this.b += v11;
                }
            }
            this.a = v;
            Object[] arr_object = {v, Boolean.valueOf(z), ((long)(v2 % b1.c() - b1.d(v))), ((long)(v5 - v4)), ((long)(v2 - v3)), this.c, this.b, this.d, v2, v6, v7};
            x0.a.g(c.f, "draw: frame: %2d, drawn: %b, delay: %3d ms, rendering: %3d ms, prev: %3d ms ago, duplicates: %3d, skipped: %3d, draw calls: %4d, anim time: %6d ms, next start: %6d ms, next scheduled: %6d ms", arr_object);
        }
    }
}

