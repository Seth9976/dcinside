package javassist.bytecode;

import java.io.IOException;
import java.io.OutputStream;

final class h extends OutputStream {
    private byte[] a;
    private int b;

    public h() {
        this(0x20);
    }

    public h(int v) {
        this.a = new byte[v];
        this.b = 0;
    }

    public void a(int v) {
        int v1 = this.b;
        int v2 = v + v1;
        byte[] arr_b = this.a;
        if(v2 > arr_b.length) {
            int v3 = arr_b.length << 1;
            if(v3 > v2) {
                v2 = v3;
            }
            byte[] arr_b1 = new byte[v2];
            System.arraycopy(arr_b, 0, arr_b1, 0, v1);
            this.a = arr_b1;
        }
    }

    public int b() {
        return this.b;
    }

    public byte[] c() [...] // 潜在的解密器

    public void e(int v, int v1) {
        this.a[v] = (byte)v1;
    }

    public void f(int v) {
        this.a(v);
        this.b += v;
    }

    public void i(float f) {
        this.j(Float.floatToIntBits(f));
    }

    public void j(int v) {
        this.a(4);
        int v1 = this.b;
        byte[] arr_b = this.a;
        arr_b[v1] = (byte)(v >>> 24);
        arr_b[v1 + 1] = (byte)(v >>> 16);
        arr_b[v1 + 2] = (byte)(v >>> 8);
        arr_b[v1 + 3] = (byte)v;
        this.b = v1 + 4;
    }

    public void k(int v, int v1) {
        byte[] arr_b = this.a;
        arr_b[v] = (byte)(v1 >>> 24);
        arr_b[v + 1] = (byte)(v1 >>> 16);
        arr_b[v + 2] = (byte)(v1 >>> 8);
        arr_b[v + 3] = (byte)v1;
    }

    public void n(long v) {
        this.a(8);
        int v1 = this.b;
        byte[] arr_b = this.a;
        arr_b[v1] = (byte)(((int)(v >>> 56)));
        arr_b[v1 + 1] = (byte)(((int)(v >>> 0x30)));
        arr_b[v1 + 2] = (byte)(((int)(v >>> 40)));
        arr_b[v1 + 3] = (byte)(((int)(v >>> 0x20)));
        arr_b[v1 + 4] = (byte)(((int)(v >>> 24)));
        arr_b[v1 + 5] = (byte)(((int)(v >>> 16)));
        arr_b[v1 + 6] = (byte)(((int)(v >>> 8)));
        arr_b[v1 + 7] = (byte)(((int)v));
        this.b = v1 + 8;
    }

    public void o(int v) {
        this.a(2);
        int v1 = this.b;
        byte[] arr_b = this.a;
        arr_b[v1] = (byte)(v >>> 8);
        arr_b[v1 + 1] = (byte)v;
        this.b = v1 + 2;
    }

    public void p(int v, int v1) {
        byte[] arr_b = this.a;
        arr_b[v] = (byte)(v1 >>> 8);
        arr_b[v + 1] = (byte)v1;
    }

    public void q(OutputStream outputStream0) throws IOException {
        outputStream0.write(this.a, 0, this.b);
    }

    public void s(String s) {
        int v = s.length();
        int v1 = this.b;
        this.a(v + 2);
        byte[] arr_b = this.a;
        arr_b[v1] = (byte)(v >>> 8);
        int v2 = v1 + 2;
        arr_b[v1 + 1] = (byte)v;
        int v3 = 0;
        while(v3 < v) {
            int v4 = s.charAt(v3);
            if(1 <= v4 && v4 <= 0x7F) {
                arr_b[v2] = (byte)v4;
                ++v3;
                ++v2;
                continue;
            }
            this.t(s, v, v3);
            return;
        }
        this.b = v2;
    }

    public int size() {
        return this.b;
    }

    private void t(String s, int v, int v1) {
        int v2 = v;
        for(int v3 = v1; v3 < v; ++v3) {
            int v4 = s.charAt(v3);
            if(v4 > 0x7FF) {
                v2 += 2;
            }
            else if(v4 == 0 || v4 > 0x7F) {
                ++v2;
            }
        }
        if(v2 > 0xFFFF) {
            throw new RuntimeException("encoded string too long: " + v + v2 + " bytes");
        }
        this.a(v2 + 2);
        int v5 = this.b;
        byte[] arr_b = this.a;
        arr_b[v5] = (byte)(v2 >>> 8);
        arr_b[v5 + 1] = (byte)v2;
        int v6 = v5 + (v1 + 2);
        while(v1 < v) {
            int v7 = s.charAt(v1);
            if(1 <= v7 && v7 <= 0x7F) {
                arr_b[v6] = (byte)v7;
                ++v6;
            }
            else if(v7 > 0x7FF) {
                arr_b[v6] = (byte)(v7 >> 12 & 15 | 0xE0);
                arr_b[v6 + 1] = (byte)(v7 >> 6 & 0x3F | 0x80);
                arr_b[v6 + 2] = (byte)(v7 & 0x3F | 0x80);
                v6 += 3;
            }
            else {
                arr_b[v6] = (byte)(v7 >> 6 & 0x1F | 0xC0);
                arr_b[v6 + 1] = (byte)(v7 & 0x3F | 0x80);
                v6 += 2;
            }
            ++v1;
        }
        this.b = v6;
    }

    @Override
    public void write(int v) {
        this.a(1);
        int v1 = this.b;
        this.a[v1] = (byte)v;
        this.b = v1 + 1;
    }

    @Override
    public void write(byte[] arr_b) {
        this.write(arr_b, 0, arr_b.length);
    }

    @Override
    public void write(byte[] arr_b, int v, int v1) {
        this.a(v1);
        System.arraycopy(arr_b, v, this.a, this.b, v1);
        this.b += v1;
    }

    public void writeDouble(double f) {
        this.n(Double.doubleToLongBits(f));
    }
}

