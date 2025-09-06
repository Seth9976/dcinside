package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.l;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class o implements Serializable {
    static class a {
        public final a a;
        public final int b;
        public final String c;

        a(a o$a0, int v, String s) {
            this.a = o$a0;
            this.b = v;
            this.c = s;
        }
    }

    static class b {
        public final b a;
        public final String b;
        public final int c;
        public int d;
        public b e;

        public b(b o$b0, String s, int v) {
            this.a = o$b0;
            this.b = s;
            this.c = v;
            if(o$b0 != null) {
                o$b0.e = this;
            }
        }
    }

    static class c implements Externalizable {
        private String a;

        public c() {
        }

        c(String s) {
            this.a = s;
        }

        private Object a() throws ObjectStreamException {
            return o.m(this.a);
        }

        @Override
        public void readExternal(ObjectInput objectInput0) throws IOException, ClassNotFoundException {
            this.a = objectInput0.readUTF();
        }

        @Override
        public void writeExternal(ObjectOutput objectOutput0) throws IOException {
            objectOutput0.writeUTF(this.a);
        }
    }

    protected final o a;
    protected volatile o b;
    protected final String c;
    protected final int d;
    protected final String e;
    protected final int f;
    protected int g;
    private static final long h = 1L;
    public static final char i = '/';
    protected static final o j;

    static {
        o.j = new o();
    }

    protected o() {
        this.a = null;
        this.e = null;
        this.f = -1;
        this.c = "";
        this.d = 0;
    }

    protected o(String s, int v, String s1, int v1, o o0) {
        this.c = s;
        this.d = v;
        this.a = o0;
        this.e = s1;
        this.f = v1;
    }

    protected o(String s, int v, String s1, o o0) {
        this.c = s;
        this.d = v;
        this.a = o0;
        this.e = s1;
        this.f = o.h(s1);
    }

    public boolean A(String s) {
        return this.a != null && this.e.equals(s);
    }

    public boolean B() {
        return this.f >= 0;
    }

    public boolean C() {
        return this.e != null;
    }

    public o D() {
        return this.a;
    }

    public static o E(String s) {
        return o.m(s);
    }

    // 去混淆评级： 低(20)
    private Object F() {
        return new c("");
    }

    private static void a(StringBuilder stringBuilder0, char c) {
        switch(c) {
            case 0x30: {
                c = '~';
                break;
            }
            case 49: {
                c = '/';
                break;
            }
            default: {
                stringBuilder0.append('~');
            }
        }
        stringBuilder0.append(c);
    }

    private static void b(StringBuilder stringBuilder0, String s) {
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(v2 == 0x2F) {
                stringBuilder0.append("~1");
            }
            else if(v2 == 0x7E) {
                stringBuilder0.append("~0");
            }
            else {
                stringBuilder0.append(((char)v2));
            }
        }
    }

    private static o c(String s, int v, String s1, a o$a0) {
        o o0;
        for(o0 = new o(s, v, s1, o.j); o$a0 != null; o0 = o1) {
            o o1 = new o(s, o$a0.b, o$a0.c, o0);
            o$a0 = o$a0.a;
        }
        return o0;
    }

    private final boolean d(String s, int v, String s1, int v1) {
        int v2 = s.length();
        if(v2 - v != s1.length() - v1) {
            return false;
        }
        while(v < v2) {
            if(s.charAt(v) != s1.charAt(v1)) {
                return false;
            }
            ++v;
            ++v1;
        }
        return true;
    }

    protected o e() {
        o o0 = this.s();
        if(o0 == this) {
            return o.j;
        }
        int v = o0.u();
        o o1 = this.a.f(v, o0);
        return new o("".substring(0, -v), 0, this.e, this.f, o1);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof o ? this.d(this.c, this.d, ((o)object0).c, ((o)object0).d) : false;
    }

    protected o f(int v, o o0) {
        if(this == o0) {
            return o.j;
        }
        o o1 = this.a.f(v, o0);
        return new o("".substring(0, -v), 0, this.e, this.f, o1);
    }

    protected static int g(String s, int v, int v1, StringBuilder stringBuilder0) {
        int v2 = s.length();
        if(v1 - 1 - v > 0) {
            stringBuilder0.append(s, v, v1 - 1);
        }
        int v3 = v1 + 1;
        o.a(stringBuilder0, s.charAt(v1));
        while(v3 < v2) {
            int v4 = s.charAt(v3);
            if(v4 == 0x2F) {
                return v3;
            }
            int v5 = v3 + 1;
            if(v4 == 0x7E && v5 < v2) {
                v3 += 2;
                o.a(stringBuilder0, s.charAt(v5));
            }
            else {
                stringBuilder0.append(((char)v4));
                v3 = v5;
            }
        }
        return -1;
    }

    private static final int h(String s) {
        int v = s.length();
        if(v != 0 && v <= 10) {
            int v1 = s.charAt(0);
            int v2 = 1;
            if(v1 <= 0x30) {
                return v != 1 || v1 != 0x30 ? -1 : 0;
            }
            if(v1 > 57) {
                return -1;
            }
            while(v2 < v) {
                int v3 = s.charAt(v2);
                if(v3 <= 57 && v3 >= 0x30) {
                    ++v2;
                    continue;
                }
                return -1;
            }
            return v != 10 || l.v(s) <= 0x7FFFFFFFL ? l.t(s) : -1;
        }
        return -1;
    }

    @Override
    public int hashCode() {
        int v = this.g;
        if(v == 0) {
            v = -1;
            this.g = -1;
        }
        return v;
    }

    protected static o i(String s) {
        int v = s.length();
        a o$a0 = null;
        int v1 = 1;
        int v2 = 0;
        while(v1 < v) {
            int v3 = s.charAt(v1);
            if(v3 == 0x2F) {
                a o$a1 = new a(o$a0, v2, s.substring(v2 + 1, v1));
                v2 = v1;
                ++v1;
                o$a0 = o$a1;
            }
            else {
                ++v1;
                if(v3 == 0x7E && v1 < v) {
                    StringBuilder stringBuilder0 = new StringBuilder(0x20);
                    int v4 = o.g(s, v2 + 1, v1, stringBuilder0);
                    String s1 = stringBuilder0.toString();
                    if(v4 < 0) {
                        return o.c(s, v2, s1, o$a0);
                    }
                    a o$a2 = new a(o$a0, v2, s1);
                    v2 = v4;
                    v1 = v4 + 1;
                    o$a0 = o$a2;
                }
            }
        }
        return o.c(s, v2, s.substring(v2 + 1), o$a0);
    }

    // 去混淆评级： 低(32)
    public o j(o o0) {
        o o1 = o.j;
        if(this == o1) {
            return o0;
        }
        return o0 == o1 ? this : o.m("");
    }

    // 去混淆评级： 低(26)
    public o k(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Negative index cannot be appended");
        }
        return o.m(("" + '/' + v));
    }

    public o l(String s) {
        if(s != null && !s.isEmpty()) {
            if(s.charAt(0) != 0x2F) {
                s = '/' + s;
            }
            return o.m(("" + s));
        }
        return this;
    }

    public static o m(String s) throws IllegalArgumentException {
        if(s != null && s.length() != 0) {
            if(s.charAt(0) != 0x2F) {
                throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with \'/\': \"" + s + "\"");
            }
            return o.i(s);
        }
        return o.j;
    }

    public static o n() {
        return o.j;
    }

    public static o o(q q0, boolean z) {
        if(q0 == null) {
            return o.j;
        }
        if(!q0.k() && (!z || !q0.n() || !q0.i())) {
            q0 = q0.f();
        }
        int v = 0;
        b o$b0 = null;
        while(q0 != null) {
            if(q0.m()) {
                String s = q0.b();
                if(s == null) {
                    s = "";
                }
                v += s.length() + 2;
                o$b0 = new b(o$b0, s, -1);
            }
            else if(q0.l() || z) {
                v += 6;
                o$b0 = new b(o$b0, null, q0.a());
            }
            q0 = q0.f();
        }
        if(o$b0 == null) {
            return o.j;
        }
        StringBuilder stringBuilder0 = new StringBuilder(v);
        b o$b1 = null;
        b o$b2 = o$b0;
        while(o$b2 != null) {
            o$b2.d = stringBuilder0.length();
            stringBuilder0.append('/');
            String s1 = o$b2.b;
            if(s1 == null) {
                stringBuilder0.append(o$b2.c);
            }
            else {
                o.b(stringBuilder0, s1);
            }
            b o$b3 = o$b2;
            o$b2 = o$b2.a;
            o$b1 = o$b3;
        }
        String s2 = stringBuilder0.toString();
        o o0 = o.j;
        while(o$b1 != null) {
            o0 = o$b1.b == null ? new o(s2, o$b1.d, String.valueOf(o$b1.c), o$b1.c, o0) : new o(s2, o$b1.d, o$b1.b, o0);
            o$b1 = o$b1.e;
        }
        return o0;
    }

    public int p() {
        return this.f;
    }

    public String q() {
        return this.e;
    }

    public o r() {
        o o0 = this.b;
        if(o0 == null) {
            if(this != o.j) {
                o0 = this.e();
            }
            this.b = o0;
        }
        return o0;
    }

    public o s() {
        if(this == o.j) {
            return null;
        }
        o o0 = this;
        o o1;
        while((o1 = o0.a) != o.j) {
            o0 = o1;
        }
        return o0;
    }

    @Override
    public String toString() [...] // 潜在的解密器

    public int u() {
        return this.c.length() - this.d;
    }

    public o w(int v) {
        return v != this.f || v < 0 ? null : this.a;
    }

    public o x(String s) {
        return this.a == null || !this.e.equals(s) ? null : this.a;
    }

    public boolean y() {
        return this.a == null;
    }

    public boolean z(int v) {
        return v == this.f && v >= 0;
    }
}

