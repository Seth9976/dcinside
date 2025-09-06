package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import K0.c;
import com.facebook.fresco.animation.backend.d;
import com.facebook.imagepipeline.bitmaps.e;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

public final class k {
    @s0({"SMAP\nAnimationLoaderFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationLoaderFactory.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameLoaderFactory$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,65:1\n535#2:66\n520#2,6:67\n216#3,2:73\n*S KotlinDebug\n*F\n+ 1 AnimationLoaderFactory.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameLoaderFactory$Companion\n*L\n53#1:66\n53#1:67,6\n55#1:73,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Date date0) {
            L.p(date0, "until");
            synchronized(k.e) {
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object0: k.e.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    if(((m)map$Entry0.getValue()).b().compareTo(date0) < 0) {
                        linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                    }
                }
                for(Object object1: linkedHashMap0.entrySet()) {
                    ((m)((Map.Entry)object1).getValue()).a().clear();
                    k.e.remove(((Map.Entry)object1).getKey());
                }
            }
        }

        public final void b(@l String s, @l j j0) {
            L.p(s, "cacheKey");
            L.p(j0, "frameLoader");
            k.e.put(s, new m(j0, new Date()));
        }
    }

    @l
    private final e a;
    private final int b;
    private final int c;
    @l
    public static final a d;
    @l
    private static final ConcurrentHashMap e;

    static {
        k.d = new a(null);
        k.e = new ConcurrentHashMap();
    }

    public k(@l e e0, int v, int v1) {
        L.p(e0, "platformBitmapFactory");
        super();
        this.a = e0;
        this.b = v;
        this.c = v1;
    }

    @l
    public final j b(@l String s, @l I0.e e0, @l d d0) {
        L.p(s, "cacheKey");
        L.p(e0, "bitmapFrameRenderer");
        L.p(d0, "animationInformation");
        ConcurrentHashMap concurrentHashMap0 = k.e;
        synchronized(concurrentHashMap0) {
            m m0 = (m)concurrentHashMap0.get(s);
            if(m0 != null) {
                concurrentHashMap0.remove(s);
                return m0.a();
            }
        }
        c c0 = new c(this.b);
        return new g(this.a, e0, c0, d0, this.c);
    }
}

