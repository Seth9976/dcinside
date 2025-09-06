package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
class b {
    class a implements com.google.android.material.transition.platform.a {
        a() {
            super();
        }

        @Override  // com.google.android.material.transition.platform.a
        public c a(float f, float f1, float f2, float f3) {
            return c.a(0xFF, w.p(0, 0xFF, f1, f2, f));
        }
    }

    class com.google.android.material.transition.platform.b.b implements com.google.android.material.transition.platform.a {
        com.google.android.material.transition.platform.b.b() {
            super();
        }

        @Override  // com.google.android.material.transition.platform.a
        public c a(float f, float f1, float f2, float f3) {
            return c.b(w.p(0xFF, 0, f1, f2, f), 0xFF);
        }
    }

    class com.google.android.material.transition.platform.b.c implements com.google.android.material.transition.platform.a {
        com.google.android.material.transition.platform.b.c() {
            super();
        }

        @Override  // com.google.android.material.transition.platform.a
        public c a(float f, float f1, float f2, float f3) {
            return c.b(w.p(0xFF, 0, f1, f2, f), w.p(0, 0xFF, f1, f2, f));
        }
    }

    class d implements com.google.android.material.transition.platform.a {
        d() {
            super();
        }

        @Override  // com.google.android.material.transition.platform.a
        public c a(float f, float f1, float f2, float f3) {
            float f4 = (f2 - f1) * f3 + f1;
            return c.b(w.p(0xFF, 0, f1, f4, f), w.p(0, 0xFF, f4, f2, f));
        }
    }

    private static final com.google.android.material.transition.platform.a a;
    private static final com.google.android.material.transition.platform.a b;
    private static final com.google.android.material.transition.platform.a c;
    private static final com.google.android.material.transition.platform.a d;

    static {
        b.a = new a();
        b.b = new com.google.android.material.transition.platform.b.b();
        b.c = new com.google.android.material.transition.platform.b.c();
        b.d = new d();
    }

    static com.google.android.material.transition.platform.a a(int v, boolean z) {
        switch(v) {
            case 0: {
                return z ? b.a : b.b;
            }
            case 1: {
                return z ? b.b : b.a;
            }
            case 2: {
                return b.c;
            }
            case 3: {
                return b.d;
            }
            default: {
                throw new IllegalArgumentException("Invalid fade mode: " + v);
            }
        }
    }
}

