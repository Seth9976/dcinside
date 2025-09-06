package com.kakao.adfit.a;

import B3.a;
import android.view.View;
import com.kakao.adfit.m.D;
import j..util.Map.-CC;
import j..util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.math.b;
import kotlin.text.r;
import kotlin.text.v;

public final class d implements a, Map, java.util.Map {
    public static final class com.kakao.adfit.a.d.a {
        public static final class com.kakao.adfit.a.d.a.a {
            private com.kakao.adfit.a.d.a.a() {
            }

            public com.kakao.adfit.a.d.a.a(w w0) {
            }

            public final com.kakao.adfit.a.d.a a(View view0, View view1, com.kakao.adfit.a.d.d d$d0, com.kakao.adfit.a.d.d d$d1) {
                L.p(view0, "containerView");
                L.p(view1, "view");
                return (d$d0 == null || !d$d0.d()) && (d$d1 == null || !d$d1.d()) ? null : new com.kakao.adfit.a.d.a(view0, view1, d$d0, d$d1, null);
            }
        }

        private final View a;
        private final View b;
        private final com.kakao.adfit.a.d.d c;
        private final com.kakao.adfit.a.d.d d;
        private boolean e;
        private int f;
        private int g;
        public static final com.kakao.adfit.a.d.a.a h;

        static {
            com.kakao.adfit.a.d.a.h = new com.kakao.adfit.a.d.a.a(null);
        }

        private com.kakao.adfit.a.d.a(View view0, View view1, com.kakao.adfit.a.d.d d$d0, com.kakao.adfit.a.d.d d$d1) {
            this.a = view0;
            this.b = view1;
            if(d$d0 == null || !d$d0.d()) {
                d$d0 = null;
            }
            this.c = d$d0;
            if(d$d1 == null || !d$d1.d()) {
                d$d1 = null;
            }
            this.d = d$d1;
            this.d();
        }

        public com.kakao.adfit.a.d.a(View view0, View view1, com.kakao.adfit.a.d.d d$d0, com.kakao.adfit.a.d.d d$d1, w w0) {
            this(view0, view1, d$d0, d$d1);
        }

        public final boolean a() {
            return this.e;
        }

        public final int b() {
            return this.f;
        }

        public final int c() {
            return this.g;
        }

        private final void d() {
            float f1;
            float f;
            com.kakao.adfit.a.d.d d$d0 = this.c;
            com.kakao.adfit.a.d.d d$d1 = null;
            if(d$d0 == null || !d$d0.d()) {
                d$d0 = null;
            }
            com.kakao.adfit.a.d.d d$d2 = this.d;
            if(d$d2 != null && d$d2.d()) {
                d$d1 = d$d2;
            }
            if(d$d1 == null || d$d0 == null || d$d1.a() < d$d0.a()) {
                if(d$d1 != null) {
                    d$d0 = d$d1;
                }
                if(d$d0 != null) {
                    f = d$d0.b();
                    f1 = d$d0.c();
                label_16:
                    if(!L.g(this.a, this.b)) {
                        int[] arr_v = new int[2];
                        this.b.getLocationInWindow(arr_v);
                        int v = arr_v[0];
                        int v1 = arr_v[1];
                        this.a.getLocationInWindow(arr_v);
                        f += (float)(v - arr_v[0]);
                        f1 += (float)(v1 - arr_v[1]);
                    }
                    float f2 = this.b.getResources().getDisplayMetrics().density;
                    this.e = true;
                    this.f = b.L0(f / f2);
                    this.g = b.L0(f1 / f2);
                }
            }
            else {
                f = (d$d1.b() + d$d0.b()) / 2.0f;
                f1 = (d$d1.c() + d$d0.c()) / 2.0f;
                goto label_16;
            }
        }
    }

    public static final class com.kakao.adfit.a.d.b {
        private com.kakao.adfit.a.d.b() {
        }

        public com.kakao.adfit.a.d.b(w w0) {
        }

        // 去混淆评级： 低(20)
        private final void a(java.util.Map map0) {
            L.o("46988103-f73e-4be1-8603-ff77206bb554", "randomUUID().toString()");
            map0.put("[stId]", "46988103-f73e-4be1-8603-ff77206bb554");
        }

        private final void a(java.util.Map map0, View view0) {
            float f = view0.getResources().getDisplayMetrics().density;
            map0.put("[w]", String.valueOf(b.L0(((float)view0.getMeasuredWidth()) / f)));
            map0.put("[h]", String.valueOf(b.L0(((float)view0.getMeasuredHeight()) / f)));
        }

        private final void a(java.util.Map map0, c c0) {
            long v = D.a.a().a() - D.a.b().a();
            com.kakao.adfit.a.c.c c$c0 = c0.c();
            com.kakao.adfit.a.c.b c$b0 = null;
            if(!c$c0.c()) {
                c$c0 = null;
            }
            if(c$c0 != null) {
                map0.put("[rt]", String.valueOf(c$c0.b() + v));
            }
            com.kakao.adfit.a.c.c c$c1 = c0.d().c() ? c0.d() : null;
            if(c$c1 != null) {
                map0.put("[vt]", String.valueOf(c$c1.b() + v));
            }
            com.kakao.adfit.a.c.b c$b1 = c0.a();
            if(c$b1.c()) {
                c$b0 = c$b1;
            }
            if(c$b0 != null) {
                map0.put("[ct]", String.valueOf(c$b0.b() + v));
            }
        }

        private final void a(java.util.Map map0, com.kakao.adfit.a.d.a d$a0) {
            if(d$a0 != null && (d$a0.a() ? d$a0 : null) != null) {
                map0.put("[cx]", String.valueOf(d$a0.b()));
                map0.put("[cy]", String.valueOf(d$a0.c()));
            }
        }

        private final void a(java.util.Map map0, o o0) {
            float f = o0.getContext().getResources().getDisplayMetrics().density;
            map0.put("[w]", String.valueOf(b.L0(((float)o0.c()) / f)));
            map0.put("[h]", String.valueOf(b.L0(((float)o0.d()) / f)));
        }

        public final d a(View view0, c c0) {
            L.p(view0, "v");
            L.p(c0, "event");
            HashMap hashMap0 = new HashMap();
            d.b.a(hashMap0);
            d.b.a(hashMap0, c0);
            d.b.a(hashMap0, view0);
            return this.b(hashMap0);
        }

        public final d a(View view0, c c0, com.kakao.adfit.a.d.a d$a0) {
            L.p(view0, "v");
            L.p(c0, "event");
            HashMap hashMap0 = new HashMap();
            d.b.a(hashMap0);
            d.b.a(hashMap0, c0);
            d.b.a(hashMap0, view0);
            d.b.a(hashMap0, d$a0);
            return this.b(hashMap0);
        }

        public final d a(o o0, c c0) {
            L.p(o0, "v");
            L.p(c0, "event");
            HashMap hashMap0 = new HashMap();
            d.b.a(hashMap0);
            d.b.a(hashMap0, c0);
            d.b.a(hashMap0, o0);
            return this.b(hashMap0);
        }

        public final d a(o o0, c c0, com.kakao.adfit.a.d.a d$a0) {
            L.p(o0, "v");
            L.p(c0, "event");
            HashMap hashMap0 = new HashMap();
            d.b.a(hashMap0);
            d.b.a(hashMap0, c0);
            d.b.a(hashMap0, o0);
            d.b.a(hashMap0, d$a0);
            return this.b(hashMap0);
        }

        public final String a(String s, java.util.Map map0) {
            L.p(s, "url");
            L.p(map0, "data");
            StringBuilder stringBuilder0 = new StringBuilder(s);
            for(Object object0: map0.entrySet()) {
                String s1 = (String)((Map.Entry)object0).getKey();
                String s2 = (String)((Map.Entry)object0).getValue();
                for(int v = v.o3(stringBuilder0, s1, 0, false); v > 0; v = v.o3(stringBuilder0, s1, v + s2.length(), false)) {
                    stringBuilder0.replace(v, s1.length() + v, s2);
                }
            }
            String s3 = stringBuilder0.toString();
            L.o(s3, "StringBuilder(url).apply…\n            }.toString()");
            return s3;
        }

        public final boolean a(String s) {
            L.p(s, "url");
            return d.c.b(s);
        }

        private final d b(java.util.Map map0) {
            return new d(map0);
        }
    }

    public static final class com.kakao.adfit.a.d.c implements A3.a {
        private final A3.a a;

        public com.kakao.adfit.a.d.c(A3.a a0) {
            L.p(a0, "block");
            super();
            this.a = a0;
        }

        public d a() {
            return (d)this.a.invoke();
        }

        @Override  // A3.a
        public Object invoke() {
            return this.a();
        }
    }

    public static final class com.kakao.adfit.a.d.d {
        private final float a;
        private final float b;
        private final long c;

        public com.kakao.adfit.a.d.d(float f, float f1, long v) {
            this.a = f;
            this.b = f1;
            this.c = v;
        }

        public com.kakao.adfit.a.d.d(float f, float f1, long v, int v1, w w0) {
            if((v1 & 4) != 0) {
                v = D.a.b().a();
            }
            this(f, f1, v);
        }

        public final long a() {
            return this.c;
        }

        public final float b() {
            return this.a;
        }

        public final float c() {
            return this.b;
        }

        public final boolean d() {
            return D.a.b().a() - this.c <= 1000L;
        }
    }

    private final java.util.Map a;
    public static final com.kakao.adfit.a.d.b b;
    private static final r c;

    static {
        d.b = new com.kakao.adfit.a.d.b(null);
        d.c = new r("\\[[a-zA-Z]+]");
    }

    public d(java.util.Map map0) {
        L.p(map0, "data");
        super();
        this.a = map0;
    }

    public String a(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean a(String s) {
        L.p(s, "key");
        return this.a.containsKey(s);
    }

    public Set b() {
        return this.a.entrySet();
    }

    public boolean b(String s) {
        L.p(s, "value");
        return this.a.containsValue(s);
    }

    public String c(String s) {
        L.p(s, "key");
        return (String)this.a.get(s);
    }

    public Set c() {
        return this.a.keySet();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public Object compute(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public Object computeIfAbsent(Object object0, Function function0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public Object computeIfPresent(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean containsKey(Object object0) {
        return object0 instanceof String ? this.a(((String)object0)) : false;
    }

    @Override
    public final boolean containsValue(Object object0) {
        return object0 instanceof String ? this.b(((String)object0)) : false;
    }

    public int d() {
        return this.a.size();
    }

    public Collection e() {
        return this.a.values();
    }

    @Override
    public final Set entrySet() {
        return this.b();
    }

    @Override  // j$.util.Map
    public void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    @Override
    public final Object get(Object object0) {
        return !(object0 instanceof String) ? null : this.c(((String)object0));
    }

    @Override  // j$.util.Map
    public Object getOrDefault(Object object0, Object object1) {
        return Map.-CC.$default$getOrDefault(this, object0, object1);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Set keySet() {
        return this.c();
    }

    @Override  // j$.util.Map
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(java.util.Map map0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public Object putIfAbsent(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object remove(Object object0) {
        return this.a(object0);
    }

    @Override  // j$.util.Map
    public boolean remove(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public Object replace(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public boolean replace(Object object0, Object object1, Object object2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public void replaceAll(BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.d();
    }

    @Override
    public final Collection values() {
        return this.e();
    }
}

