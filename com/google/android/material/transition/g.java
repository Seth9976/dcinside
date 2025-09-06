package com.google.android.material.transition;

import android.graphics.RectF;

class g {
    class a implements f {
        a() {
            super();
        }

        @Override  // com.google.android.material.transition.f
        public h a(float f, float f1, float f2, float f3, float f4, float f5, float f6) {
            float f7 = v.o(f3, f5, f1, f2, f, true);
            return new h(f7 / f3, f7 / f5, f7, f4 * (f7 / f3), f7, f6 * (f7 / f5));
        }

        @Override  // com.google.android.material.transition.f
        public boolean b(h h0) {
            return h0.d > h0.f;
        }

        @Override  // com.google.android.material.transition.f
        public void c(RectF rectF0, float f, h h0) {
            rectF0.bottom -= Math.abs(h0.f - h0.d) * f;
        }
    }

    class b implements f {
        b() {
            super();
        }

        @Override  // com.google.android.material.transition.f
        public h a(float f, float f1, float f2, float f3, float f4, float f5, float f6) {
            float f7 = v.o(f4, f6, f1, f2, f, true);
            return new h(f7 / f4, f7 / f6, f3 * (f7 / f4), f7, f5 * (f7 / f6), f7);
        }

        @Override  // com.google.android.material.transition.f
        public boolean b(h h0) {
            return h0.c > h0.e;
        }

        @Override  // com.google.android.material.transition.f
        public void c(RectF rectF0, float f, h h0) {
            float f1 = Math.abs(h0.e - h0.c) / 2.0f * f;
            rectF0.left += f1;
            rectF0.right -= f1;
        }
    }

    private static final f a;
    private static final f b;

    static {
        g.a = new a();
        g.b = new b();
    }

    static f a(int v, boolean z, RectF rectF0, RectF rectF1) {
        switch(v) {
            case 0: {
                return g.b(z, rectF0, rectF1) ? g.a : g.b;
            }
            case 1: {
                return g.a;
            }
            case 2: {
                return g.b;
            }
            default: {
                throw new IllegalArgumentException("Invalid fit mode: " + v);
            }
        }
    }

    private static boolean b(boolean z, RectF rectF0, RectF rectF1) {
        float f = rectF0.width();
        float f1 = rectF0.height();
        float f2 = rectF1.width();
        float f3 = rectF1.height();
        return z ? f3 * f / f2 >= f1 : f2 * f1 / f >= f3;
    }
}

