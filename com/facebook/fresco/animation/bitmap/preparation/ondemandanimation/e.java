package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import android.os.Handler;
import android.os.HandlerThread;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Date;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.D;
import kotlin.E;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nAnimationCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationCoordinator.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/AnimationCoordinator\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,130:1\n216#2,2:131\n216#2,2:133\n*S KotlinDebug\n*F\n+ 1 AnimationCoordinator.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/AnimationCoordinator\n*L\n53#1:131,2\n58#1:133,2\n*E\n"})
public final class e {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l.a.values().length];
            try {
                arr_v[com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l.a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l.a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l.a.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @l
    public static final e a = null;
    private static final long b = 2000L;
    private static final long c = 10000L;
    private static final float d = 0.2f;
    private static final float e = 0.5f;
    @l
    private static final AtomicInteger f;
    @l
    private static final AtomicInteger g;
    @l
    private static final AtomicInteger h;
    @l
    private static final ConcurrentHashMap i;
    @l
    private static final D j;
    @l
    private static final Runnable k;
    @l
    private static final Runnable l;

    static {
        e e0 = new e();
        e.a = e0;
        e.f = new AtomicInteger(0);
        e.g = new AtomicInteger(0);
        e.h = new AtomicInteger(0);
        e.i = new ConcurrentHashMap();
        e.j = E.a(() -> {
            HandlerThread handlerThread0 = new HandlerThread("FrescoAnimationWorker");
            handlerThread0.start();
            return new Handler(handlerThread0.getLooper());
        });
        c c0 = () -> {
            float f = (float)e.f.getAndSet(0);
            float f1 = (float)e.g.getAndSet(0);
            float f2 = (float)e.h.getAndSet(0);
            float f3 = f + f1 + f2;
            if(f3 > 0.0f) {
                if(f1 / f3 > 0.25f || f2 / f3 > 0.1f) {
                    for(Object object1: e.i.entrySet()) {
                        i i1 = (i)((Map.Entry)object1).getKey();
                        int v1 = ((Number)((Map.Entry)object1).getValue()).intValue();
                        e.a.k(i1, -v1);
                    }
                }
                else if(f / f3 > 0.98f) {
                    for(Object object0: e.i.entrySet()) {
                        i i0 = (i)((Map.Entry)object0).getKey();
                        int v = ((Number)((Map.Entry)object0).getValue()).intValue();
                        e.a.k(i0, v);
                    }
                }
                e.i.clear();
            }
            e.a.j();
        };
        e.k = c0;
        d d0 = () -> {
            Date date0 = new Date(System.currentTimeMillis() - 10000L);
            k.d.a(date0);
            e.a.i();
        };
        e.l = d0;
        e0.f().post(c0);
        e0.f().post(d0);
    }

    // 检测为 Lambda 实现
    private static final void d() [...]

    // 检测为 Lambda 实现
    private static final void e() [...]

    private final Handler f() {
        return (Handler)e.j.getValue();
    }

    // 检测为 Lambda 实现
    private static final Handler g() [...]

    public final void h(@l i i0, @l com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l l0) {
        L.p(i0, "animation");
        L.p(l0, "frameResult");
        ConcurrentHashMap concurrentHashMap0 = e.i;
        if(!concurrentHashMap0.contains(i0)) {
            concurrentHashMap0.put(i0, ((int)(((float)i0.c()) * 0.2f)));
        }
        switch(l0.b()) {
            case 1: {
                e.f.incrementAndGet();
                return;
            }
            case 2: {
                e.g.incrementAndGet();
                return;
            }
            case 3: {
                e.h.incrementAndGet();
                return;
            }
            default: {
                throw new J();
            }
        }
    }

    private final boolean i() {
        return this.f().postDelayed(e.l, 10000L);
    }

    private final boolean j() {
        return this.f().postDelayed(e.k, 2000L);
    }

    private final void k(i i0, int v) {
        int v1 = (int)s.t(((float)i0.c()) * 0.5f, 1.0f);
        int v2 = s.I(i0.b() + v, v1, i0.c());
        if(v2 != i0.b()) {
            i0.a(v2);
        }
    }
}

