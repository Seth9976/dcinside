package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class Sonic {
    private final int a;
    private final int b;
    private final float c;
    private final float d;
    private final float e;
    private final int f;
    private final int g;
    private final int h;
    private final short[] i;
    private short[] j;
    private int k;
    private short[] l;
    private int m;
    private short[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private static final int w = 65;
    private static final int x = 400;
    private static final int y = 4000;
    private static final int z = 2;

    public Sonic(int v, int v1, float f, float f1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = f;
        this.d = f1;
        this.e = ((float)v) / ((float)v2);
        this.f = v / 400;
        this.g = v / 65;
        int v3 = v / 65 * 2;
        this.h = v3;
        this.i = new short[v3];
        this.j = new short[v3 * v1];
        this.l = new short[v3 * v1];
        this.n = new short[v3 * v1];
    }

    private void a(float f, int v) {
        int v5;
        int v4;
        if(this.m == v) {
            return;
        }
        int v1 = this.a;
        int v2 = (int)(((float)v1) / f);
        while(v2 > 0x4000 || v1 > 0x4000) {
            v2 /= 2;
            v1 /= 2;
        }
        this.o(v);
        for(int v3 = 0; true; ++v3) {
            v4 = this.o;
            boolean z = true;
            if(v3 >= v4 - 1) {
                break;
            }
            while(true) {
                v5 = this.p;
                int v6 = this.q;
                if((v5 + 1) * v2 <= v6 * v1) {
                    break;
                }
                this.l = this.f(this.l, this.m, 1);
                for(int v7 = 0; true; ++v7) {
                    int v8 = this.b;
                    if(v7 >= v8) {
                        break;
                    }
                    short[] arr_v = this.l;
                    int v9 = this.m * v8 + v7;
                    arr_v[v9] = this.n(this.n, v8 * v3 + v7, v1, v2);
                }
                ++this.q;
                ++this.m;
            }
            this.p = v5 + 1;
            if(v5 + 1 == v1) {
                this.p = 0;
                if(v6 != v2) {
                    z = false;
                }
                Assertions.i(z);
                this.q = 0;
            }
        }
        this.u(v4 - 1);
    }

    private void b(float f) {
        int v2;
        int v = this.k;
        if(v < this.h) {
            return;
        }
        int v1 = 0;
        do {
            if(this.r > 0) {
                v2 = this.c(v1);
            }
            else {
                int v3 = this.g(this.j, v1);
                v2 = ((double)f) > 1.0 ? v3 + this.w(this.j, v1, f, v3) : this.m(this.j, v1, f, v3);
            }
            v1 += v2;
        }
        while(this.h + v1 <= v);
        this.v(v1);
    }

    private int c(int v) {
        int v1 = Math.min(this.h, this.r);
        this.d(this.j, v, v1);
        this.r -= v1;
        return v1;
    }

    private void d(short[] arr_v, int v, int v1) {
        short[] arr_v1 = this.f(this.l, this.m, v1);
        this.l = arr_v1;
        System.arraycopy(arr_v, v * this.b, arr_v1, this.m * this.b, this.b * v1);
        this.m += v1;
    }

    private void e(short[] arr_v, int v, int v1) {
        int v2 = this.h / v1;
        int v3 = v1 * this.b;
        int v4 = v * this.b;
        for(int v5 = 0; v5 < v2; ++v5) {
            int v7 = 0;
            for(int v6 = 0; v6 < v3; ++v6) {
                v7 += arr_v[v5 * v3 + v4 + v6];
            }
            this.i[v5] = (short)(v7 / v3);
        }
    }

    private short[] f(short[] arr_v, int v, int v1) {
        int v2 = arr_v.length / this.b;
        return v + v1 > v2 ? Arrays.copyOf(arr_v, (v2 * 3 / 2 + v1) * this.b) : arr_v;
    }

    private int g(short[] arr_v, int v) {
        int v2;
        int v1 = this.a <= 4000 ? 1 : this.a / 4000;
        if(this.b != 1 || v1 != 1) {
            this.e(arr_v, v, v1);
            int v3 = this.h(this.i, 0, this.f / v1, this.g / v1);
            if(v1 == 1) {
                v2 = v3;
            }
            else {
                int v4 = v3 * v1;
                int v5 = v4 - v1 * 4;
                int v6 = v4 + v1 * 4;
                int v7 = this.f;
                if(v5 < v7) {
                    v5 = v7;
                }
                int v8 = this.g;
                if(v6 > v8) {
                    v6 = v8;
                }
                if(this.b == 1) {
                    v2 = this.h(arr_v, v, v5, v6);
                }
                else {
                    this.e(arr_v, v, 1);
                    v2 = this.h(this.i, 0, v5, v6);
                }
            }
        }
        else {
            v2 = this.h(arr_v, v, this.f, this.g);
        }
        int v9 = this.q(this.u, this.v) ? this.s : v2;
        this.t = this.u;
        this.s = v2;
        return v9;
    }

    private int h(short[] arr_v, int v, int v1, int v2) {
        int v3 = v * this.b;
        int v4 = 0xFF;
        int v5 = 1;
        int v6 = 0;
        int v7 = 0;
        while(v1 <= v2) {
            int v9 = 0;
            for(int v8 = 0; v8 < v1; ++v8) {
                v9 += Math.abs(arr_v[v3 + v8] - arr_v[v3 + v1 + v8]);
            }
            if(v9 * v6 < v5 * v1) {
                v6 = v1;
                v5 = v9;
            }
            if(v9 * v4 > v7 * v1) {
                v4 = v1;
                v7 = v9;
            }
            ++v1;
        }
        this.u = v5 / v6;
        this.v = v7 / v4;
        return v6;
    }

    public void i() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public void j(ShortBuffer shortBuffer0) {
        int v = Math.min(shortBuffer0.remaining() / this.b, this.m);
        shortBuffer0.put(this.l, 0, this.b * v);
        int v1 = this.m - v;
        this.m = v1;
        System.arraycopy(this.l, v * this.b, this.l, 0, v1 * this.b);
    }

    public int k() {
        return this.m * this.b * 2;
    }

    public int l() {
        return this.k * this.b * 2;
    }

    private int m(short[] arr_v, int v, float f, int v1) {
        int v2;
        if(f < 0.5f) {
            v2 = (int)(((float)v1) * f / (1.0f - f));
        }
        else {
            this.r = (int)(((float)v1) * (2.0f * f - 1.0f) / (1.0f - f));
            v2 = v1;
        }
        int v3 = v1 + v2;
        short[] arr_v1 = this.f(this.l, this.m, v3);
        this.l = arr_v1;
        System.arraycopy(arr_v, v * this.b, arr_v1, this.m * this.b, this.b * v1);
        Sonic.p(v2, this.b, this.l, this.m + v1, arr_v, v + v1, arr_v, v);
        this.m += v3;
        return v2;
    }

    private short n(short[] arr_v, int v, int v1, int v2) {
        int v3 = (this.p + 1) * v2;
        int v4 = v3 - this.q * v1;
        int v5 = v3 - this.p * v2;
        return (short)((arr_v[v] * v4 + (v5 - v4) * arr_v[v + this.b]) / v5);
    }

    private void o(int v) {
        int v1 = this.m - v;
        short[] arr_v = this.f(this.n, this.o, v1);
        this.n = arr_v;
        System.arraycopy(this.l, v * this.b, arr_v, this.o * this.b, this.b * v1);
        this.m = v;
        this.o += v1;
    }

    private static void p(int v, int v1, short[] arr_v, int v2, short[] arr_v1, int v3, short[] arr_v2, int v4) {
        for(int v5 = 0; v5 < v1; ++v5) {
            int v6 = v2 * v1 + v5;
            int v7 = v4 * v1 + v5;
            int v8 = v3 * v1 + v5;
            for(int v9 = 0; v9 < v; ++v9) {
                arr_v[v6] = (short)((arr_v1[v8] * (v - v9) + arr_v2[v7] * v9) / v);
                v6 += v1;
                v8 += v1;
                v7 += v1;
            }
        }
    }

    private boolean q(int v, int v1) {
        return v != 0 && this.s != 0 && v1 <= v * 3 ? v * 2 > this.t * 3 : false;
    }

    private void r() {
        int v = this.m;
        float f = this.c / this.d;
        float f1 = this.e * this.d;
        if(((double)f) > 1.00001 || ((double)f) < 0.99999) {
            this.b(f);
        }
        else {
            this.d(this.j, 0, this.k);
            this.k = 0;
        }
        if(f1 != 1.0f) {
            this.a(f1, v);
        }
    }

    public void s() {
        int v3;
        int v = this.k;
        int v1 = this.m + ((int)((((float)v) / (this.c / this.d) + ((float)this.o)) / (this.e * this.d) + 0.5f));
        this.j = this.f(this.j, v, this.h * 2 + v);
        for(int v2 = 0; true; ++v2) {
            v3 = this.h;
            int v4 = this.b;
            if(v2 >= v3 * 2 * v4) {
                break;
            }
            this.j[v4 * v + v2] = 0;
        }
        this.k += v3 * 2;
        this.r();
        if(this.m > v1) {
            this.m = v1;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    public void t(ShortBuffer shortBuffer0) {
        int v = shortBuffer0.remaining() / this.b;
        short[] arr_v = this.f(this.j, this.k, v);
        this.j = arr_v;
        shortBuffer0.get(arr_v, this.k * this.b, this.b * v * 2 / 2);
        this.k += v;
        this.r();
    }

    private void u(int v) {
        if(v == 0) {
            return;
        }
        System.arraycopy(this.n, v * this.b, this.n, 0, (this.o - v) * this.b);
        this.o -= v;
    }

    private void v(int v) {
        int v1 = this.k - v;
        System.arraycopy(this.j, v * this.b, this.j, 0, this.b * v1);
        this.k = v1;
    }

    private int w(short[] arr_v, int v, float f, int v1) {
        int v2;
        if(f >= 2.0f) {
            v2 = (int)(((float)v1) / (f - 1.0f));
        }
        else {
            this.r = (int)(((float)v1) * (2.0f - f) / (f - 1.0f));
            v2 = v1;
        }
        short[] arr_v1 = this.f(this.l, this.m, v2);
        this.l = arr_v1;
        Sonic.p(v2, this.b, arr_v1, this.m, arr_v, v, arr_v, v + v1);
        this.m += v2;
        return v2;
    }
}

