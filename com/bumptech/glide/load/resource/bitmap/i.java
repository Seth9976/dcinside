package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class I extends FilterInputStream {
    static class a extends IOException {
        private static final long a = 0xC3CAFB6C37664863L;

        a(String s) {
            super(s);
        }
    }

    private volatile byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final b f;

    public I(@NonNull InputStream inputStream0, @NonNull b b0) {
        this(inputStream0, b0, 0x10000);
    }

    @VisibleForTesting
    I(@NonNull InputStream inputStream0, @NonNull b b0, int v) {
        super(inputStream0);
        this.d = -1;
        this.f = b0;
        this.a = (byte[])b0.d(v, byte[].class);
    }

    private int a(InputStream inputStream0, byte[] arr_b) throws IOException {
        int v = this.d;
        if(v != -1) {
            int v1 = this.c;
            if(this.e - v < v1) {
                if(v == 0 && v1 > arr_b.length && this.b == arr_b.length) {
                    int v2 = arr_b.length * 2;
                    if(v2 <= v1) {
                        v1 = v2;
                    }
                    byte[] arr_b1 = (byte[])this.f.d(v1, byte[].class);
                    System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
                    this.a = arr_b1;
                    this.f.put(arr_b);
                    arr_b = arr_b1;
                }
                else if(v > 0) {
                    System.arraycopy(arr_b, v, arr_b, 0, arr_b.length - v);
                }
                int v3 = this.e - this.d;
                this.e = v3;
                this.d = 0;
                this.b = 0;
                int v4 = inputStream0.read(arr_b, v3, arr_b.length - v3);
                this.b = v4 <= 0 ? this.e : this.e + v4;
                return v4;
            }
        }
        int v5 = inputStream0.read(arr_b);
        if(v5 > 0) {
            this.d = -1;
            this.e = 0;
            this.b = v5;
        }
        return v5;
    }

    @Override
    public int available() throws IOException {
        synchronized(this) {
            InputStream inputStream0 = this.in;
            if(this.a != null && inputStream0 != null) {
                int v1 = this.b - this.e;
                int v2 = inputStream0.available();
                return v1 + v2;
            }
        }
        throw I.c();
    }

    public void b() {
        synchronized(this) {
            this.c = this.a.length;
        }
    }

    private static IOException c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override
    public void close() throws IOException {
        if(this.a != null) {
            this.f.put(this.a);
            this.a = null;
        }
        InputStream inputStream0 = this.in;
        this.in = null;
        if(inputStream0 != null) {
            inputStream0.close();
        }
    }

    @Override
    public void mark(int v) {
        synchronized(this) {
            this.c = Math.max(this.c, v);
            this.d = this.e;
        }
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public int read() throws IOException {
        synchronized(this) {
            byte[] arr_b = this.a;
            InputStream inputStream0 = this.in;
            if(arr_b != null && inputStream0 != null) {
                if(this.e >= this.b && this.a(inputStream0, arr_b) == -1) {
                    return -1;
                }
                if(arr_b != this.a) {
                    arr_b = this.a;
                    if(arr_b == null) {
                        throw I.c();
                    }
                }
                int v1 = this.e;
                if(this.b - v1 > 0) {
                    this.e = v1 + 1;
                    int v2 = arr_b[v1];
                    return v2 & 0xFF;
                }
                return -1;
            }
        }
        throw I.c();
    }

    @Override
    public int read(@NonNull byte[] arr_b, int v, int v1) throws IOException {
        int v8;
        int v6;
        synchronized(this) {
            byte[] arr_b1 = this.a;
            if(arr_b1 != null) {
                if(v1 == 0) {
                    return 0;
                }
                InputStream inputStream0 = this.in;
                if(inputStream0 != null) {
                    int v3 = this.e;
                    int v4 = this.b;
                    if(v3 < v4) {
                        int v5 = v4 - v3 < v1 ? v4 - v3 : v1;
                        System.arraycopy(arr_b1, v3, arr_b, v, v5);
                        this.e += v5;
                        if(v5 != v1 && inputStream0.available() != 0) {
                            v += v5;
                            v6 = v1 - v5;
                            goto label_24;
                        }
                        return v5;
                    }
                    else {
                        v6 = v1;
                    }
                    while(true) {
                    label_24:
                        int v7 = -1;
                        if(this.d != -1 || v6 < arr_b1.length) {
                            if(this.a(inputStream0, arr_b1) == -1) {
                                if(v6 != v1) {
                                    v7 = v1 - v6;
                                }
                                return v7;
                            }
                            if(arr_b1 != this.a) {
                                arr_b1 = this.a;
                                if(arr_b1 == null) {
                                    throw I.c();
                                }
                            }
                            v8 = this.b - this.e < v6 ? this.b - this.e : v6;
                            System.arraycopy(arr_b1, this.e, arr_b, v, v8);
                            this.e += v8;
                        }
                        else {
                            v8 = inputStream0.read(arr_b, v, v6);
                            if(v8 == -1) {
                                if(v6 != v1) {
                                    v7 = v1 - v6;
                                }
                                return v7;
                            }
                        }
                        v6 -= v8;
                        if(v6 == 0) {
                            return v1;
                        }
                        if(inputStream0.available() == 0) {
                            return v1 - v6;
                        }
                        v += v8;
                    }
                }
                throw I.c();
            }
        }
        throw I.c();
    }

    public void release() {
        synchronized(this) {
            if(this.a != null) {
                this.f.put(this.a);
                this.a = null;
            }
        }
    }

    @Override
    public void reset() throws IOException {
        synchronized(this) {
            if(this.a != null) {
                int v1 = this.d;
                if(-1 == v1) {
                    throw new a("Mark has been invalidated, pos: " + this.e + " markLimit: " + this.c);
                }
                this.e = v1;
                return;
            }
        }
        throw new IOException("Stream is closed");
    }

    @Override
    public long skip(long v) throws IOException {
        synchronized(this) {
            if(v < 1L) {
                return 0L;
            }
            byte[] arr_b = this.a;
            if(arr_b != null) {
                InputStream inputStream0 = this.in;
                if(inputStream0 == null) {
                    throw I.c();
                }
                int v2 = this.b;
                int v3 = this.e;
                if(((long)(v2 - v3)) >= v) {
                    this.e = (int)(((long)v3) + v);
                    return v;
                }
                long v4 = ((long)v2) - ((long)v3);
                this.e = v2;
                if(this.d != -1 && v <= ((long)this.c)) {
                    if(this.a(inputStream0, arr_b) == -1) {
                        return v4;
                    }
                    int v5 = this.b;
                    int v6 = this.e;
                    if(((long)(v5 - v6)) >= v - v4) {
                        this.e = (int)(((long)v6) + v - v4);
                        return v;
                    }
                    this.e = v5;
                    return v4 + ((long)v5) - ((long)v6);
                }
                long v7 = inputStream0.skip(v - v4);
                if(v7 > 0L) {
                    this.d = -1;
                }
                return v4 + v7;
            }
        }
        throw I.c();
    }
}

