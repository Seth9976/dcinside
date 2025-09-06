package com.facebook.imagepipeline.core;

import android.net.Uri;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import bolts.h;
import bolts.j;
import com.facebook.common.internal.o;
import com.facebook.common.internal.q;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.producers.G;
import com.facebook.imagepipeline.producers.h0;
import com.facebook.imagepipeline.producers.q0;
import com.facebook.imagepipeline.producers.u0;
import f1.c;
import f1.e;
import f1.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import p3.d;
import y4.l;
import y4.m;

@s0({"SMAP\nImagePipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePipeline.kt\ncom/facebook/imagepipeline/core/ImagePipeline\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1154:1\n40#2,9:1155\n40#2,9:1164\n40#2,9:1180\n40#2,9:1189\n40#2,9:1198\n40#2,9:1207\n216#3,2:1173\n216#3,2:1175\n216#3,2:1178\n1#4:1177\n*S KotlinDebug\n*F\n+ 1 ImagePipeline.kt\ncom/facebook/imagepipeline/core/ImagePipeline\n*L\n418#1:1155,9\n550#1:1164,9\n902#1:1180,9\n967#1:1189,9\n1005#1:1198,9\n1039#1:1207,9\n610#1:1173,2\n638#1:1175,2\n768#1:1178,2\n*E\n"})
@d
public final class x {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.facebook.imagepipeline.request.d.b.values().length];
            try {
                arr_v[com.facebook.imagepipeline.request.d.b.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.facebook.imagepipeline.request.d.b.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.facebook.imagepipeline.request.d.b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @l
    private final L0 a;
    @l
    private final q b;
    @l
    private final q c;
    @l
    private final f d;
    @l
    private final e e;
    @l
    private final B f;
    @l
    private final B g;
    @l
    private final n h;
    @l
    private final u0 i;
    @l
    private final q j;
    @l
    private final AtomicLong k;
    @l
    private final q l;
    @m
    private final s0.a m;
    @l
    private final z n;
    @l
    public static final a o;
    @l
    private static final CancellationException p;
    @l
    private static final CancellationException q;
    @l
    private static final CancellationException r;

    static {
        x.o = new a(null);
        x.p = new CancellationException("Prefetching is not enabled");
        x.q = new CancellationException("ImageRequest is null");
        x.r = new CancellationException("Modified URL is null");
    }

    public x(@l L0 l00, @l Set set0, @l Set set1, @l q q0, @l B b0, @l B b1, @l q q1, @l n n0, @l u0 u00, @l q q2, @l q q3, @m s0.a a0, @l z z0) {
        L.p(l00, "producerSequenceFactory");
        L.p(set0, "requestListeners");
        L.p(set1, "requestListener2s");
        L.p(q0, "isPrefetchEnabledSupplier");
        L.p(b0, "bitmapMemoryCache");
        L.p(b1, "encodedMemoryCache");
        L.p(q1, "diskCachesStoreSupplier");
        L.p(n0, "cacheKeyFactory");
        L.p(u00, "threadHandoffProducerQueue");
        L.p(q2, "suppressBitmapPrefetchingSupplier");
        L.p(q3, "lazyDataSource");
        L.p(z0, "config");
        super();
        this.a = l00;
        this.b = q0;
        this.c = q1;
        this.d = new f1.d(set0);
        this.e = new c(set1);
        this.k = new AtomicLong();
        this.f = b0;
        this.g = b1;
        this.h = n0;
        this.i = u00;
        this.j = q2;
        this.l = q3;
        this.m = a0;
        this.n = z0;
    }

    @l
    public final n A() {
        return this.h;
    }

    @m
    public final com.facebook.common.references.a B(@m com.facebook.cache.common.e e0) {
        if(e0 == null) {
            return null;
        }
        com.facebook.common.references.a a0 = this.f.get(e0);
        if(a0 != null && !((com.facebook.imagepipeline.image.e)a0.n()).I().a()) {
            a0.close();
            return null;
        }
        return a0;
    }

    @l
    public final f C(@m f f0) {
        return f0 != null ? new f1.d(new f[]{this.d, f0}) : this.d;
    }

    @l
    public final z D() {
        return this.n;
    }

    @l
    public final q E(@l com.facebook.imagepipeline.request.d d0, @m Object object0, @m com.facebook.imagepipeline.request.d.d d$d0) {
        public static final class com.facebook.imagepipeline.core.x.c implements q {
            final x a;
            final com.facebook.imagepipeline.request.d b;
            final Object c;
            final com.facebook.imagepipeline.request.d.d d;

            com.facebook.imagepipeline.core.x.c(x x0, com.facebook.imagepipeline.request.d d0, Object object0, com.facebook.imagepipeline.request.d.d d$d0) {
                this.a = x0;
                this.b = d0;
                this.c = object0;
                this.d = d$d0;
                super();
            }

            public com.facebook.datasource.d a() {
                return x.t(this.a, this.b, this.c, this.d, null, null, 24, null);
            }

            @Override  // com.facebook.common.internal.q
            public Object get() {
                return this.a();
            }

            @Override
            public String toString() {
                String s = com.facebook.common.internal.l.e(this).f("uri", this.b.z()).toString();
                L.o(s, "toString(...)");
                return s;
            }
        }

        L.p(d0, "imageRequest");
        return new com.facebook.imagepipeline.core.x.c(this, d0, object0, d$d0);
    }

    @l
    public final q F(@l com.facebook.imagepipeline.request.d d0, @m Object object0, @m com.facebook.imagepipeline.request.d.d d$d0, @m f f0) {
        public static final class com.facebook.imagepipeline.core.x.d implements q {
            final x a;
            final com.facebook.imagepipeline.request.d b;
            final Object c;
            final com.facebook.imagepipeline.request.d.d d;
            final f e;

            com.facebook.imagepipeline.core.x.d(x x0, com.facebook.imagepipeline.request.d d0, Object object0, com.facebook.imagepipeline.request.d.d d$d0, f f0) {
                this.a = x0;
                this.b = d0;
                this.c = object0;
                this.d = d$d0;
                this.e = f0;
                super();
            }

            public com.facebook.datasource.d a() {
                return x.t(this.a, this.b, this.c, this.d, this.e, null, 16, null);
            }

            @Override  // com.facebook.common.internal.q
            public Object get() {
                return this.a();
            }

            @Override
            public String toString() {
                String s = com.facebook.common.internal.l.e(this).f("uri", this.b.z()).toString();
                L.o(s, "toString(...)");
                return s;
            }
        }

        L.p(d0, "imageRequest");
        return new com.facebook.imagepipeline.core.x.d(this, d0, object0, d$d0, f0);
    }

    @l
    public final q G(@l com.facebook.imagepipeline.request.d d0, @m Object object0, @m com.facebook.imagepipeline.request.d.d d$d0, @m f f0, @m String s) {
        public static final class com.facebook.imagepipeline.core.x.e implements q {
            final x a;
            final com.facebook.imagepipeline.request.d b;
            final Object c;
            final com.facebook.imagepipeline.request.d.d d;
            final f e;
            final String f;

            com.facebook.imagepipeline.core.x.e(x x0, com.facebook.imagepipeline.request.d d0, Object object0, com.facebook.imagepipeline.request.d.d d$d0, f f0, String s) {
                this.a = x0;
                this.b = d0;
                this.c = object0;
                this.d = d$d0;
                this.e = f0;
                this.f = s;
                super();
            }

            public com.facebook.datasource.d a() {
                return this.a.q(this.b, this.c, this.d, this.e, this.f);
            }

            @Override  // com.facebook.common.internal.q
            public Object get() {
                return this.a();
            }

            @Override
            public String toString() {
                String s = com.facebook.common.internal.l.e(this).f("uri", this.b.z()).toString();
                L.o(s, "toString(...)");
                return s;
            }
        }

        L.p(d0, "imageRequest");
        return new com.facebook.imagepipeline.core.x.e(this, d0, object0, d$d0, f0, s);
    }

    @l
    public final q H(@l com.facebook.imagepipeline.request.d d0, @m Object object0) {
        public static final class com.facebook.imagepipeline.core.x.f implements q {
            final x a;
            final com.facebook.imagepipeline.request.d b;
            final Object c;

            com.facebook.imagepipeline.core.x.f(x x0, com.facebook.imagepipeline.request.d d0, Object object0) {
                this.a = x0;
                this.b = d0;
                this.c = object0;
                super();
            }

            public com.facebook.datasource.d a() {
                return this.a.u(this.b, this.c);
            }

            @Override  // com.facebook.common.internal.q
            public Object get() {
                return this.a();
            }

            @Override
            public String toString() {
                String s = com.facebook.common.internal.l.e(this).f("uri", this.b.z()).toString();
                L.o(s, "toString(...)");
                return s;
            }
        }

        L.p(d0, "imageRequest");
        return new com.facebook.imagepipeline.core.x.f(this, d0, object0);
    }

    @l
    public final L0 I() {
        return this.a;
    }

    @l
    public final f J(@m com.facebook.imagepipeline.request.d d0, @m f f0) {
        if(d0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if(f0 == null) {
            return d0.u() == null ? this.d : new f1.d(new f[]{this.d, d0.u()});
        }
        return d0.u() == null ? new f1.d(new f[]{this.d, f0}) : new f1.d(new f[]{this.d, f0, d0.u()});
    }

    public final long K() {
        Object object0 = this.c.get();
        L.o(object0, "get(...)");
        long v = ((com.facebook.imagepipeline.core.c)object0).c().u();
        long v1 = ((com.facebook.imagepipeline.core.c)object0).b().u();
        Collection collection0 = ((com.facebook.imagepipeline.core.c)object0).e().values();
        L.o(collection0, "<get-values>(...)");
        long v2 = 0L;
        for(Object object1: collection0) {
            v2 += ((com.facebook.imagepipeline.cache.m)object1).u();
        }
        return v + v1 + v2;
    }

    public final boolean L(@m com.facebook.cache.common.e e0) {
        return e0 == null ? false : this.f.contains(e0);
    }

    public final void M() {
    }

    public final boolean N(@m Uri uri0) {
        if(uri0 == null) {
            return false;
        }
        o o0 = this.f0(uri0);
        return this.f.p(o0);
    }

    public final boolean O(@m com.facebook.imagepipeline.request.d d0) {
        if(d0 == null) {
            return false;
        }
        com.facebook.cache.common.e e0 = this.h.c(d0, null);
        L.m(e0);
        com.facebook.common.references.a a0 = this.f.get(e0);
        try {
            return com.facebook.common.references.a.s(a0);
        }
        finally {
            com.facebook.common.references.a.j(a0);
        }
    }

    @l
    public final com.facebook.datasource.d P(@m Uri uri0) {
        com.facebook.imagepipeline.request.d d0 = com.facebook.imagepipeline.request.d.b(uri0);
        if(d0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return this.Q(d0);
    }

    @l
    public final com.facebook.datasource.d Q(@m com.facebook.imagepipeline.request.d d0) {
        Object object0 = this.c.get();
        L.o(object0, "get(...)");
        com.facebook.cache.common.e e0 = this.h.b(d0, null);
        com.facebook.datasource.d d1 = com.facebook.datasource.m.x();
        bolts.f f0 = new bolts.f();
        r r0 = (j j0) -> {
            Boolean boolean0 = (Boolean)((com.facebook.datasource.m)d1).getResult();
            ((com.facebook.datasource.m)d1).y(Boolean.valueOf((boolean0 == null ? false : boolean0.booleanValue()) || !j0.H() && !j0.J() && ((Boolean)j0.F()).booleanValue()));
            return null;
        };
        s s0 = (j j0) -> {
            Boolean boolean0 = (Boolean)((com.facebook.datasource.m)d1).getResult();
            ((com.facebook.datasource.m)d1).t(Boolean.valueOf((boolean0 == null ? false : boolean0.booleanValue()) || !j0.H() && !j0.J() && ((Boolean)j0.F()).booleanValue()), false);
            return null;
        };
        com.facebook.imagepipeline.cache.m m0 = ((com.facebook.imagepipeline.core.c)object0).c();
        L.m(e0);
        m0.l(e0).u((j j0) -> {
            L.p(((com.facebook.imagepipeline.core.c)object0), "$diskCachesStore");
            if(!j0.H() && !j0.J() && ((Boolean)j0.F()).booleanValue()) {
                return j.D(Boolean.TRUE);
            }
            com.facebook.imagepipeline.cache.m m0 = ((com.facebook.imagepipeline.core.c)object0).b();
            L.m(e0);
            return m0.l(e0);
        }).v((j j0) -> {
            L.p(this, "this$0");
            L.p(s0, "$intermediateContinuation");
            L.p(f0, "$cts");
            if(!j0.H() && !j0.J() && ((Boolean)j0.F()).booleanValue()) {
                return j.D(Boolean.TRUE);
            }
            L.m(e0);
            return this.Y(d0, e0, s0, f0);
        }, f0.j()).q(r0);
        L.m(d1);
        return d1;
    }

    // 检测为 Lambda 实现
    private static final j R(x x0, com.facebook.imagepipeline.request.d d0, com.facebook.cache.common.e e0, h h0, bolts.f f0, j j0) [...]

    // 检测为 Lambda 实现
    private static final Void S(com.facebook.datasource.m m0, j j0) [...]

    // 检测为 Lambda 实现
    private static final Void T(com.facebook.datasource.m m0, j j0) [...]

    // 检测为 Lambda 实现
    private static final j U(com.facebook.imagepipeline.core.c c0, com.facebook.cache.common.e e0, j j0) [...]

    // 去混淆评级： 低(30)
    public final boolean V(@m Uri uri0) {
        return this.W(uri0, com.facebook.imagepipeline.request.d.b.a) || this.W(uri0, com.facebook.imagepipeline.request.d.b.b) || this.W(uri0, com.facebook.imagepipeline.request.d.b.c);
    }

    public final boolean W(@m Uri uri0, @m com.facebook.imagepipeline.request.d.b d$b0) {
        com.facebook.imagepipeline.request.d d0 = com.facebook.imagepipeline.request.e.B(uri0).E(d$b0).b();
        L.m(d0);
        return this.X(d0);
    }

    public final boolean X(@l com.facebook.imagepipeline.request.d d0) {
        boolean z;
        L.p(d0, "imageRequest");
        Object object0 = this.c.get();
        L.o(object0, "get(...)");
        com.facebook.cache.common.e e0 = this.h.b(d0, null);
        com.facebook.imagepipeline.request.d.b d$b0 = d0.f();
        L.o(d$b0, "getCacheChoice(...)");
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            switch(d$b0) {
                case 1: {
                    com.facebook.imagepipeline.cache.m m0 = ((com.facebook.imagepipeline.core.c)object0).c();
                    L.m(e0);
                    z = m0.p(e0);
                    break;
                }
                case 2: {
                    com.facebook.imagepipeline.cache.m m1 = ((com.facebook.imagepipeline.core.c)object0).b();
                    L.m(e0);
                    z = m1.p(e0);
                    break;
                }
                case 3: {
                    z = this.Z(d0);
                    break;
                }
                default: {
                    throw new J();
                }
            }
            return z;
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }

    private final j Y(com.facebook.imagepipeline.request.d d0, com.facebook.cache.common.e e0, h h0, bolts.f f0) {
        static final class g implements h {
            final bolts.f a;
            final h b;
            final kotlin.jvm.internal.l0.h c;

            g(bolts.f f0, h h0, kotlin.jvm.internal.l0.h l0$h0) {
                this.a = f0;
                this.b = h0;
                this.c = l0$h0;
                super();
            }

            @Override  // bolts.h
            public Object a(j j0) {
                return this.b(j0);
            }

            public final j b(j j0) {
                if(!j0.H() && !j0.J() && ((Boolean)j0.F()).booleanValue()) {
                    this.a.c();
                    return j.D(Boolean.TRUE).q(this.b);
                }
                return j0.H() ? j.D(Boolean.FALSE) : ((j)this.c.a);
            }
        }

        j j0;
        Object object0 = this.c.get();
        L.o(object0, "get(...)");
        String s = d0 == null ? null : d0.i();
        if(s != null) {
            com.facebook.imagepipeline.cache.m m0 = (com.facebook.imagepipeline.cache.m)((com.facebook.imagepipeline.core.c)object0).e().get(s);
            if(m0 == null) {
                j0 = j.D(Boolean.FALSE);
                L.o(j0, "forResult(...)");
            }
            else {
                j0 = m0.l(e0);
                if(j0 == null) {
                    j0 = j.D(Boolean.FALSE);
                    L.o(j0, "forResult(...)");
                    return j0;
                }
            }
            return j0;
        }
        if(((com.facebook.imagepipeline.core.c)object0).e().size() == 0) {
            j j1 = j.D(Boolean.FALSE);
            L.o(j1, "forResult(...)");
            return j1;
        }
        Iterator iterator0 = ((com.facebook.imagepipeline.core.c)object0).e().entrySet().iterator();
        j j2 = j.D(Boolean.FALSE);
        L.o(j2, "forResult(...)");
        kotlin.jvm.internal.l0.h l0$h0 = new kotlin.jvm.internal.l0.h();
        l0$h0.a = j2;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            l0$h0.a = ((com.facebook.imagepipeline.cache.m)((Map.Entry)object1).getValue()).l(e0);
            j2.v(new g(f0, h0, l0$h0), f0.j());
            j2 = (j)l0$h0.a;
        }
        return j2;
    }

    private final boolean Z(com.facebook.imagepipeline.request.d d0) {
        Object object0 = this.c.get();
        L.o(object0, "get(...)");
        com.facebook.cache.common.e e0 = this.h.b(d0, null);
        String s = d0.i();
        if(s != null) {
            com.facebook.imagepipeline.cache.m m0 = (com.facebook.imagepipeline.cache.m)((com.facebook.imagepipeline.core.c)object0).e().get(s);
            if(m0 != null) {
                L.m(e0);
                return m0.p(e0);
            }
            return false;
        }
        for(Object object1: ((com.facebook.imagepipeline.core.c)object0).e().entrySet()) {
            com.facebook.imagepipeline.cache.m m1 = (com.facebook.imagepipeline.cache.m)((Map.Entry)object1).getValue();
            L.m(e0);
            if(m1.p(e0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final boolean a0(@m Uri uri0) {
        if(uri0 == null) {
            return false;
        }
        o o0 = this.f0(uri0);
        return this.g.p(o0);
    }

    public final boolean b0(@m com.facebook.imagepipeline.request.d d0) {
        if(d0 == null) {
            return false;
        }
        com.facebook.cache.common.e e0 = this.h.b(d0, null);
        L.m(e0);
        com.facebook.common.references.a a0 = this.g.get(e0);
        try {
            return com.facebook.common.references.a.s(a0);
        }
        finally {
            com.facebook.common.references.a.j(a0);
        }
    }

    @l
    public final q c0() {
        return this.l;
    }

    public final boolean d0() {
        return this.i.e();
    }

    public final void e0() {
        this.i.b();
    }

    private final o f0(Uri uri0) {
        return (com.facebook.cache.common.e e0) -> {
            L.p(uri0, "$uri");
            L.p(e0, "key");
            return e0.c(uri0);
        };
    }

    public final void g() {
        this.i();
        this.h();
    }

    // 检测为 Lambda 实现
    private static final boolean g0(Uri uri0, com.facebook.cache.common.e e0) [...]

    public final void h() {
        Object object0 = this.c.get();
        L.o(object0, "get(...)");
        ((com.facebook.imagepipeline.core.c)object0).c().j();
        ((com.facebook.imagepipeline.core.c)object0).b().j();
        for(Object object1: ((com.facebook.imagepipeline.core.c)object0).e().entrySet()) {
            ((com.facebook.imagepipeline.cache.m)((Map.Entry)object1).getValue()).j();
        }
    }

    @l
    @z3.j
    public final com.facebook.datasource.d h0(@m com.facebook.imagepipeline.request.d d0, @m Object object0) {
        return this.i0(d0, object0, null);
    }

    public final void i() {
        com.facebook.imagepipeline.core.w w0 = (com.facebook.cache.common.e e0) -> {
            L.p(e0, "it");
            return true;
        };
        this.f.i(w0);
        this.g.i(w0);
    }

    @l
    @z3.j
    public final com.facebook.datasource.d i0(@m com.facebook.imagepipeline.request.d d0, @m Object object0, @m f f0) {
        com.facebook.datasource.d d5;
        boolean z = false;
        if(!com.facebook.imagepipeline.systrace.b.e()) {
            if(!((Boolean)this.b.get()).booleanValue()) {
                com.facebook.datasource.d d1 = com.facebook.datasource.e.c(x.p);
                L.o(d1, "immediateFailedDataSource(...)");
                return d1;
            }
            try {
                if(this.n.q().p() && this.O(d0)) {
                    com.facebook.datasource.d d2 = com.facebook.datasource.e.d();
                    L.o(d2, "immediateSuccessfulDataSource(...)");
                    return d2;
                }
                if(d0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Boolean boolean0 = d0.I();
                if(boolean0 == null) {
                    Object object1 = this.j.get();
                    L.o(object1, "get(...)");
                    z = ((Boolean)object1).booleanValue();
                }
                else if(!boolean0.booleanValue()) {
                    z = true;
                }
                return this.x0((z ? this.a.M(d0) : this.a.I(d0)), d0, com.facebook.imagepipeline.request.d.d.b, object0, com.facebook.imagepipeline.common.f.c, f0);
            }
            catch(Exception exception0) {
                return com.facebook.datasource.e.c(exception0);
            }
        }
        com.facebook.imagepipeline.systrace.b.a("ImagePipeline#prefetchToBitmapCache");
        try {
            if(!((Boolean)this.b.get()).booleanValue()) {
                com.facebook.datasource.d d3 = com.facebook.datasource.e.c(x.p);
                L.o(d3, "immediateFailedDataSource(...)");
                return d3;
            }
            try {
                if(this.n.q().p() && this.O(d0)) {
                    com.facebook.datasource.d d4 = com.facebook.datasource.e.d();
                    L.o(d4, "immediateSuccessfulDataSource(...)");
                    return d4;
                }
                if(d0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Boolean boolean1 = d0.I();
                if(boolean1 == null) {
                    Object object2 = this.j.get();
                    L.o(object2, "get(...)");
                    z = ((Boolean)object2).booleanValue();
                }
                else if(!boolean1.booleanValue()) {
                    z = true;
                }
                d5 = this.x0((z ? this.a.M(d0) : this.a.I(d0)), d0, com.facebook.imagepipeline.request.d.d.b, object0, com.facebook.imagepipeline.common.f.c, f0);
            }
            catch(Exception exception1) {
                d5 = com.facebook.datasource.e.c(exception1);
            }
            return d5;
        }
        finally {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    // 检测为 Lambda 实现
    private static final boolean j(com.facebook.cache.common.e e0) [...]

    @l
    public final com.facebook.datasource.d j0(@m com.facebook.imagepipeline.request.d d0, @m Object object0) {
        return this.l0(d0, object0, com.facebook.imagepipeline.common.f.c, null);
    }

    public final void k(@l Uri uri0) {
        L.p(uri0, "uri");
        this.n(uri0);
        this.l(uri0);
    }

    @l
    public final com.facebook.datasource.d k0(@m com.facebook.imagepipeline.request.d d0, @m Object object0, @l com.facebook.imagepipeline.common.f f0) {
        L.p(f0, "priority");
        return this.l0(d0, object0, f0, null);
    }

    public final void l(@m Uri uri0) {
        com.facebook.imagepipeline.request.d d0 = com.facebook.imagepipeline.request.d.b(uri0);
        if(d0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.m(d0);
    }

    @l
    @z3.j
    public final com.facebook.datasource.d l0(@m com.facebook.imagepipeline.request.d d0, @m Object object0, @l com.facebook.imagepipeline.common.f f0, @m f f1) {
        L.p(f0, "priority");
        if(!((Boolean)this.b.get()).booleanValue()) {
            com.facebook.datasource.d d1 = com.facebook.datasource.e.c(x.p);
            L.o(d1, "immediateFailedDataSource(...)");
            return d1;
        }
        if(d0 == null) {
            com.facebook.datasource.d d2 = com.facebook.datasource.e.c(new NullPointerException("imageRequest is null"));
            L.m(d2);
            return d2;
        }
        try {
            return this.x0(this.a.M(d0), d0, com.facebook.imagepipeline.request.d.d.b, object0, f0, f1);
        }
        catch(Exception exception0) {
            return com.facebook.datasource.e.c(exception0);
        }
    }

    public final void m(@m com.facebook.imagepipeline.request.d d0) {
        if(d0 == null) {
            return;
        }
        com.facebook.cache.common.e e0 = this.h.b(d0, null);
        Object object0 = this.c.get();
        L.o(object0, "get(...)");
        com.facebook.imagepipeline.cache.m m0 = ((com.facebook.imagepipeline.core.c)object0).c();
        L.m(e0);
        m0.A(e0);
        ((com.facebook.imagepipeline.core.c)object0).b().A(e0);
        for(Object object1: ((com.facebook.imagepipeline.core.c)object0).e().entrySet()) {
            ((com.facebook.imagepipeline.cache.m)((Map.Entry)object1).getValue()).A(e0);
        }
    }

    @l
    public final com.facebook.datasource.d m0(@m com.facebook.imagepipeline.request.d d0, @m Object object0, @m f f0) {
        return this.l0(d0, object0, com.facebook.imagepipeline.common.f.c, f0);
    }

    public final void n(@l Uri uri0) {
        L.p(uri0, "uri");
        o o0 = this.f0(uri0);
        this.f.i(o0);
        this.g.i(o0);
    }

    @l
    @z3.j
    public final com.facebook.datasource.d n0(@m com.facebook.imagepipeline.request.d d0, @m Object object0) {
        return x.r0(this, d0, object0, null, null, 12, null);
    }

    @l
    public final com.facebook.datasource.d o(@m com.facebook.imagepipeline.request.d d0, @m Object object0) {
        return x.t(this, d0, object0, null, null, null, 24, null);
    }

    @l
    @z3.j
    public final com.facebook.datasource.d o0(@m com.facebook.imagepipeline.request.d d0, @m Object object0, @l com.facebook.imagepipeline.common.f f0) {
        L.p(f0, "priority");
        return x.r0(this, d0, object0, f0, null, 8, null);
    }

    @l
    public final com.facebook.datasource.d p(@m com.facebook.imagepipeline.request.d d0, @m Object object0, @l com.facebook.imagepipeline.request.d.d d$d0) {
        L.p(d$d0, "lowestPermittedRequestLevelOnSubmit");
        return x.t(this, d0, object0, d$d0, null, null, 16, null);
    }

    @l
    @z3.j
    public final com.facebook.datasource.d p0(@m com.facebook.imagepipeline.request.d d0, @m Object object0, @l com.facebook.imagepipeline.common.f f0, @m f f1) {
        com.facebook.datasource.d d7;
        L.p(f0, "priority");
        if(!com.facebook.imagepipeline.systrace.b.e()) {
            if(!((Boolean)this.b.get()).booleanValue()) {
                com.facebook.datasource.d d1 = com.facebook.datasource.e.c(x.p);
                L.o(d1, "immediateFailedDataSource(...)");
                return d1;
            }
            if(d0 == null) {
                com.facebook.datasource.d d2 = com.facebook.datasource.e.c(x.q);
                L.o(d2, "immediateFailedDataSource(...)");
                return d2;
            }
            try {
                if(this.n.q().p() && this.b0(d0)) {
                    com.facebook.datasource.d d3 = com.facebook.datasource.e.d();
                    L.o(d3, "immediateSuccessfulDataSource(...)");
                    return d3;
                }
                return this.x0(this.a.M(d0), d0, com.facebook.imagepipeline.request.d.d.b, object0, f0, f1);
            }
            catch(Exception exception0) {
                return com.facebook.datasource.e.c(exception0);
            }
        }
        com.facebook.imagepipeline.systrace.b.a("ImagePipeline#prefetchToEncodedCache");
        try {
            if(!((Boolean)this.b.get()).booleanValue()) {
                com.facebook.datasource.d d4 = com.facebook.datasource.e.c(x.p);
                L.o(d4, "immediateFailedDataSource(...)");
                return d4;
            }
            if(d0 == null) {
                com.facebook.datasource.d d5 = com.facebook.datasource.e.c(x.q);
                L.o(d5, "immediateFailedDataSource(...)");
                return d5;
            }
            try {
                if(this.n.q().p() && this.b0(d0)) {
                    com.facebook.datasource.d d6 = com.facebook.datasource.e.d();
                    L.o(d6, "immediateSuccessfulDataSource(...)");
                    return d6;
                }
                d7 = this.x0(this.a.M(d0), d0, com.facebook.imagepipeline.request.d.d.b, object0, f0, f1);
            }
            catch(Exception exception1) {
                d7 = com.facebook.datasource.e.c(exception1);
            }
            return d7;
        }
        finally {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    @l
    public final com.facebook.datasource.d q(@m com.facebook.imagepipeline.request.d d0, @m Object object0, @m com.facebook.imagepipeline.request.d.d d$d0, @m f f0, @m String s) {
        if(d0 == null) {
            com.facebook.datasource.d d1 = com.facebook.datasource.e.c(new NullPointerException());
            L.o(d1, "immediateFailedDataSource(...)");
            return d1;
        }
        try {
            h0 h00 = this.a.K(d0);
            if(d$d0 == null) {
                d$d0 = com.facebook.imagepipeline.request.d.d.b;
            }
            return this.u0(h00, d0, d$d0, object0, f0, s);
        }
        catch(Exception exception0) {
            return com.facebook.datasource.e.c(exception0);
        }
    }

    @l
    public final com.facebook.datasource.d q0(@m com.facebook.imagepipeline.request.d d0, @m Object object0, @m f f0) {
        return this.p0(d0, object0, com.facebook.imagepipeline.common.f.c, f0);
    }

    @l
    public final com.facebook.datasource.d r(@m com.facebook.imagepipeline.request.d d0, @m Object object0, @l com.facebook.imagepipeline.request.d.d d$d0, @m f f0, @m String s, @m Map map0) {
        L.p(d$d0, "lowestPermittedRequestLevelOnSubmit");
        if(d0 == null) {
            com.facebook.datasource.d d1 = com.facebook.datasource.e.c(new NullPointerException());
            L.o(d1, "immediateFailedDataSource(...)");
            return d1;
        }
        try {
            return this.v0(this.a.K(d0), d0, d$d0, object0, f0, s, map0);
        }
        catch(Exception exception0) {
            return com.facebook.datasource.e.c(exception0);
        }
    }

    public static com.facebook.datasource.d r0(x x0, com.facebook.imagepipeline.request.d d0, Object object0, com.facebook.imagepipeline.common.f f0, f f1, int v, Object object1) {
        if((v & 4) != 0) {
            f0 = com.facebook.imagepipeline.common.f.c;
        }
        if((v & 8) != 0) {
            f1 = null;
        }
        return x0.p0(d0, object0, f0, f1);
    }

    @l
    public final com.facebook.datasource.d s(@m com.facebook.imagepipeline.request.d d0, @m Object object0, @l f f0) {
        L.p(f0, "requestListener");
        return x.t(this, d0, object0, null, f0, null, 16, null);
    }

    public final void s0() {
        this.i.d();
    }

    public static com.facebook.datasource.d t(x x0, com.facebook.imagepipeline.request.d d0, Object object0, com.facebook.imagepipeline.request.d.d d$d0, f f0, String s, int v, Object object1) {
        com.facebook.imagepipeline.request.d.d d$d1 = (v & 4) == 0 ? d$d0 : null;
        f f1 = (v & 8) == 0 ? f0 : null;
        return (v & 16) == 0 ? x0.q(d0, object0, d$d1, f1, s) : x0.q(d0, object0, d$d1, f1, null);
    }

    @l
    public final com.facebook.datasource.d t0(@l h0 h00, @l q0 q00, @m f f0) {
        com.facebook.datasource.d d0;
        L.p(h00, "producerSequence");
        L.p(q00, "settableProducerContext");
        if(!com.facebook.imagepipeline.systrace.b.e()) {
            try {
                return com.facebook.imagepipeline.datasource.e.I(h00, q00, new G(f0, this.e));
            }
            catch(Exception exception0) {
                return com.facebook.datasource.e.c(exception0);
            }
        }
        com.facebook.imagepipeline.systrace.b.a("ImagePipeline#submitFetchRequest");
        try {
            d0 = com.facebook.imagepipeline.datasource.e.I(h00, q00, new G(f0, this.e));
        }
        catch(Exception exception1) {
            d0 = com.facebook.datasource.e.c(exception1);
        }
        finally {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return d0;
    }

    @l
    public final com.facebook.datasource.d u(@l com.facebook.imagepipeline.request.d d0, @m Object object0) {
        L.p(d0, "imageRequest");
        return this.v(d0, object0, null);
    }

    private final com.facebook.datasource.d u0(h0 h00, com.facebook.imagepipeline.request.d d0, com.facebook.imagepipeline.request.d.d d$d0, Object object0, f f0, String s) {
        return this.v0(h00, d0, d$d0, object0, f0, s, null);
    }

    @l
    public final com.facebook.datasource.d v(@l com.facebook.imagepipeline.request.d d0, @m Object object0, @m f f0) {
        L.p(d0, "imageRequest");
        if(d0.z() != null) {
            try {
                h0 h00 = this.a.N(d0);
                if(d0.v() != null) {
                    d0 = com.facebook.imagepipeline.request.e.e(d0).R(null).b();
                }
                return this.v0(h00, d0, com.facebook.imagepipeline.request.d.d.b, object0, f0, null, null);
            }
            catch(Exception exception0) {
                return com.facebook.datasource.e.c(exception0);
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final com.facebook.datasource.d v0(h0 h00, com.facebook.imagepipeline.request.d d0, com.facebook.imagepipeline.request.d.d d$d0, Object object0, f f0, String s, Map map0) {
        com.facebook.datasource.d d1;
        if(!com.facebook.imagepipeline.systrace.b.e()) {
            G g0 = new G(this.J(d0, f0), this.e);
            s0.a a0 = this.m;
            if(a0 != null) {
                a0.a(object0, false);
            }
            try {
                com.facebook.imagepipeline.request.d.d d$d1 = com.facebook.imagepipeline.request.d.d.a(d0.o(), d$d0);
                L.o(d$d1, "getMax(...)");
                q0 q00 = new q0(d0, this.x(), s, g0, object0, d$d1, false, d0.t() || !com.facebook.common.util.h.q(d0.z()), d0.s(), this.n);
                q00.k(map0);
                return com.facebook.imagepipeline.datasource.e.I(h00, q00, g0);
            }
            catch(Exception exception0) {
                return com.facebook.datasource.e.c(exception0);
            }
        }
        com.facebook.imagepipeline.systrace.b.a("ImagePipeline#submitFetchRequest");
        try {
            G g1 = new G(this.J(d0, f0), this.e);
            s0.a a1 = this.m;
            if(a1 != null) {
                a1.a(object0, false);
            }
            try {
                com.facebook.imagepipeline.request.d.d d$d2 = com.facebook.imagepipeline.request.d.d.a(d0.o(), d$d0);
                L.o(d$d2, "getMax(...)");
                q0 q01 = new q0(d0, this.x(), s, g1, object0, d$d2, false, d0.t() || !com.facebook.common.util.h.q(d0.z()), d0.s(), this.n);
                q01.k(map0);
                d1 = com.facebook.imagepipeline.datasource.e.I(h00, q01, g1);
            }
            catch(Exception exception1) {
                d1 = com.facebook.datasource.e.c(exception1);
            }
            return d1;
        }
        finally {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    @l
    public final com.facebook.datasource.d w(@l com.facebook.imagepipeline.request.d d0, @m Object object0) {
        L.p(d0, "imageRequest");
        return this.p(d0, object0, com.facebook.imagepipeline.request.d.d.e);
    }

    private final com.facebook.datasource.d w0(h0 h00, com.facebook.imagepipeline.request.d d0, com.facebook.imagepipeline.request.d.d d$d0, Object object0, f f0, Map map0) {
        com.facebook.datasource.d d1;
        if(!com.facebook.imagepipeline.systrace.b.e()) {
            G g0 = new G(this.J(d0, f0), this.e);
            s0.a a0 = this.m;
            if(a0 != null) {
                a0.a(object0, false);
            }
            try {
                com.facebook.imagepipeline.request.d.d d$d1 = com.facebook.imagepipeline.request.d.d.a(d0.o(), d$d0);
                L.o(d$d1, "getMax(...)");
                return com.facebook.imagepipeline.datasource.e.I(h00, new q0(d0, this.x(), null, g0, object0, d$d1, false, d0.t() || !com.facebook.common.util.h.q(d0.z()), d0.s(), this.n), g0);
            }
            catch(Exception exception0) {
                return com.facebook.datasource.e.c(exception0);
            }
        }
        com.facebook.imagepipeline.systrace.b.a("ImagePipeline#submitFetchRequest");
        try {
            G g1 = new G(this.J(d0, f0), this.e);
            s0.a a1 = this.m;
            if(a1 != null) {
                a1.a(object0, false);
            }
            try {
                com.facebook.imagepipeline.request.d.d d$d2 = com.facebook.imagepipeline.request.d.d.a(d0.o(), d$d0);
                L.o(d$d2, "getMax(...)");
                d1 = com.facebook.imagepipeline.datasource.e.I(h00, new q0(d0, this.x(), null, g1, object0, d$d2, false, d0.t() || !com.facebook.common.util.h.q(d0.z()), d0.s(), this.n), g1);
            }
            catch(Exception exception1) {
                d1 = com.facebook.datasource.e.c(exception1);
            }
            return d1;
        }
        finally {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    @l
    public final String x() {
        return String.valueOf(this.k.getAndIncrement());
    }

    private final com.facebook.datasource.d x0(h0 h00, com.facebook.imagepipeline.request.d d0, com.facebook.imagepipeline.request.d.d d$d0, Object object0, com.facebook.imagepipeline.common.f f0, f f1) {
        com.facebook.imagepipeline.request.d d1 = d0;
        G g0 = new G(this.J(d1, f1), this.e);
        s0.a a0 = this.m;
        if(a0 != null) {
            a0.a(object0, true);
        }
        Uri uri0 = d0.z();
        L.o(uri0, "getSourceUri(...)");
        Uri uri1 = U0.d.b.b(uri0, object0);
        if(uri1 == null) {
            com.facebook.datasource.d d2 = com.facebook.datasource.e.c(x.r);
            L.o(d2, "immediateFailedDataSource(...)");
            return d2;
        }
        if(!L.g(uri0, uri1)) {
            d1 = com.facebook.imagepipeline.request.e.e(d0).V(uri1).b();
        }
        try {
            com.facebook.imagepipeline.request.d.d d$d1 = com.facebook.imagepipeline.request.d.d.a(d1.o(), d$d0);
            L.o(d$d1, "getMax(...)");
            String s = this.x();
            l0 l00 = this.n.q();
            q0 q00 = new q0(d1, s, g0, object0, d$d1, true, l00 != null && l00.b() && d1.t(), f0, this.n);
            return com.facebook.imagepipeline.datasource.h.k.a(h00, q00, g0);
        }
        catch(Exception exception0) {
            return com.facebook.datasource.e.c(exception0);
        }
    }

    @l
    public final B y() {
        return this.f;
    }

    @m
    public final com.facebook.cache.common.e z(@m com.facebook.imagepipeline.request.d d0, @m Object object0) {
        com.facebook.cache.common.e e0 = null;
        if(!com.facebook.imagepipeline.systrace.b.e()) {
            if(d0 != null) {
                return d0.p() == null ? this.h.c(d0, object0) : this.h.a(d0, object0);
            }
            return null;
        }
        com.facebook.imagepipeline.systrace.b.a("ImagePipeline#getCacheKey");
        try {
            if(d0 != null) {
                e0 = d0.p() == null ? this.h.c(d0, object0) : this.h.a(d0, object0);
            }
            return e0;
        }
        finally {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }
}

