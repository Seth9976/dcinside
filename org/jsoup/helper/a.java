package org.jsoup.helper;

import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;

class a extends Authenticator {
    interface org.jsoup.helper.a.a {
        a a(a arg1);

        void b(g arg1, HttpURLConnection arg2);

        void remove();
    }

    static class b implements org.jsoup.helper.a.a {
        static ThreadLocal a;

        static {
            b.a = new ThreadLocal();
            Authenticator.setDefault(new a());
        }

        @Override  // org.jsoup.helper.a$a
        public a a(a a0) {
            return (a)b.a.get();
        }

        @Override  // org.jsoup.helper.a$a
        public void b(g g0, HttpURLConnection httpURLConnection0) {
            b.a.set(new a(g0));
        }

        @Override  // org.jsoup.helper.a$a
        public void remove() {
            b.a.remove();
        }
    }

    g a;
    int b;
    static final int c = 5;
    static org.jsoup.helper.a.a d;

    static {
        try {
            a.d = (org.jsoup.helper.a.a)Class.forName("org.jsoup.helper.RequestAuthHandler").getConstructor(null).newInstance(null);
        }
        catch(ClassNotFoundException unused_ex) {
            a.d = new b();
        }
        catch(Exception exception0) {
            throw new IllegalStateException(exception0);
        }
    }

    a() {
        this.b = 0;
    }

    a(g g0) {
        this.b = 0;
        this.a = g0;
    }

    @Override
    public final PasswordAuthentication getPasswordAuthentication() {
        a a0 = a.d.a(this);
        if(a0 == null) {
            return null;
        }
        int v = a0.b + 1;
        a0.b = v;
        if(v > 5) {
            return null;
        }
        if(a0.a == null) {
            return null;
        }
        org.jsoup.helper.g.a g$a0 = new org.jsoup.helper.g.a(this.getRequestingURL(), this.getRequestorType(), this.getRequestingPrompt());
        return a0.a.a(g$a0);
    }
}

