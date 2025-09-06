package com.bumptech.glide.integration.webp.decoder;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LruCache;
import com.bumptech.glide.gifdecoder.a;
import com.bumptech.glide.gifdecoder.c;
import com.bumptech.glide.integration.webp.WebpFrame;
import com.bumptech.glide.integration.webp.WebpImage;
import com.bumptech.glide.integration.webp.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class j implements a {
    private ByteBuffer f;
    private WebpImage g;
    private final com.bumptech.glide.gifdecoder.a.a h;
    private int i;
    private final int[] j;
    private final b[] k;
    private int l;
    private int m;
    private int n;
    private final Paint o;
    private p p;
    private Bitmap.Config q;
    private final LruCache r;
    private static final String s = "WebpDecoder";
    private static final int t = 5;

    public j(com.bumptech.glide.gifdecoder.a.a a$a0, WebpImage webpImage0, ByteBuffer byteBuffer0, int v) {
        this(a$a0, webpImage0, byteBuffer0, v, p.c);
    }

    public j(com.bumptech.glide.gifdecoder.a.a a$a0, WebpImage webpImage0, ByteBuffer byteBuffer0, int v, p p0) {
        class com.bumptech.glide.integration.webp.decoder.j.a extends LruCache {
            final j a;

            com.bumptech.glide.integration.webp.decoder.j.a(int v) {
                super(v);
            }

            protected void a(boolean z, Integer integer0, Bitmap bitmap0, Bitmap bitmap1) {
                if(bitmap0 != null) {
                    j.this.h.c(bitmap0);
                }
            }

            @Override  // android.util.LruCache
            protected void entryRemoved(boolean z, Object object0, Object object1, Object object2) {
                this.a(z, ((Integer)object0), ((Bitmap)object1), ((Bitmap)object2));
            }
        }

        this.i = -1;
        this.q = Bitmap.Config.ARGB_8888;
        this.h = a$a0;
        this.g = webpImage0;
        this.j = webpImage0.getFrameDurations();
        this.k = new b[webpImage0.getFrameCount()];
        for(int v1 = 0; v1 < this.g.getFrameCount(); ++v1) {
            this.k[v1] = this.g.getFrameInfo(v1);
            if(Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "mFrameInfos: " + this.k[v1].toString());
            }
        }
        this.p = p0;
        Paint paint0 = new Paint();
        this.o = paint0;
        paint0.setColor(0);
        paint0.setStyle(Paint.Style.FILL);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.r = new com.bumptech.glide.integration.webp.decoder.j.a(this, (this.p.a() ? webpImage0.getFrameCount() : Math.max(5, this.p.d())));
        this.o(new c(), byteBuffer0, v);
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    @Deprecated
    public int a() {
        return this.g.getLoopCount();
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int b() {
        return this.g.getFrameCount();
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int c(InputStream inputStream0, int v) {
        return 0;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void clear() {
        this.g.dispose();
        this.g = null;
        this.r.evictAll();
        this.f = null;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void d(Bitmap.Config bitmap$Config0) {
        Bitmap.Config bitmap$Config1 = Bitmap.Config.ARGB_8888;
        if(bitmap$Config0 != bitmap$Config1) {
            throw new IllegalArgumentException("Unsupported format: " + bitmap$Config0 + ", must be one of " + bitmap$Config1);
        }
        this.q = bitmap$Config0;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void e(c c0, byte[] arr_b) {
        this.n(c0, ByteBuffer.wrap(arr_b));
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void f() {
        this.i = -1;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int g() {
        return this.i;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public ByteBuffer getData() {
        return this.f;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int getHeight() {
        return this.g.getHeight();
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int getStatus() {
        return 0;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int getWidth() {
        return this.g.getWidth();
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int h() {
        return this.g.getSizeInBytes();
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public Bitmap i() {
        int v = this.g();
        Bitmap bitmap0 = this.h.b(this.n, this.m, Bitmap.Config.ARGB_8888);
        bitmap0.eraseColor(0);
        if(Build.VERSION.SDK_INT >= 24) {
            bitmap0.setDensity(0);
        }
        Canvas canvas0 = new Canvas(bitmap0);
        canvas0.drawColor(0, PorterDuff.Mode.SRC);
        if(!this.p.e()) {
            Bitmap bitmap1 = (Bitmap)this.r.get(v);
            if(bitmap1 != null) {
                if(Log.isLoggable("WebpDecoder", 3)) {
                    Log.d("WebpDecoder", "hit frame bitmap from memory cache, frameNumber=" + v);
                }
                bitmap1.setDensity(canvas0.getDensity());
                canvas0.drawBitmap(bitmap1, 0.0f, 0.0f, null);
                return bitmap0;
            }
        }
        int v1 = this.v(v) ? v : this.w(v - 1, canvas0);
        if(Log.isLoggable("WebpDecoder", 3)) {
            Log.d("WebpDecoder", "frameNumber=" + v + ", nextIndex=" + v1);
        }
        while(v1 < v) {
            b b0 = this.k[v1];
            if(!b0.g) {
                this.s(canvas0, b0);
            }
            this.x(v1, canvas0);
            if(Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "renderFrame, index=" + v1 + ", blend=" + b0.g + ", dispose=" + b0.h);
            }
            if(b0.h) {
                this.s(canvas0, b0);
            }
            ++v1;
        }
        b b1 = this.k[v];
        if(!b1.g) {
            this.s(canvas0, b1);
        }
        this.x(v, canvas0);
        if(Log.isLoggable("WebpDecoder", 3)) {
            Log.d("WebpDecoder", "renderFrame, index=" + v + ", blend=" + b1.g + ", dispose=" + b1.h);
        }
        this.r(v, bitmap0);
        return bitmap0;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void j() {
        this.i = (this.i + 1) % this.g.getFrameCount();
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int k(int v) {
        if(v >= 0) {
            return v >= this.j.length ? -1 : this.j[v];
        }
        return -1;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int l() {
        return this.g.getLoopCount() == 0 ? 0 : this.g.getLoopCount();
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int m() {
        if(this.j.length != 0) {
            return this.i < 0 ? 0 : this.k(this.i);
        }
        return 0;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void n(c c0, ByteBuffer byteBuffer0) {
        this.o(c0, byteBuffer0, 1);
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void o(c c0, ByteBuffer byteBuffer0, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + v);
        }
        int v1 = Integer.highestOneBit(v);
        ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
        this.f = byteBuffer1;
        byteBuffer1.position(0);
        this.l = v1;
        this.n = this.g.getWidth() / v1;
        this.m = this.g.getHeight() / v1;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int p() {
        return this.g.getLoopCount();
    }

    private void r(int v, Bitmap bitmap0) {
        this.r.remove(v);
        int v1 = bitmap0.getWidth();
        int v2 = bitmap0.getHeight();
        Bitmap.Config bitmap$Config0 = bitmap0.getConfig();
        Bitmap bitmap1 = this.h.b(v1, v2, bitmap$Config0);
        bitmap1.eraseColor(0);
        bitmap1.setDensity(bitmap0.getDensity());
        Canvas canvas0 = new Canvas(bitmap1);
        canvas0.drawColor(0, PorterDuff.Mode.SRC);
        canvas0.drawBitmap(bitmap0, 0.0f, 0.0f, null);
        this.r.put(v, bitmap1);
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int read(byte[] arr_b) {
        return 0;
    }

    private void s(Canvas canvas0, b b0) {
        canvas0.drawRect(((float)(b0.b / this.l)), ((float)(b0.c / this.l)), ((float)((b0.b + b0.d) / this.l)), ((float)((b0.c + b0.e) / this.l)), this.o);
    }

    public p t() {
        return this.p;
    }

    private boolean u(b b0) {
        return b0.b == 0 && b0.c == 0 && b0.d == this.g.getWidth() && b0.e == this.g.getHeight();
    }

    private boolean v(int v) {
        if(v == 0) {
            return true;
        }
        b b0 = this.k[v];
        b b1 = this.k[v - 1];
        return b0.g || !this.u(b0) ? b1.h && this.u(b1) : true;
    }

    private int w(int v, Canvas canvas0) {
        while(v >= 0) {
            b b0 = this.k[v];
            if(b0.h && this.u(b0)) {
                return v + 1;
            }
            Bitmap bitmap0 = (Bitmap)this.r.get(v);
            if(bitmap0 != null && !bitmap0.isRecycled()) {
                bitmap0.setDensity(canvas0.getDensity());
                canvas0.drawBitmap(bitmap0, 0.0f, 0.0f, null);
                if(b0.h) {
                    this.s(canvas0, b0);
                }
                return v + 1;
            }
            if(this.v(v)) {
                return v;
            }
            --v;
        }
        return 0;
    }

    private void x(int v, Canvas canvas0) {
        b b0 = this.k[v];
        int v1 = this.l;
        int v2 = b0.d / v1;
        int v3 = b0.e / v1;
        int v4 = b0.b / v1;
        int v5 = b0.c / v1;
        if(v2 != 0 && v3 != 0) {
            WebpFrame webpFrame0 = this.g.getFrame(v);
            try {
                Bitmap bitmap0 = this.h.b(v2, v3, this.q);
                bitmap0.eraseColor(0);
                bitmap0.setDensity(canvas0.getDensity());
                webpFrame0.renderFrame(v2, v3, bitmap0);
                canvas0.drawBitmap(bitmap0, ((float)v4), ((float)v5), null);
                this.h.c(bitmap0);
            }
            catch(IllegalStateException | IllegalArgumentException unused_ex) {
                Log.e("WebpDecoder", "Rendering of frame failed. Frame number: " + v);
            }
            finally {
                webpFrame0.dispose();
            }
        }
    }
}

