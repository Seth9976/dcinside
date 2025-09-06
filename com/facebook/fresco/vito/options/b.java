package com.facebook.fresco.vito.options;

import android.graphics.Bitmap.Config;
import android.graphics.PointF;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.common.h;
import com.facebook.imagepipeline.core.n;
import com.facebook.imagepipeline.request.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

public class b extends c {
    @s0({"SMAP\nDecodedImageOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecodedImageOptions.kt\ncom/facebook/fresco/vito/options/DecodedImageOptions$Builder\n*L\n1#1,205:1\n200#1,2:206\n200#1,2:208\n200#1,2:210\n200#1,2:212\n200#1,2:214\n200#1,2:216\n200#1,2:218\n200#1,2:220\n200#1,2:222\n200#1,2:224\n200#1,2:226\n200#1,2:228\n200#1,2:230\n*S KotlinDebug\n*F\n+ 1 DecodedImageOptions.kt\ncom/facebook/fresco/vito/options/DecodedImageOptions$Builder\n*L\n134#1:206,2\n142#1:208,2\n146#1:210,2\n150#1:212,2\n154#1:214,2\n164#1:216,2\n168#1:218,2\n170#1:220,2\n175#1:222,2\n183#1:224,2\n187#1:226,2\n191#1:228,2\n193#1:230,2\n*E\n"})
    public static class a extends com.facebook.fresco.vito.options.c.a {
        @m
        private g d;
        @m
        private n e;
        @m
        private h f;
        @m
        private f g;
        @m
        private d h;
        @m
        private com.facebook.fresco.vito.options.g i;
        @m
        private com.facebook.fresco.vito.options.a j;
        @l
        private com.facebook.drawee.drawable.t.d k;
        @m
        private PointF l;
        private boolean m;
        private boolean n;
        @m
        private Bitmap.Config o;
        @m
        private Boolean p;

        public a() {
            L.o(com.facebook.drawee.drawable.t.d.i, "CENTER_CROP");
            this.k = com.facebook.drawee.drawable.t.d.i;
        }

        public a(@l b b0) {
            L.p(b0, "decodedImageOptions");
            super(b0);
            L.o(com.facebook.drawee.drawable.t.d.i, "CENTER_CROP");
            this.k = com.facebook.drawee.drawable.t.d.i;
            this.d = b0.q();
            this.e = b0.l();
            this.f = b0.r();
            this.g = b0.p();
            this.h = b0.m();
            this.i = b0.s();
            this.j = b0.k();
            this.k = b0.i();
            this.l = b0.h();
            this.m = b0.f();
            this.n = b0.n();
            this.o = b0.j();
            this.p = b0.t();
        }

        public a(@l com.facebook.fresco.vito.options.d d0) {
            L.p(d0, "defaultOptions");
            this(d0);
        }

        @m
        public final Boolean A() {
            return this.p;
        }

        @m
        public final g B() {
            return this.d;
        }

        @m
        public final h C() {
            return this.f;
        }

        @m
        public final com.facebook.fresco.vito.options.g D() {
            return this.i;
        }

        @l
        public final a E(@m d d0) {
            this.h = d0;
            return (a)this.g();
        }

        @l
        public final a F(boolean z) {
            this.n = z;
            return (a)this.g();
        }

        @l
        public final a G(boolean z) {
            this.m = z;
            return (a)this.g();
        }

        private final a H(Function1 function10) {
            function10.invoke(this);
            return (a)this.g();
        }

        @l
        public final a I(@m f f0) {
            this.g = f0;
            return (a)this.g();
        }

        @l
        public final a J(@m Boolean boolean0) {
            this.p = boolean0;
            return (a)this.g();
        }

        @l
        public final a K(@m g g0) {
            this.d = g0;
            return (a)this.g();
        }

        @l
        public final a L(@m h h0) {
            this.f = h0;
            return (a)this.g();
        }

        @l
        public final a M(@m com.facebook.fresco.vito.options.g g0) {
            this.i = g0;
            return (a)this.g();
        }

        @l
        public final a N(@m com.facebook.drawee.drawable.t.d t$d0) {
            if(t$d0 == null) {
                t$d0 = com.facebook.fresco.vito.options.d.P.b().i();
            }
            this.k = t$d0;
            return (a)this.g();
        }

        public final void O(@m PointF pointF0) {
            this.l = pointF0;
        }

        public final void P(@l com.facebook.drawee.drawable.t.d t$d0) {
            L.p(t$d0, "<set-?>");
            this.k = t$d0;
        }

        public final void Q(@m Bitmap.Config bitmap$Config0) {
            this.o = bitmap$Config0;
        }

        public final void R(@m com.facebook.fresco.vito.options.a a0) {
            this.j = a0;
        }

        public final void S(@m n n0) {
            this.e = n0;
        }

        public final void T(@m d d0) {
            this.h = d0;
        }

        public final void U(boolean z) {
            this.n = z;
        }

        public final void V(boolean z) {
            this.m = z;
        }

        public final void W(@m f f0) {
            this.g = f0;
        }

        public final void X(@m Boolean boolean0) {
            this.p = boolean0;
        }

        public final void Y(@m g g0) {
            this.d = g0;
        }

        public final void Z(@m h h0) {
            this.f = h0;
        }

        @Override  // com.facebook.fresco.vito.options.c$a
        public c a() {
            return this.o();
        }

        public final void a0(@m com.facebook.fresco.vito.options.g g0) {
            this.i = g0;
        }

        @l
        public final a m(@m Bitmap.Config bitmap$Config0) {
            this.o = bitmap$Config0;
            return (a)this.g();
        }

        @l
        public final a n(@m com.facebook.fresco.vito.options.a a0) {
            this.j = a0;
            return (a)this.g();
        }

        @l
        public b o() {
            return new b(this);
        }

        @l
        public final a p(@m n n0) {
            this.e = n0;
            return (a)this.g();
        }

        @l
        public final a q(@m PointF pointF0) {
            this.l = pointF0;
            return (a)this.g();
        }

        @m
        public final PointF r() {
            return this.l;
        }

        @l
        public final com.facebook.drawee.drawable.t.d s() {
            return this.k;
        }

        @m
        public final Bitmap.Config t() {
            return this.o;
        }

        @m
        public final com.facebook.fresco.vito.options.a u() {
            return this.j;
        }

        @m
        public final n v() {
            return this.e;
        }

        @m
        public final d w() {
            return this.h;
        }

        public final boolean x() {
            return this.n;
        }

        public final boolean y() {
            return this.m;
        }

        @m
        public final f z() {
            return this.g;
        }
    }

    @m
    private final g d;
    @m
    private final n e;
    @m
    private final h f;
    @m
    private final f g;
    @m
    private final d h;
    @m
    private final com.facebook.fresco.vito.options.g i;
    @m
    private final com.facebook.fresco.vito.options.a j;
    @l
    private final com.facebook.drawee.drawable.t.d k;
    @m
    private final PointF l;
    private final boolean m;
    private final boolean n;
    @m
    private final Bitmap.Config o;
    @m
    private final Boolean p;

    public b(@l a b$a0) {
        L.p(b$a0, "builder");
        super(b$a0);
        this.d = b$a0.B();
        this.e = b$a0.v();
        this.f = b$a0.C();
        this.g = b$a0.z();
        this.h = b$a0.w();
        this.i = b$a0.D();
        this.j = b$a0.u();
        this.k = b$a0.s();
        this.l = b$a0.r();
        this.m = b$a0.y();
        this.n = b$a0.x();
        this.o = b$a0.t();
        this.p = b$a0.A();
    }

    @Override  // com.facebook.fresco.vito.options.c
    @l
    protected com.facebook.common.internal.l.a e() {
        com.facebook.common.internal.l.a l$a0 = super.e().f("resizeOptions", this.d).f("downsampleOverride", this.e).f("rotationOptions", this.f).f("postprocessor", this.g).f("imageDecodeOptions", this.h).f("roundingOptions", this.i).f("borderOptions", this.j).f("actualImageScaleType", this.k).f("actualImageFocusPoint", this.l).g("localThumbnailPreviewsEnabled", this.m).g("loadThumbnailOnly", this.n).f("bitmapConfig", this.o).f("progressiveRenderingEnabled", this.p);
        L.o(l$a0, "add(...)");
        return l$a0;
    }

    @Override  // com.facebook.fresco.vito.options.c
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 == null || !L.g(this.getClass(), object0.getClass()) ? false : this.g(((b)object0));
    }

    public final boolean f() {
        return this.m;
    }

    // 去混淆评级： 中等(50)
    protected final boolean g(@l b b0) {
        L.p(b0, "other");
        return !com.facebook.common.internal.l.a(this.d, b0.d) || !com.facebook.common.internal.l.a(this.e, b0.e) || !com.facebook.common.internal.l.a(this.f, b0.f) || !com.facebook.common.internal.l.a(this.g, b0.g) || !com.facebook.common.internal.l.a(this.h, b0.h) || !com.facebook.common.internal.l.a(this.i, b0.i) || !com.facebook.common.internal.l.a(this.j, b0.j) || !com.facebook.common.internal.l.a(this.k, b0.k) || !com.facebook.common.internal.l.a(this.l, b0.l) || this.m != b0.m || this.n != b0.n || this.p != b0.p || !com.facebook.common.internal.l.a(this.o, b0.o) ? false : this.a(b0);
    }

    @m
    public final PointF h() {
        return this.l;
    }

    @Override  // com.facebook.fresco.vito.options.c
    public int hashCode() {
        int v = 0;
        int v1 = (((((((((((super.hashCode() * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F + (this.h == null ? 0 : this.h.hashCode())) * 0x1F + (this.i == null ? 0 : this.i.hashCode())) * 0x1F + (this.j == null ? 0 : this.j.hashCode())) * 0x1F + this.k.hashCode()) * 0x1F + (this.l == null ? 0 : this.l.hashCode())) * 0x1F + this.m) * 0x1F + this.n) * 0x1F;
        int v2 = this.o == null ? 0 : this.o.hashCode();
        Boolean boolean0 = this.p;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return (v1 + v2) * 0x1F + v;
    }

    @l
    public final com.facebook.drawee.drawable.t.d i() {
        return this.k;
    }

    @m
    public final Bitmap.Config j() {
        return this.o;
    }

    @m
    public final com.facebook.fresco.vito.options.a k() {
        return this.j;
    }

    @m
    public final n l() {
        return this.e;
    }

    @m
    public final d m() {
        return this.h;
    }

    public final boolean n() {
        return this.n;
    }

    public final boolean o() {
        return this.m;
    }

    @m
    public final f p() {
        return this.g;
    }

    @m
    public final g q() {
        return this.d;
    }

    @m
    public final h r() {
        return this.f;
    }

    @m
    public final com.facebook.fresco.vito.options.g s() {
        return this.i;
    }

    @m
    public final Boolean t() {
        return this.p;
    }

    @Override  // com.facebook.fresco.vito.options.c
    @l
    public String toString() {
        return "DecodedImageOptions{" + this.e() + "}";
    }
}

