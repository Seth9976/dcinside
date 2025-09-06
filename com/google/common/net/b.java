package com.google.common.net;

import J1.b;
import O1.j;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.P;
import com.google.common.base.e;
import java.io.Serializable;

@b
@j
@a
public final class com.google.common.net.b implements Serializable {
    private final String a;
    private final int b;
    private final boolean c;
    private static final int d = -1;
    private static final long e;

    private com.google.common.net.b(String s, int v, boolean z) {
        this.a = s;
        this.b = v;
        this.c = z;
    }

    public static com.google.common.net.b a(String s) {
        com.google.common.net.b b0 = com.google.common.net.b.c(s);
        H.u(!b0.h(), "Host has a port: %s", s);
        return b0;
    }

    public static com.google.common.net.b b(String s, int v) {
        H.k(com.google.common.net.b.i(v), "Port out of range: %s", v);
        com.google.common.net.b b0 = com.google.common.net.b.c(s);
        H.u(!b0.h(), "Host has a port: %s", s);
        return new com.google.common.net.b(b0.a, v, b0.c);
    }

    @O1.a
    public static com.google.common.net.b c(String s) {
        int v1;
        boolean z1;
        String s3;
        String s2;
        H.E(s);
        boolean z = true;
        if(s.startsWith("[")) {
            String[] arr_s = com.google.common.net.b.e(s);
            String s1 = arr_s[0];
            s2 = arr_s[1];
            s3 = s1;
            z1 = false;
        }
        else {
            int v = s.indexOf(58);
            if(v < 0 || s.indexOf(58, v + 1) != -1) {
                s3 = s;
                z1 = v >= 0;
                s2 = null;
            }
            else {
                s2 = s.substring(v + 1);
                s3 = s.substring(0, v);
                z1 = false;
            }
        }
        if(!P.d(s2)) {
            if(s2.startsWith("+") || !e.f().C(s2)) {
                z = false;
            }
            H.u(z, "Unparseable port number: %s", s);
            try {
                v1 = Integer.parseInt(s2);
            }
            catch(NumberFormatException unused_ex) {
                throw new IllegalArgumentException("Unparseable port number: " + s);
            }
            H.u(com.google.common.net.b.i(v1), "Port number out of range: %s", s);
            return new com.google.common.net.b(s3, v1, z1);
        }
        return new com.google.common.net.b(s3, -1, z1);
    }

    public String d() {
        return this.a;
    }

    private static String[] e(String s) {
        boolean z = false;
        H.u(s.charAt(0) == 91, "Bracketed host-port string must start with a bracket: %s", s);
        int v = s.indexOf(58);
        int v1 = s.lastIndexOf(93);
        H.u(v > -1 && v1 > v, "Invalid bracketed host/port: %s", s);
        String s1 = s.substring(1, v1);
        if(v1 + 1 == s.length()) {
            return new String[]{s1, ""};
        }
        if(s.charAt(v1 + 1) == 58) {
            z = true;
        }
        H.u(z, "Only a colon may follow a close bracket: %s", s);
        for(int v2 = v1 + 2; v2 < s.length(); ++v2) {
            H.u(Character.isDigit(s.charAt(v2)), "Port must be numeric: %s", s);
        }
        return new String[]{s1, s.substring(v1 + 2)};
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@o3.a Object object0) {
        return this == object0 ? true : object0 instanceof com.google.common.net.b && (B.a(this.a, ((com.google.common.net.b)object0).a) && this.b == ((com.google.common.net.b)object0).b);
    }

    public int f() {
        H.g0(this.h());
        return this.b;
    }

    // 去混淆评级： 低(20)
    public int g(int v) {
        return this.h() ? this.b : v;
    }

    public boolean h() {
        return this.b >= 0;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.a, this.b});
    }

    private static boolean i(int v) {
        return v >= 0 && v <= 0xFFFF;
    }

    @O1.a
    public com.google.common.net.b j() {
        H.u(!this.c, "Possible bracketless IPv6 literal: %s", this.a);
        return this;
    }

    public com.google.common.net.b k(int v) {
        H.d(com.google.common.net.b.i(v));
        return this.h() ? this : new com.google.common.net.b(this.a, v, this.c);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.a.length() + 8);
        if(this.a.indexOf(58) >= 0) {
            stringBuilder0.append('[');
            stringBuilder0.append(this.a);
            stringBuilder0.append(']');
        }
        else {
            stringBuilder0.append(this.a);
        }
        if(this.h()) {
            stringBuilder0.append(':');
            stringBuilder0.append(this.b);
        }
        return stringBuilder0.toString();
    }
}

