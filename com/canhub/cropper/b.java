package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
import androidx.compose.foundation.c;
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
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class b implements O {
    public static final class a {
        @l
        private final Uri a;
        @m
        private final Bitmap b;
        private final int c;
        private final int d;
        private final boolean e;
        private final boolean f;
        @m
        private final Exception g;

        public a(@l Uri uri0, @m Bitmap bitmap0, int v, int v1, boolean z, boolean z1, @m Exception exception0) {
            L.p(uri0, "uri");
            super();
            this.a = uri0;
            this.b = bitmap0;
            this.c = v;
            this.d = v1;
            this.e = z;
            this.f = z1;
            this.g = exception0;
        }

        @l
        public final Uri a() {
            return this.a;
        }

        @m
        public final Bitmap b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        public final boolean e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            if(!L.g(this.a, ((a)object0).a)) {
                return false;
            }
            if(!L.g(this.b, ((a)object0).b)) {
                return false;
            }
            if(this.c != ((a)object0).c) {
                return false;
            }
            if(this.d != ((a)object0).d) {
                return false;
            }
            if(this.e != ((a)object0).e) {
                return false;
            }
            return this.f == ((a)object0).f ? L.g(this.g, ((a)object0).g) : false;
        }

        public final boolean f() {
            return this.f;
        }

        @m
        public final Exception g() {
            return this.g;
        }

        @l
        public final a h(@l Uri uri0, @m Bitmap bitmap0, int v, int v1, boolean z, boolean z1, @m Exception exception0) {
            L.p(uri0, "uri");
            return new a(uri0, bitmap0, v, v1, z, z1, exception0);
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = (((((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + c.a(this.e)) * 0x1F + c.a(this.f)) * 0x1F;
            Exception exception0 = this.g;
            if(exception0 != null) {
                v = exception0.hashCode();
            }
            return v1 + v;
        }

        public static a i(a b$a0, Uri uri0, Bitmap bitmap0, int v, int v1, boolean z, boolean z1, Exception exception0, int v2, Object object0) {
            if((v2 & 1) != 0) {
                uri0 = b$a0.a;
            }
            if((v2 & 2) != 0) {
                bitmap0 = b$a0.b;
            }
            if((v2 & 4) != 0) {
                v = b$a0.c;
            }
            if((v2 & 8) != 0) {
                v1 = b$a0.d;
            }
            if((v2 & 16) != 0) {
                z = b$a0.e;
            }
            if((v2 & 0x20) != 0) {
                z1 = b$a0.f;
            }
            if((v2 & 0x40) != 0) {
                exception0 = b$a0.g;
            }
            return b$a0.h(uri0, bitmap0, v, v1, z, z1, exception0);
        }

        @m
        public final Bitmap j() {
            return this.b;
        }

        public final int k() {
            return this.d;
        }

        @m
        public final Exception l() {
            return this.g;
        }

        public final boolean m() {
            return this.e;
        }

        public final boolean n() {
            return this.f;
        }

        public final int o() {
            return this.c;
        }

        @l
        public final Uri p() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            return "Result(uri=" + this.a + ", bitmap=" + this.b + ", loadSampleSize=" + this.c + ", degreesRotated=" + this.d + ", flipHorizontally=" + this.e + ", flipVertically=" + this.f + ", error=" + this.g + ")";
        }
    }

    @l
    private final Context a;
    @l
    private final Uri b;
    private final int c;
    private final int d;
    @l
    private final WeakReference e;
    @l
    private I0 f;

    public b(@l Context context0, @l CropImageView cropImageView0, @l Uri uri0) {
        L.p(context0, "context");
        L.p(cropImageView0, "cropImageView");
        L.p(uri0, "uri");
        super();
        this.a = context0;
        this.b = uri0;
        this.e = new WeakReference(cropImageView0);
        this.f = O0.c(null, 1, null);
        DisplayMetrics displayMetrics0 = cropImageView0.getResources().getDisplayMetrics();
        double f = displayMetrics0.density > 1.0f ? 1.0 / ((double)displayMetrics0.density) : 1.0;
        this.c = (int)(((double)displayMetrics0.widthPixels) * f);
        this.d = (int)(((double)displayMetrics0.heightPixels) * f);
    }

    public final void g() {
        kotlinx.coroutines.I0.a.b(this.f, null, 1, null);
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return h0.e().plus(this.f);
    }

    @l
    public final Uri h() {
        return this.b;
    }

    private final Object i(a b$a0, d d0) {
        @f(c = "com.canhub.cropper.BitmapLoadingWorkerJob$onPostExecute$2", f = "BitmapLoadingWorkerJob.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.canhub.cropper.b.b extends o implements A3.o {
            int k;
            private Object l;
            final b m;
            final a n;

            com.canhub.cropper.b.b(b b0, a b$a0, d d0) {
                this.m = b0;
                this.n = b$a0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new com.canhub.cropper.b.b(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            public final Object invoke(O o0, d d0) {
                return ((com.canhub.cropper.b.b)this.create(o0, d0)).invokeSuspend(S0.a);
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
                    CropImageView cropImageView0 = (CropImageView)this.m.e.get();
                    if(cropImageView0 != null) {
                        l0$a0.a = true;
                        cropImageView0.C(this.n);
                    }
                }
                if(!l0$a0.a && this.n.j() != null) {
                    this.n.j().recycle();
                }
                return S0.a;
            }
        }

        Object object0 = i.h(h0.e(), new com.canhub.cropper.b.b(this, b$a0, null), d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    public final void j() {
        @f(c = "com.canhub.cropper.BitmapLoadingWorkerJob$start$1", f = "BitmapLoadingWorkerJob.kt", i = {}, l = {52, 66}, m = "invokeSuspend", n = {}, s = {})
        static final class com.canhub.cropper.b.c extends o implements A3.o {
            int k;
            private Object l;
            final b m;

            com.canhub.cropper.b.c(b b0, d d0) {
                this.m = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new com.canhub.cropper.b.c(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            public final Object invoke(O o0, d d0) {
                return ((com.canhub.cropper.b.c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        try {
                            if(P.k(o0)) {
                                com.canhub.cropper.d d0 = com.canhub.cropper.d.a;
                                com.canhub.cropper.d.a d$a0 = d0.l(this.m.a, this.m.h(), this.m.c, this.m.d);
                                if(P.k(o0)) {
                                    com.canhub.cropper.d.b d$b0 = d0.E(d$a0.a(), this.m.a, this.m.h());
                                    a b$a0 = new a(this.m.h(), d$b0.a(), d$a0.b(), d$b0.b(), d$b0.c(), d$b0.d(), null);
                                    this.k = 1;
                                    if(this.m.i(b$a0, this) == object1) {
                                        return object1;
                                    }
                                }
                            }
                        }
                        catch(Exception exception0) {
                        label_19:
                            a b$a1 = new a(this.m.h(), null, 0, 0, false, false, exception0);
                            this.k = 2;
                            if(this.m.i(b$a1, this) == object1) {
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
                            goto label_19;
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

        this.f = k.f(this, h0.a(), null, new com.canhub.cropper.b.c(this, null), 2, null);
    }
}

