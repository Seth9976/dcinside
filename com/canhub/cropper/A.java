package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.ref.WeakReference;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class a implements O {
    public static final class com.canhub.cropper.a.a {
        @m
        private final Bitmap a;
        @m
        private final Uri b;
        @m
        private final Exception c;
        private final int d;

        public com.canhub.cropper.a.a(@m Bitmap bitmap0, @m Uri uri0, @m Exception exception0, int v) {
            this.a = bitmap0;
            this.b = uri0;
            this.c = exception0;
            this.d = v;
        }

        @m
        public final Bitmap a() {
            return this.a;
        }

        @m
        public final Uri b() {
            return this.b;
        }

        @m
        public final Exception c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        @l
        public final com.canhub.cropper.a.a e(@m Bitmap bitmap0, @m Uri uri0, @m Exception exception0, int v) {
            return new com.canhub.cropper.a.a(bitmap0, uri0, exception0, v);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.canhub.cropper.a.a)) {
                return false;
            }
            if(!L.g(this.a, ((com.canhub.cropper.a.a)object0).a)) {
                return false;
            }
            if(!L.g(this.b, ((com.canhub.cropper.a.a)object0).b)) {
                return false;
            }
            return L.g(this.c, ((com.canhub.cropper.a.a)object0).c) ? this.d == ((com.canhub.cropper.a.a)object0).d : false;
        }

        public static com.canhub.cropper.a.a f(com.canhub.cropper.a.a a$a0, Bitmap bitmap0, Uri uri0, Exception exception0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                bitmap0 = a$a0.a;
            }
            if((v1 & 2) != 0) {
                uri0 = a$a0.b;
            }
            if((v1 & 4) != 0) {
                exception0 = a$a0.c;
            }
            if((v1 & 8) != 0) {
                v = a$a0.d;
            }
            return a$a0.e(bitmap0, uri0, exception0, v);
        }

        @m
        public final Bitmap g() {
            return this.a;
        }

        @m
        public final Exception h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            int v2 = this.b == null ? 0 : this.b.hashCode();
            Exception exception0 = this.c;
            if(exception0 != null) {
                v = exception0.hashCode();
            }
            return ((v1 * 0x1F + v2) * 0x1F + v) * 0x1F + this.d;
        }

        public final int i() {
            return this.d;
        }

        @m
        public final Uri j() {
            return this.b;
        }

        @Override
        @l
        public String toString() {
            return "Result(bitmap=" + this.a + ", uri=" + this.b + ", error=" + this.c + ", sampleSize=" + this.d + ")";
        }
    }

    @l
    private final Context a;
    @l
    private final WeakReference b;
    @m
    private final Uri c;
    @m
    private final Bitmap d;
    @l
    private final float[] e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;
    private final boolean o;
    @l
    private final k p;
    @l
    private final Bitmap.CompressFormat q;
    private final int r;
    @m
    private final Uri s;
    @l
    private I0 t;

    public a(@l Context context0, @l WeakReference weakReference0, @m Uri uri0, @m Bitmap bitmap0, @l float[] arr_f, int v, int v1, int v2, boolean z, int v3, int v4, int v5, int v6, boolean z1, boolean z2, @l k cropImageView$k0, @l Bitmap.CompressFormat bitmap$CompressFormat0, int v7, @m Uri uri1) {
        L.p(context0, "context");
        L.p(weakReference0, "cropImageViewReference");
        L.p(arr_f, "cropPoints");
        L.p(cropImageView$k0, "options");
        L.p(bitmap$CompressFormat0, "saveCompressFormat");
        super();
        this.a = context0;
        this.b = weakReference0;
        this.c = uri0;
        this.d = bitmap0;
        this.e = arr_f;
        this.f = v;
        this.g = v1;
        this.h = v2;
        this.i = z;
        this.j = v3;
        this.k = v4;
        this.l = v5;
        this.m = v6;
        this.n = z1;
        this.o = z2;
        this.p = cropImageView$k0;
        this.q = bitmap$CompressFormat0;
        this.r = v7;
        this.s = uri1;
        this.t = O0.c(null, 1, null);
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return h0.e().plus(this.t);
    }

    public final void w() {
        kotlinx.coroutines.I0.a.b(this.t, null, 1, null);
    }

    private final Object x(com.canhub.cropper.a.a a$a0, d d0) {
        @f(c = "com.canhub.cropper.BitmapCroppingWorkerJob$onPostExecute$2", f = "BitmapCroppingWorkerJob.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements A3.o {
            int k;
            private Object l;
            final a m;
            final com.canhub.cropper.a.a n;

            b(a a0, com.canhub.cropper.a.a a$a0, d d0) {
                this.m = a0;
                this.n = a$a0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new b(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            public final Object invoke(O o0, d d0) {
                return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                O o0 = (O)this.l;
                kotlin.jvm.internal.l0.a l0$a0 = new kotlin.jvm.internal.l0.a();
                if(P.k(o0)) {
                    CropImageView cropImageView0 = (CropImageView)this.m.b.get();
                    if(cropImageView0 != null) {
                        l0$a0.a = true;
                        cropImageView0.B(this.n);
                    }
                }
                if(!l0$a0.a && this.n.g() != null) {
                    this.n.g().recycle();
                }
                return S0.a;
            }
        }

        Object object0 = i.h(h0.e(), new b(this, a$a0, null), d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    public final void y() {
        @f(c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1", f = "BitmapCroppingWorkerJob.kt", i = {}, l = {76, 0x73}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements A3.o {
            int k;
            private Object l;
            final a m;

            c(a a0, d d0) {
                this.m = a0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new c(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            public final Object invoke(O o0, d d0) {
                return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                @f(c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1", f = "BitmapCroppingWorkerJob.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
                static final class com.canhub.cropper.a.c.a extends o implements A3.o {
                    int k;
                    final a l;
                    final Bitmap m;
                    final com.canhub.cropper.d.a n;

                    com.canhub.cropper.a.c.a(a a0, Bitmap bitmap0, com.canhub.cropper.d.a d$a0, d d0) {
                        this.l = a0;
                        this.m = bitmap0;
                        this.n = d$a0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final d create(Object object0, d d0) {
                        return new com.canhub.cropper.a.c.a(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    public final Object invoke(O o0, d d0) {
                        return ((com.canhub.cropper.a.c.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object object0) {
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                Uri uri0 = com.canhub.cropper.d.a.J(this.l.a, this.m, this.l.q, this.l.r, this.l.s);
                                com.canhub.cropper.a.a a$a0 = new com.canhub.cropper.a.a(this.m, uri0, null, this.n.b());
                                this.k = 1;
                                return this.l.x(a$a0, this) == object1 ? object1 : S0.a;
                            }
                            case 1: {
                                f0.n(object0);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                }

                com.canhub.cropper.d.a d$a0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        try {
                            if(P.k(o0)) {
                                boolean z = false;
                                if(this.m.c != null) {
                                    z = true;
                                    d$a0 = com.canhub.cropper.d.a.d(this.m.a, this.m.c, this.m.e, this.m.f, this.m.g, this.m.h, this.m.i, this.m.j, this.m.k, this.m.l, this.m.m, this.m.n, this.m.o);
                                }
                                else if(this.m.d != null) {
                                    z = true;
                                    d$a0 = com.canhub.cropper.d.a.g(this.m.d, this.m.e, this.m.f, this.m.i, this.m.j, this.m.k, this.m.n, this.m.o);
                                }
                                if(z) {
                                    Bitmap bitmap0 = com.canhub.cropper.d.a.G(d$a0.a(), this.m.l, this.m.m, this.m.p);
                                    kotlinx.coroutines.k.f(o0, h0.c(), null, new com.canhub.cropper.a.c.a(this.m, bitmap0, d$a0, null), 2, null);
                                    return S0.a;
                                }
                                com.canhub.cropper.a.a a$a0 = new com.canhub.cropper.a.a(null, null, null, 1);
                                this.k = 1;
                                return this.m.x(a$a0, this) == object1 ? object1 : S0.a;
                            }
                        }
                        catch(Exception exception0) {
                        label_24:
                            com.canhub.cropper.a.a a$a1 = new com.canhub.cropper.a.a(null, null, exception0, 1);
                            this.k = 2;
                            if(this.m.x(a$a1, this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
                    }
                    case 1: {
                        try {
                            f0.n(object0);
                            return S0.a;
                        }
                        catch(Exception exception0) {
                            goto label_24;
                        }
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        this.t = kotlinx.coroutines.k.f(this, h0.a(), null, new c(this, null), 2, null);
    }
}

