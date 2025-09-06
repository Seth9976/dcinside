package com.google.android.material.carousel;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

final class k {
    static class a {
    }

    static final class b {
        private final float a;
        private final float b;
        private final List c;
        private c d;
        private c e;
        private int f;
        private int g;
        private float h;
        private int i;
        private static final int j = -1;
        private static final float k = 1.401298E-45f;

        b(float f, float f1) {
            this.c = new ArrayList();
            this.f = -1;
            this.g = -1;
            this.h = 0.0f;
            this.i = -1;
            this.a = f;
            this.b = f1;
        }

        @O1.a
        @NonNull
        b a(float f, @FloatRange(from = 0.0, to = 1.0) float f1, float f2) {
            return this.d(f, f1, f2, false, true);
        }

        @O1.a
        @NonNull
        b b(float f, @FloatRange(from = 0.0, to = 1.0) float f1, float f2) {
            return this.c(f, f1, f2, false);
        }

        @O1.a
        @NonNull
        b c(float f, @FloatRange(from = 0.0, to = 1.0) float f1, float f2, boolean z) {
            return this.d(f, f1, f2, z, false);
        }

        @O1.a
        @NonNull
        b d(float f, @FloatRange(from = 0.0, to = 1.0) float f1, float f2, boolean z, boolean z1) {
            float f3 = f - f2 / 2.0f;
            float f4 = f2 / 2.0f + f;
            float f5 = this.b;
            if(f4 > f5) {
                return this.e(f, f1, f2, z, z1, Math.abs(f4 - Math.max(f4 - f2, f5)));
            }
            return f3 < 0.0f ? this.e(f, f1, f2, z, z1, Math.abs(f3 - Math.min(f3 + f2, 0.0f))) : this.e(f, f1, f2, z, z1, 0.0f);
        }

        @O1.a
        @NonNull
        b e(float f, @FloatRange(from = 0.0, to = 1.0) float f1, float f2, boolean z, boolean z1, float f3) {
            return this.f(f, f1, f2, z, z1, f3, 0.0f, 0.0f);
        }

        @O1.a
        @NonNull
        b f(float f, @FloatRange(from = 0.0, to = 1.0) float f1, float f2, boolean z, boolean z1, float f3, float f4, float f5) {
            if(f2 <= 0.0f) {
                return this;
            }
            if(z1) {
                if(z) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                if(this.i != -1 && this.i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.i = this.c.size();
            }
            c k$c0 = new c(1.401298E-45f, f, f1, f2, z1, f3, f4, f5);
            if(z) {
                if(this.d == null) {
                    this.d = k$c0;
                    this.f = this.c.size();
                }
                if(this.g != -1 && this.c.size() - this.g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if(f2 != this.d.d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.e = k$c0;
                this.g = this.c.size();
            }
            else {
                if(this.d == null && k$c0.d < this.h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if(this.e != null && k$c0.d > this.h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.h = k$c0.d;
            this.c.add(k$c0);
            return this;
        }

        @O1.a
        @NonNull
        b g(float f, @FloatRange(from = 0.0, to = 1.0) float f1, float f2, int v) {
            return this.h(f, f1, f2, v, false);
        }

        @O1.a
        @NonNull
        b h(float f, @FloatRange(from = 0.0, to = 1.0) float f1, float f2, int v, boolean z) {
            if(v > 0 && f2 > 0.0f) {
                for(int v1 = 0; v1 < v; ++v1) {
                    this.c(((float)v1) * f2 + f, f1, f2, z);
                }
            }
            return this;
        }

        @NonNull
        k i() {
            if(this.d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < this.c.size(); ++v) {
                c k$c0 = (c)this.c.get(v);
                arrayList0.add(new c(this.d.b - ((float)this.f) * this.a + ((float)v) * this.a, k$c0.b, k$c0.c, k$c0.d, k$c0.e, k$c0.f, k$c0.g, k$c0.h));
            }
            return new k(this.a, arrayList0, this.f, this.g, null);
        }

        private static float j(float f, float f1, int v, int v1) [...] // Inlined contents
    }

    static final class c {
        final float a;
        final float b;
        final float c;
        final float d;
        final boolean e;
        final float f;
        final float g;
        final float h;

        c(float f, float f1, float f2, float f3) {
            this(f, f1, f2, f3, false, 0.0f, 0.0f, 0.0f);
        }

        c(float f, float f1, float f2, float f3, boolean z, float f4, float f5, float f6) {
            this.a = f;
            this.b = f1;
            this.c = f2;
            this.d = f3;
            this.e = z;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        static c a(c k$c0, c k$c1, @FloatRange(from = 0.0, to = 1.0) float f) {
            return new c(k$c0.a + f * (k$c1.a - k$c0.a), k$c0.b + f * (k$c1.b - k$c0.b), k$c0.c + f * (k$c1.c - k$c0.c), k$c0.d + f * (k$c1.d - k$c0.d));
        }
    }

    private final float a;
    private final List b;
    private final int c;
    private final int d;

    private k(float f, List list0, int v, int v1) {
        this.a = f;
        this.b = DesugarCollections.unmodifiableList(list0);
        this.c = v;
        this.d = v1;
    }

    k(float f, List list0, int v, int v1, a k$a0) {
        this(f, list0, v, v1);
    }

    c a() {
        return (c)this.b.get(this.c);
    }

    int b() {
        return this.c;
    }

    c c() {
        return (c)this.b.get(0);
    }

    @Nullable
    c d() {
        for(int v = 0; v < this.b.size(); ++v) {
            c k$c0 = (c)this.b.get(v);
            if(!k$c0.e) {
                return k$c0;
            }
        }
        return null;
    }

    List e() {
        return this.b.subList(this.c, this.d + 1);
    }

    float f() {
        return this.a;
    }

    List g() {
        return this.b;
    }

    c h() {
        return (c)this.b.get(this.d);
    }

    int i() {
        return this.d;
    }

    c j() {
        return (c)this.b.get(this.b.size() - 1);
    }

    @Nullable
    c k() {
        for(int v = this.b.size() - 1; v >= 0; --v) {
            c k$c0 = (c)this.b.get(v);
            if(!k$c0.e) {
                return k$c0;
            }
        }
        return null;
    }

    int l() {
        int v = 0;
        for(Object object0: this.b) {
            if(((c)object0).e) {
                ++v;
            }
        }
        return this.b.size() - v;
    }

    static k m(k k0, k k1, float f) {
        if(k0.f() != k1.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List list0 = k0.g();
        List list1 = k1.g();
        if(list0.size() != list1.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < k0.g().size(); ++v) {
            arrayList0.add(c.a(((c)list0.get(v)), ((c)list1.get(v)), f));
        }
        return new k(k0.f(), arrayList0, com.google.android.material.animation.b.c(k0.b(), k1.b(), f), com.google.android.material.animation.b.c(k0.i(), k1.i(), f));
    }

    static k n(k k0, float f) {
        b k$b0 = new b(k0.f(), f);
        c k$c0 = k0.j();
        c k$c1 = k0.j();
        float f1 = f - k$c0.b - k$c1.d / 2.0f;
        for(int v = k0.g().size() - 1; v >= 0; --v) {
            Object object0 = k0.g().get(v);
            k$b0.d(f1 + ((c)object0).d / 2.0f, ((c)object0).c, ((c)object0).d, v >= k0.b() && v <= k0.i(), ((c)object0).e);
            f1 += ((c)object0).d;
        }
        return k$b0.i();
    }
}

