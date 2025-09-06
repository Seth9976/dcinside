package com.facebook.imagepipeline.request;

import android.net.Uri;
import android.os.Build.VERSION;
import com.facebook.common.internal.h;
import com.facebook.common.internal.l;
import com.facebook.imagepipeline.common.f;
import com.facebook.imagepipeline.common.g;
import java.io.File;
import java.util.HashMap;
import k1.n.a;
import k1.n;
import p3.b;

@n(a.a)
@b
public class d {
    class com.facebook.imagepipeline.request.d.a implements h {
        com.facebook.imagepipeline.request.d.a() {
            super();
        }

        @o3.h
        public Uri a(@o3.h d d0) {
            return d0 == null ? null : d0.z();
        }

        @Override  // com.facebook.common.internal.h
        @o3.h
        public Object apply(@o3.h Object object0) {
            return this.a(((d)object0));
        }
    }

    public static enum com.facebook.imagepipeline.request.d.b {
        SMALL,
        DEFAULT,
        DYNAMIC;

    }

    public @interface c {
        public static final int s0 = 1;
        public static final int t0 = 2;
        public static final int u0 = 4;
        public static final int v0 = 8;
        public static final int w0 = 16;
        public static final int x0 = 0x20;

    }

    public static enum com.facebook.imagepipeline.request.d.d {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);

        private int a;

        private com.facebook.imagepipeline.request.d.d(int v1) {
            this.a = v1;
        }

        public static com.facebook.imagepipeline.request.d.d a(com.facebook.imagepipeline.request.d.d d$d0, com.facebook.imagepipeline.request.d.d d$d1) {
            return d$d0.b() > d$d1.b() ? d$d0 : d$d1;
        }

        public int b() {
            return this.a;
        }
    }

    public static final h A;
    private int a;
    private final com.facebook.imagepipeline.request.d.b b;
    private final Uri c;
    private final int d;
    @o3.h
    private File e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final com.facebook.imagepipeline.common.d i;
    @o3.h
    private final g j;
    private final com.facebook.imagepipeline.common.h k;
    @o3.h
    private final com.facebook.imagepipeline.common.b l;
    private final f m;
    private final com.facebook.imagepipeline.request.d.d n;
    protected int o;
    private final boolean p;
    private final boolean q;
    @o3.h
    private final Boolean r;
    @o3.h
    private final com.facebook.imagepipeline.request.f s;
    @o3.h
    private final f1.f t;
    @o3.h
    private final Boolean u;
    @o3.h
    private final com.facebook.imagepipeline.core.n v;
    @o3.h
    private final String w;
    private final int x;
    private static boolean y;
    private static boolean z;

    static {
        d.A = new com.facebook.imagepipeline.request.d.a();
    }

    protected d(e e0) {
        this.b = e0.g();
        Uri uri0 = e0.u();
        this.c = uri0;
        this.d = d.B(uri0);
        this.f = e0.z();
        this.g = e0.x();
        this.h = e0.m();
        this.i = e0.l();
        this.j = e0.r();
        this.k = e0.t() == null ? com.facebook.imagepipeline.common.h.d() : e0.t();
        this.l = e0.f();
        this.m = e0.q();
        this.n = e0.n();
        boolean z = e0.w();
        this.p = z;
        this.o = z ? e0.h() : e0.h() | 0x30;
        this.q = e0.y();
        this.r = e0.W();
        this.s = e0.o();
        this.t = e0.p();
        this.u = e0.s();
        this.v = e0.k();
        this.x = e0.i();
        this.w = e0.j();
    }

    public int A() {
        return this.d;
    }

    private static int B(@o3.h Uri uri0) {
        if(uri0 == null) {
            return -1;
        }
        if(com.facebook.common.util.h.q(uri0)) {
            return 0;
        }
        if(uri0.getPath() != null && com.facebook.common.util.h.o(uri0)) {
            return y0.a.f(y0.a.b(uri0.getPath())) ? 2 : 3;
        }
        if(com.facebook.common.util.h.n(uri0)) {
            return 4;
        }
        if(com.facebook.common.util.h.k(uri0)) {
            return 5;
        }
        if(com.facebook.common.util.h.p(uri0)) {
            return 6;
        }
        if(com.facebook.common.util.h.j(uri0)) {
            return 7;
        }
        return com.facebook.common.util.h.r(uri0) ? 8 : -1;
    }

    public boolean C(int v) {
        return (v & this.g()) == 0;
    }

    public boolean D() {
        return this.p;
    }

    public boolean E() {
        return this.q;
    }

    public void F(HashMap hashMap0) {
        com.facebook.cache.common.e e0 = this.s == null ? null : this.s.a();
        hashMap0.put("ImageRequest", this.hashCode());
        hashMap0.put("ImageRequest.mSourceUri", d.k(this.c));
        hashMap0.put("ImageRequest.mLocalThumbnailPreviewsEnabled", d.k(Boolean.valueOf(this.g)));
        hashMap0.put("ImageRequest.mBytesRange", d.k(this.l));
        hashMap0.put("ImageRequest.mRequestPriority", d.k(this.m));
        hashMap0.put("ImageRequest.mLowestPermittedRequestLevel", d.k(this.n));
        hashMap0.put("ImageRequest.mCachesDisabled", d.k(this.o));
        hashMap0.put("ImageRequest.mIsDiskCacheEnabled", d.k(Boolean.valueOf(this.p)));
        hashMap0.put("ImageRequest.mIsMemoryCacheEnabled", d.k(Boolean.valueOf(this.q)));
        hashMap0.put("ImageRequest.mImageDecodeOptions", d.k(this.i));
        hashMap0.put("ImageRequest.mDecodePrefetches", d.k(this.r));
        hashMap0.put("ImageRequest.mSoumResizeOptionsrceUri", d.k(this.j));
        hashMap0.put("ImageRequest.mRotationOptions", d.k(this.k));
        hashMap0.put("ImageRequest.postprocessorCacheKey", d.k(e0));
        hashMap0.put("ImageRequest.mResizingAllowedOverride", d.k(this.u));
        hashMap0.put("ImageRequest.mDownsampleOverride", d.k(this.v));
        hashMap0.put("ImageRequest.mDelayMs", d.k(this.x));
        hashMap0.put("ImageRequest.mLoadThumbnailOnly", d.k(Boolean.valueOf(this.h)));
    }

    public static void G(boolean z) {
        d.z = z;
    }

    public static void H(boolean z) {
        d.y = z;
    }

    @o3.h
    public Boolean I() {
        return this.r;
    }

    @o3.h
    public static d a(@o3.h File file0) {
        return file0 == null ? null : d.b(com.facebook.common.util.h.g(file0));
    }

    @o3.h
    public static d b(@o3.h Uri uri0) {
        return uri0 == null ? null : e.B(uri0).b();
    }

    @o3.h
    public static d c(@o3.h String s) {
        return s == null || s.length() == 0 ? null : d.b(Uri.parse(s));
    }

    @Deprecated
    public boolean d() {
        return this.k.k();
    }

    @o3.h
    public com.facebook.imagepipeline.common.b e() {
        return this.l;
    }

    @Override
    public boolean equals(@o3.h Object object0) {
        if(!(object0 instanceof d)) {
            return false;
        }
        d d0 = (d)object0;
        if(d.y && (this.a != 0 && d0.a != 0 && this.a != d0.a)) {
            return false;
        }
        if(this.g != d0.g) {
            return false;
        }
        if(this.p != d0.p) {
            return false;
        }
        if(this.q != d0.q) {
            return false;
        }
        if(l.a(this.c, d0.c) && l.a(this.b, d0.b) && l.a(this.w, d0.w) && l.a(this.e, d0.e) && l.a(this.l, d0.l) && l.a(this.i, d0.i) && l.a(this.j, d0.j) && l.a(this.m, d0.m) && l.a(this.n, d0.n) && l.a(this.o, d0.o) && l.a(this.r, d0.r) && l.a(this.u, d0.u) && l.a(this.v, d0.v) && l.a(this.k, d0.k) && this.h == d0.h) {
            com.facebook.cache.common.e e0 = null;
            com.facebook.cache.common.e e1 = this.s == null ? null : this.s.a();
            com.facebook.imagepipeline.request.f f0 = d0.s;
            if(f0 != null) {
                e0 = f0.a();
            }
            return l.a(e1, e0) ? this.x == d0.x : false;
        }
        return false;
    }

    public com.facebook.imagepipeline.request.d.b f() {
        return this.b;
    }

    public int g() {
        return this.o;
    }

    public int h() {
        return this.x;
    }

    @Override
    public int hashCode() {
        boolean z = d.z;
        int v = z ? this.a : 0;
        if(v == 0) {
            com.facebook.cache.common.e e0 = this.s == null ? null : this.s.a();
            v = l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(l1.a.a(0, this.b), this.c), Boolean.valueOf(this.g)), this.l), this.m), this.n), this.o), Boolean.valueOf(this.p)), Boolean.valueOf(this.q)), this.i), this.r), this.j), this.k), e0), this.u), this.v), this.x), Boolean.valueOf(this.h));
            if(z) {
                this.a = v;
            }
        }
        return v;
    }

    @o3.h
    public String i() {
        return this.w;
    }

    @o3.h
    public com.facebook.imagepipeline.core.n j() {
        return this.v;
    }

    private static int k(@o3.h Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    public com.facebook.imagepipeline.common.d l() {
        return this.i;
    }

    public boolean m() {
        return Build.VERSION.SDK_INT >= 29 && this.h;
    }

    public boolean n() {
        return this.g;
    }

    public com.facebook.imagepipeline.request.d.d o() {
        return this.n;
    }

    @o3.h
    public com.facebook.imagepipeline.request.f p() {
        return this.s;
    }

    public int q() {
        return this.j == null ? 0x800 : this.j.b;
    }

    public int r() {
        return this.j == null ? 0x800 : this.j.a;
    }

    public f s() {
        return this.m;
    }

    public boolean t() {
        return this.f;
    }

    @Override
    public String toString() {
        return l.e(this).f("uri", this.c).f("cacheChoice", this.b).f("decodeOptions", this.i).f("postprocessor", this.s).f("priority", this.m).f("resizeOptions", this.j).f("rotationOptions", this.k).f("bytesRange", this.l).f("resizingAllowedOverride", this.u).f("downsampleOverride", this.v).g("progressiveRenderingEnabled", this.f).g("localThumbnailPreviewsEnabled", this.g).g("loadThumbnailOnly", this.h).f("lowestPermittedRequestLevel", this.n).d("cachesDisabled", this.o).g("isDiskCacheEnabled", this.p).g("isMemoryCacheEnabled", this.q).f("decodePrefetches", this.r).d("delayMs", this.x).toString();
    }

    @o3.h
    public f1.f u() {
        return this.t;
    }

    @o3.h
    public g v() {
        return this.j;
    }

    @o3.h
    public Boolean w() {
        return this.u;
    }

    public com.facebook.imagepipeline.common.h x() {
        return this.k;
    }

    public File y() {
        synchronized(this) {
            if(this.e == null) {
                com.facebook.common.internal.n.i(this.c.getPath());
                this.e = new File(this.c.getPath());
            }
            return this.e;
        }
    }

    public Uri z() {
        return this.c;
    }
}

