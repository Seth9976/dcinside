package org.jsoup.parser;

import java.util.Arrays;
import org.jsoup.internal.n;
import org.jsoup.nodes.p;

final class t {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[u.values().length];
            a.a = arr_v;
            try {
                arr_v[u.h.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[u.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final org.jsoup.parser.a a;
    private final e b;
    private u c;
    private r d;
    private boolean e;
    private String f;
    private final StringBuilder g;
    final StringBuilder h;
    final h i;
    final g j;
    i k;
    final c l;
    final org.jsoup.parser.r.e m;
    final d n;
    private String o;
    private String p;
    private int q;
    private int r;
    private final int[] s;
    private final int[] t;
    static final char u = '\uFFFD';
    private static final char[] v = null;
    static final int w = 0x80;
    static final int[] x = null;
    private static final int y = -1;
    static final boolean z;

    static {
        char[] arr_c = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        t.v = arr_c;
        t.x = new int[]{0x20AC, 0x81, 0x201A, 402, 0x201E, 8230, 0x2020, 0x2021, 710, 0x2030, 0x160, 0x2039, 338, 0x8D, 381, 0x8F, 0x90, 0x2018, 0x2019, 8220, 0x201D, 0x2022, 0x2013, 0x2014, 732, 8482, 353, 8250, 339, 0x9D, 382, 376};
        Arrays.sort(arr_c);
    }

    t(v v0) {
        this.c = u.a;
        this.d = null;
        this.e = false;
        this.f = null;
        this.g = new StringBuilder(0x400);
        this.h = new StringBuilder(0x400);
        this.l = new c();
        this.m = new org.jsoup.parser.r.e();
        this.n = new d();
        this.r = 0;
        this.s = new int[1];
        this.t = new int[2];
        h r$h0 = new h(v0);
        this.i = r$h0;
        this.k = r$h0;
        this.j = new g(v0);
        this.a = v0.b;
        this.b = v0.a.b();
    }

    r A() {
        while(!this.e) {
            this.c.j(this, this.a);
        }
        StringBuilder stringBuilder0 = this.g;
        if(stringBuilder0.length() != 0) {
            stringBuilder0.delete(0, stringBuilder0.length());
            r r0 = this.l.v(stringBuilder0.toString());
            this.f = null;
            return r0;
        }
        String s = this.f;
        if(s != null) {
            r r1 = this.l.v(s);
            this.f = null;
            return r1;
        }
        this.e = false;
        return this.d;
    }

    void B(u u0) {
        switch(u0) {
            case 1: {
                this.q = this.a.P();
                break;
            }
            case 2: {
                if(this.r == -1) {
                    this.r = this.a.P();
                }
            }
        }
        this.c = u0;
    }

    String C(boolean z) {
        StringBuilder stringBuilder0 = n.d();
        while(!this.a.w()) {
            stringBuilder0.append(this.a.p('&'));
            if(this.a.F('&')) {
                this.a.g();
                int[] arr_v = this.e(null, z);
                if(arr_v != null && arr_v.length != 0) {
                    stringBuilder0.appendCodePoint(arr_v[0]);
                    if(arr_v.length != 2) {
                        continue;
                    }
                    stringBuilder0.appendCodePoint(arr_v[1]);
                }
                else {
                    stringBuilder0.append('&');
                }
            }
        }
        return n.v(stringBuilder0);
    }

    void a(u u0) {
        this.B(u0);
        this.a.a();
    }

    String b() {
        return this.o;
    }

    String c() {
        if(this.p == null) {
            this.p = "</" + this.o;
        }
        return this.p;
    }

    private void d(String s, Object[] arr_object) {
        if(this.b.a()) {
            org.jsoup.parser.d d0 = new org.jsoup.parser.d(this.a, String.format(("Invalid character reference: " + s), arr_object));
            this.b.add(d0);
        }
    }

    int[] e(Character character0, boolean z) {
        int v;
        if(this.a.w()) {
            return null;
        }
        if(character0 != null && character0.charValue() == this.a.v()) {
            return null;
        }
        if(this.a.I(t.v)) {
            return null;
        }
        int[] arr_v = this.s;
        this.a.C();
        if(this.a.D("#")) {
            boolean z1 = this.a.E("X");
            String s = z1 ? this.a.k() : this.a.j();
            if(s.length() == 0) {
                this.d("numeric reference with no numerals", new Object[0]);
                this.a.U();
                return null;
            }
            this.a.Y();
            if(!this.a.D(";")) {
                this.d("missing semicolon on [&#%s]", new Object[]{s});
            }
            try {
                v = -1;
                v = (int)Integer.valueOf(s, (z1 ? 16 : 10));
            }
            catch(NumberFormatException unused_ex) {
            }
            if(v != -1 && v <= 0x10FFFF) {
                if(v >= 0x80) {
                    int[] arr_v1 = t.x;
                    if(v < arr_v1.length + 0x80) {
                        this.d("character [%s] is not a valid unicode code point", new Object[]{v});
                        v = arr_v1[v - 0x80];
                    }
                }
                arr_v[0] = v;
                return arr_v;
            }
            this.d("character [%s] outside of valid range", new Object[]{v});
            arr_v[0] = 0xFFFD;
            return arr_v;
        }
        String s1 = this.a.m();
        boolean z2 = this.a.F(';');
        if(!p.i(s1) && (!p.j(s1) || !z2)) {
            this.a.U();
            if(z2) {
                this.d("invalid named reference [%s]", new Object[]{s1});
            }
            return null;
        }
        if(z && (this.a.M() || this.a.K() || this.a.H(new char[]{'=', '-', '_'}))) {
            this.a.U();
            return null;
        }
        this.a.Y();
        if(!this.a.D(";")) {
            this.d("missing semicolon on [&%s]", new Object[]{s1});
        }
        int v1 = p.d(s1, this.t);
        if(v1 == 1) {
            arr_v[0] = this.t[0];
            return arr_v;
        }
        if(v1 == 2) {
            return this.t;
        }
        org.jsoup.helper.i.d(("Unexpected characters returned for " + s1));
        return this.t;
    }

    void f() {
        this.n.p();
        this.n.g = true;
    }

    void g() {
        this.n.p();
    }

    void h() {
        this.m.p();
    }

    i i(boolean z) {
        i r$i0 = z ? this.i.M() : this.j.M();
        this.k = r$i0;
        return r$i0;
    }

    void j() {
        r.q(this.h);
    }

    static boolean k() {
        return true;
    }

    void l(char c) {
        if(this.f == null) {
            this.f = String.valueOf(c);
        }
        else {
            if(this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append(c);
        }
        this.l.s(this.r);
        this.l.g(this.a.P());
    }

    void m(String s) {
        if(this.f == null) {
            this.f = s;
        }
        else {
            if(this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append(s);
        }
        this.l.s(this.r);
        this.l.g(this.a.P());
    }

    void n(StringBuilder stringBuilder0) {
        if(this.f == null) {
            this.f = stringBuilder0.toString();
        }
        else {
            if(this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append(stringBuilder0);
        }
        this.l.s(this.r);
        this.l.g(this.a.P());
    }

    void o(r r0) {
        org.jsoup.helper.i.f(this.e);
        this.d = r0;
        this.e = true;
        r0.s(this.q);
        r0.g(this.a.P());
        this.r = -1;
        j r$j0 = r0.a;
        if(r$j0 == j.b) {
            this.o = ((h)r0).e;
            this.p = null;
            return;
        }
        if(r$j0 == j.c && ((g)r0).G()) {
            this.w("Attributes incorrectly present on end tag [/%s]", new Object[]{((g)r0).L()});
        }
    }

    void p(char[] arr_c) {
        this.m(String.valueOf(arr_c));
    }

    void q(int[] arr_v) {
        this.m(new String(arr_v, 0, arr_v.length));
    }

    void r() {
        this.o(this.n);
    }

    void s() {
        this.o(this.m);
    }

    void t() {
        this.k.D();
        this.o(this.k);
    }

    void u(u u0) {
        if(this.b.a()) {
            org.jsoup.parser.d d0 = new org.jsoup.parser.d(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{u0});
            this.b.add(d0);
        }
    }

    void v(String s) {
        if(this.b.a()) {
            org.jsoup.parser.d d0 = new org.jsoup.parser.d(this.a, s);
            this.b.add(d0);
        }
    }

    void w(String s, Object[] arr_object) {
        if(this.b.a()) {
            org.jsoup.parser.d d0 = new org.jsoup.parser.d(this.a, s, arr_object);
            this.b.add(d0);
        }
    }

    void x(u u0) {
        if(this.b.a()) {
            Object[] arr_object = {Character.valueOf(this.a.v()), u0};
            org.jsoup.parser.d d0 = new org.jsoup.parser.d(this.a, "Unexpected character \'%s\' in input state [%s]", arr_object);
            this.b.add(d0);
        }
    }

    u y() {
        return this.c;
    }

    boolean z() {
        return this.o != null && this.k.I().equalsIgnoreCase(this.o);
    }
}

