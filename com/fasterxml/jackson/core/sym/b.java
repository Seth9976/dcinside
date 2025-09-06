package com.fasterxml.jackson.core.sym;

import androidx.compose.animation.core.d;
import com.fasterxml.jackson.core.E;
import com.fasterxml.jackson.core.util.g;
import com.fasterxml.jackson.core.y;
import java.io.IOException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

public final class b {
    static final class a {
        public final String a;
        public final a b;
        public final int c;

        public a(String s, a b$a0) {
            this.a = s;
            this.b = b$a0;
            this.c = b$a0 == null ? 1 : b$a0.c + 1;
        }

        public String a(char[] arr_c, int v, int v1) {
            if(this.a.length() != v1) {
                return null;
            }
            int v2 = 0;
            do {
                if(this.a.charAt(v2) != arr_c[v + v2]) {
                    return null;
                }
                ++v2;
            }
            while(v2 < v1);
            return this.a;
        }
    }

    static final class com.fasterxml.jackson.core.sym.b.b {
        final int a;
        final int b;
        final String[] c;
        final a[] d;

        public com.fasterxml.jackson.core.sym.b.b(int v, int v1, String[] arr_s, a[] arr_b$a) {
            this.a = v;
            this.b = v1;
            this.c = arr_s;
            this.d = arr_b$a;
        }

        public com.fasterxml.jackson.core.sym.b.b(b b0) {
            this.a = b0.i;
            this.b = b0.l;
            this.c = b0.g;
            this.d = b0.h;
        }

        public static com.fasterxml.jackson.core.sym.b.b a(int v) {
            return new com.fasterxml.jackson.core.sym.b.b(0, 0, new String[v], new a[v >> 1]);
        }
    }

    protected final b a;
    protected final AtomicReference b;
    protected final y c;
    protected final int d;
    protected final int e;
    protected boolean f;
    protected String[] g;
    protected a[] h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected boolean m;
    protected BitSet n;
    public static final int o = 33;
    private static final int p = 0x40;
    private static final int q = 0x10000;
    static final int r = 12000;
    static final int s = 150;

    private b(b b0, y y0, int v, int v1, com.fasterxml.jackson.core.sym.b.b b$b0) {
        this.a = b0;
        this.c = y0;
        this.d = v1;
        this.b = null;
        this.e = v;
        this.f = com.fasterxml.jackson.core.h.a.c.b(v);
        this.g = b$b0.c;
        this.h = b$b0.d;
        this.i = b$b0.a;
        this.l = b$b0.b;
        this.j = b$b0.c.length - (b$b0.c.length >> 2);
        this.k = b$b0.c.length - 1;
        this.m = true;
    }

    private b(y y0, int v, int v1) {
        this.a = null;
        this.d = v1;
        this.c = y0;
        this.f = true;
        this.e = v;
        this.m = false;
        this.l = 0;
        this.b = new AtomicReference(com.fasterxml.jackson.core.sym.b.b.a(0x40));
    }

    private String a(char[] arr_c, int v, int v1, int v2, int v3) throws IOException {
        if(this.m) {
            this.k();
            this.m = false;
        }
        else if(this.i >= this.j) {
            this.w();
            v3 = this.d(this.i(arr_c, v, v1));
        }
        String s = new String(arr_c, v, v1);
        if(com.fasterxml.jackson.core.h.a.b.b(this.e)) {
            s = g.d.a(s);
        }
        ++this.i;
        String[] arr_s = this.g;
        if(arr_s[v3] == null) {
            arr_s[v3] = s;
            return s;
        }
        a b$a0 = new a(s, this.h[v3 >> 1]);
        int v4 = b$a0.c;
        if(v4 > 150) {
            this.c(v3 >> 1, b$a0, v3);
            return s;
        }
        this.h[v3 >> 1] = b$a0;
        this.l = Math.max(v4, this.l);
        return s;
    }

    private String b(char[] arr_c, int v, int v1, a b$a0) {
        while(b$a0 != null) {
            String s = b$a0.a(arr_c, v, v1);
            if(s != null) {
                return s;
            }
            b$a0 = b$a0.b;
        }
        return null;
    }

    private void c(int v, a b$a0, int v1) throws IOException {
        BitSet bitSet0 = this.n;
        if(bitSet0 == null) {
            BitSet bitSet1 = new BitSet();
            this.n = bitSet1;
            bitSet1.set(v);
        }
        else if(bitSet0.get(v)) {
            if(com.fasterxml.jackson.core.h.a.d.b(this.e)) {
                this.e(150);
            }
            this.f = false;
        }
        else {
            this.n.set(v);
        }
        this.g[v1] = b$a0.a;
        this.h[v] = null;
        this.i -= b$a0.c;
        this.l = -1;
    }

    public int d(int v) {
        int v1 = v + (v >>> 15);
        int v2 = v1 ^ v1 << 7;
        return v2 + (v2 >>> 3) & this.k;
    }

    protected void e(int v) throws com.fasterxml.jackson.core.exc.b {
        throw new com.fasterxml.jackson.core.exc.b("Longest collision chain in symbol table (of size " + this.i + ") now exceeds maximum, " + v + " -- suspect a DoS attack based on hash collisions");
    }

    private static int f(int v) [...] // Inlined contents

    public int g() {
        return this.g.length;
    }

    public int h(String s) {
        int v = s.length();
        int v1 = this.d;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 = v1 * 33 + s.charAt(v2);
        }
        return v1 == 0 ? 1 : v1;
    }

    public int i(char[] arr_c, int v, int v1) {
        int v2 = this.d;
        int v3 = v1 + v;
        while(v < v3) {
            v2 = v2 * 33 + arr_c[v];
            ++v;
        }
        return v2 == 0 ? 1 : v2;
    }

    public int j() {
        a[] arr_b$a = this.h;
        int v1 = 0;
        for(int v = 0; v < arr_b$a.length; ++v) {
            a b$a0 = arr_b$a[v];
            if(b$a0 != null) {
                v1 += b$a0.c;
            }
        }
        return v1;
    }

    private void k() {
        this.g = (String[])Arrays.copyOf(this.g, this.g.length);
        this.h = (a[])Arrays.copyOf(this.h, this.h.length);
    }

    @Deprecated
    public static b l() {
        return b.n(null);
    }

    @Deprecated
    public static b m(int v) {
        return b.o(null, v);
    }

    public static b n(E e0) {
        return b.o(e0, 0);
    }

    public static b o(E e0, int v) {
        if(v == 0) {
            v = System.identityHashCode(e0);
        }
        return e0 == null ? new b(y.d(), 0, v) : new b(e0.S(), e0.E(), v);
    }

    public String p(char[] arr_c, int v, int v1, int v2) throws IOException {
        if(v1 < 1) {
            return "";
        }
        if(!this.f) {
            this.c.q(v1);
            return new String(arr_c, v, v1);
        }
        int v3 = this.d(v2);
        String s = this.g[v3];
        if(s != null) {
            if(s.length() == v1) {
                int v4 = 0;
                while(s.charAt(v4) == arr_c[v + v4]) {
                    ++v4;
                    if(v4 == v1) {
                        return s;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            a b$a0 = this.h[v3 >> 1];
            if(b$a0 != null) {
                String s1 = b$a0.a(arr_c, v, v1);
                if(s1 != null) {
                    return s1;
                }
                String s2 = this.b(arr_c, v, v1, b$a0.b);
                if(s2 != null) {
                    return s2;
                }
            }
        }
        this.c.q(v1);
        return this.a(arr_c, v, v1, v2, v3);
    }

    public int q() {
        return this.d;
    }

    public b r() {
        Object object0 = this.b.get();
        return new b(this, this.c, this.e, this.d, ((com.fasterxml.jackson.core.sym.b.b)object0));
    }

    @Deprecated
    public b s(int v) {
        return this.r();
    }

    public int t() {
        return this.l;
    }

    public boolean u() {
        return !this.m;
    }

    private void v(com.fasterxml.jackson.core.sym.b.b b$b0) {
        int v = b$b0.a;
        com.fasterxml.jackson.core.sym.b.b b$b1 = (com.fasterxml.jackson.core.sym.b.b)this.b.get();
        if(v == b$b1.a) {
            return;
        }
        if(v > 12000) {
            b$b0 = com.fasterxml.jackson.core.sym.b.b.a(0x40);
        }
        d.a(this.b, b$b1, b$b0);
    }

    private void w() throws IOException {
        String[] arr_s = this.g;
        int v = arr_s.length + arr_s.length;
        if(v > 0x10000) {
            this.i = 0;
            this.f = false;
            this.g = new String[0x40];
            this.h = new a[0x20];
            this.k = 0x3F;
            this.m = false;
            return;
        }
        a[] arr_b$a = this.h;
        this.g = new String[v];
        this.h = new a[v >> 1];
        this.k = v - 1;
        this.j = v - (v >> 2);
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s = arr_s[v1];
            if(s != null) {
                ++v2;
                int v4 = this.d(this.h(s));
                String[] arr_s1 = this.g;
                if(arr_s1[v4] == null) {
                    arr_s1[v4] = s;
                }
                else {
                    a b$a0 = new a(s, this.h[v4 >> 1]);
                    this.h[v4 >> 1] = b$a0;
                    v3 = Math.max(v3, b$a0.c);
                }
            }
        }
        int v5 = arr_s.length >> 1;
        for(int v6 = 0; v6 < v5; ++v6) {
            for(a b$a1 = arr_b$a[v6]; b$a1 != null; b$a1 = b$a1.b) {
                ++v2;
                String s1 = b$a1.a;
                int v7 = this.d(this.h(s1));
                String[] arr_s2 = this.g;
                if(arr_s2[v7] == null) {
                    arr_s2[v7] = s1;
                }
                else {
                    a b$a2 = new a(s1, this.h[v7 >> 1]);
                    this.h[v7 >> 1] = b$a2;
                    v3 = Math.max(v3, b$a2.c);
                }
            }
        }
        this.l = v3;
        this.n = null;
        if(v2 != this.i) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", this.i, v2));
        }
    }

    public void x() {
        if(!this.u()) {
            return;
        }
        b b0 = this.a;
        if(b0 != null && this.f) {
            b0.v(new com.fasterxml.jackson.core.sym.b.b(this));
            this.m = true;
        }
    }

    public int y() {
        return this.b == null ? this.i : ((com.fasterxml.jackson.core.sym.b.b)this.b.get()).a;
    }

    protected void z() {
        int v1 = 0;
        for(int v = 0; v < this.g.length; ++v) {
            if(this.g[v] != null) {
                ++v1;
            }
        }
        int v2 = this.g.length >> 1;
        for(int v3 = 0; v3 < v2; ++v3) {
            for(a b$a0 = this.h[v3]; b$a0 != null; b$a0 = b$a0.b) {
                ++v1;
            }
        }
        if(v1 != this.i) {
            throw new IllegalStateException(String.format("Internal error: expected internal size %d vs calculated count %d", this.i, v1));
        }
    }
}

