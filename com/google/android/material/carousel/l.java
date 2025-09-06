package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class l {
    private final k a;
    private final List b;
    private final List c;
    private final float[] d;
    private final float[] e;
    private final float f;
    private final float g;
    private static final int h = -1;

    private l(@NonNull k k0, List list0, List list1) {
        this.a = k0;
        this.b = DesugarCollections.unmodifiableList(list0);
        this.c = DesugarCollections.unmodifiableList(list1);
        c k$c0 = ((k)list0.get(list0.size() - 1)).c();
        c k$c1 = k0.c();
        float f = k$c0.a - k$c1.a;
        this.f = f;
        c k$c2 = k0.j();
        c k$c3 = ((k)list1.get(list1.size() - 1)).j();
        float f1 = k$c2.a - k$c3.a;
        this.g = f1;
        this.d = l.m(f, list0, true);
        this.e = l.m(f1, list1, false);
    }

    private k a(List list0, float f, float[] arr_f) {
        float[] arr_f1 = l.o(list0, f, arr_f);
        return arr_f1[0] >= 0.5f ? ((k)list0.get(((int)arr_f1[2]))) : ((k)list0.get(((int)arr_f1[1])));
    }

    private static int b(k k0, float f) {
        for(int v = k0.i(); v < k0.g().size(); ++v) {
            if(f == ((c)k0.g().get(v)).c) {
                return v;
            }
        }
        return k0.g().size() - 1;
    }

    private static int c(k k0) {
        for(int v = 0; v < k0.g().size(); ++v) {
            if(!((c)k0.g().get(v)).e) {
                return v;
            }
        }
        return -1;
    }

    private static int d(k k0, float f) {
        for(int v = k0.b() - 1; v >= 0; --v) {
            if(f == ((c)k0.g().get(v)).c) {
                return v;
            }
        }
        return 0;
    }

    private static int e(k k0) {
        for(int v = k0.g().size() - 1; v >= 0; --v) {
            if(!((c)k0.g().get(v)).e) {
                return v;
            }
        }
        return -1;
    }

    static l f(b b0, k k0, float f, float f1, float f2) {
        return new l(k0, l.p(b0, k0, f, f1), l.n(b0, k0, f, f2));
    }

    k g() {
        return this.a;
    }

    k h() {
        return (k)this.c.get(this.c.size() - 1);
    }

    Map i(int v, int v1, int v2, boolean z) {
        float f = this.a.f();
        Map map0 = new HashMap();
        int v4 = 0;
        for(int v3 = 0; true; ++v3) {
            int v5 = -1;
            if(v3 >= v) {
                break;
            }
            int v6 = z ? v - v3 - 1 : v3;
            if(!z) {
                v5 = 1;
            }
            if(((float)v6) * f * ((float)v5) > ((float)v2) - this.g || v3 >= v - this.c.size()) {
                map0.put(v6, ((k)this.c.get(MathUtils.e(v4, 0, this.c.size() - 1))));
                ++v4;
            }
        }
        int v7 = v - 1;
        int v8 = 0;
        while(v7 >= 0) {
            int v9 = z ? v - v7 - 1 : v7;
            if(((float)v9) * f * ((float)(z ? -1 : 1)) < ((float)v1) + this.f || v7 < this.b.size()) {
                map0.put(v9, ((k)this.b.get(MathUtils.e(v8, 0, this.b.size() - 1))));
                ++v8;
            }
            --v7;
        }
        return map0;
    }

    public k j(float f, float f1, float f2) {
        return this.k(f, f1, f2, false);
    }

    k k(float f, float f1, float f2, boolean z) {
        float f7;
        float f3 = this.f + f1;
        float f4 = f2 - this.g;
        float f5 = this.l().a().g;
        float f6 = this.h().h().h;
        if(this.f == f5) {
            f3 += f5;
        }
        if(this.g == f6) {
            f4 -= f6;
        }
        if(f < f3) {
            f7 = com.google.android.material.animation.b.b(1.0f, 0.0f, f1, f3, f);
            return z ? this.a(this.b, f7, this.d) : l.s(this.b, f7, this.d);
        }
        if(f > f4) {
            f7 = com.google.android.material.animation.b.b(0.0f, 1.0f, f4, f2, f);
            return z ? this.a(this.c, f7, this.e) : l.s(this.c, f7, this.e);
        }
        return this.a;
    }

    k l() {
        return (k)this.b.get(this.b.size() - 1);
    }

    private static float[] m(float f, List list0, boolean z) {
        float f1;
        int v = list0.size();
        float[] arr_f = new float[v];
        for(int v1 = 1; v1 < v; ++v1) {
            k k0 = (k)list0.get(v1 - 1);
            k k1 = (k)list0.get(v1);
            if(z) {
                c k$c0 = k1.c();
                c k$c1 = k0.c();
                f1 = k$c0.a - k$c1.a;
            }
            else {
                c k$c2 = k0.j();
                c k$c3 = k1.j();
                f1 = k$c2.a - k$c3.a;
            }
            arr_f[v1] = v1 == v - 1 ? 1.0f : arr_f[v1 - 1] + f1 / f;
        }
        return arr_f;
    }

    private static List n(b b0, k k0, float f, float f1) {
        List list0 = new ArrayList();
        list0.add(k0);
        int v = l.e(k0);
        int v1 = b0.r() ? b0.n() : b0.e();
        if(!l.r(b0, k0) && v != -1) {
            int v2 = v - k0.i();
            c k$c0 = k0.c();
            c k$c1 = k0.c();
            float f2 = k$c0.b - k$c1.d / 2.0f;
            if(v2 <= 0 && k0.h().f > 0.0f) {
                list0.add(l.v(k0, f2 - k0.h().f, ((float)v1)));
                return list0;
            }
            int v3 = 0;
            for(float f3 = 0.0f; v3 < v2; f3 = f4) {
                k k1 = (k)list0.get(list0.size() - 1);
                int v4 = v - v3;
                float f4 = f3 + ((c)k0.g().get(v4)).f;
                int v5 = v4 + 1;
                k k2 = l.t(k1, v, (v5 >= k0.g().size() ? 0 : l.d(k1, ((c)k0.g().get(v5)).c) + 1), f2 - f4, k0.b() + v3 + 1, k0.i() + v3 + 1, ((float)v1));
                if(v3 == v2 - 1 && f1 > 0.0f) {
                    k2 = l.u(k2, f1, ((float)v1), false, f);
                }
                list0.add(k2);
                ++v3;
            }
            return list0;
        }
        if(f1 > 0.0f) {
            list0.add(l.u(k0, f1, ((float)v1), false, f));
        }
        return list0;
    }

    private static float[] o(List list0, float f, float[] arr_f) {
        int v = list0.size();
        float f1 = arr_f[0];
        int v1 = 1;
        while(v1 < v) {
            float f2 = arr_f[v1];
            if(f <= f2) {
                return new float[]{com.google.android.material.animation.b.b(0.0f, 1.0f, f1, f2, f), ((float)(v1 - 1)), ((float)v1)};
            }
            ++v1;
            f1 = f2;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List p(b b0, k k0, float f, float f1) {
        List list0 = new ArrayList();
        list0.add(k0);
        int v = l.c(k0);
        int v1 = b0.r() ? b0.n() : b0.e();
        if(!l.q(k0) && v != -1) {
            int v2 = k0.b() - v;
            c k$c0 = k0.c();
            c k$c1 = k0.c();
            float f2 = k$c0.b - k$c1.d / 2.0f;
            if(v2 <= 0 && k0.a().f > 0.0f) {
                list0.add(l.v(k0, f2 + k0.a().f, ((float)v1)));
                return list0;
            }
            int v3 = 0;
            for(float f3 = 0.0f; v3 < v2; f3 = f4) {
                k k1 = (k)list0.get(list0.size() - 1);
                int v4 = v + v3;
                float f4 = f3 + ((c)k0.g().get(v4)).f;
                int v5 = v4 - 1;
                k k2 = l.t(k1, v, (v5 < 0 ? k0.g().size() - 1 : l.b(k1, ((c)k0.g().get(v5)).c) - 1), f2 + f4, k0.b() - v3 - 1, k0.i() - v3 - 1, ((float)v1));
                if(v3 == v2 - 1 && f1 > 0.0f) {
                    k2 = l.u(k2, f1, ((float)v1), true, f);
                }
                list0.add(k2);
                ++v3;
            }
            return list0;
        }
        if(f1 > 0.0f) {
            list0.add(l.u(k0, f1, ((float)v1), true, f));
        }
        return list0;
    }

    private static boolean q(k k0) {
        c k$c0 = k0.a();
        c k$c1 = k0.a();
        return k$c0.b - k$c1.d / 2.0f >= 0.0f && k0.a() == k0.d();
    }

    private static boolean r(b b0, k k0) {
        int v = b0.e();
        if(b0.r()) {
            v = b0.n();
        }
        c k$c0 = k0.h();
        c k$c1 = k0.h();
        return k$c0.b + k$c1.d / 2.0f <= ((float)v) && k0.h() == k0.k();
    }

    private static k s(List list0, float f, float[] arr_f) {
        float[] arr_f1 = l.o(list0, f, arr_f);
        return k.m(((k)list0.get(((int)arr_f1[1]))), ((k)list0.get(((int)arr_f1[2]))), arr_f1[0]);
    }

    private static k t(k k0, int v, int v1, float f, int v2, int v3, float f1) {
        ArrayList arrayList0 = new ArrayList(k0.g());
        arrayList0.add(v1, ((c)arrayList0.remove(v)));
        com.google.android.material.carousel.k.b k$b0 = new com.google.android.material.carousel.k.b(k0.f(), f1);
        for(int v4 = 0; v4 < arrayList0.size(); ++v4) {
            c k$c0 = (c)arrayList0.get(v4);
            k$b0.e(f + k$c0.d / 2.0f, k$c0.c, k$c0.d, v4 >= v2 && v4 <= v3, k$c0.e, k$c0.f);
            f += k$c0.d;
        }
        return k$b0.i();
    }

    private static k u(k k0, float f, float f1, boolean z, float f2) {
        ArrayList arrayList0 = new ArrayList(k0.g());
        com.google.android.material.carousel.k.b k$b0 = new com.google.android.material.carousel.k.b(k0.f(), f1);
        float f3 = f / ((float)k0.l());
        float f4 = z ? f : 0.0f;
        for(int v = 0; v < arrayList0.size(); ++v) {
            c k$c0 = (c)arrayList0.get(v);
            if(k$c0.e) {
                k$b0.e(k$c0.b, k$c0.c, k$c0.d, false, true, k$c0.f);
            }
            else {
                float f5 = k$c0.d - f3;
                float f6 = f5 / 2.0f + f4;
                float f7 = f6 - k$c0.b;
                k$b0.f(f6, 1.0f - (f5 - f2) / (k0.f() - f2), f5, v >= k0.b() && v <= k0.i(), false, k$c0.f, (z ? f7 : 0.0f), (z ? 0.0f : f7));
                f4 += f5;
            }
        }
        return k$b0.i();
    }

    private static k v(k k0, float f, float f1) {
        return l.t(k0, 0, 0, f, k0.b(), k0.i(), f1);
    }
}

