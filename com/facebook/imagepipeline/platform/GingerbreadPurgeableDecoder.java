package com.facebook.imagepipeline.platform;

import A0.b;
import A0.c;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.MemoryFile;
import com.facebook.common.internal.d;
import com.facebook.common.internal.f;
import com.facebook.common.internal.s;
import com.facebook.common.memory.i;
import com.facebook.common.memory.k;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import jeb.synthetic.TWR;
import k1.n.a;
import k1.n;
import o3.h;

@f
@n(a.a)
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    @h
    private final b c;
    private static Method d;

    @f
    public GingerbreadPurgeableDecoder() {
        this.c = c.j();
    }

    @Override  // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap e(com.facebook.common.references.a a0, BitmapFactory.Options bitmapFactory$Options0) {
        return this.k(a0, ((i)a0.n()).size(), null, bitmapFactory$Options0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap f(com.facebook.common.references.a a0, int v, BitmapFactory.Options bitmapFactory$Options0) {
        return DalvikPurgeableDecoder.g(a0, v) ? this.k(a0, v, null, bitmapFactory$Options0) : this.k(a0, v, DalvikPurgeableDecoder.b, bitmapFactory$Options0);
    }

    private static MemoryFile j(com.facebook.common.references.a a0, int v, @h byte[] arr_b) throws IOException {
        z0.a a1;
        Closeable closeable0;
        k k0;
        OutputStream outputStream0 = null;
        MemoryFile memoryFile0 = new MemoryFile(null, (arr_b == null ? 0 : arr_b.length) + v);
        memoryFile0.allowPurging(false);
        try {
            k0 = new k(((i)a0.n()));
        }
        catch(Throwable throwable0) {
            closeable0 = null;
            a1 = null;
            goto label_23;
        }
        try {
            a1 = new z0.a(k0, v);
        }
        catch(Throwable throwable0) {
            closeable0 = null;
            a1 = null;
            goto label_22;
        }
        try {
            outputStream0 = memoryFile0.getOutputStream();
            com.facebook.common.internal.b.a(a1, outputStream0);
            if(arr_b != null) {
                memoryFile0.writeBytes(arr_b, 0, v, arr_b.length);
            }
            goto label_28;
        }
        catch(Throwable throwable0) {
            closeable0 = outputStream0;
        }
    label_22:
        outputStream0 = k0;
    label_23:
        com.facebook.common.references.a.j(a0);
        d.b(((InputStream)outputStream0));
        d.b(a1);
        d.a(closeable0, true);
        throw throwable0;
    label_28:
        com.facebook.common.references.a.j(a0);
        d.b(k0);
        d.b(a1);
        d.a(outputStream0, true);
        return memoryFile0;
    }

    private Bitmap k(com.facebook.common.references.a a0, int v, @h byte[] arr_b, BitmapFactory.Options bitmapFactory$Options0) {
        Bitmap bitmap0;
        MemoryFile memoryFile0;
        try {
            try {
                memoryFile0 = null;
                memoryFile0 = GingerbreadPurgeableDecoder.j(a0, v, arr_b);
                FileDescriptor fileDescriptor0 = this.m(memoryFile0);
                b b0 = this.c;
                if(b0 == null) {
                    throw new IllegalStateException("WebpBitmapFactory is null");
                }
                bitmap0 = (Bitmap)com.facebook.common.internal.n.j(b0.e(fileDescriptor0, null, bitmapFactory$Options0), "BitmapFactory returned null");
            }
            catch(IOException iOException0) {
                throw s.d(iOException0);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(memoryFile0, throwable0);
            throw throwable0;
        }
        if(memoryFile0 != null) {
            memoryFile0.close();
        }
        return bitmap0;
    }

    private Method l() {
        synchronized(this) {
            if(GingerbreadPurgeableDecoder.d == null) {
                try {
                    GingerbreadPurgeableDecoder.d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
                }
                catch(Exception exception0) {
                    throw s.d(exception0);
                }
            }
            return GingerbreadPurgeableDecoder.d;
        }
    }

    private FileDescriptor m(MemoryFile memoryFile0) {
        try {
            return (FileDescriptor)com.facebook.common.internal.n.i(this.l().invoke(memoryFile0, null));
        }
        catch(Exception exception0) {
            throw s.d(exception0);
        }
    }
}

