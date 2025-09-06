package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.gifdecoder.c;
import com.bumptech.glide.gifdecoder.d;
import com.bumptech.glide.gifdecoder.f;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.resource.k;
import com.bumptech.glide.util.i;
import com.bumptech.glide.util.o;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

public class a implements l {
    @VisibleForTesting
    static class com.bumptech.glide.load.resource.gif.a.a {
        com.bumptech.glide.gifdecoder.a a(com.bumptech.glide.gifdecoder.a.a a$a0, c c0, ByteBuffer byteBuffer0, int v) {
            return new f(a$a0, c0, byteBuffer0, v);
        }
    }

    @VisibleForTesting
    static class b {
        private final Queue a;

        b() {
            this.a = o.g(0);
        }

        d a(ByteBuffer byteBuffer0) {
            synchronized(this) {
                d d0 = (d)this.a.poll();
                if(d0 == null) {
                    d0 = new d();
                }
                return d0.q(byteBuffer0);
            }
        }

        void b(d d0) {
            synchronized(this) {
                d0.a();
                this.a.offer(d0);
            }
        }
    }

    private final Context a;
    private final List b;
    private final b c;
    private final com.bumptech.glide.load.resource.gif.a.a d;
    private final com.bumptech.glide.load.resource.gif.b e;
    private static final String f = "BufferGifDecoder";
    private static final com.bumptech.glide.load.resource.gif.a.a g;
    private static final b h;

    static {
        a.g = new com.bumptech.glide.load.resource.gif.a.a();
        a.h = new b();
    }

    public a(Context context0) {
        this(context0, com.bumptech.glide.c.e(context0).n().g(), com.bumptech.glide.c.e(context0).h(), com.bumptech.glide.c.e(context0).g());
    }

    public a(Context context0, List list0, e e0, com.bumptech.glide.load.engine.bitmap_recycle.b b0) {
        this(context0, list0, e0, b0, a.h, a.g);
    }

    @VisibleForTesting
    a(Context context0, List list0, e e0, com.bumptech.glide.load.engine.bitmap_recycle.b b0, b a$b0, com.bumptech.glide.load.resource.gif.a.a a$a0) {
        this.a = context0.getApplicationContext();
        this.b = list0;
        this.d = a$a0;
        this.e = new com.bumptech.glide.load.resource.gif.b(e0, b0);
        this.c = a$b0;
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.f(((ByteBuffer)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        return this.d(((ByteBuffer)object0), v, v1, j0);
    }

    @Nullable
    private com.bumptech.glide.load.resource.gif.e c(ByteBuffer byteBuffer0, int v, int v1, d d0, j j0) {
        com.bumptech.glide.load.resource.gif.e e0;
        long v2 = i.b();
        try {
            c c0 = d0.d();
            if(c0.b() > 0 && c0.c() == 0) {
                Bitmap.Config bitmap$Config0 = j0.c(com.bumptech.glide.load.resource.gif.i.a) == com.bumptech.glide.load.b.b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int v3 = a.e(c0, v, v1);
                com.bumptech.glide.gifdecoder.a a0 = this.d.a(this.e, c0, byteBuffer0, v3);
                a0.d(bitmap$Config0);
                a0.j();
                Bitmap bitmap0 = a0.i();
                if(bitmap0 != null) {
                    k k0 = k.c();
                    e0 = new com.bumptech.glide.load.resource.gif.e(new com.bumptech.glide.load.resource.gif.c(this.a, a0, k0, v, v1, bitmap0));
                    goto label_17;
                }
                goto label_20;
            }
            goto label_23;
        }
        catch(Throwable throwable0) {
        }
        if(Log.isLoggable("BufferGifDecoder", 2)) {
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + i.a(v2));
        }
        throw throwable0;
    label_17:
        if(Log.isLoggable("BufferGifDecoder", 2)) {
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + i.a(v2));
        }
        return e0;
    label_20:
        if(Log.isLoggable("BufferGifDecoder", 2)) {
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + i.a(v2));
        }
        return null;
    label_23:
        if(Log.isLoggable("BufferGifDecoder", 2)) {
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + i.a(v2));
        }
        return null;
    }

    public com.bumptech.glide.load.resource.gif.e d(@NonNull ByteBuffer byteBuffer0, int v, int v1, @NonNull j j0) {
        d d0 = this.c.a(byteBuffer0);
        try {
            return this.c(byteBuffer0, v, v1, d0, j0);
        }
        finally {
            this.c.b(d0);
        }
    }

    private static int e(c c0, int v, int v1) {
        int v2 = Math.min(c0.a() / v1, c0.d() / v);
        int v3 = Math.max(1, (v2 == 0 ? 0 : Integer.highestOneBit(v2)));
        if(Log.isLoggable("BufferGifDecoder", 2) && v3 > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + v3 + ", target dimens: [" + v + "x" + v1 + "], actual dimens: [" + c0.d() + "x" + c0.a() + "]");
        }
        return v3;
    }

    public boolean f(@NonNull ByteBuffer byteBuffer0, @NonNull j j0) throws IOException {
        return !((Boolean)j0.c(com.bumptech.glide.load.resource.gif.i.b)).booleanValue() && com.bumptech.glide.load.f.g(this.b, byteBuffer0) == ImageType.GIF;
    }
}

