package org.jsoup.helper;

import java.net.Authenticator.RequestorType;
import java.net.PasswordAuthentication;
import java.net.URL;

@FunctionalInterface
public interface g {
    public static class a {
        private final URL a;
        private final Authenticator.RequestorType b;
        private final String c;

        a(URL uRL0, Authenticator.RequestorType authenticator$RequestorType0, String s) {
            this.a = uRL0;
            this.b = authenticator$RequestorType0;
            this.c = s;
        }

        public PasswordAuthentication a(String s, String s1) {
            return new PasswordAuthentication(s, s1.toCharArray());
        }

        public boolean b() {
            return this.b == Authenticator.RequestorType.PROXY;
        }

        public boolean c() {
            return this.b == Authenticator.RequestorType.SERVER;
        }

        public String d() {
            return this.c;
        }

        public Authenticator.RequestorType e() {
            return this.b;
        }

        public URL f() {
            return this.a;
        }
    }

    PasswordAuthentication a(a arg1);
}

