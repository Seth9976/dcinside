package com.google.crypto.tink.internal;

import O1.j;
import com.google.crypto.tink.E;
import com.google.crypto.tink.P;
import com.google.crypto.tink.o;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.k2.c;
import j..util.Objects;
import java.security.GeneralSecurityException;
import o3.h;

@j
public final class i extends o {
    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[c.values().length];
            a.b = arr_v;
            try {
                arr_v[c.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[c.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[F2.values().length];
            a.a = arr_v1;
            try {
                arr_v1[F2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[F2.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[F2.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[F2.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    @j
    static class b extends E {
        private final String a;
        private final F2 b;

        private b(String s, F2 f20) {
            this.a = s;
            this.b = f20;
        }

        b(String s, F2 f20, a i$a0) {
            this(s, f20);
        }

        @Override  // com.google.crypto.tink.E
        public boolean a() {
            return this.b != F2.e;
        }

        private static String b(F2 f20) {
            switch(a.a[f20.ordinal()]) {
                case 1: {
                    return "TINK";
                }
                case 2: {
                    return "LEGACY";
                }
                case 3: {
                    return "RAW";
                }
                case 4: {
                    return "CRUNCHY";
                }
                default: {
                    return "UNKNOWN";
                }
            }
        }

        @Override
        public String toString() {
            String s = b.b(this.b);
            return String.format("(typeUrl=%s, outputPrefixType=%s)", this.a, s);
        }
    }

    private final u a;

    public i(u u0, @h P p0) throws GeneralSecurityException {
        i.f(u0, p0);
        this.a = u0;
    }

    @Override  // com.google.crypto.tink.o
    public boolean a(o o0) {
        if(!(o0 instanceof i)) {
            return false;
        }
        u u0 = ((i)o0).a;
        if(!u0.e().equals(this.a.e())) {
            return false;
        }
        if(!u0.d().equals(this.a.d())) {
            return false;
        }
        if(!u0.f().equals(this.a.f())) {
            return false;
        }
        return Objects.equals(u0.c(), this.a.c()) ? com.google.crypto.tink.subtle.h.e(this.a.g().a0(), u0.g().a0()) : false;
    }

    @Override  // com.google.crypto.tink.o
    @h
    public Integer b() {
        return this.a.c();
    }

    @Override  // com.google.crypto.tink.o
    public E c() {
        return new b(this.a.f(), this.a.e(), null);
    }

    public u d(@h P p0) throws GeneralSecurityException {
        i.f(this.a, p0);
        return this.a;
    }

    private static void f(u u0, @h P p0) throws GeneralSecurityException {
        switch(u0.d()) {
            case 1: 
            case 2: {
                P.b(p0);
            }
        }
    }
}

