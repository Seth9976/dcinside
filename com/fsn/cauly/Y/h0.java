package com.fsn.cauly.Y;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import java.io.InputStream;
import java.util.Vector;

public class h0 {
    static class a {
        public Bitmap a;
        public int b;

        public a(Bitmap bitmap0, int v) {
            this.a = bitmap0;
            this.b = v;
        }
    }

    protected Bitmap A;
    protected byte[] B;
    protected int C;
    protected int D;
    protected int E;
    protected boolean F;
    protected int G;
    protected int H;
    protected short[] I;
    protected byte[] J;
    protected byte[] K;
    protected byte[] L;
    protected Vector M;
    protected int N;
    private boolean O;
    protected InputStream a;
    protected int b;
    protected int c;
    protected int d;
    protected boolean e;
    protected int f;
    protected int g;
    protected int[] h;
    protected int[] i;
    protected int[] j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected boolean o;
    protected boolean p;
    protected int q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected int v;
    protected int w;
    protected int x;
    protected int y;
    protected Bitmap z;

    public h0() {
        this.g = 1;
        this.B = new byte[0x100];
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.G = 0;
        this.O = false;
    }

    public int a(int v) {
        this.G = -1;
        if(v >= 0 && v < this.N) {
            this.G = ((a)this.M.elementAt(v)).b;
        }
        return this.G;
    }

    public int a(InputStream inputStream0) {
        this.f();
        if(inputStream0 == null) {
            this.b = 2;
        }
        else {
            this.a = inputStream0;
            this.l();
            if(!this.c()) {
                this.j();
                if(this.N < 0) {
                    this.b = 1;
                }
            }
        }
        this.O = true;
        return this.b;
    }

    public void a() {
        this.j();
        try {
            this.a.close();
        }
        catch(Exception unused_ex) {
        }
    }

    public Bitmap b(int v) {
        return this.N > 0 ? ((a)this.M.elementAt(v % this.N)).a : null;
    }

    protected void b() {
        int v21;
        int v19;
        int v = this.t * this.u;
        if(this.L == null || this.L.length < v) {
            this.L = new byte[v];
        }
        if(this.I == null) {
            this.I = new short[0x1000];
        }
        if(this.J == null) {
            this.J = new byte[0x1000];
        }
        if(this.K == null) {
            this.K = new byte[0x1001];
        }
        int v1 = this.g();
        int v2 = (1 << v1) + 2;
        int v3 = v1 + 1;
        int v4 = (1 << v3) - 1;
        for(int v5 = 0; v5 < 1 << v1; ++v5) {
            this.I[v5] = 0;
            this.J[v5] = (byte)v5;
        }
        int v6 = v3;
        int v7 = v2;
        int v8 = v4;
        int v9 = 0;
        int v10 = 0;
        int v11 = 0;
        int v12 = -1;
        int v13 = 0;
        int v14 = 0;
        int v15 = 0;
        int v16 = 0;
        int v17 = 0;
        while(v10 < v) {
            if(v11 != 0) {
                goto label_86;
            }
            if(v13 < v6) {
                if(v15 == 0) {
                    v15 = this.i();
                    if(v15 <= 0) {
                        break;
                    }
                    v16 = 0;
                }
                v14 += (this.B[v16] & 0xFF) << v13;
                v13 += 8;
                ++v16;
                --v15;
                continue;
            }
            int v18 = v14 & v8;
            v14 >>= v6;
            v13 -= v6;
            if(v18 > v7 || v18 == (1 << v1) + 1) {
                break;
            }
            if(v18 == 1 << v1) {
                v6 = v3;
                v7 = v2;
                v8 = v4;
                v12 = -1;
                continue;
            }
            if(v12 == -1) {
                this.K[0] = this.J[v18];
                v9 = v18;
                v12 = v9;
                v11 = 1;
                continue;
            }
            if(v18 == v7) {
                this.K[0] = (byte)v9;
                v19 = v12;
                v11 = 1;
            }
            else {
                v19 = v18;
            }
            while(v19 > 1 << v1) {
                this.K[v11] = this.J[v19];
                v19 = this.I[v19];
                ++v11;
            }
            int v20 = v3;
            byte[] arr_b = this.J;
            v9 = arr_b[v19] & 0xFF;
            if(v7 < 0x1000) {
                this.K[v11] = (byte)v9;
                this.I[v7] = (short)v12;
                arr_b[v7] = (byte)v9;
                ++v7;
                if((v7 & v8) == 0 && v7 < 0x1000) {
                    ++v6;
                    v8 += v7;
                }
                ++v11;
                v12 = v18;
                goto label_87;
            }
            else {
                v21 = v17;
                goto label_94;
            label_86:
                v20 = v3;
            label_87:
                --v11;
                this.L[v17] = this.K[v11];
                ++v10;
                ++v17;
                v3 = v20;
                continue;
            }
            goto label_94;
        }
        v21 = v17;
    label_94:
        while(v21 < v) {
            this.L[v21] = 0;
            ++v21;
        }
    }

    protected boolean c() {
        return this.b != 0;
    }

    protected int[] c(int v) {
        int v2;
        byte[] arr_b = new byte[v * 3];
        try {
            v2 = this.a.read(arr_b);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            v2 = 0;
        }
        if(v2 < v * 3) {
            this.b = 1;
            return null;
        }
        int[] arr_v = new int[0x100];
        int v3 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v4 = arr_b[v3] & 0xFF;
            int v5 = v3 + 2;
            int v6 = arr_b[v3 + 1] & 0xFF;
            v3 += 3;
            arr_v[v1] = v6 << 8 | (v4 << 16 | 0xFF000000) | arr_b[v5] & 0xFF;
        }
        return arr_v;
    }

    public int d() {
        return this.N;
    }

    public int e() {
        return this.g;
    }

    protected void f() {
        this.b = 0;
        this.N = 0;
        this.M = new Vector();
        this.h = null;
        this.i = null;
    }

    protected int g() {
        try {
            return this.a.read();
        }
        catch(Exception unused_ex) {
            this.b = 1;
            return 0;
        }
    }

    protected void h() {
        this.r = this.o();
        this.s = this.o();
        this.t = this.o();
        this.u = this.o();
        int v = this.g();
        int v1 = 0;
        this.o = (v & 0x80) != 0;
        int v2 = (int)Math.pow(2.0, (v & 7) + 1);
        this.q = v2;
        this.p = (v & 0x40) != 0;
        if(this.o) {
            int[] arr_v = this.c(v2);
            this.i = arr_v;
            this.j = arr_v;
        }
        else {
            this.j = this.h;
            if(this.k == this.H) {
                this.l = 0;
            }
        }
        if(this.F) {
            int[] arr_v1 = this.j;
            int v3 = this.H;
            int v4 = arr_v1[v3];
            arr_v1[v3] = 0;
            v1 = v4;
        }
        if(this.j == null) {
            this.b = 1;
        }
        if(this.c()) {
            return;
        }
        this.b();
        this.r();
        if(this.c()) {
            return;
        }
        ++this.N;
        this.z = Bitmap.createBitmap(this.c, this.d, Bitmap.Config.ARGB_4444);
        this.q();
        this.M.addElement(new a(this.z, this.G));
        if(this.F) {
            this.j[this.H] = v1;
        }
        this.p();
    }

    protected int i() {
        int v3;
        int v = this.g();
        this.C = v;
        int v1 = 0;
        if(v > 0) {
            while(true) {
                int v2 = this.C;
                if(v1 >= v2) {
                    break;
                }
                try {
                    v3 = this.a.read(this.B, v1, v2 - v1);
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                    break;
                }
                if(v3 == -1) {
                    break;
                }
                v1 += v3;
            }
            if(v1 < this.C) {
                this.b = 1;
            }
        }
        return v1;
    }

    protected void j() {
        boolean z = false;
        while(!z && !this.c()) {
            switch(this.g()) {
                case 33: {
                    switch(this.g()) {
                        case 1: {
                            this.r();
                            break;
                        }
                        case 0xF9: {
                            this.k();
                            break;
                        }
                        case 0xFE: {
                            this.r();
                            break;
                        }
                        case 0xFF: {
                            this.i();
                            String s = "";
                            for(int v = 0; v < 11; ++v) {
                                s = s + ((char)this.B[v]);
                            }
                            if(s.equals("NETSCAPE2.0")) {
                                this.n();
                            }
                            else {
                                this.r();
                            }
                            break;
                        }
                        default: {
                            this.r();
                        }
                    }
                    break;
                }
                case 44: {
                    this.h();
                    if(this.O) {
                        continue;
                    }
                    return;
                }
                case 59: {
                    z = true;
                    break;
                }
                default: {
                    this.b = 1;
                }
            }
        }
    }

    protected void k() {
        this.g();
        int v = this.g();
        int v1 = (v & 28) >> 2;
        this.D = v1;
        boolean z = true;
        if(v1 == 0) {
            this.D = 1;
        }
        if((v & 1) == 0) {
            z = false;
        }
        this.F = z;
        this.G = this.o() * 10;
        this.H = this.g();
        this.g();
    }

    protected void l() {
        String s = "";
        for(int v = 0; v < 6; ++v) {
            s = s + ((char)this.g());
        }
        if(!s.startsWith("GIF")) {
            this.b = 1;
            return;
        }
        this.m();
        if(this.e && !this.c()) {
            int[] arr_v = this.c(this.f);
            this.h = arr_v;
            this.l = arr_v[this.k];
        }
    }

    protected void m() {
        this.c = this.o();
        this.d = this.o();
        int v = this.g();
        this.e = (v & 0x80) != 0;
        this.f = 2 << (v & 7);
        this.k = this.g();
        this.n = this.g();
    }

    protected void n() {
        do {
            this.i();
            byte[] arr_b = this.B;
            if(arr_b[0] == 1) {
                this.g = (arr_b[2] & 0xFF) << 8 | arr_b[1] & 0xFF;
            }
        }
        while(this.C > 0 && !this.c());
    }

    protected int o() {
        return this.g() | this.g() << 8;
    }

    protected void p() {
        this.E = this.D;
        this.v = this.r;
        this.w = this.s;
        this.x = this.t;
        this.y = this.u;
        this.A = this.z;
        this.m = this.l;
        this.D = 0;
        this.F = false;
        this.G = 0;
        this.i = null;
    }

    protected void q() {
        int v11;
        int[] arr_v = new int[this.c * this.d];
        int v = this.E;
        int v1 = 0;
        if(v > 0) {
            if(v == 3) {
                int v2 = this.N;
                this.A = v2 - 2 > 0 ? this.b(v2 - 3) : null;
            }
            Bitmap bitmap0 = this.A;
            if(bitmap0 != null) {
                bitmap0.getPixels(arr_v, 0, this.c, 0, 0, this.c, this.d);
                if(this.E == 2) {
                    int v3 = this.F ? 0 : this.m;
                    for(int v4 = 0; v4 < this.y; ++v4) {
                        int v5 = (this.w + v4) * this.c + this.v;
                        int v6 = this.x + v5;
                        while(v5 < v6) {
                            arr_v[v5] = v3;
                            ++v5;
                        }
                    }
                }
            }
        }
        int v7 = 8;
        int v9 = 1;
        for(int v8 = 0; true; v8 = v11) {
            int v10 = this.u;
            if(v1 >= v10) {
                break;
            }
            if(this.p) {
                if(v8 >= v10) {
                    ++v9;
                    switch(v9) {
                        case 2: {
                            v8 = 4;
                            break;
                        }
                        case 3: {
                            v7 = 4;
                            v8 = 2;
                            break;
                        }
                        case 4: {
                            v7 = 2;
                            v8 = 1;
                        }
                    }
                }
                v11 = v8 + v7;
            }
            else {
                v11 = v8;
                v8 = v1;
            }
            int v12 = v8 + this.s;
            if(v12 < this.d) {
                int v13 = v12 * this.c;
                int v14 = this.r + v13;
                int v15 = this.t;
                int v16 = v14 + v15;
                int v17 = v13 + this.c;
                if(v17 < v16) {
                    v16 = v17;
                }
                for(int v18 = v15 * v1; v14 < v16; ++v18) {
                    int v19 = this.j[this.L[v18] & 0xFF];
                    if(v19 != 0) {
                        arr_v[v14] = v19;
                    }
                    ++v14;
                }
            }
            ++v1;
        }
        this.z = Bitmap.createBitmap(arr_v, this.c, this.d, Bitmap.Config.ARGB_4444);
    }

    protected void r() {
        do {
            this.i();
        }
        while(this.C > 0 && !this.c());
    }
}

