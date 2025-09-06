package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.L;
import y4.l;

@f
final class d extends InputStream {
    @l
    private final InputStream a;
    @l
    private final a b;
    private boolean c;
    private boolean d;
    @l
    private final byte[] e;
    @l
    private final byte[] f;
    @l
    private final byte[] g;
    private int h;
    private int i;

    public d(@l InputStream inputStream0, @l a a0) {
        L.p(inputStream0, "input");
        L.p(a0, "base64");
        super();
        this.a = inputStream0;
        this.b = a0;
        this.e = new byte[1];
        this.f = new byte[0x400];
        this.g = new byte[0x400];
    }

    private final void a(byte[] arr_b, int v, int v1) {
        kotlin.collections.l.v0(this.g, arr_b, v, this.h, this.h + v1);
        this.h += v1;
        this.i();
    }

    private final int b(byte[] arr_b, int v, int v1, int v2) {
        this.i += this.b.n(this.f, this.g, this.i, 0, v2);
        int v3 = Math.min(this.c(), v1 - v);
        this.a(arr_b, v, v3);
        this.j();
        return v3;
    }

    private final int c() {
        return this.i - this.h;
    }

    @Override
    public void close() {
        if(!this.c) {
            this.c = true;
            this.a.close();
        }
    }

    private final int e(int v) {
        this.f[v] = 61;
        if((v & 3) == 2) {
            int v1 = this.f();
            if(v1 >= 0) {
                this.f[v + 1] = (byte)v1;
            }
            return v + 2;
        }
        return v + 1;
    }

    private final int f() {
        int v;
        if(!this.b.D()) {
            return this.a.read();
        }
        do {
            v = this.a.read();
        }
        while(v != -1 && !c.g(v));
        return v;
    }

    private final void i() {
        if(this.h == this.i) {
            this.h = 0;
            this.i = 0;
        }
    }

    private final void j() {
        byte[] arr_b = this.g;
        int v = this.i;
        if(this.f.length / 4 * 3 > arr_b.length - v) {
            kotlin.collections.l.v0(arr_b, arr_b, 0, this.h, v);
            this.i -= this.h;
            this.h = 0;
        }
    }

    @Override
    public int read() {
        int v = this.h;
        if(v < this.i) {
            int v1 = this.g[v] & 0xFF;
            this.h = v + 1;
            this.i();
            return v1;
        }
        switch(this.read(this.e, 0, 1)) {
            case -1: {
                return -1;
            }
            case 1: {
                return this.e[0] & 0xFF;
            }
            default: {
                throw new IllegalStateException("Unreachable");
            }
        }
    }

    @Override
    public int read(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "destination");
        if(v >= 0 && v1 >= 0) {
            int v2 = v + v1;
            if(v2 <= arr_b.length) {
                if(this.c) {
                    throw new IOException("The input stream is closed.");
                }
                if(this.d) {
                    return -1;
                }
                if(v1 == 0) {
                    return 0;
                }
                if(this.c() >= v1) {
                    this.a(arr_b, v, v1);
                    return v1;
                }
                int v3 = (v1 - this.c() + 2) / 3 * 4;
                int v4 = v;
                boolean z;
                while(!z = this.d && v3 > 0) {
                    int v5 = Math.min(this.f.length, v3);
                    int v6 = 0;
                    boolean z1;
                    while(!z1 = this.d && v6 < v5) {
                        int v7 = this.f();
                        switch(v7) {
                            case -1: {
                                this.d = true;
                                break;
                            }
                            case 61: {
                                v6 = this.e(v6);
                                this.d = true;
                                break;
                            }
                            default: {
                                this.f[v6] = (byte)v7;
                                ++v6;
                            }
                        }
                    }
                    if(!z1 && v6 != v5) {
                        throw new IllegalStateException("Check failed.");
                    }
                    v3 -= v6;
                    v4 += this.b(arr_b, v4, v2, v6);
                }
                return v4 == v && z ? -1 : v4 - v;
            }
        }
        throw new IndexOutOfBoundsException("offset: " + v + ", length: " + v1 + ", buffer size: " + arr_b.length);
    }
}

