package com.google.common.net;

import J1.b;
import O1.j;
import com.google.common.base.B;
import com.google.common.base.C;
import com.google.common.base.H;
import com.google.common.base.c;
import com.google.common.base.e;
import com.google.common.base.f;
import com.google.common.base.y.d;
import com.google.common.base.y;
import com.google.common.base.z;
import com.google.common.collect.D3;
import com.google.common.collect.M3;
import com.google.common.collect.P2;
import com.google.common.collect.P3;
import com.google.common.collect.a3;
import com.google.common.collect.u5;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;

@b
@j
@a
public final class i {
    static final class com.google.common.net.i.a {
        final String a;
        int b;

        com.google.common.net.i.a(String s) {
            this.b = 0;
            this.a = s;
        }

        @O1.a
        char a(char c) {
            H.g0(this.e());
            H.g0(this.f() == c);
            ++this.b;
            return c;
        }

        char b(e e0) {
            H.g0(this.e());
            char c = this.f();
            H.g0(e0.B(c));
            ++this.b;
            return c;
        }

        String c(e e0) {
            int v = this.b;
            String s = this.d(e0);
            H.g0(this.b != v);
            return s;
        }

        @O1.a
        String d(e e0) {
            H.g0(this.e());
            int v = this.b;
            this.b = e0.F().o(this.a, v);
            return this.e() ? this.a.substring(v, this.b) : this.a.substring(v);
        }

        boolean e() {
            return this.b >= 0 && this.b < this.a.length();
        }

        char f() {
            H.g0(this.e());
            return this.a.charAt(this.b);
        }
    }

    public static final i A = null;
    public static final i A0 = null;
    public static final i A1 = null;
    public static final i B = null;
    public static final i B0 = null;
    public static final i B1 = null;
    public static final i C = null;
    public static final i C0 = null;
    public static final i C1 = null;
    public static final i D = null;
    public static final i D0 = null;
    public static final i D1 = null;
    public static final i E = null;
    public static final i E0 = null;
    private static final d E1 = null;
    public static final i F = null;
    public static final i F0 = null;
    public static final i G = null;
    public static final i G0 = null;
    public static final i H = null;
    public static final i H0 = null;
    public static final i I = null;
    public static final i I0 = null;
    public static final i J = null;
    public static final i J0 = null;
    public static final i K = null;
    public static final i K0 = null;
    public static final i L = null;
    public static final i L0 = null;
    public static final i M = null;
    public static final i M0 = null;
    public static final i N = null;
    public static final i N0 = null;
    public static final i O = null;
    public static final i O0 = null;
    public static final i P = null;
    public static final i P0 = null;
    public static final i Q = null;
    public static final i Q0 = null;
    public static final i R = null;
    public static final i R0 = null;
    public static final i S = null;
    public static final i S0 = null;
    public static final i T = null;
    public static final i T0 = null;
    public static final i U = null;
    public static final i U0 = null;
    public static final i V = null;
    public static final i V0 = null;
    public static final i W = null;
    public static final i W0 = null;
    public static final i X = null;
    public static final i X0 = null;
    public static final i Y = null;
    public static final i Y0 = null;
    public static final i Z = null;
    public static final i Z0 = null;
    private final String a;
    public static final i a0 = null;
    public static final i a1 = null;
    private final String b;
    public static final i b0 = null;
    public static final i b1 = null;
    private final P2 c;
    public static final i c0 = null;
    public static final i c1 = null;
    @P1.b
    @o3.a
    private String d;
    public static final i d0 = null;
    public static final i d1 = null;
    @P1.b
    private int e;
    public static final i e0 = null;
    public static final i e1 = null;
    @P1.b
    @o3.a
    private C f;
    public static final i f0 = null;
    public static final i f1 = null;
    private static final String g = "charset";
    public static final i g0 = null;
    public static final i g1 = null;
    private static final P2 h = null;
    public static final i h0 = null;
    public static final i h1 = null;
    private static final e i = null;
    public static final i i0 = null;
    public static final i i1 = null;
    private static final e j = null;
    public static final i j0 = null;
    public static final i j1 = null;
    private static final e k = null;
    public static final i k0 = null;
    public static final i k1 = null;
    private static final String l = "application";
    public static final i l0 = null;
    public static final i l1 = null;
    private static final String m = "audio";
    public static final i m0 = null;
    public static final i m1 = null;
    private static final String n = "image";
    public static final i n0 = null;
    public static final i n1 = null;
    private static final String o = "text";
    public static final i o0 = null;
    public static final i o1 = null;
    private static final String p = "video";
    public static final i p0 = null;
    public static final i p1 = null;
    private static final String q = "font";
    public static final i q0 = null;
    public static final i q1 = null;
    private static final String r = "*";
    public static final i r0;
    public static final i r1;
    private static final Map s;
    public static final i s0;
    public static final i s1;
    public static final i t;
    public static final i t0;
    public static final i t1;
    public static final i u;
    public static final i u0;
    public static final i u1;
    public static final i v;
    public static final i v0;
    public static final i v1;
    public static final i w;
    public static final i w0;
    public static final i w1;
    public static final i x;
    public static final i x0;
    public static final i x1;
    public static final i y;
    public static final i y0;
    public static final i y1;
    public static final i z;
    public static final i z0;
    public static final i z1;

    static {
        i.h = P2.b0("charset", "utf-8");
        i.i = e.f().b(e.v().F()).b(e.s(' ')).b(e.H("()<>@,;:\\\"/[]?="));
        i.j = e.f().b(e.H("\"\\\r"));
        i.k = e.d(" \t\r\n");
        i.s = D3.Y();
        i.t = i.j("*", "*");
        i.u = i.j("text", "*");
        i.v = i.j("image", "*");
        i.w = i.j("audio", "*");
        i.x = i.j("video", "*");
        i.y = i.j("application", "*");
        i.z = i.j("font", "*");
        i.A = i.k("text", "cache-manifest");
        i.B = i.k("text", "css");
        i.C = i.k("text", "csv");
        i.D = i.k("text", "html");
        i.E = i.k("text", "calendar");
        i.F = i.k("text", "plain");
        i.G = i.k("text", "javascript");
        i.H = i.k("text", "tab-separated-values");
        i.I = i.k("text", "vcard");
        i.J = i.k("text", "vnd.wap.wml");
        i.K = i.k("text", "xml");
        i.L = i.k("text", "vtt");
        i.M = i.j("image", "bmp");
        i.N = i.j("image", "x-canon-crw");
        i.O = i.j("image", "gif");
        i.P = i.j("image", "vnd.microsoft.icon");
        i.Q = i.j("image", "jpeg");
        i.R = i.j("image", "png");
        i.S = i.j("image", "vnd.adobe.photoshop");
        i.T = i.k("image", "svg+xml");
        i.U = i.j("image", "tiff");
        i.V = i.j("image", "webp");
        i.W = i.j("image", "heif");
        i.X = i.j("image", "jp2");
        i.Y = i.j("audio", "mp4");
        i.Z = i.j("audio", "mpeg");
        i.a0 = i.j("audio", "ogg");
        i.b0 = i.j("audio", "webm");
        i.c0 = i.j("audio", "l16");
        i.d0 = i.j("audio", "l24");
        i.e0 = i.j("audio", "basic");
        i.f0 = i.j("audio", "aac");
        i.g0 = i.j("audio", "vorbis");
        i.h0 = i.j("audio", "x-ms-wma");
        i.i0 = i.j("audio", "x-ms-wax");
        i.j0 = i.j("audio", "vnd.rn-realaudio");
        i.k0 = i.j("audio", "vnd.wave");
        i.l0 = i.j("video", "mp4");
        i.m0 = i.j("video", "mpeg");
        i.n0 = i.j("video", "ogg");
        i.o0 = i.j("video", "quicktime");
        i.p0 = i.j("video", "webm");
        i.q0 = i.j("video", "x-ms-wmv");
        i.r0 = i.j("video", "x-flv");
        i.s0 = i.j("video", "3gpp");
        i.t0 = i.j("video", "3gpp2");
        i.u0 = i.k("application", "xml");
        i.v0 = i.k("application", "atom+xml");
        i.w0 = i.j("application", "x-bzip2");
        i.x0 = i.k("application", "dart");
        i.y0 = i.j("application", "vnd.apple.pkpass");
        i.z0 = i.j("application", "vnd.ms-fontobject");
        i.A0 = i.j("application", "epub+zip");
        i.B0 = i.j("application", "x-www-form-urlencoded");
        i.C0 = i.j("application", "pkcs12");
        i.D0 = i.j("application", "binary");
        i.E0 = i.j("application", "geo+json");
        i.F0 = i.j("application", "x-gzip");
        i.G0 = i.j("application", "hal+json");
        i.H0 = i.k("application", "javascript");
        i.I0 = i.j("application", "jose");
        i.J0 = i.j("application", "jose+json");
        i.K0 = i.k("application", "json");
        i.L0 = i.j("application", "jwt");
        i.M0 = i.k("application", "manifest+json");
        i.N0 = i.j("application", "vnd.google-earth.kml+xml");
        i.O0 = i.j("application", "vnd.google-earth.kmz");
        i.P0 = i.j("application", "mbox");
        i.Q0 = i.j("application", "x-apple-aspen-config");
        i.R0 = i.j("application", "vnd.ms-excel");
        i.S0 = i.j("application", "vnd.ms-outlook");
        i.T0 = i.j("application", "vnd.ms-powerpoint");
        i.U0 = i.j("application", "msword");
        i.V0 = i.j("application", "dash+xml");
        i.W0 = i.j("application", "wasm");
        i.X0 = i.j("application", "x-nacl");
        i.Y0 = i.j("application", "x-pnacl");
        i.Z0 = i.j("application", "octet-stream");
        i.a1 = i.j("application", "ogg");
        i.b1 = i.j("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        i.c1 = i.j("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        i.d1 = i.j("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        i.e1 = i.j("application", "vnd.oasis.opendocument.graphics");
        i.f1 = i.j("application", "vnd.oasis.opendocument.presentation");
        i.g1 = i.j("application", "vnd.oasis.opendocument.spreadsheet");
        i.h1 = i.j("application", "vnd.oasis.opendocument.text");
        i.i1 = i.k("application", "opensearchdescription+xml");
        i.j1 = i.j("application", "pdf");
        i.k1 = i.j("application", "postscript");
        i.l1 = i.j("application", "protobuf");
        i.m1 = i.k("application", "rdf+xml");
        i.n1 = i.k("application", "rtf");
        i.o1 = i.j("application", "font-sfnt");
        i.p1 = i.j("application", "x-shockwave-flash");
        i.q1 = i.j("application", "vnd.sketchup.skp");
        i.r1 = i.k("application", "soap+xml");
        i.s1 = i.j("application", "x-tar");
        i.t1 = i.j("application", "font-woff");
        i.u1 = i.j("application", "font-woff2");
        i.v1 = i.k("application", "xhtml+xml");
        i.w1 = i.k("application", "xrd+xml");
        i.x1 = i.j("application", "zip");
        i.y1 = i.j("font", "collection");
        i.z1 = i.j("font", "otf");
        i.A1 = i.j("font", "sfnt");
        i.B1 = i.j("font", "ttf");
        i.C1 = i.j("font", "woff");
        i.D1 = i.j("font", "woff2");
        i.E1 = y.p("; ").u("=");
    }

    private i(String s, String s1, P2 p20) {
        this.a = s;
        this.b = s1;
        this.c = p20;
    }

    public i A(Charset charset0) {
        H.E(charset0);
        i i0 = this.B("charset", charset0.name());
        i0.f = C.f(charset0);
        return i0;
    }

    public i B(String s, String s1) {
        return this.D(s, a3.C(s1));
    }

    public i C(M3 m30) {
        return i.g(this.a, this.b, m30);
    }

    public i D(String s, Iterable iterable0) {
        H.E(s);
        H.E(iterable0);
        String s1 = i.u(s);
        com.google.common.collect.P2.a p2$a0 = P2.S();
        u5 u50 = this.c.x().i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s2 = (String)map$Entry0.getKey();
            if(!s1.equals(s2)) {
                p2$a0.p(s2, ((String)map$Entry0.getValue()));
            }
        }
        for(Object object1: iterable0) {
            p2$a0.p(s1, i.t(s1, ((String)object1)));
        }
        P2 p20 = p2$a0.l();
        i i0 = new i(this.a, this.b, p20);
        if(!s1.equals("charset")) {
            i0.f = this.f;
        }
        return (i)z.a(((i)i.s.get(i0)), i0);
    }

    // 去混淆评级： 低(20)
    public i E() {
        return this.c.isEmpty() ? this : i.f(this.a, this.b);
    }

    private static i b(i i0) {
        i.s.put(i0, i0);
        return i0;
    }

    public C c() {
        C c0 = this.f;
        if(c0 == null) {
            c0 = C.a();
            String s = null;
            u5 u50 = this.c.X("charset").i();
            while(u50.hasNext()) {
                Object object0 = u50.next();
                String s1 = (String)object0;
                if(s == null) {
                    c0 = C.f(Charset.forName(s1));
                    s = s1;
                }
                else {
                    if(!s.equals(s1)) {
                        throw new IllegalStateException("Multiple charset values defined: " + s + ", " + s1);
                    }
                    if(false) {
                        break;
                    }
                }
            }
            this.f = c0;
        }
        return c0;
    }

    private String d() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a);
        stringBuilder0.append('/');
        stringBuilder0.append(this.b);
        if(!this.c.isEmpty()) {
            stringBuilder0.append("; ");
            g g0 = (String s) -> // 去混淆评级： 低(20)
            (i.i.C(s) && !s.isEmpty() ? s : i.p(s));
            Collection collection0 = P3.G(this.c, g0).h();
            i.E1.d(stringBuilder0, collection0);
        }
        return stringBuilder0.toString();
    }

    private static void e(com.google.common.net.i.a i$a0, char c) {
        i$a0.d(i.k);
        i$a0.a(c);
        i$a0.d(i.k);
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(@o3.a Object object0) {
        return object0 == this ? true : object0 instanceof i && (this.a.equals(((i)object0).a) && this.b.equals(((i)object0).b) && this.w().equals(((i)object0).w()));
    }

    public static i f(String s, String s1) {
        i i0 = i.g(s, s1, P2.a0());
        i0.f = C.a();
        return i0;
    }

    private static i g(String s, String s1, M3 m30) {
        H.E(s);
        H.E(s1);
        H.E(m30);
        String s2 = i.u(s);
        String s3 = i.u(s1);
        H.e(!"*".equals(s2) || "*".equals(s3), "A wildcard type cannot be used with a non-wildcard subtype");
        com.google.common.collect.P2.a p2$a0 = P2.S();
        for(Object object0: m30.h()) {
            String s4 = i.u(((String)((Map.Entry)object0).getKey()));
            p2$a0.p(s4, i.t(s4, ((String)((Map.Entry)object0).getValue())));
        }
        i i0 = new i(s2, s3, p2$a0.l());
        return (i)z.a(((i)i.s.get(i0)), i0);
    }

    static i h(String s) {
        return i.f("application", s);
    }

    @Override
    public int hashCode() {
        int v = this.e;
        if(v == 0) {
            Map map0 = this.w();
            v = B.b(new Object[]{this.a, this.b, map0});
            this.e = v;
        }
        return v;
    }

    static i i(String s) {
        return i.f("audio", s);
    }

    private static i j(String s, String s1) {
        i i0 = i.b(new i(s, s1, P2.a0()));
        i0.f = C.a();
        return i0;
    }

    private static i k(String s, String s1) {
        i i0 = i.b(new i(s, s1, i.h));
        i0.f = C.f(f.c);
        return i0;
    }

    static i l(String s) {
        return i.f("font", s);
    }

    static i m(String s) {
        return i.f("image", s);
    }

    static i n(String s) {
        return i.f("text", s);
    }

    static i o(String s) {
        return i.f("video", s);
    }

    private static String p(String s) {
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + 16);
        stringBuilder0.append('\"');
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(v1 == 13 || v1 == 34 || v1 == 92) {
                stringBuilder0.append('\\');
            }
            stringBuilder0.append(((char)v1));
        }
        stringBuilder0.append('\"');
        return stringBuilder0.toString();
    }

    // 去混淆评级： 低(20)
    public boolean q() {
        return "*".equals(this.a) || "*".equals(this.b);
    }

    // 去混淆评级： 中等(50)
    public boolean r(i i0) {
        return (i0.a.equals("*") || i0.a.equals(this.a)) && (i0.b.equals("*") || i0.b.equals(this.b)) && this.c.x().containsAll(i0.c.x());
    }

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static String s(String s) [...]

    private static String t(String s, String s1) {
        H.E(s1);
        H.u(e.f().C(s1), "parameter values must be ASCII: %s", s1);
        return "charset".equals(s) ? c.g(s1) : s1;
    }

    @Override
    public String toString() {
        String s = this.d;
        if(s == null) {
            s = this.d();
            this.d = s;
        }
        return s;
    }

    private static String u(String s) {
        H.d(i.i.C(s));
        H.d(!s.isEmpty());
        return c.g(s);
    }

    public P2 v() {
        return this.c;
    }

    private Map w() {
        return D3.D0(this.c.n(), new h());
    }

    @O1.a
    public static i x(String s) {
        String s4;
        H.E(s);
        com.google.common.net.i.a i$a0 = new com.google.common.net.i.a(s);
        try {
            String s1 = i$a0.c(i.i);
            i.e(i$a0, '/');
            String s2 = i$a0.c(i.i);
            com.google.common.collect.P2.a p2$a0 = P2.S();
            while(i$a0.e()) {
                i.e(i$a0, ';');
                e e0 = i.i;
                String s3 = i$a0.c(e0);
                i.e(i$a0, '=');
                if(34 == i$a0.f()) {
                    i$a0.a('\"');
                    StringBuilder stringBuilder0 = new StringBuilder();
                    while(34 != i$a0.f()) {
                        if(92 == i$a0.f()) {
                            i$a0.a('\\');
                            stringBuilder0.append(i$a0.b(e.f()));
                        }
                        else {
                            stringBuilder0.append(i$a0.c(i.j));
                        }
                    }
                    s4 = stringBuilder0.toString();
                    i$a0.a('\"');
                }
                else {
                    s4 = i$a0.c(e0);
                }
                p2$a0.p(s3, s4);
            }
            return i.g(s1, s2, p2$a0.l());
        }
        catch(IllegalStateException illegalStateException0) {
        }
        throw new IllegalArgumentException("Could not parse \'" + s + "\'", illegalStateException0);
    }

    public String y() {
        return this.b;
    }

    public String z() {
        return this.a;
    }
}

