package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import K0.c;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import com.facebook.fresco.animation.backend.d;
import com.facebook.imagepipeline.bitmaps.e;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.T;
import kotlin.collections.Y;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nBufferFrameLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferFrameLoader.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/BufferFrameLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1#2:253\n1863#3,2:254\n774#3:256\n865#3,2:257\n1863#3,2:259\n1863#3,2:261\n1863#3,2:263\n*S KotlinDebug\n*F\n+ 1 BufferFrameLoader.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/BufferFrameLoader\n*L\n109#1:254,2\n137#1:256\n137#1:257,2\n144#1:259,2\n198#1:261,2\n204#1:263,2\n*E\n"})
public final class g implements j {
    static final class a {
        @l
        private final com.facebook.common.references.a a;
        private boolean b;

        public a(@l com.facebook.common.references.a a0) {
            L.p(a0, "bitmapRef");
            super();
            this.a = a0;
        }

        @l
        public final com.facebook.common.references.a a() {
            return this.a;
        }

        // 去混淆评级： 低(20)
        public final boolean b() {
            return !this.b && this.a.q();
        }

        public final boolean c() {
            return this.b;
        }

        public final void d() {
            com.facebook.common.references.a.j(this.a);
        }

        public final void e(boolean z) {
            this.b = z;
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    @l
    private final e a;
    @l
    private final I0.e b;
    @l
    private final c c;
    @l
    private final d d;
    private final int e;
    private final int f;
    @l
    private final ConcurrentHashMap g;
    private volatile int h;
    private volatile boolean i;
    @l
    private final h j;
    private int k;
    @l
    private Map l;
    @l
    private Set m;
    @l
    public static final b n = null;
    private static final float o = 0.5f;

    static {
        g.n = new b(null);
    }

    public g(@l e e0, @l I0.e e1, @l c c0, @l d d0, int v) {
        L.p(e0, "platformBitmapFactory");
        L.p(e1, "bitmapFrameRenderer");
        L.p(c0, "fpsCompressor");
        L.p(d0, "animationInformation");
        super();
        this.a = e0;
        this.b = e1;
        this.c = c0;
        this.d = d0;
        this.e = v;
        int v1 = s.u(this.k(this.c()) * v / 1000, 1);
        this.f = v1;
        this.g = new ConcurrentHashMap();
        this.j = new h(this.c().b());
        this.k = -1;
        this.l = Y.z();
        this.m = k0.k();
        this.b(this.k(this.c()));
        this.h = (int)(((float)v1) * 0.5f);
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.j
    @UiThread
    public void a(int v, int v1, @l A3.a a0) {
        L.p(a0, "onAnimationLoaded");
        this.l(v, v1);
        a0.invoke();
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.j
    public void b(int v) {
        int v1 = this.c().c();
        int v2 = s.u(this.c().a(), 1);
        int v3 = this.c().b();
        int v4 = s.B(v, this.k(this.c()));
        Map map0 = this.c.a(v1 * v2, v3, v4);
        this.l = map0;
        this.m = u.a6(map0.values());
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.j
    @l
    public d c() {
        return this.d;
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.j
    public void clear() {
        Collection collection0 = this.g.values();
        L.o(collection0, "<get-values>(...)");
        for(Object object0: collection0) {
            ((a)object0).d();
        }
        this.g.clear();
        this.k = -1;
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.j
    @UiThread
    @l
    public com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l d(int v, int v1, int v2) {
        Integer integer0 = (Integer)this.l.get(v);
        if(integer0 != null) {
            int v3 = (int)integer0;
            this.k = v3;
            a g$a0 = (a)this.g.get(integer0);
            if(g$a0 == null || !g$a0.b()) {
                g$a0 = null;
            }
            if(g$a0 != null) {
                if(this.j.c(this.h, v3, this.f)) {
                    this.l(v1, v2);
                }
                return new com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l(g$a0.a().b(), com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l.a.a);
            }
            this.l(v1, v2);
            return this.j(v3);
        }
        return this.j(v);
    }

    private final void f(com.facebook.common.references.a a0) {
        if(a0.q()) {
            new Canvas(((Bitmap)a0.n())).drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    @WorkerThread
    private final boolean g(int v, int v1, int v2, int v3) {
        int v6;
        com.facebook.common.references.a a1;
        Iterable iterable0 = this.j.d(v, this.f);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(this.m.contains(((Number)object0).intValue())) {
                arrayList0.add(object0);
            }
        }
        Set set0 = u.a6(arrayList0);
        Set set1 = this.g.keySet();
        L.o(set1, "<get-keys>(...)");
        ArrayDeque arrayDeque0 = new ArrayDeque(k0.x(set1, set0));
        Iterator iterator1 = arrayList0.iterator();
        while(iterator1.hasNext()) {
            int v4 = -1;
            Object object1 = iterator1.next();
            int v5 = ((Number)object1).intValue();
            if(this.g.get(v5) == null) {
                if(this.k != -1 && !set0.contains(this.k)) {
                    return false;
                }
                Integer integer0 = (Integer)arrayDeque0.pollFirst();
                if(integer0 != null) {
                    v4 = (int)integer0;
                }
                a g$a0 = (a)this.g.get(v4);
                if(g$a0 == null) {
                    a1 = null;
                }
                else {
                    com.facebook.common.references.a a0 = g$a0.a();
                    if(a0 != null) {
                        a1 = a0.c();
                    }
                }
                if(a1 == null) {
                    com.facebook.common.references.a a2 = this.a.d(v1, v2);
                    L.o(a2, "createBitmap(...)");
                    g$a0 = new a(a2);
                    a1 = g$a0.a().b();
                }
                g$a0.e(true);
                try {
                    this.n(a1, v5, v1, v2);
                }
                catch(Throwable throwable0) {
                    kotlin.io.c.a(a1, throwable0);
                    throw throwable0;
                }
                kotlin.io.c.a(a1, null);
                this.g.remove(v4);
                g$a0.e(false);
                this.g.put(v5, g$a0);
            }
        }
        if(arrayList0.isEmpty()) {
            v6 = (int)(((float)this.f) * 0.5f);
        }
        else {
            int v7 = arrayList0.size();
            v6 = ((Number)arrayList0.get(s.I(((int)(((float)v7) * 0.5f)), 0, v7 - 1))).intValue();
        }
        this.h = v6;
        return true;
    }

    static boolean h(g g0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 8) != 0) {
            v3 = 0;
        }
        return g0.g(v, v1, v2, v3);
    }

    private final com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a i(int v) {
        com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a a0;
        Iterator iterator0 = new kotlin.ranges.l(0, this.j.b()).iterator();
        do {
            a0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            int v1 = ((T)iterator0).b();
            int v2 = this.j.a(v - v1);
            a g$a0 = (a)this.g.get(v2);
            if(g$a0 != null) {
                if(!g$a0.b()) {
                    g$a0 = null;
                }
                if(g$a0 != null) {
                    a0 = new com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a(v2, g$a0.a());
                }
            }
        }
        while(a0 == null);
        return a0;
    }

    @UiThread
    private final com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l j(int v) {
        com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a a0 = this.i(v);
        if(a0 != null) {
            com.facebook.common.references.a a1 = a0.a().b();
            L.o(a1, "clone(...)");
            this.k = a0.b();
            return new com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l(a1, com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l.a.b);
        }
        return new com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l(null, com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l.a.c);
    }

    private final int k(d d0) {
        return (int)s.v(TimeUnit.SECONDS.toMillis(1L) / ((long)(d0.c() / d0.b())), 1L);
    }

    private final void l(int v, int v1) {
        if(this.i) {
            return;
        }
        this.i = true;
        f f0 = () -> {
            L.p(this, "this$0");
            while(!g.h(this, s.u(this.k, 0), v, v1, 0, 8, null)) {
            }
            this.i = false;
        };
        K0.b.a.b(f0);
    }

    // 检测为 Lambda 实现
    private static final void m(g g0, int v, int v1) [...]

    private final void n(com.facebook.common.references.a a0, int v, int v1, int v2) {
        com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a a1 = this.i(v);
        if(a1 != null) {
            com.facebook.common.references.a a2 = a1.a();
            if(a2 != null) {
                com.facebook.common.references.a a3 = a2.c();
                if(a3 != null) {
                    int v3 = a1.b();
                    if(v3 < v) {
                        try {
                            Object object0 = a3.n();
                            L.o(object0, "get(...)");
                            this.o(a0, ((Bitmap)object0));
                            Iterator iterator0 = new kotlin.ranges.l(v3 + 1, v).iterator();
                            while(iterator0.hasNext()) {
                                int v4 = ((T)iterator0).b();
                                Object object1 = a0.n();
                                L.o(object1, "get(...)");
                                this.b.g(v4, ((Bitmap)object1));
                            }
                        }
                        catch(Throwable throwable0) {
                            kotlin.io.c.a(a3, throwable0);
                            throw throwable0;
                        }
                        kotlin.io.c.a(a3, null);
                        return;
                    }
                    kotlin.io.c.a(a3, null);
                }
            }
        }
        this.f(a0);
        Iterator iterator1 = new kotlin.ranges.l(0, v).iterator();
        while(iterator1.hasNext()) {
            int v5 = ((T)iterator1).b();
            Object object2 = a0.n();
            L.o(object2, "get(...)");
            this.b.g(v5, ((Bitmap)object2));
        }
    }

    private final com.facebook.common.references.a o(com.facebook.common.references.a a0, Bitmap bitmap0) {
        if(a0.q() && !L.g(a0.n(), bitmap0)) {
            Canvas canvas0 = new Canvas(((Bitmap)a0.n()));
            canvas0.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas0.drawBitmap(bitmap0, 0.0f, 0.0f, null);
        }
        return a0;
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.j
    public void onStop() {
    }
}

