package kotlin.io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.L;
import y4.l;

@f
final class e extends OutputStream {
    @l
    private final OutputStream a;
    @l
    private final a b;
    private boolean c;
    private int d;
    @l
    private final byte[] e;
    @l
    private final byte[] f;
    private int g;

    public e(@l OutputStream outputStream0, @l a a0) {
        L.p(outputStream0, "output");
        L.p(a0, "base64");
        super();
        this.a = outputStream0;
        this.b = a0;
        this.d = a0.D() ? 76 : -1;
        this.e = new byte[0x400];
        this.f = new byte[3];
    }

    private final void a() {
        if(this.c) {
            throw new IOException("The output stream is closed.");
        }
    }

    private final int b(byte[] arr_b, int v, int v1) {
        int v2 = Math.min(3 - this.g, v1 - v);
        kotlin.collections.l.v0(arr_b, this.f, this.g, v, v + v2);
        int v3 = this.g + v2;
        this.g = v3;
        if(v3 == 3) {
            this.c();
        }
        return v2;
    }

    private final void c() {
        if(this.e(this.f, 0, this.g) != 4) {
            throw new IllegalStateException("Check failed.");
        }
        this.g = 0;
    }

    @Override
    public void close() {
        if(!this.c) {
            this.c = true;
            if(this.g != 0) {
                this.c();
            }
            this.a.close();
        }
    }

    private final int e(byte[] arr_b, int v, int v1) {
        int v2 = this.b.t(arr_b, this.e, 0, v, v1);
        if(this.d == 0) {
            this.a.write(new byte[]{13, 10});
            this.d = 76;
            if(v2 > 76) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.a.write(this.e, 0, v2);
        this.d -= v2;
        return v2;
    }

    @Override
    public void flush() {
        this.a();
        this.a.flush();
    }

    @Override
    public void write(int v) {
        this.a();
        int v1 = this.g;
        this.g = v1 + 1;
        this.f[v1] = (byte)v;
        if(v1 + 1 == 3) {
            this.c();
        }
    }

    @Override
    public void write(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "source");
        this.a();
        if(v >= 0 && v1 >= 0) {
            int v2 = v + v1;
            if(v2 <= arr_b.length) {
                if(v1 == 0) {
                    return;
                }
                int v3 = this.g;
                if(v3 >= 3) {
                    throw new IllegalStateException("Check failed.");
                }
                if(v3 != 0) {
                    v += this.b(arr_b, v, v2);
                    if(this.g != 0) {
                        return;
                    }
                }
                while(v + 3 <= v2) {
                    int v4 = Math.min((this.b.D() ? this.d : this.e.length) / 4, (v2 - v) / 3);
                    int v5 = v4 * 3 + v;
                    if(this.e(arr_b, v, v5) != v4 * 4) {
                        throw new IllegalStateException("Check failed.");
                    }
                    v = v5;
                }
                kotlin.collections.l.v0(arr_b, this.f, 0, v, v2);
                this.g = v2 - v;
                return;
            }
        }
        throw new IndexOutOfBoundsException("offset: " + v + ", length: " + v1 + ", source size: " + arr_b.length);
    }
}

