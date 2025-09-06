package com.facebook.imagepipeline.nativecode;

import X0.b;
import android.graphics.ColorSpace;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.f;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.transcoder.c;
import com.facebook.imagepipeline.transcoder.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import k1.n.a;
import k1.n;
import o3.h;

@f
@n(a.a)
public class NativeJpegTranscoder implements c {
    private boolean a;
    private int b;
    private boolean c;
    public static final String d = "NativeJpegTranscoder";

    public NativeJpegTranscoder(boolean z, int v, boolean z1, boolean z2) {
        this.a = z;
        this.b = v;
        this.c = z1;
        if(z2) {
            d.a();
        }
    }

    @Override  // com.facebook.imagepipeline.transcoder.c
    public String a() {
        return "NativeJpegTranscoder";
    }

    @Override  // com.facebook.imagepipeline.transcoder.c
    public boolean b(X0.c c0) {
        return c0 == b.b;
    }

    @Override  // com.facebook.imagepipeline.transcoder.c
    public com.facebook.imagepipeline.transcoder.b c(l l0, OutputStream outputStream0, @h com.facebook.imagepipeline.common.h h0, @h g g0, @h X0.c c0, @h Integer integer0, @h ColorSpace colorSpace0) throws IOException {
        InputStream inputStream0;
        if(integer0 == null) {
            integer0 = 85;
        }
        if(h0 == null) {
            h0 = com.facebook.imagepipeline.common.h.d();
        }
        int v = com.facebook.imagepipeline.transcoder.a.b(h0, g0, l0, this.b);
        try {
            int v2 = e.g(h0, g0, l0, this.a);
            int v3 = e.a(v);
            if(this.c) {
                v2 = v3;
            }
            inputStream0 = l0.o();
            Integer integer1 = l0.A0();
            if(e.h.contains(integer1)) {
                int v4 = e.e(h0, l0);
                NativeJpegTranscoder.f(((InputStream)com.facebook.common.internal.n.j(inputStream0, "Cannot transcode from null input stream!")), outputStream0, v4, v2, ((int)integer0));
            }
            else {
                int v5 = e.f(h0, l0);
                NativeJpegTranscoder.e(((InputStream)com.facebook.common.internal.n.j(inputStream0, "Cannot transcode from null input stream!")), outputStream0, v5, v2, ((int)integer0));
            }
        }
        finally {
            com.facebook.common.internal.d.b(inputStream0);
        }
        return new com.facebook.imagepipeline.transcoder.b((v == 1 ? 1 : 0));
    }

    @Override  // com.facebook.imagepipeline.transcoder.c
    public boolean d(l l0, @h com.facebook.imagepipeline.common.h h0, @h g g0) {
        if(h0 == null) {
            h0 = com.facebook.imagepipeline.common.h.d();
        }
        return e.g(h0, g0, l0, this.a) < 8;
    }

    @VisibleForTesting
    public static void e(InputStream inputStream0, OutputStream outputStream0, int v, int v1, int v2) throws IOException {
        d.a();
        boolean z = false;
        com.facebook.common.internal.n.d(Boolean.valueOf(v1 >= 1));
        com.facebook.common.internal.n.d(Boolean.valueOf(v1 <= 16));
        com.facebook.common.internal.n.d(Boolean.valueOf(v2 >= 0));
        com.facebook.common.internal.n.d(Boolean.valueOf(v2 <= 100));
        com.facebook.common.internal.n.d(Boolean.valueOf(e.k(v)));
        if(v1 != 8 || v != 0) {
            z = true;
        }
        com.facebook.common.internal.n.e(z, "no transformation requested");
        NativeJpegTranscoder.nativeTranscodeJpeg(((InputStream)com.facebook.common.internal.n.i(inputStream0)), ((OutputStream)com.facebook.common.internal.n.i(outputStream0)), v, v1, v2);
    }

    @VisibleForTesting
    public static void f(InputStream inputStream0, OutputStream outputStream0, int v, int v1, int v2) throws IOException {
        d.a();
        boolean z = false;
        com.facebook.common.internal.n.d(Boolean.valueOf(v1 >= 1));
        com.facebook.common.internal.n.d(Boolean.valueOf(v1 <= 16));
        com.facebook.common.internal.n.d(Boolean.valueOf(v2 >= 0));
        com.facebook.common.internal.n.d(Boolean.valueOf(v2 <= 100));
        com.facebook.common.internal.n.d(Boolean.valueOf(e.j(v)));
        if(v1 != 8 || v != 1) {
            z = true;
        }
        com.facebook.common.internal.n.e(z, "no transformation requested");
        NativeJpegTranscoder.nativeTranscodeJpegWithExifOrientation(((InputStream)com.facebook.common.internal.n.i(inputStream0)), ((OutputStream)com.facebook.common.internal.n.i(outputStream0)), v, v1, v2);
    }

    @f
    private static native void nativeTranscodeJpeg(InputStream arg0, OutputStream arg1, int arg2, int arg3, int arg4) throws IOException {
    }

    @f
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream arg0, OutputStream arg1, int arg2, int arg3, int arg4) throws IOException {
    }
}

