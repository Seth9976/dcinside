package org.jsoup;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.nodes.f;
import org.jsoup.parser.g;
import org.jsoup.parser.h;

public interface b {
    public interface a {
        boolean F(String arg1, String arg2);

        Map J();

        a M(String arg1, String arg2);

        boolean N(String arg1);

        a O(String arg1);

        boolean P(String arg1);

        c S();

        a T(String arg1);

        Map U();

        Map W();

        a c(String arg1, String arg2);

        a i(URL arg1);

        a o(String arg1, String arg2);

        a p(c arg1);

        URL t();

        String u(String arg1);

        String w(String arg1);

        List y(String arg1);
    }

    public interface org.jsoup.b.b {
        InputStream J();

        String key();

        String m();

        org.jsoup.b.b n(String arg1);

        org.jsoup.b.b o(String arg1);

        org.jsoup.b.b p(String arg1);

        org.jsoup.b.b q(InputStream arg1);

        boolean r();

        String value();
    }

    public static enum c {
        GET(false),
        POST(true),
        PUT(true),
        DELETE(true),
        PATCH(true),
        HEAD(false),
        OPTIONS(false),
        TRACE(false);

        private final boolean a;

        private c(boolean z) {
            this.a = z;
        }

        private static c[] a() [...] // Inlined contents

        public final boolean b() {
            return this.a;
        }
    }

    public interface d extends a {
        String B();

        int C();

        boolean D();

        String E();

        SSLSocketFactory G();

        Proxy H();

        d I(org.jsoup.b.b arg1);

        boolean R();

        g Z();

        d a(boolean arg1);

        d b(String arg1);

        d d(int arg1);

        void e(SSLSocketFactory arg1);

        d f(Proxy arg1);

        Collection g();

        d h(g arg1);

        d j(int arg1);

        d k(boolean arg1);

        d l(org.jsoup.helper.g arg1);

        d n(String arg1);

        d q(String arg1, int arg2);

        d r(boolean arg1);

        int timeout();

        boolean v();

        org.jsoup.helper.g z();
    }

    public interface e extends a {
        int A();

        h K() throws IOException;

        f L() throws IOException;

        String Q();

        e V();

        String X();

        byte[] Y();

        String body();

        String m();

        BufferedInputStream s();

        e x(String arg1);
    }

    b A(String arg1, String arg2, InputStream arg3);

    b B(String[] arg1);

    b C(String arg1);

    b D(Map arg1);

    b E(Collection arg1);

    b F();

    f G() throws IOException;

    b H(URL arg1);

    b I(String arg1);

    b J(d arg1);

    b K(e arg1);

    org.jsoup.b.b L(String arg1);

    b a(boolean arg1);

    b b(String arg1);

    b c(String arg1, String arg2);

    b d(int arg1);

    b e(SSLSocketFactory arg1);

    e execute() throws IOException;

    b f(Proxy arg1);

    b g(Map arg1);

    f get() throws IOException;

    b h(g arg1);

    b i(URL arg1);

    b j(int arg1);

    b k(boolean arg1);

    b l(org.jsoup.helper.g arg1);

    b m(String arg1, String arg2, InputStream arg3, String arg4);

    b n(String arg1);

    b o(String arg1, String arg2);

    b p(c arg1);

    b q(String arg1, int arg2);

    b r(boolean arg1);

    d request();

    b s(String arg1, String arg2);

    b t(String arg1);

    e u();

    b v(CookieStore arg1);

    b w(org.jsoup.h arg1);

    CookieStore x();

    b y(String arg1);

    b z(Map arg1);
}

