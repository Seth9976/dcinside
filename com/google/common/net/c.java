package com.google.common.net;

import J1.c;
import J1.d;
import com.google.common.base.H;
import java.net.InetAddress;
import java.text.ParseException;

@c
@d
@a
public final class com.google.common.net.c {
    private final String a;

    private com.google.common.net.c(String s) {
        this.a = s;
    }

    @O1.a
    public static com.google.common.net.c a(String s) throws ParseException {
        try {
            return com.google.common.net.c.b(s);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            ParseException parseException0 = new ParseException("Invalid host specifier: " + s, 0);
            parseException0.initCause(illegalArgumentException0);
            throw parseException0;
        }
    }

    public static com.google.common.net.c b(String s) {
        InetAddress inetAddress0;
        b b0 = b.c(s);
        H.d(!b0.h());
        String s1 = b0.d();
        try {
            inetAddress0 = null;
            inetAddress0 = e.g(s1);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        if(inetAddress0 != null) {
            return new com.google.common.net.c(e.O(inetAddress0));
        }
        f f0 = f.d(s1);
        if(!f0.f()) {
            throw new IllegalArgumentException("Domain name does not have a recognized public suffix: " + s1);
        }
        return new com.google.common.net.c(f0.toString());
    }

    public static boolean c(String s) {
        try {
            com.google.common.net.c.b(s);
            return true;
        }
        catch(IllegalArgumentException unused_ex) {
            return false;
        }
    }

    @Override
    public boolean equals(@o3.a Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof com.google.common.net.c ? this.a.equals(((com.google.common.net.c)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return this.a;
    }
}

