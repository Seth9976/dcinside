package com.google.crypto.tink.aead;

import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.proto.A;
import com.google.crypto.tink.proto.D;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.proto.z;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.E;
import com.google.crypto.tink.subtle.L;
import com.google.crypto.tink.subtle.b0;
import com.google.crypto.tink.subtle.b;
import java.security.GeneralSecurityException;

public class h extends com.google.crypto.tink.internal.h {
    private static final int d = 12;

    h() {
        class a extends r {
            a(Class class0) {
            }

            @Override  // com.google.crypto.tink.internal.r
            public Object a(R0 r00) throws GeneralSecurityException {
                return this.c(((z)r00));
            }

            public E c(z z0) throws GeneralSecurityException {
                return new b(z0.c().a0(), z0.a().J());
            }
        }

        r[] arr_r = {new a(E.class)};
        super(z.class, arr_r);
    }

    @Override  // com.google.crypto.tink.internal.h
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override  // com.google.crypto.tink.internal.h
    public int f() [...] // Inlined contents

    @Override  // com.google.crypto.tink.internal.h
    public com.google.crypto.tink.internal.h.a g() {
        class com.google.crypto.tink.aead.h.b extends com.google.crypto.tink.internal.h.a {
            final h b;

            com.google.crypto.tink.aead.h.b(Class class0) {
                super(class0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 a(R0 r00) throws GeneralSecurityException {
                return this.h(((A)r00));
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public R0 e(u u0) throws y0 {
                return this.i(u0);
            }

            @Override  // com.google.crypto.tink.internal.h$a
            public void g(R0 r00) throws GeneralSecurityException {
                this.j(((A)r00));
            }

            public z h(A a0) throws GeneralSecurityException {
                return (z)z.Q2().W1(a0.a()).U1(u.p(L.c(a0.d()))).X1(0).B1();
            }

            public A i(u u0) throws y0 {
                return A.S2(u0, V.d());
            }

            public void j(A a0) throws GeneralSecurityException {
                b0.a(a0.d());
                D d0 = a0.a();
                h.this.p(d0);
            }
        }

        return new com.google.crypto.tink.aead.h.b(this, A.class);
    }

    @Override  // com.google.crypto.tink.internal.h
    public c h() {
        return c.c;
    }

    @Override  // com.google.crypto.tink.internal.h
    public R0 i(u u0) throws y0 {
        return this.m(u0);
    }

    @Override  // com.google.crypto.tink.internal.h
    public void k(R0 r00) throws GeneralSecurityException {
        this.o(((z)r00));
    }

    public z m(u u0) throws y0 {
        return z.V2(u0, V.d());
    }

    public static void n(boolean z) throws GeneralSecurityException {
        O.D(new h(), z);
    }

    public void o(z z0) throws GeneralSecurityException {
        b0.j(z0.getVersion(), 0);
        b0.a(z0.c().size());
        this.p(z0.a());
    }

    private void p(D d0) throws GeneralSecurityException {
        if(d0.J() < 12 || d0.J() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}

