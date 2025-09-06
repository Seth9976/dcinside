package com.google.crypto.tink.internal;

import com.google.crypto.tink.G;
import com.google.crypto.tink.monitoring.c;
import com.google.crypto.tink.proto.m2;
import com.google.crypto.tink.s;
import java.security.GeneralSecurityException;
import java.util.List;

public final class k {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[m2.values().length];
            a.a = arr_v;
            try {
                arr_v[m2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[m2.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[m2.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static class b implements com.google.crypto.tink.monitoring.b.a {
        private b() {
        }

        b(a k$a0) {
        }

        @Override  // com.google.crypto.tink.monitoring.b$a
        public void a() {
        }

        @Override  // com.google.crypto.tink.monitoring.b$a
        public void b(int v, long v1) {
        }
    }

    public static final com.google.crypto.tink.monitoring.b.a a = null;
    private static final String b = "type.googleapis.com/google.crypto.";

    static {
        k.a = new b(null);
    }

    public static c a(G g0) {
        com.google.crypto.tink.monitoring.c.b c$b0 = c.d();
        c$b0.d(g0.e());
        for(Object object0: g0.d()) {
            for(Object object1: ((List)object0)) {
                c$b0.a(k.c(((com.google.crypto.tink.G.c)object1).i()), ((com.google.crypto.tink.G.c)object1).d(), k.b(((com.google.crypto.tink.G.c)object1).e()), ((com.google.crypto.tink.G.c)object1).f().name());
            }
        }
        if(g0.f() != null) {
            c$b0.e(g0.f().d());
        }
        try {
            return c$b0.b();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException(generalSecurityException0);
        }
    }

    private static String b(String s) {
        return s.startsWith("type.googleapis.com/google.crypto.") ? s.substring(34) : s;
    }

    private static s c(m2 m20) {
        switch(m20) {
            case 1: {
                return s.b;
            }
            case 2: {
                return s.c;
            }
            case 3: {
                return s.d;
            }
            default: {
                throw new IllegalStateException("Unknown key status");
            }
        }
    }
}

