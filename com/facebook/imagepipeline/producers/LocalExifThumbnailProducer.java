package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.i;
import com.facebook.common.memory.j;
import com.facebook.common.memory.k;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.request.d;
import com.facebook.imageutils.c;
import com.facebook.soloader.f;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class LocalExifThumbnailProducer implements z0 {
    @f
    class Api24Utils {
        final LocalExifThumbnailProducer a;

        private Api24Utils() {
        }

        Api24Utils(M m0) {
        }

        @h
        ExifInterface a(FileDescriptor fileDescriptor0) throws IOException {
            return Build.VERSION.SDK_INT < 24 ? null : L.a(fileDescriptor0);
        }
    }

    private final Executor a;
    private final j b;
    private final ContentResolver c;
    private static final int d = 0x200;
    public static final String e = "LocalExifThumbnailProducer";
    @VisibleForTesting
    static final String f = "createdThumbnail";

    public LocalExifThumbnailProducer(Executor executor0, j j0, ContentResolver contentResolver0) {
        this.a = executor0;
        this.b = j0;
        this.c = contentResolver0;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        class com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.a extends r0 {
            final d k;
            final LocalExifThumbnailProducer l;

            com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.a(com.facebook.imagepipeline.producers.n n0, l0 l00, j0 j00, String s, d d0) {
                this.k = d0;
                super(n0, l00, j00, s);
            }

            @Override  // com.facebook.imagepipeline.producers.r0
            protected void b(@h Object object0) {
                this.j(((l)object0));
            }

            @Override  // com.facebook.common.executors.i
            @h
            protected Object c() throws Exception {
                return this.l();
            }

            @Override  // com.facebook.imagepipeline.producers.r0
            protected Map i(@h Object object0) {
                return this.k(((l)object0));
            }

            protected void j(@h l l0) {
                l.c(l0);
            }

            // 去混淆评级： 低(20)
            protected Map k(@h l l0) {
                return l0 == null ? com.facebook.common.internal.j.of("createdThumbnail", "false") : com.facebook.common.internal.j.of("createdThumbnail", "true");
            }

            @h
            protected l l() throws Exception {
                ExifInterface exifInterface0 = LocalExifThumbnailProducer.this.g(this.k.z());
                if(exifInterface0 != null && exifInterface0.hasThumbnail()) {
                    byte[] arr_b = (byte[])com.facebook.common.internal.n.i(exifInterface0.getThumbnail());
                    i i0 = LocalExifThumbnailProducer.this.b.c(arr_b);
                    return LocalExifThumbnailProducer.this.e(i0, exifInterface0);
                }
                return null;
            }
        }


        class b extends com.facebook.imagepipeline.producers.f {
            final r0 a;
            final LocalExifThumbnailProducer b;

            b(r0 r00) {
                this.a = r00;
                super();
            }

            @Override  // com.facebook.imagepipeline.producers.f
            public void b() {
                this.a.a();
            }
        }

        l0 l00 = j00.i();
        d d0 = j00.b();
        j00.o("local", "exif");
        com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.a localExifThumbnailProducer$a0 = new com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.a(this, n0, l00, j00, "LocalExifThumbnailProducer", d0);
        j00.n(new b(this, localExifThumbnailProducer$a0));
        this.a.execute(localExifThumbnailProducer$a0);
    }

    @Override  // com.facebook.imagepipeline.producers.z0
    public boolean b(@h g g0) {
        return A0.b(0x200, 0x200, g0);
    }

    private l e(i i0, ExifInterface exifInterface0) {
        l l0;
        Pair pair0 = c.e(new k(i0));
        int v = this.h(exifInterface0);
        int v1 = -1;
        int v2 = pair0 == null ? -1 : ((int)(((Integer)pair0.first)));
        if(pair0 != null) {
            v1 = (int)(((Integer)pair0.second));
        }
        com.facebook.common.references.a a0 = com.facebook.common.references.a.t(i0);
        try {
            l0 = new l(a0);
        }
        finally {
            com.facebook.common.references.a.j(a0);
        }
        l0.u0(X0.b.b);
        l0.x0(v);
        l0.a1(v2);
        l0.l0(v1);
        return l0;
    }

    @VisibleForTesting
    boolean f(String s) throws IOException {
        if(s == null) {
            return false;
        }
        File file0 = new File(s);
        return file0.exists() && file0.canRead();
    }

    @VisibleForTesting
    @h
    ExifInterface g(Uri uri0) {
        String s = com.facebook.common.util.h.e(this.c, uri0);
        if(s == null) {
            return null;
        }
        try {
            if(this.f(s)) {
                return new ExifInterface(s);
            }
            AssetFileDescriptor assetFileDescriptor0 = com.facebook.common.util.h.a(this.c, uri0);
            if(assetFileDescriptor0 != null && Build.VERSION.SDK_INT >= 24) {
                ExifInterface exifInterface0 = new Api24Utils(this, null).a(assetFileDescriptor0.getFileDescriptor());
                assetFileDescriptor0.close();
                return exifInterface0;
            }
        }
        catch(IOException unused_ex) {
            x0.a.q(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        catch(StackOverflowError unused_ex) {
        }
        return null;
    }

    private int h(ExifInterface exifInterface0) {
        return com.facebook.imageutils.f.a(Integer.parseInt(((String)com.facebook.common.internal.n.i(exifInterface0.getAttribute("Orientation")))));
    }
}

