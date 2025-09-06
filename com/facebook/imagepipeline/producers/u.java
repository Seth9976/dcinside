package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.request.d;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import k1.n.a;
import k1.n;
import o3.h;

@RequiresApi(29)
@n(a.a)
public class U implements h0 {
    private final Executor a;
    private final ContentResolver b;
    public static final String c = "LocalThumbnailBitmapSdk29Producer";
    @VisibleForTesting
    static final String d = "createdThumbnail";

    public U(Executor executor0, ContentResolver contentResolver0) {
        this.a = executor0;
        this.b = contentResolver0;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        class com.facebook.imagepipeline.producers.U.a extends r0 {
            final l0 k;
            final j0 l;
            final d m;
            final CancellationSignal n;
            final U o;

            com.facebook.imagepipeline.producers.U.a(U u0, com.facebook.imagepipeline.producers.n n0, l0 l00, j0 j00, String s, l0 l01, j0 j01, d d0, CancellationSignal cancellationSignal0) {
            }

            @Override  // com.facebook.imagepipeline.producers.r0
            protected void b(Object object0) {
            }

            @Override  // com.facebook.common.executors.i
            protected Object c() throws Exception {
            }

            @Override  // com.facebook.imagepipeline.producers.r0
            protected void d() {
            }

            @Override  // com.facebook.imagepipeline.producers.r0
            protected void e(Exception exception0) {
            }

            @Override  // com.facebook.imagepipeline.producers.r0
            protected void f(Object object0) {
            }

            @Override  // com.facebook.imagepipeline.producers.r0
            protected Map i(Object object0) {
            }

            protected void j(com.facebook.common.references.a a0) {
            }

            protected Map k(com.facebook.common.references.a a0) {
            }

            protected com.facebook.common.references.a l() throws IOException {
            }

            protected void m(com.facebook.common.references.a a0) {
            }
        }


        class b extends f {
            final r0 a;
            final U b;

            b(U u0, r0 r00) {
            }

            @Override  // com.facebook.imagepipeline.producers.f
            public void b() {
            }
        }

        l0 l00 = j00.i();
        d d0 = j00.b();
        j00.o("local", "thumbnail_bitmap");
        com.facebook.imagepipeline.producers.U.a u$a0 = new com.facebook.imagepipeline.producers.U.a(this, n0, l00, j00, "LocalThumbnailBitmapSdk29Producer", l00, j00, d0, new CancellationSignal());
        j00.n(new b(this, u$a0));
        this.a.execute(u$a0);
    }

    static ContentResolver c(U u0) {
        return u0.b;
    }

    static String d(U u0, d d0) {
        return u0.e(d0);
    }

    @h
    private String e(d d0) {
        return com.facebook.common.util.h.e(this.b, d0.z());
    }
}

