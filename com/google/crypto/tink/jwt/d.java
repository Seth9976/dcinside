package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.H1;
import com.google.crypto.tink.proto.M1;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.m;
import com.google.crypto.tink.subtle.w.c;
import com.google.crypto.tink.subtle.w;
import j..util.Optional;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

class d extends h {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[H1.values().length];
            a.a = arr_v;
            try {
                arr_v[H1.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[H1.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[H1.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static class b extends r {
        public b() {
            super(q.class);
        }

        @Override  // com.google.crypto.tink.internal.r
        public Object a(R0 r00) throws GeneralSecurityException {
            return this.c(((M1)r00));
        }

        public q c(M1 m10) throws GeneralSecurityException {
            class com.google.crypto.tink.jwt.d.b.a implements q {
                final m a;
                final String b;
                final Optional c;
                final b d;

                com.google.crypto.tink.jwt.d.b.a(m m0, String s, Optional optional0) {
                    this.a = m0;
                    this.b = s;
                    this.c = optional0;
                    super();
                }

                @Override  // com.google.crypto.tink.jwt.q
                public z a(String s, x x0, Optional optional0) throws GeneralSecurityException {
                    com.google.crypto.tink.jwt.e.a e$a0 = e.n(s);
                    this.a.a(e$a0.b, e$a0.a.getBytes(StandardCharsets.US_ASCII));
                    com.google.gson.m m0 = com.google.crypto.tink.jwt.a.b(e$a0.c);
                    e.r(this.b, optional0, this.c, m0);
                    return x0.c(y.b(e.l(m0), e$a0.d));
                }
            }

            m m0 = new m(w.p(d.l(m10.g()), m10.t().a0(), m10.u().a0()), d.m(m10.g()), c.a);
            String s = m10.g().name();
            return m10.o() ? new com.google.crypto.tink.jwt.d.b.a(this, m0, s, Optional.of("")) : new com.google.crypto.tink.jwt.d.b.a(this, m0, s, Optional.empty());
        }
    }

    public d() {
        r[] arr_r = {new b()};
        super(M1.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.proto.k2.c h() {
        return com.google.crypto.tink.proto.k2.c.e;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.n(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.p(((M1)r00));
    }

    static final com.google.crypto.tink.subtle.w.b l(H1 h10) throws GeneralSecurityException {
        switch(h10) {
            case 1: {
                return com.google.crypto.tink.subtle.w.b.a;
            }
            case 2: {
                return com.google.crypto.tink.subtle.w.b.b;
            }
            case 3: {
                return com.google.crypto.tink.subtle.w.b.c;
            }
            default: {
                throw new GeneralSecurityException("unknown algorithm " + h10.name());
            }
        }
    }

    public static com.google.crypto.tink.subtle.A.a m(H1 h10) throws GeneralSecurityException {
        switch(a.a[h10.ordinal()]) {
            case 1: {
                return com.google.crypto.tink.subtle.A.a.c;
            }
            case 2: {
                return com.google.crypto.tink.subtle.A.a.d;
            }
            case 3: {
                return com.google.crypto.tink.subtle.A.a.e;
            }
            default: {
                throw new GeneralSecurityException("unknown algorithm " + h10.name());
            }
        }
    }

    public M1 n(u u0) throws y0 {
        return M1.c3(u0, V.d());
    }

    static final void o(H1 h10) throws GeneralSecurityException {
        d.m(h10);
    }

    public void p(M1 m10) throws GeneralSecurityException {
        b0.j(m10.getVersion(), 0);
        d.o(m10.g());
    }
}

