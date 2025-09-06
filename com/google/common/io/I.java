package com.google.common.io;

import J1.c;
import J1.d;
import com.google.common.base.H;
import j..util.Objects;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import o3.a;

@c
@d
@q
final class i extends Reader {
    @a
    private CharSequence a;
    private int b;
    private int c;

    public i(CharSequence charSequence0) {
        this.a = (CharSequence)H.E(charSequence0);
    }

    private boolean C() {
        return this.b() > 0;
    }

    private void a() throws IOException {
        if(this.a == null) {
            throw new IOException("reader closed");
        }
    }

    private int b() {
        Objects.requireNonNull(this.a);
        return this.a.length() - this.b;
    }

    @Override
    public void close() throws IOException {
        synchronized(this) {
            this.a = null;
        }
    }

    @Override
    public void mark(int v) throws IOException {
        synchronized(this) {
            H.k(v >= 0, "readAheadLimit (%s) may not be negative", v);
            this.a();
            this.c = this.b;
        }
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public int read() throws IOException {
        int v2;
        synchronized(this) {
            this.a();
            Objects.requireNonNull(this.a);
            if(this.C()) {
                int v1 = this.b;
                this.b = v1 + 1;
                v2 = this.a.charAt(v1);
            }
            else {
                v2 = -1;
            }
            return v2;
        }
    }

    @Override
    public int read(CharBuffer charBuffer0) throws IOException {
        synchronized(this) {
            H.E(charBuffer0);
            this.a();
            Objects.requireNonNull(this.a);
            if(!this.C()) {
                return -1;
            }
            int v1 = Math.min(charBuffer0.remaining(), this.b());
            for(int v2 = 0; v2 < v1; ++v2) {
                int v3 = this.b;
                this.b = v3 + 1;
                charBuffer0.put(this.a.charAt(v3));
            }
            return v1;
        }
    }

    @Override
    public int read(char[] arr_c, int v, int v1) throws IOException {
        synchronized(this) {
            H.f0(v, v + v1, arr_c.length);
            this.a();
            Objects.requireNonNull(this.a);
            if(!this.C()) {
                return -1;
            }
            int v3 = Math.min(v1, this.b());
            for(int v4 = 0; v4 < v3; ++v4) {
                int v5 = this.b;
                this.b = v5 + 1;
                arr_c[v + v4] = this.a.charAt(v5);
            }
            return v3;
        }
    }

    @Override
    public boolean ready() throws IOException {
        synchronized(this) {
            this.a();
            return true;
        }
    }

    @Override
    public void reset() throws IOException {
        synchronized(this) {
            this.a();
            this.b = this.c;
        }
    }

    @Override
    public long skip(long v) throws IOException {
        int v2;
        synchronized(this) {
            H.p(v >= 0L, "n (%s) may not be negative", v);
            this.a();
            v2 = (int)Math.min(this.b(), v);
            this.b += v2;
        }
        return (long)v2;
    }
}

