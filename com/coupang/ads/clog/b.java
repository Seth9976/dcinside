package com.coupang.ads.clog;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

public final class b {
    public interface a {
        void a(int arg1, @m String arg2, @l String arg3);
    }

    @l
    public static final b a = null;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    @l
    private static final f i;

    static {
        b.a = new b();
        f f0 = new f();
        f0.add(new e(0, 1, null));
        b.i = f0;
    }

    public final int a(@m String s, @l String s1) {
        L.p(s1, "msg");
        return this.k(3, s, s1);
    }

    public final int b(@m String s, @l String s1, @m Throwable throwable0) {
        L.p(s1, "msg");
        return this.k(3, s, s1 + '\n' + this.f(throwable0));
    }

    public final int c(@m String s, @l String s1) {
        L.p(s1, "msg");
        return this.k(6, s, s1);
    }

    public final int d(@m String s, @l String s1, @m Throwable throwable0) {
        L.p(s1, "msg");
        return this.k(6, s, s1 + '\n' + this.f(throwable0));
    }

    @l
    public final f e() {
        return b.i;
    }

    private final String f(Throwable throwable0) {
        if(throwable0 == null) {
            return "";
        }
        for(Throwable throwable1 = throwable0; throwable1 != null; throwable1 = throwable1.getCause()) {
            if(throwable1 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter0 = new StringWriter();
        PrintWriter printWriter0 = new PrintWriter(stringWriter0);
        throwable0.printStackTrace(printWriter0);
        printWriter0.flush();
        String s = stringWriter0.toString();
        L.o(s, "sw.toString()");
        return s;
    }

    public final int g(@m String s, @l String s1) {
        L.p(s1, "msg");
        return this.k(1, s, s1);
    }

    public final int h(@m String s, @l String s1, @m Throwable throwable0) {
        L.p(s1, "msg");
        return this.k(1, s, s1 + '\n' + this.f(throwable0));
    }

    public final int i(@m String s, @l String s1) {
        L.p(s1, "msg");
        return this.k(4, s, s1);
    }

    public final int j(@m String s, @l String s1, @m Throwable throwable0) {
        L.p(s1, "msg");
        return this.k(4, s, s1 + '\n' + this.f(throwable0));
    }

    private final int k(int v, String s, String s1) {
        static final class com.coupang.ads.clog.b.b extends N implements Function1 {
            final int e;
            final String f;
            final String g;
            final kotlin.jvm.internal.l0.f h;

            com.coupang.ads.clog.b.b(int v, String s, String s1, kotlin.jvm.internal.l0.f l0$f0) {
                this.e = v;
                this.f = s;
                this.g = s1;
                this.h = l0$f0;
                super(1);
            }

            public final void a(@l a b$a0) {
                L.p(b$a0, "it");
                b$a0.a(this.e, this.f, this.g);
                ++this.h.a;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((a)object0));
                return S0.a;
            }
        }

        kotlin.jvm.internal.l0.f l0$f0 = new kotlin.jvm.internal.l0.f();
        f f0 = b.i;
        if(!f0.isEmpty()) {
            f0.a(new com.coupang.ads.clog.b.b(v, s, s1, l0$f0));
        }
        return l0$f0.a;
    }

    public final int l(@m String s, @l String s1) {
        L.p(s1, "msg");
        return this.k(2, s, s1);
    }

    public final int m(@m String s, @l String s1, @m Throwable throwable0) {
        L.p(s1, "msg");
        return this.k(2, s, s1 + '\n' + this.f(throwable0));
    }

    public final int n(@m String s, @l String s1) {
        L.p(s1, "msg");
        return this.k(5, s, s1);
    }

    public final int o(@m String s, @l String s1, @m Throwable throwable0) {
        L.p(s1, "msg");
        return this.k(5, s, s1 + '\n' + this.f(throwable0));
    }

    public final int p(@m String s, @m Throwable throwable0) {
        return this.k(5, s, this.f(throwable0));
    }
}

