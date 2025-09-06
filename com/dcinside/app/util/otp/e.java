package com.dcinside.app.util.otp;

import com.dcinside.app.util.Dl;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class e implements f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final b a;
    @l
    private final i b;
    @l
    private final k c;
    @l
    public static final a d = null;
    private static final int e = 6;
    private static final int f = 9;
    public static final int g = 30;

    static {
        e.d = new a(null);
    }

    public e(int v, @l b b0, @l i i0) {
        L.p(b0, "mAccountDb");
        L.p(i0, "totpClock");
        super();
        this.a = b0;
        this.b = i0;
        this.c = new k(((long)v), 0L, 2, null);
    }

    public e(@l b b0, @l i i0) {
        L.p(b0, "accountDb");
        L.p(i0, "totpClock");
        this(30, b0, i0);
    }

    @Override  // com.dcinside.app.util.otp.f
    @l
    public i a() {
        return this.b;
    }

    @Override  // com.dcinside.app.util.otp.f
    @l
    public k b() {
        return this.c;
    }

    @Override  // com.dcinside.app.util.otp.f
    @m
    public List c() {
        return this.a.n();
    }

    @Override  // com.dcinside.app.util.otp.f
    @m
    public String d(@m d b$d0) throws com.dcinside.app.http.i {
        return this.g(b$d0, null);
    }

    @Override  // com.dcinside.app.util.otp.f
    @m
    public String e(@m d b$d0, @m String s) throws com.dcinside.app.http.i {
        if(s == null) {
            return this.g(b$d0, null);
        }
        try {
            Charset charset0 = Charset.forName("UTF-8");
            L.o(charset0, "forName(...)");
            byte[] arr_b = s.getBytes(charset0);
            L.o(arr_b, "getBytes(...)");
            return this.g(b$d0, arr_b);
        }
        catch(UnsupportedEncodingException unused_ex) {
            return "";
        }
    }

    private final String f(String s, long v, byte[] arr_b) throws com.dcinside.app.http.i {
        if(s == null || s.length() == 0) {
            throw new com.dcinside.app.http.i("Null or empty secret");
        }
        try {
            g g0 = new g(b.u(s), (arr_b == null ? 6 : 9));
            String s1 = arr_b == null ? g0.a(v) : g0.b(v, arr_b);
            L.m(s1);
            return s1;
        }
        catch(GeneralSecurityException generalSecurityException0) {
        }
        throw new com.dcinside.app.http.i("Crypto failure", generalSecurityException0);
    }

    private final String g(d b$d0, byte[] arr_b) throws com.dcinside.app.http.i {
        if(b$d0 == null) {
            throw new com.dcinside.app.http.i("No account");
        }
        com.dcinside.app.util.otp.b.e b$e0 = this.a.v(b$d0);
        String s = this.h(b$d0);
        if(b$e0 == com.dcinside.app.util.otp.b.e.b) {
            return this.f(s, this.b().c(Dl.s(this.a().a())), arr_b);
        }
        if(b$e0 == com.dcinside.app.util.otp.b.e.c) {
            this.a.w(b$d0);
            return this.f(s, ((long)(((int)this.a.o(b$d0)))), arr_b);
        }
        return this.f(s, 0L, arr_b);
    }

    private final String h(d b$d0) {
        String s = this.a.t(b$d0);
        L.o(s, "getSecret(...)");
        return s;
    }
}

