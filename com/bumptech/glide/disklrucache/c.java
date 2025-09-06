package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class c implements Closeable {
    private final InputStream a;
    private final Charset b;
    private byte[] c;
    private int d;
    private int e;
    private static final byte f = 13;
    private static final byte g = 10;

    public c(InputStream inputStream0, int v, Charset charset0) {
        if(inputStream0 == null || charset0 == null) {
            throw null;
        }
        if(v < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if(!charset0.equals(d.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.a = inputStream0;
        this.b = charset0;
        this.c = new byte[v];
    }

    public c(InputStream inputStream0, Charset charset0) {
        this(inputStream0, 0x2000, charset0);
    }

    private void b() throws IOException {
        int v = this.a.read(this.c, 0, this.c.length);
        if(v == -1) {
            throw new EOFException();
        }
        this.d = 0;
        this.e = v;
    }

    public boolean c() {
        return this.e == -1;
    }

    @Override
    public void close() throws IOException {
        synchronized(this.a) {
            if(this.c != null) {
                this.c = null;
                this.a.close();
            }
        }
    }

    public String e() throws IOException {
        class a extends ByteArrayOutputStream {
            final c a;

            a(int v) {
                super(v);
            }

            @Override
            public String toString() {
                int v = this.count <= 0 || this.buf[this.count - 1] != 13 ? this.count : this.count - 1;
                try {
                    return new String(this.buf, 0, v, c.this.b.name());
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new AssertionError(unsupportedEncodingException0);
                }
            }
        }

        int v4;
        int v3;
        synchronized(this.a) {
            if(this.c != null) {
                if(this.d >= this.e) {
                    this.b();
                }
                for(int v1 = this.d; v1 != this.e; ++v1) {
                    byte[] arr_b = this.c;
                    if(arr_b[v1] == 10) {
                        int v2 = this.d;
                        if(v1 == v2) {
                            v3 = v1;
                        }
                        else {
                            v3 = v1 - 1;
                            if(arr_b[v3] != 13) {
                                v3 = v1;
                            }
                        }
                        String s = new String(arr_b, v2, v3 - v2, this.b.name());
                        this.d = v1 + 1;
                        return s;
                    }
                }
                a c$a0 = new a(this, this.e - this.d + 80);
                do {
                    c$a0.write(this.c, this.d, this.e - this.d);
                    this.e = -1;
                    this.b();
                    v4 = this.d;
                label_30:
                }
                while(v4 == this.e);
                byte[] arr_b1 = this.c;
                if(arr_b1[v4] != 10) {
                    ++v4;
                    goto label_30;
                }
                int v5 = this.d;
                if(v4 != v5) {
                    c$a0.write(arr_b1, v5, v4 - v5);
                }
                this.d = v4 + 1;
                return c$a0.toString();
            }
        }
        throw new IOException("LineReader is closed");
    }
}

