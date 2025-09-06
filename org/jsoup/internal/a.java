package org.jsoup.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import org.jsoup.h;
import org.jsoup.helper.i;

public class a extends FilterInputStream {
    private final BufferedInputStream a;
    private final boolean b;
    private final int c;
    private long d;
    private long e;
    private int f;
    private int g;
    private boolean h;
    private h i;
    private Object j;
    private int k;
    private int l;

    private a(BufferedInputStream bufferedInputStream0, int v) {
        super(bufferedInputStream0);
        this.e = 0L;
        this.k = -1;
        boolean z = false;
        this.l = 0;
        i.h(v >= 0);
        this.a = bufferedInputStream0;
        if(v != 0) {
            z = true;
        }
        this.b = z;
        this.c = v;
        this.f = v;
        this.g = -1;
        this.d = System.nanoTime();
    }

    private void a() {
        if(this.i == null) {
            return;
        }
        float f = this.k <= 0 ? 0.0f : Math.min(100.0f, ((float)this.l) * 100.0f / ((float)this.k));
        this.i.a(this.l, this.k, f, this.j);
        if(f == 100.0f) {
            this.i = null;
        }
    }

    private boolean b() {
        return this.e == 0L ? false : System.nanoTime() - this.d > this.e;
    }

    public BufferedInputStream c() {
        return this.a;
    }

    public a e(int v, h h0, Object object0) {
        i.o(h0);
        i.o(object0);
        this.k = v;
        this.i = h0;
        this.j = object0;
        return this;
    }

    public static ByteBuffer f(InputStream inputStream0, int v) throws IOException {
        boolean z = true;
        i.i(v >= 0, "maxSize must be 0 (unlimited) or larger");
        i.o(inputStream0);
        if(v <= 0) {
            z = false;
        }
        int v1 = !z || v >= 0x8000 ? 0x8000 : v;
        byte[] arr_b = new byte[v1];
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(v1);
        int v2;
        while((v2 = inputStream0.read(arr_b, 0, (z ? Math.min(v, v1) : v1))) != -1) {
            if(z) {
                if(v2 >= v) {
                    byteArrayOutputStream0.write(arr_b, 0, v);
                    return ByteBuffer.wrap(byteArrayOutputStream0.toByteArray());
                }
                v -= v2;
            }
            byteArrayOutputStream0.write(arr_b, 0, v2);
        }
        return ByteBuffer.wrap(byteArrayOutputStream0.toByteArray());
    }

    public a i(long v, long v1) {
        this.d = v;
        this.e = v1 * 1000000L;
        return this;
    }

    public static a j(InputStream inputStream0, int v, int v1) {
        if(inputStream0 instanceof a) {
            return (a)inputStream0;
        }
        return inputStream0 instanceof BufferedInputStream ? new a(((BufferedInputStream)inputStream0), v1) : new a(new BufferedInputStream(inputStream0, v), v1);
    }

    @Override
    public void mark(int v) {
        super.mark(v);
        this.g = this.c - this.f;
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        if(this.l == 0) {
            this.a();
        }
        if(!this.h && (!this.b || this.f > 0)) {
            if(Thread.currentThread().isInterrupted()) {
                this.h = true;
                return -1;
            }
            if(this.b()) {
                throw new SocketTimeoutException("Read timeout");
            }
            if(this.b) {
                int v2 = this.f;
                if(v1 > v2) {
                    v1 = v2;
                }
            }
            try {
                int v3 = super.read(arr_b, v, v1);
                if(v3 == -1) {
                    this.k = this.l;
                }
                else {
                    this.f -= v3;
                    this.l += v3;
                }
                this.a();
                return v3;
            }
            catch(SocketTimeoutException socketTimeoutException0) {
            }
            if(this.b()) {
                throw socketTimeoutException0;
            }
            return 0;
        }
        return -1;
    }

    @Override
    public void reset() throws IOException {
        super.reset();
        this.f = this.c - this.g;
        this.l = this.g;
    }
}

