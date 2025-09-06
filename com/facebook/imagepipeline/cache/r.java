package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.f;

public final class r {
    public static final class a {
        @f
        public final int a;
        @f
        public final int b;
        @f
        public final int c;
        @f
        public final int d;
        @f
        public final int e;
        @l
        @f
        public final List f;
        @l
        @f
        public final List g;
        @l
        @f
        public final Map h;

        public a(int v, int v1, @l C c0) {
            L.p(c0, "params");
            super();
            this.a = c0.a;
            this.b = c0.b;
            this.c = c0.e;
            this.d = v;
            this.e = v1;
            this.f = new ArrayList();
            this.g = new ArrayList();
            this.h = new HashMap();
        }

        public final void a() {
            for(Object object0: this.f) {
                ((b)object0).a();
            }
            for(Object object1: this.g) {
                ((b)object1).a();
            }
        }
    }

    public static final class b {
        @f
        public final Object a;
        @m
        @f
        public final com.facebook.common.references.a b;

        public b(Object object0, @m com.facebook.common.references.a a0) {
            if(object0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.a = object0;
            this.b = com.facebook.common.references.a.e(a0);
        }

        public final void a() {
            com.facebook.common.references.a.j(this.b);
        }
    }

    @l
    private final q a;

    public r(@l q q0) {
        L.p(q0, "countingBitmapCache");
        super();
        this.a = q0;
    }

    @l
    public final a a() {
        a r$a0;
        q q0 = this.a;
        __monitor_enter(q0);
        try {
            int v = this.a.z();
            int v1 = this.a.e();
            C c0 = this.a.f();
            L.o(c0, "getMemoryCacheParams(...)");
            r$a0 = new a(v, v1, c0);
            p p0 = this.a.d();
            if(p0 != null) {
                ArrayList arrayList0 = p0.g(null);
                L.o(arrayList0, "getMatchingEntries(...)");
                for(Object object0: arrayList0) {
                    com.facebook.imagepipeline.cache.q.a q$a0 = (com.facebook.imagepipeline.cache.q.a)((Map.Entry)object0).getValue();
                    b r$b0 = new b(q$a0.a, q$a0.b);
                    if(q$a0.c > 0) {
                        r$a0.g.add(r$b0);
                    }
                    else {
                        r$a0.f.add(r$b0);
                    }
                }
                Map map0 = this.a.o();
                if(map0 != null) {
                    Iterator iterator1 = map0.entrySet().iterator();
                    while(true) {
                        if(!iterator1.hasNext()) {
                            break;
                        }
                        Object object1 = iterator1.next();
                        Map.Entry map$Entry0 = (Map.Entry)object1;
                        if(map$Entry0 != null && !((Bitmap)map$Entry0.getKey()).isRecycled()) {
                            Object object2 = map$Entry0.getKey();
                            Object object3 = map$Entry0.getValue();
                            r$a0.h.put(object2, object3);
                        }
                    }
                }
                goto label_35;
            }
            goto label_37;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(q0);
        throw throwable0;
    label_35:
        __monitor_exit(q0);
        return r$a0;
    label_37:
        __monitor_exit(q0);
        return r$a0;
    }
}

