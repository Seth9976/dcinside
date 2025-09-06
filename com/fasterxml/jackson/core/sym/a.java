package com.fasterxml.jackson.core.sym;

import androidx.compose.animation.core.d;
import com.fasterxml.jackson.core.exc.b;
import com.fasterxml.jackson.core.util.g;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class a {
    static final class com.fasterxml.jackson.core.sym.a.a {
        public final int a;
        public final int b;
        public final int c;
        public final int[] d;
        public final String[] e;
        public final int f;
        public final int g;

        public com.fasterxml.jackson.core.sym.a.a(int v, int v1, int v2, int[] arr_v, String[] arr_s, int v3, int v4) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = arr_v;
            this.e = arr_s;
            this.f = v3;
            this.g = v4;
        }

        public com.fasterxml.jackson.core.sym.a.a(a a0) {
            this.a = a0.g;
            this.b = a0.k;
            this.c = a0.j;
            this.d = a0.f;
            this.e = a0.l;
            this.f = a0.m;
            this.g = a0.n;
        }

        public static com.fasterxml.jackson.core.sym.a.a a(int v) {
            return new com.fasterxml.jackson.core.sym.a.a(v, 0, a.c(v), new int[v << 3], new String[v << 1], (v << 3) - v, v << 3);
        }
    }

    protected final a a;
    protected final AtomicReference b;
    protected final int c;
    protected final g d;
    protected final boolean e;
    protected int[] f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected String[] l;
    protected int m;
    protected int n;
    protected boolean o;
    private static final int p = 0x40;
    private static final int q = 0x10000;
    private static final int r = 16;
    protected static final int s = 6000;
    private static final int t = 33;
    private static final int u = 0x1003F;
    private static final int v = 0x1F;

    private a(int v, int v1) {
        this.a = null;
        this.k = 0;
        this.o = true;
        this.c = v1;
        this.d = null;
        this.e = true;
        int v2 = 16;
        if(v < 16) {
            v = 16;
        }
        else if((v - 1 & v) != 0) {
            while(v2 < v) {
                v2 += v2;
            }
            v = v2;
        }
        this.b = new AtomicReference(com.fasterxml.jackson.core.sym.a.a.a(v));
    }

    private a(com.fasterxml.jackson.core.sym.a.a a$a0) {
        this.a = null;
        this.c = 0;
        this.d = null;
        this.e = true;
        this.b = null;
        this.k = -1;
        this.f = a$a0.d;
        this.l = a$a0.e;
        this.g = a$a0.a;
        this.h = a$a0.d.length;
        this.i = a$a0.d.length;
        this.j = 1;
        this.m = a$a0.d.length;
        this.n = a$a0.d.length;
        this.o = true;
    }

    private a(a a0, int v, com.fasterxml.jackson.core.sym.a.a a$a0, boolean z, boolean z1) {
        this.a = a0;
        this.c = v;
        this.d = z ? g.d : null;
        this.e = z1;
        this.b = null;
        this.k = a$a0.b;
        this.g = a$a0.a;
        this.h = a$a0.a << 2;
        this.i = (a$a0.a << 2) + (a$a0.a << 2 >> 1);
        this.j = a$a0.c;
        this.f = a$a0.d;
        this.l = a$a0.e;
        this.m = a$a0.f;
        this.n = a$a0.g;
        this.o = true;
    }

    public String A(int v) {
        int v1 = this.b(this.u(v));
        int[] arr_v = this.f;
        int v2 = arr_v[v1 + 3];
        if(v2 == 1) {
            if(arr_v[v1] == v) {
                return this.l[v1 >> 2];
            }
        }
        else if(v2 == 0) {
            return null;
        }
        int v3 = this.h + (v1 >> 3 << 2);
        int v4 = arr_v[v3 + 3];
        if(v4 == 1) {
            return arr_v[v3] == v ? this.l[v3 >> 2] : this.f(v1, v);
        }
        return v4 == 0 ? null : this.f(v1, v);
    }

    public String B(int v, int v1) {
        int v2 = this.b(this.v(v, v1));
        int[] arr_v = this.f;
        int v3 = arr_v[v2 + 3];
        if(v3 == 2) {
            if(v == arr_v[v2] && v1 == arr_v[v2 + 1]) {
                return this.l[v2 >> 2];
            }
        }
        else if(v3 == 0) {
            return null;
        }
        int v4 = this.h + (v2 >> 3 << 2);
        int v5 = arr_v[v4 + 3];
        if(v5 == 2) {
            return v != arr_v[v4] || v1 != arr_v[v4 + 1] ? this.g(v2, v, v1) : this.l[v4 >> 2];
        }
        return v5 == 0 ? null : this.g(v2, v, v1);
    }

    public String C(int v, int v1, int v2) {
        int v3 = this.b(this.w(v, v1, v2));
        int[] arr_v = this.f;
        int v4 = arr_v[v3 + 3];
        if(v4 == 3) {
            if(v == arr_v[v3] && arr_v[v3 + 1] == v1 && arr_v[v3 + 2] == v2) {
                return this.l[v3 >> 2];
            }
        }
        else if(v4 == 0) {
            return null;
        }
        int v5 = this.h + (v3 >> 3 << 2);
        int v6 = arr_v[v5 + 3];
        if(v6 == 3) {
            return v != arr_v[v5] || arr_v[v5 + 1] != v1 || arr_v[v5 + 2] != v2 ? this.h(v3, v, v1, v2) : this.l[v5 >> 2];
        }
        return v6 == 0 ? null : this.h(v3, v, v1, v2);
    }

    public String D(int[] arr_v, int v) {
        if(v < 4) {
            switch(v) {
                case 1: {
                    return this.A(arr_v[0]);
                }
                case 2: {
                    return this.B(arr_v[0], arr_v[1]);
                }
                default: {
                    return v == 3 ? this.C(arr_v[0], arr_v[1], arr_v[2]) : "";
                }
            }
        }
        int v1 = this.x(arr_v, v);
        int v2 = this.b(v1);
        int[] arr_v1 = this.f;
        int v3 = arr_v1[v2 + 3];
        if(v1 == arr_v1[v2] && v3 == v && this.m(arr_v, v, arr_v1[v2 + 1])) {
            return this.l[v2 >> 2];
        }
        if(v3 == 0) {
            return null;
        }
        int v4 = this.h + (v2 >> 3 << 2);
        return v1 != arr_v1[v4] || arr_v1[v4 + 3] != v || !this.m(arr_v, v, arr_v1[v4 + 1]) ? this.i(v2, v1, arr_v, v) : this.l[v4 >> 2];
    }

    public int E() {
        return this.c;
    }

    public boolean F() {
        return this.a != null;
    }

    public a G(int v) {
        Object object0 = this.b.get();
        return new a(this, this.c, ((com.fasterxml.jackson.core.sym.a.a)object0), com.fasterxml.jackson.core.h.a.b.b(v), com.fasterxml.jackson.core.h.a.d.b(v));
    }

    public a H(int v) {
        if(com.fasterxml.jackson.core.h.a.c.b(v)) {
            Object object0 = this.b.get();
            return new a(this, this.c, ((com.fasterxml.jackson.core.sym.a.a)object0), com.fasterxml.jackson.core.h.a.b.b(v), com.fasterxml.jackson.core.h.a.d.b(v));
        }
        return new a(((com.fasterxml.jackson.core.sym.a.a)this.b.get()));
    }

    public boolean I() {
        return !this.o;
    }

    private void J(com.fasterxml.jackson.core.sym.a.a a$a0) {
        int v = a$a0.b;
        com.fasterxml.jackson.core.sym.a.a a$a1 = (com.fasterxml.jackson.core.sym.a.a)this.b.get();
        if(v == a$a1.b) {
            return;
        }
        if(v > 6000) {
            a$a0 = com.fasterxml.jackson.core.sym.a.a.a(0x40);
        }
        d.a(this.b, a$a1, a$a0);
    }

    private void K(boolean z) {
        this.k = 0;
        this.m = this.l();
        this.n = this.g << 3;
        if(z) {
            Arrays.fill(this.f, 0);
            Arrays.fill(this.l, null);
        }
    }

    public int L() {
        int v = this.h;
        int v1 = 0;
        for(int v2 = 3; v2 < v; v2 += 4) {
            if(this.f[v2] != 0) {
                ++v1;
            }
        }
        return v1;
    }

    private void M() throws b {
        this.o = false;
        int[] arr_v = this.f;
        String[] arr_s = this.l;
        int v = this.g;
        int v1 = this.k;
        int v2 = v + v;
        int v3 = this.m;
        if(v2 > 0x10000) {
            this.K(true);
            return;
        }
        this.f = new int[arr_v.length + (v << 3)];
        this.g = v2;
        this.h = v2 << 2;
        this.i = (v2 << 2) + (v2 << 2 >> 1);
        this.j = a.c(v2);
        this.l = new String[arr_s.length << 1];
        this.K(false);
        int[] arr_v1 = new int[16];
        int v5 = 0;
        for(int v4 = 0; v4 < v3; v4 += 4) {
            int v6 = arr_v[v4 + 3];
            if(v6 != 0) {
                ++v5;
                String s = arr_s[v4 >> 2];
                if(v6 == 1) {
                    arr_v1[0] = arr_v[v4];
                    this.s(s, arr_v1, 1);
                }
                else {
                    switch(v6) {
                        case 2: {
                            arr_v1[0] = arr_v[v4];
                            arr_v1[1] = arr_v[v4 + 1];
                            this.s(s, arr_v1, 2);
                            break;
                        }
                        case 3: {
                            arr_v1[0] = arr_v[v4];
                            arr_v1[1] = arr_v[v4 + 1];
                            arr_v1[2] = arr_v[v4 + 2];
                            this.s(s, arr_v1, 3);
                            break;
                        }
                        default: {
                            if(v6 > arr_v1.length) {
                                arr_v1 = new int[v6];
                            }
                            System.arraycopy(arr_v, arr_v[v4 + 1], arr_v1, 0, v6);
                            this.s(s, arr_v1, v6);
                        }
                    }
                }
            }
        }
        if(v5 != v1) {
            throw new IllegalStateException("Internal error: Failed rehash(), old count=" + v1 + ", copyCount=" + v5);
        }
    }

    public void N() {
        if(this.a != null && this.I()) {
            com.fasterxml.jackson.core.sym.a.a a$a0 = new com.fasterxml.jackson.core.sym.a.a(this);
            this.a.J(a$a0);
            this.o = true;
        }
    }

    public int O() {
        int v = this.h + 3;
        int v1 = this.i;
        int v2 = 0;
        while(v < v1) {
            if(this.f[v] != 0) {
                ++v2;
            }
            v += 4;
        }
        return v2;
    }

    public int P() {
        return this.b == null ? this.k : ((com.fasterxml.jackson.core.sym.a.a)this.b.get()).b;
    }

    public int Q() {
        return this.m - this.l() >> 2;
    }

    public int R() {
        int v = this.i + 3;
        int v1 = this.g + v;
        int v2 = 0;
        while(v < v1) {
            if(this.f[v] != 0) {
                ++v2;
            }
            v += 4;
        }
        return v2;
    }

    public int S() {
        int v1 = this.g << 3;
        int v2 = 0;
        for(int v = 3; v < v1; v += 4) {
            if(this.f[v] != 0) {
                ++v2;
            }
        }
        return v2;
    }

    private int a(int[] arr_v, int v) {
        int v1 = this.n;
        int v2 = v1 + v;
        int[] arr_v1 = this.f;
        if(v2 > arr_v1.length) {
            this.f = Arrays.copyOf(this.f, this.f.length + Math.max(v2 - arr_v1.length, Math.min(0x1000, this.g)));
        }
        System.arraycopy(arr_v, 0, this.f, v1, v);
        this.n += v;
        return v1;
    }

    private final int b(int v) {
        return (v & this.g - 1) << 2;
    }

    static int c(int v) {
        if(v >> 2 < 0x40) {
            return 4;
        }
        if(v >> 2 <= 0x100) {
            return 5;
        }
        return v >> 2 > 0x400 ? 7 : 6;
    }

    private boolean d() {
        return this.k > this.g >> 1 && (this.m - this.l() >> 2 > this.k + 1 >> 7 || ((double)this.k) > ((double)this.g) * 0.8);
    }

    private int e(int v) throws b {
        int v1 = this.b(v);
        int[] arr_v = this.f;
        if(arr_v[v1 + 3] == 0) {
            return v1;
        }
        if(this.d()) {
            return this.k(v);
        }
        int v2 = this.h + (v1 >> 3 << 2);
        if(arr_v[v2 + 3] == 0) {
            return v2;
        }
        int v3 = this.i + (v1 >> this.j + 2 << this.j);
        int v4 = (1 << this.j) + v3;
        while(v3 < v4) {
            if(arr_v[v3 + 3] == 0) {
                return v3;
            }
            v3 += 4;
        }
        int v5 = this.m;
        this.m = v5 + 4;
        if(v5 + 4 >= this.g << 3) {
            if(this.e) {
                this.j();
            }
            return this.k(v);
        }
        return v5;
    }

    private String f(int v, int v1) {
        int v2 = this.i + (v >> this.j + 2 << this.j);
        int[] arr_v = this.f;
        int v3 = (1 << this.j) + v2;
        while(v2 < v3) {
            int v4 = arr_v[v2 + 3];
            if(v1 == arr_v[v2] && 1 == v4) {
                return this.l[v2 >> 2];
            }
            if(v4 == 0) {
                return null;
            }
            v2 += 4;
        }
        for(int v5 = this.l(); v5 < this.m; v5 += 4) {
            if(v1 == arr_v[v5] && 1 == arr_v[v5 + 3]) {
                return this.l[v5 >> 2];
            }
        }
        return null;
    }

    private String g(int v, int v1, int v2) {
        int v3 = this.i + (v >> this.j + 2 << this.j);
        int[] arr_v = this.f;
        int v4 = (1 << this.j) + v3;
        while(v3 < v4) {
            int v5 = arr_v[v3 + 3];
            if(v1 == arr_v[v3] && v2 == arr_v[v3 + 1] && 2 == v5) {
                return this.l[v3 >> 2];
            }
            if(v5 == 0) {
                return null;
            }
            v3 += 4;
        }
        for(int v6 = this.l(); v6 < this.m; v6 += 4) {
            if(v1 == arr_v[v6] && v2 == arr_v[v6 + 1] && 2 == arr_v[v6 + 3]) {
                return this.l[v6 >> 2];
            }
        }
        return null;
    }

    private String h(int v, int v1, int v2, int v3) {
        int v4 = this.i + (v >> this.j + 2 << this.j);
        int[] arr_v = this.f;
        int v5 = (1 << this.j) + v4;
        while(v4 < v5) {
            int v6 = arr_v[v4 + 3];
            if(v1 == arr_v[v4] && v2 == arr_v[v4 + 1] && v3 == arr_v[v4 + 2] && 3 == v6) {
                return this.l[v4 >> 2];
            }
            if(v6 == 0) {
                return null;
            }
            v4 += 4;
        }
        for(int v7 = this.l(); v7 < this.m; v7 += 4) {
            if(v1 == arr_v[v7] && v2 == arr_v[v7 + 1] && v3 == arr_v[v7 + 2] && 3 == arr_v[v7 + 3]) {
                return this.l[v7 >> 2];
            }
        }
        return null;
    }

    private String i(int v, int v1, int[] arr_v, int v2) {
        int v3 = this.i + (v >> this.j + 2 << this.j);
        int[] arr_v1 = this.f;
        int v4 = (1 << this.j) + v3;
        while(v3 < v4) {
            int v5 = arr_v1[v3 + 3];
            if(v1 == arr_v1[v3] && v2 == v5 && this.m(arr_v, v2, arr_v1[v3 + 1])) {
                return this.l[v3 >> 2];
            }
            if(v5 == 0) {
                return null;
            }
            v3 += 4;
        }
        for(int v6 = this.l(); v6 < this.m; v6 += 4) {
            if(v1 == arr_v1[v6] && v2 == arr_v1[v6 + 3] && this.m(arr_v, v2, arr_v1[v6 + 1])) {
                return this.l[v6 >> 2];
            }
        }
        return null;
    }

    protected void j() throws b {
        if(this.g > 0x400) {
            throw new b("Spill-over slots in symbol table with " + this.k + " entries, hash area of " + this.g + " slots is now full (all " + (this.g >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
        }
    }

    private int k(int v) throws b {
        this.M();
        int v1 = this.b(v);
        int[] arr_v = this.f;
        if(arr_v[v1 + 3] == 0) {
            return v1;
        }
        int v2 = this.h + (v1 >> 3 << 2);
        if(arr_v[v2 + 3] == 0) {
            return v2;
        }
        int v3 = this.i + (v1 >> this.j + 2 << this.j);
        int v4 = (1 << this.j) + v3;
        while(v3 < v4) {
            if(arr_v[v3 + 3] == 0) {
                return v3;
            }
            v3 += 4;
        }
        int v5 = this.m;
        this.m = v5 + 4;
        return v5;
    }

    private final int l() {
        return (this.g << 3) - this.g;
    }

    private boolean m(int[] arr_v, int v, int v1) {
        int v5;
        int v4;
        int v3;
        int v2;
        int[] arr_v1 = this.f;
        switch(v) {
            case 4: {
                v2 = 0;
                goto label_27;
            }
            case 5: {
                v3 = 0;
                goto label_23;
            }
            case 6: {
                v4 = 0;
                goto label_19;
            }
            case 7: {
                v5 = 0;
                break;
            }
            case 8: {
                if(arr_v[0] != arr_v1[v1]) {
                    return false;
                }
                ++v1;
                v5 = 1;
                break;
            }
            default: {
                return this.n(arr_v, v, v1);
            }
        }
        v4 = v5 + 1;
        if(arr_v[v5] != arr_v1[v1]) {
            return false;
        }
        ++v1;
    label_19:
        v3 = v4 + 1;
        if(arr_v[v4] != arr_v1[v1]) {
            return false;
        }
        ++v1;
    label_23:
        v2 = v3 + 1;
        if(arr_v[v3] != arr_v1[v1]) {
            return false;
        }
        ++v1;
    label_27:
        if(arr_v[v2] != arr_v1[v1]) {
            return false;
        }
        if(arr_v[v2 + 1] != arr_v1[v1 + 1]) {
            return false;
        }
        return arr_v[v2 + 2] == arr_v1[v1 + 2] ? arr_v[v2 + 3] == arr_v1[v1 + 3] : false;
    }

    private boolean n(int[] arr_v, int v, int v1) {
        int v2 = 0;
        while(true) {
            if(arr_v[v2] != this.f[v1]) {
                return false;
            }
            if(v2 + 1 >= v) {
                return true;
            }
            ++v2;
            ++v1;
        }
    }

    private void o() {
        if(this.o) {
            if(this.a == null) {
                throw this.k == 0 ? new IllegalStateException("Internal error: Cannot add names to Root symbol table") : new IllegalStateException("Internal error: Cannot add names to Placeholder symbol table");
            }
            this.f = Arrays.copyOf(this.f, this.f.length);
            this.l = (String[])Arrays.copyOf(this.l, this.l.length);
            this.o = false;
        }
    }

    public String p(String s, int v) throws b {
        this.o();
        g g0 = this.d;
        if(g0 != null) {
            s = g0.a(s);
        }
        int v1 = this.e(this.u(v));
        int[] arr_v = this.f;
        arr_v[v1] = v;
        arr_v[v1 + 3] = 1;
        this.l[v1 >> 2] = s;
        ++this.k;
        return s;
    }

    public String q(String s, int v, int v1) throws b {
        this.o();
        g g0 = this.d;
        if(g0 != null) {
            s = g0.a(s);
        }
        int v2 = this.e(this.v(v, v1));
        int[] arr_v = this.f;
        arr_v[v2] = v;
        arr_v[v2 + 1] = v1;
        arr_v[v2 + 3] = 2;
        this.l[v2 >> 2] = s;
        ++this.k;
        return s;
    }

    public String r(String s, int v, int v1, int v2) throws b {
        this.o();
        g g0 = this.d;
        if(g0 != null) {
            s = g0.a(s);
        }
        int v3 = this.e(this.w(v, v1, v2));
        int[] arr_v = this.f;
        arr_v[v3] = v;
        arr_v[v3 + 1] = v1;
        arr_v[v3 + 2] = v2;
        arr_v[v3 + 3] = 3;
        this.l[v3 >> 2] = s;
        ++this.k;
        return s;
    }

    public String s(String s, int[] arr_v, int v) throws b {
        int v2;
        this.o();
        g g0 = this.d;
        if(g0 != null) {
            s = g0.a(s);
        }
        switch(v) {
            case 1: {
                v2 = this.e(this.u(arr_v[0]));
                int[] arr_v3 = this.f;
                arr_v3[v2] = arr_v[0];
                arr_v3[v2 + 3] = 1;
                break;
            }
            case 2: {
                v2 = this.e(this.v(arr_v[0], arr_v[1]));
                int[] arr_v4 = this.f;
                arr_v4[v2] = arr_v[0];
                arr_v4[v2 + 1] = arr_v[1];
                arr_v4[v2 + 3] = 2;
                break;
            }
            default: {
                if(v == 3) {
                    int v4 = this.e(this.w(arr_v[0], arr_v[1], arr_v[2]));
                    int[] arr_v2 = this.f;
                    arr_v2[v4] = arr_v[0];
                    arr_v2[v4 + 1] = arr_v[1];
                    arr_v2[v4 + 2] = arr_v[2];
                    arr_v2[v4 + 3] = 3;
                    v2 = v4;
                }
                else {
                    int v1 = this.x(arr_v, v);
                    v2 = this.e(v1);
                    this.f[v2] = v1;
                    int v3 = this.a(arr_v, v);
                    int[] arr_v1 = this.f;
                    arr_v1[v2 + 1] = v3;
                    arr_v1[v2 + 3] = v;
                }
            }
        }
        this.l[v2 >> 2] = s;
        ++this.k;
        return s;
    }

    public int t() {
        return this.g;
    }

    @Override
    public String toString() {
        int v = this.L();
        int v1 = this.O();
        int v2 = this.R();
        int v3 = this.Q();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", "com.fasterxml.jackson.core.sym.a", this.k, this.g, v, v1, v2, v3, ((int)(v + v1 + v2 + v3)), this.S());
    }

    public int u(int v) {
        int v1 = v ^ this.c;
        int v2 = v1 + (v1 >>> 16);
        int v3 = v2 ^ v2 << 3;
        return v3 + (v3 >>> 12);
    }

    public int v(int v, int v1) {
        int v2 = v + (v >>> 15);
        int v3 = (v2 ^ v2 >>> 9) + v1 * 33 ^ this.c;
        int v4 = v3 + (v3 >>> 16);
        int v5 = v4 ^ v4 >>> 4;
        return v5 + (v5 << 3);
    }

    public int w(int v, int v1, int v2) {
        int v3 = v ^ this.c;
        int v4 = ((v3 + (v3 >>> 9)) * 0x1F + v1) * 33;
        int v5 = v4 + (v4 >>> 15) ^ v2;
        int v6 = v5 + (v5 >>> 4);
        int v7 = v6 + (v6 >>> 15);
        return v7 ^ v7 << 9;
    }

    public int x(int[] arr_v, int v) {
        if(v < 4) {
            throw new IllegalArgumentException("qlen is too short, needs to be at least 4");
        }
        int v1 = arr_v[0] ^ this.c;
        int v2 = v1 + (v1 >>> 9) + arr_v[1];
        int v3 = (v2 + (v2 >>> 15)) * 33 ^ arr_v[2];
        int v4 = v3 + (v3 >>> 4);
        for(int v5 = 3; v5 < v; ++v5) {
            int v6 = arr_v[v5];
            v4 += v6 ^ v6 >> 21;
        }
        int v7 = v4 * 0x1003F + (v4 * 0x1003F >>> 19);
        return v7 << 5 ^ v7;
    }

    public static a y() {
        long v = System.currentTimeMillis();
        return a.z(((int)v) + ((int)(v >>> 0x20)) | 1);
    }

    protected static a z(int v) {
        return new a(0x40, v);
    }
}

