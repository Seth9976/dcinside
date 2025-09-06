package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.net.Uri;
import com.facebook.common.internal.j;
import com.facebook.common.util.h;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.decoder.f;
import com.facebook.imagepipeline.decoder.g;
import com.facebook.imagepipeline.image.e;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.image.r;
import com.facebook.imageutils.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.m;

@s0({"SMAP\nDecodeProducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecodeProducer.kt\ncom/facebook/imagepipeline/producers/DecodeProducer\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,550:1\n40#2,9:551\n*S KotlinDebug\n*F\n+ 1 DecodeProducer.kt\ncom/facebook/imagepipeline/producers/DecodeProducer\n*L\n68#1:551,9\n*E\n"})
public final class q implements h0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final boolean b(l l0, d d0) {
            return ((long)l0.getWidth()) * ((long)l0.getHeight()) * ((long)c.j(d0.h)) > 0x6400000L;
        }
    }

    final class b extends com.facebook.imagepipeline.producers.q.d {
        final q q;

        public b(@y4.l n n0, @y4.l j0 j00, boolean z, int v) {
            L.p(n0, "consumer");
            L.p(j00, "producerContext");
            this.q = q0;
            super(n0, j00, z, v);
        }

        @Override  // com.facebook.imagepipeline.producers.q$d
        @y4.l
        protected r A() {
            r r0 = com.facebook.imagepipeline.image.q.d(0, false, false);
            L.o(r0, "of(...)");
            return r0;
        }

        @Override  // com.facebook.imagepipeline.producers.q$d
        protected boolean K(@m l l0, int v) {
            synchronized(this) {
                return com.facebook.imagepipeline.producers.c.f(v) ? false : super.K(l0, v);
            }
        }

        @Override  // com.facebook.imagepipeline.producers.q$d
        protected int y(@y4.l l l0) {
            L.p(l0, "encodedImage");
            return l0.getSize();
        }
    }

    final class com.facebook.imagepipeline.producers.q.c extends com.facebook.imagepipeline.producers.q.d {
        @y4.l
        private final g q;
        @y4.l
        private final f r;
        final q s;

        public com.facebook.imagepipeline.producers.q.c(@y4.l n n0, @y4.l j0 j00, @y4.l g g0, @y4.l f f0, boolean z, int v) {
            L.p(n0, "consumer");
            L.p(j00, "producerContext");
            L.p(g0, "progressiveJpegParser");
            L.p(f0, "progressiveJpegConfig");
            this.s = q0;
            super(n0, j00, z, v);
            this.q = g0;
            this.r = f0;
            this.J(0);
        }

        @Override  // com.facebook.imagepipeline.producers.q$d
        @y4.l
        protected r A() {
            int v = this.q.d();
            r r0 = this.r.b(v);
            L.o(r0, "getQualityInfo(...)");
            return r0;
        }

        @Override  // com.facebook.imagepipeline.producers.q$d
        protected boolean K(@m l l0, int v) {
            synchronized(this) {
                if(l0 == null) {
                    return false;
                }
                boolean z = super.K(l0, v);
                if((com.facebook.imagepipeline.producers.c.f(v) || com.facebook.imagepipeline.producers.c.n(v, 8)) && (!com.facebook.imagepipeline.producers.c.n(v, 4) && l.R(l0) && l0.n() == X0.b.b)) {
                    if(!this.q.h(l0)) {
                        return false;
                    }
                    int v2 = this.q.d();
                    if(v2 <= this.z()) {
                        return false;
                    }
                    if(v2 < this.r.a(this.z()) && !this.q.e()) {
                        return false;
                    }
                    this.J(v2);
                }
                return z;
            }
        }

        @y4.l
        public final f L() {
            return this.r;
        }

        @y4.l
        public final g M() {
            return this.q;
        }

        @Override  // com.facebook.imagepipeline.producers.q$d
        protected int y(@y4.l l l0) {
            L.p(l0, "encodedImage");
            return this.q.c();
        }
    }

    @s0({"SMAP\nDecodeProducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecodeProducer.kt\ncom/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,550:1\n40#2,9:551\n*S KotlinDebug\n*F\n+ 1 DecodeProducer.kt\ncom/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder\n*L\n115#1:551,9\n*E\n"})
    abstract class com.facebook.imagepipeline.producers.q.d extends u {
        @y4.l
        private final j0 i;
        @y4.l
        private final String j;
        @y4.l
        private final l0 k;
        @y4.l
        private final d l;
        @p3.a("this")
        private boolean m;
        @y4.l
        private final H n;
        private int o;
        final q p;

        public com.facebook.imagepipeline.producers.q.d(@y4.l n n0, @y4.l j0 j00, boolean z, int v) {
            public static final class com.facebook.imagepipeline.producers.q.d.a extends com.facebook.imagepipeline.producers.f {
                final com.facebook.imagepipeline.producers.q.d a;
                final boolean b;

                com.facebook.imagepipeline.producers.q.d.a(com.facebook.imagepipeline.producers.q.d q$d0, boolean z) {
                    this.a = q$d0;
                    this.b = z;
                    super();
                }

                @Override  // com.facebook.imagepipeline.producers.f
                public void a() {
                    if(this.a.i.s()) {
                        this.a.n.h();
                    }
                }

                @Override  // com.facebook.imagepipeline.producers.f
                public void b() {
                    if(this.b) {
                        this.a.B();
                    }
                }
            }

            L.p(n0, "consumer");
            L.p(j00, "producerContext");
            this.p = q0;
            super(n0);
            this.i = j00;
            this.j = "ProgressiveDecoder";
            this.k = j00.i();
            d d0 = j00.b().l();
            L.o(d0, "getImageDecodeOptions(...)");
            this.l = d0;
            this.n = new H(q0.h(), (l l0, int v1) -> {
                L.p(this, "this$0");
                L.p(q0, "this$1");
                if(l0 != null) {
                    com.facebook.imagepipeline.request.d d0 = this.i.b();
                    String s = l0.n().f();
                    this.i.f("image_format", s);
                    Uri uri0 = d0.z();
                    l0.L0((uri0 == null ? null : uri0.toString()));
                    com.facebook.imagepipeline.core.n n0 = d0.j() == null ? q0.g() : d0.j();
                    if((n0 == com.facebook.imagepipeline.core.n.a || n0 == com.facebook.imagepipeline.core.n.b && !com.facebook.imagepipeline.producers.c.n(v1, 16)) && (q0.f() || !h.q(d0.z()))) {
                        com.facebook.imagepipeline.common.h h0 = d0.x();
                        L.o(h0, "getRotationOptions(...)");
                        l0.E0(com.facebook.imagepipeline.transcoder.a.b(h0, d0.v(), l0, v));
                    }
                    if(this.i.e().q().i()) {
                        this.G(l0);
                    }
                    this.w(l0, v1, this.o);
                }
            }, d0.a);
            j00.n(new com.facebook.imagepipeline.producers.q.d.a(this, z));
        }

        @y4.l
        protected abstract r A();

        private final void B() {
            this.F(true);
            this.q().a();
        }

        private final void C(Throwable throwable0) {
            this.F(true);
            this.q().onFailure(throwable0);
        }

        private final void D(e e0, int v) {
            com.facebook.common.references.a a0 = this.p.d().b(e0);
            try {
                this.F(com.facebook.imagepipeline.producers.c.e(v));
                this.q().b(a0, v);
            }
            finally {
                com.facebook.common.references.a.j(a0);
            }
        }

        private final e E(l l0, int v, r r0) {
            boolean z = this.p.m() != null && ((Boolean)this.p.n().get()).booleanValue();
            try {
                return this.p.i().a(l0, v, r0, this.l);
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                if(!z) {
                    throw outOfMemoryError0;
                }
                Runnable runnable0 = this.p.m();
                if(runnable0 != null) {
                    runnable0.run();
                }
                System.gc();
                return this.p.i().a(l0, v, r0, this.l);
            }
        }

        private final void F(boolean z) {
            synchronized(this) {
                if(z && !this.m) {
                    this.q().c(1.0f);
                    this.m = true;
                    this.n.c();
                }
            }
        }

        private final void G(l l0) {
            if(l0.n() != X0.b.b) {
                return;
            }
            l0.E0(com.facebook.imagepipeline.transcoder.a.c(l0, c.j(this.l.h), 0x6400000));
        }

        public void H(@m l l0, int v) {
            if(!com.facebook.imagepipeline.systrace.b.e()) {
                boolean z = com.facebook.imagepipeline.producers.c.e(v);
                if(z) {
                    if(l0 == null) {
                        boolean z1 = L.g(this.i.v("cached_value_found"), Boolean.TRUE);
                        if(!this.i.e().q().h() || this.i.w() == com.facebook.imagepipeline.request.d.d.b || z1) {
                            this.C(new com.facebook.common.util.b("Encoded image is null."));
                            return;
                        }
                    }
                    else if(!l0.Q()) {
                        this.C(new com.facebook.common.util.b("Encoded image is not valid."));
                        return;
                    }
                }
                if(!this.K(l0, v)) {
                    return;
                }
                if(!z && !com.facebook.imagepipeline.producers.c.n(v, 4) && !this.i.s()) {
                    return;
                }
                this.n.h();
                return;
            }
            com.facebook.imagepipeline.systrace.b.a("DecodeProducer#onNewResultImpl");
            try {
                boolean z2 = com.facebook.imagepipeline.producers.c.e(v);
                if(z2) {
                    if(l0 == null) {
                        boolean z3 = L.g(this.i.v("cached_value_found"), Boolean.TRUE);
                        if(!this.i.e().q().h() || this.i.w() == com.facebook.imagepipeline.request.d.d.b || z3) {
                            this.C(new com.facebook.common.util.b("Encoded image is null."));
                            goto label_23;
                        }
                    }
                    else {
                        goto label_25;
                    }
                }
                goto label_29;
            }
            catch(Throwable throwable0) {
                com.facebook.imagepipeline.systrace.b.c();
                throw throwable0;
            }
        label_23:
            com.facebook.imagepipeline.systrace.b.c();
            return;
            try {
            label_25:
                if(!l0.Q()) {
                    this.C(new com.facebook.common.util.b("Encoded image is not valid."));
                    goto label_27;
                }
                goto label_29;
            }
            catch(Throwable throwable0) {
                com.facebook.imagepipeline.systrace.b.c();
                throw throwable0;
            }
        label_27:
            com.facebook.imagepipeline.systrace.b.c();
            return;
            try {
            label_29:
                if(this.K(l0, v)) {
                    if(z2 || com.facebook.imagepipeline.producers.c.n(v, 4) || this.i.s()) {
                        this.n.h();
                    }
                    goto label_36;
                }
                goto label_38;
            }
            catch(Throwable throwable0) {
            }
            com.facebook.imagepipeline.systrace.b.c();
            throw throwable0;
        label_36:
            com.facebook.imagepipeline.systrace.b.c();
            return;
        label_38:
            com.facebook.imagepipeline.systrace.b.c();
        }

        private final void I(l l0, e e0, int v) {
            Integer integer0 = l0.getWidth();
            this.i.f("encoded_width", integer0);
            Integer integer1 = l0.getHeight();
            this.i.f("encoded_height", integer1);
            Integer integer2 = l0.getSize();
            this.i.f("encoded_size", integer2);
            ColorSpace colorSpace0 = l0.j();
            this.i.f("image_color_space", colorSpace0);
            if(e0 instanceof com.facebook.imagepipeline.image.d) {
                String s = String.valueOf(((com.facebook.imagepipeline.image.d)e0).D3().getConfig());
                this.i.f("bitmap_config", s);
            }
            if(e0 != null) {
                e0.k(this.i.getExtras());
            }
            this.i.f("last_scan_num", v);
        }

        protected final void J(int v) {
            this.o = v;
        }

        protected boolean K(@m l l0, int v) {
            return this.n.k(l0, v);
        }

        @Override  // com.facebook.imagepipeline.producers.u
        public void g() {
            this.B();
        }

        @Override  // com.facebook.imagepipeline.producers.u
        public void h(@y4.l Throwable throwable0) {
            L.p(throwable0, "t");
            this.C(throwable0);
        }

        @Override  // com.facebook.imagepipeline.producers.c
        public void i(Object object0, int v) {
            this.H(((l)object0), v);
        }

        @Override  // com.facebook.imagepipeline.producers.u
        protected void j(float f) {
            super.j(f * 0.99f);
        }

        // 检测为 Lambda 实现
        private static final void s(com.facebook.imagepipeline.producers.q.d q$d0, q q0, int v, l l0, int v1) [...]

        private final void w(l l0, int v, int v1) {
            e e0;
            r r0;
            long v3;
            int v2 = v;
            if(l0.n() != X0.b.b && com.facebook.imagepipeline.producers.c.f(v)) {
                return;
            }
            if(!this.m && l.R(l0)) {
                if(L.g(l0.n(), X0.b.d) && q.m.b(l0, this.l)) {
                    IllegalStateException illegalStateException0 = new IllegalStateException("Image is too big to attempt decoding: w = " + l0.getWidth() + ", h = " + l0.getHeight() + ", pixel config = " + this.l.h + ", max bitmap size = 104857600");
                    this.k.k(this.i, "DecodeProducer", illegalStateException0, null);
                    this.C(illegalStateException0);
                    return;
                }
                X0.c c0 = l0.n();
                L.o(c0, "getImageFormat(...)");
                String s = c0.f();
                String s1 = s == null ? "unknown" : s;
                String s2 = l0.getWidth() + "x" + l0.getHeight();
                String s3 = String.valueOf(l0.q());
                boolean z = com.facebook.imagepipeline.producers.c.e(v);
                boolean z1 = z && !com.facebook.imagepipeline.producers.c.n(v2, 8);
                boolean z2 = com.facebook.imagepipeline.producers.c.n(v2, 4);
                com.facebook.imagepipeline.common.g g0 = this.i.b().v();
                String s4 = g0 == null ? "unknown" : g0.a + "x" + g0.b;
                try {
                    v3 = this.n.f();
                    String s5 = this.i.b().z().toString();
                    L.o(s5, "toString(...)");
                    int v4 = z1 || z2 ? l0.getSize() : this.y(l0);
                    r0 = z1 || z2 ? com.facebook.imagepipeline.image.q.d : this.A();
                    this.k.b(this.i, "DecodeProducer");
                    try {
                        try {
                            L.m(r0);
                            e0 = this.E(l0, v4, r0);
                            goto label_41;
                        }
                        catch(com.facebook.imagepipeline.decoder.a a0) {
                            l l1 = a0.a();
                            Object[] arr_object = {a0.getMessage(), s5, l1.k(10), l1.getSize()};
                            x0.a.q0(this.j, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", arr_object);
                            throw a0;
                        }
                    }
                    catch(Exception exception0) {
                    }
                    L.m(r0);
                    Map map0 = this.x(null, v3, r0, z, s1, s2, s4, s3);
                    this.k.k(this.i, "DecodeProducer", exception0, map0);
                    this.C(exception0);
                }
                catch(Throwable throwable0) {
                    l.c(l0);
                    throw throwable0;
                }
                l.c(l0);
                return;
            label_41:
                if(l0.q() != 1) {
                    v2 |= 16;
                }
                try {
                    Map map1 = this.x(e0, v3, r0, z, s1, s2, s4, s3);
                    this.k.j(this.i, "DecodeProducer", map1);
                    this.I(l0, e0, v1);
                    this.D(e0, v2);
                }
                catch(Throwable throwable0) {
                    l.c(l0);
                    throw throwable0;
                }
                l.c(l0);
            }
        }

        private final Map x(e e0, long v, r r0, boolean z, String s, String s1, String s2, String s3) {
            String s4 = null;
            if(!this.k.f(this.i, "DecodeProducer")) {
                return null;
            }
            String s5 = String.valueOf(v);
            String s6 = String.valueOf(r0.b());
            String s7 = String.valueOf(z);
            if(e0 != null) {
                Map map0 = e0.getExtras();
                if(map0 != null) {
                    Object object0 = map0.get("non_fatal_decode_error");
                    if(object0 != null) {
                        s4 = object0.toString();
                    }
                }
            }
            if(e0 instanceof com.facebook.imagepipeline.image.g) {
                Bitmap bitmap0 = ((com.facebook.imagepipeline.image.g)e0).D3();
                L.o(bitmap0, "getUnderlyingBitmap(...)");
                int v1 = bitmap0.getWidth();
                int v2 = bitmap0.getHeight();
                HashMap hashMap0 = new HashMap(8);
                hashMap0.put("bitmapSize", v1 + "x" + v2);
                hashMap0.put("queueTime", s5);
                hashMap0.put("hasGoodQuality", s6);
                hashMap0.put("isFinal", s7);
                hashMap0.put("encodedImageSize", s1);
                hashMap0.put("imageFormat", s);
                hashMap0.put("requestedImageSize", s2);
                hashMap0.put("sampleSize", s3);
                int v3 = bitmap0.getByteCount();
                hashMap0.put("byteCount", v3);
                if(s4 != null) {
                    hashMap0.put("non_fatal_decode_error", s4);
                }
                return j.a(hashMap0);
            }
            HashMap hashMap1 = new HashMap(7);
            hashMap1.put("queueTime", s5);
            hashMap1.put("hasGoodQuality", s6);
            hashMap1.put("isFinal", s7);
            hashMap1.put("encodedImageSize", s1);
            hashMap1.put("imageFormat", s);
            hashMap1.put("requestedImageSize", s2);
            hashMap1.put("sampleSize", s3);
            if(s4 != null) {
                hashMap1.put("non_fatal_decode_error", s4);
            }
            return j.a(hashMap1);
        }

        protected abstract int y(@y4.l l arg1);

        protected final int z() {
            return this.o;
        }
    }

    @y4.l
    private final com.facebook.common.memory.a a;
    @y4.l
    private final Executor b;
    @y4.l
    private final com.facebook.imagepipeline.decoder.c c;
    @y4.l
    private final f d;
    @y4.l
    private final com.facebook.imagepipeline.core.n e;
    private final boolean f;
    private final boolean g;
    @y4.l
    private final h0 h;
    private final int i;
    @y4.l
    private final com.facebook.imagepipeline.core.a j;
    @m
    private final Runnable k;
    @y4.l
    private final com.facebook.common.internal.q l;
    @y4.l
    public static final a m = null;
    @y4.l
    public static final String n = "DecodeProducer";
    private static final int o = 10;
    private static final int p = 0x6400000;
    @y4.l
    public static final String q = "bitmapSize";
    @y4.l
    public static final String r = "hasGoodQuality";
    @y4.l
    public static final String s = "isFinal";
    @y4.l
    public static final String t = "imageFormat";
    @y4.l
    public static final String u = "byteCount";
    @y4.l
    public static final String v = "encodedImageSize";
    @y4.l
    public static final String w = "requestedImageSize";
    @y4.l
    public static final String x = "sampleSize";
    @y4.l
    public static final String y = "non_fatal_decode_error";

    static {
        q.m = new a(null);
    }

    public q(@y4.l com.facebook.common.memory.a a0, @y4.l Executor executor0, @y4.l com.facebook.imagepipeline.decoder.c c0, @y4.l f f0, @y4.l com.facebook.imagepipeline.core.n n0, boolean z, boolean z1, @y4.l h0 h00, int v, @y4.l com.facebook.imagepipeline.core.a a1, @m Runnable runnable0, @y4.l com.facebook.common.internal.q q0) {
        L.p(a0, "byteArrayPool");
        L.p(executor0, "executor");
        L.p(c0, "imageDecoder");
        L.p(f0, "progressiveJpegConfig");
        L.p(n0, "downsampleMode");
        L.p(h00, "inputProducer");
        L.p(a1, "closeableReferenceFactory");
        L.p(q0, "recoverFromDecoderOOM");
        super();
        this.a = a0;
        this.b = executor0;
        this.c = c0;
        this.d = f0;
        this.e = n0;
        this.f = z;
        this.g = z1;
        this.h = h00;
        this.i = v;
        this.j = a1;
        this.k = runnable0;
        this.l = q0;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(@y4.l n n0, @y4.l j0 j00) {
        L.p(n0, "consumer");
        L.p(j00, "context");
        if(!com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.request.d d0 = j00.b();
            com.facebook.imagepipeline.producers.q.c q$c0 = h.q(d0.z()) || com.facebook.imagepipeline.request.e.v(d0.z()) ? new com.facebook.imagepipeline.producers.q.c(this, n0, j00, new g(this.a), this.d, this.g, this.i) : new b(this, n0, j00, this.g, this.i);
            this.h.a(q$c0, j00);
            return;
        }
        com.facebook.imagepipeline.systrace.b.a("DecodeProducer#produceResults");
        try {
            com.facebook.imagepipeline.request.d d1 = j00.b();
            com.facebook.imagepipeline.producers.q.c q$c1 = h.q(d1.z()) || com.facebook.imagepipeline.request.e.v(d1.z()) ? new com.facebook.imagepipeline.producers.q.c(this, n0, j00, new g(this.a), this.d, this.g, this.i) : new b(this, n0, j00, this.g, this.i);
            this.h.a(q$c1, j00);
        }
        finally {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    @y4.l
    public final com.facebook.common.memory.a c() {
        return this.a;
    }

    @y4.l
    public final com.facebook.imagepipeline.core.a d() {
        return this.j;
    }

    public final boolean e() {
        return this.g;
    }

    public final boolean f() {
        return this.f;
    }

    @y4.l
    public final com.facebook.imagepipeline.core.n g() {
        return this.e;
    }

    @y4.l
    public final Executor h() {
        return this.b;
    }

    @y4.l
    public final com.facebook.imagepipeline.decoder.c i() {
        return this.c;
    }

    @y4.l
    public final h0 j() {
        return this.h;
    }

    public final int k() {
        return this.i;
    }

    @y4.l
    public final f l() {
        return this.d;
    }

    @m
    public final Runnable m() {
        return this.k;
    }

    @y4.l
    public final com.facebook.common.internal.q n() {
        return this.l;
    }
}

