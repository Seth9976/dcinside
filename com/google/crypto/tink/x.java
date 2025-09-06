package com.google.crypto.tink;

import O1.l;
import com.google.crypto.tink.internal.f;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.k2;
import com.google.crypto.tink.proto.m2;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.proto.r2.b;
import com.google.crypto.tink.proto.r2;
import com.google.crypto.tink.tinkkey.c;
import java.security.GeneralSecurityException;
import p3.a;

public final class x {
    @a("this")
    private final b a;

    private x(b r2$b0) {
        this.a = r2$b0;
    }

    @O1.a
    public x a(t t0) throws GeneralSecurityException {
        synchronized(this) {
            this.e(t0.d(), false);
            return this;
        }
    }

    @O1.a
    @Deprecated
    public x b(n2 n20) throws GeneralSecurityException {
        synchronized(this) {
            this.e(n20, false);
            return this;
        }
    }

    @O1.a
    public x c(com.google.crypto.tink.tinkkey.b b0) throws GeneralSecurityException {
        N1.b b1;
        synchronized(this) {
            try {
                b1 = (N1.b)b0.f(c.a());
            }
            catch(ClassCastException classCastException0) {
                throw new UnsupportedOperationException("KeyHandles which contain TinkKeys that are not ProtoKeys are not yet supported.", classCastException0);
            }
        }
        if(this.l(b0.e())) {
            throw new GeneralSecurityException("Trying to add a key with an ID already contained in the keyset.");
        }
        com.google.crypto.tink.proto.r2.c r2$c0 = (com.google.crypto.tink.proto.r2.c)com.google.crypto.tink.proto.r2.c.V2().W1(b1.d()).X1(b0.e()).a2(f.b(b0.h())).Y1(t.g(b1.c())).B1();
        this.a.U1(r2$c0);
        return this;
    }

    @O1.a
    public x d(com.google.crypto.tink.tinkkey.b b0, com.google.crypto.tink.tinkkey.a a0) throws GeneralSecurityException {
        synchronized(this) {
            return this.c(b0);
        }
    }

    @O1.a
    @Deprecated
    public int e(n2 n20, boolean z) throws GeneralSecurityException {
        com.google.crypto.tink.proto.r2.c r2$c0;
        synchronized(this) {
            r2$c0 = this.m(n20);
            this.a.U1(r2$c0);
            if(z) {
                this.a.a2(r2$c0.H());
            }
        }
        return r2$c0.H();
    }

    private com.google.crypto.tink.proto.r2.c f(k2 k20, F2 f20) throws GeneralSecurityException {
        synchronized(this) {
            int v1 = this.n();
            if(f20 != F2.b) {
                return (com.google.crypto.tink.proto.r2.c)com.google.crypto.tink.proto.r2.c.V2().W1(k20).X1(v1).a2(m2.c).Y1(f20).B1();
            }
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }

    @O1.a
    public x g(int v) throws GeneralSecurityException {
        synchronized(this) {
            if(v != this.a.M()) {
                for(int v2 = 0; v2 < this.a.l0(); ++v2) {
                    if(this.a.D(v2).H() == v) {
                        this.a.X1(v2);
                        return this;
                    }
                }
                throw new GeneralSecurityException("key not found: " + v);
            }
        }
        throw new GeneralSecurityException("cannot delete the primary key");
    }

    @O1.a
    public x h(int v) throws GeneralSecurityException {
        synchronized(this) {
            if(v != this.a.M()) {
                for(int v2 = 0; v2 < this.a.l0(); ++v2) {
                    com.google.crypto.tink.proto.r2.c r2$c0 = this.a.D(v2);
                    if(r2$c0.H() == v) {
                        if(r2$c0.getStatus() != m2.c && r2$c0.getStatus() != m2.d && r2$c0.getStatus() != m2.e) {
                            throw new GeneralSecurityException("cannot destroy key with id " + v);
                        }
                        com.google.crypto.tink.proto.r2.c r2$c1 = (com.google.crypto.tink.proto.r2.c)((com.google.crypto.tink.proto.r2.c.a)r2$c0.C2()).a2(m2.e).Q1().B1();
                        this.a.Z1(v2, r2$c1);
                        return this;
                    }
                }
                throw new GeneralSecurityException("key not found: " + v);
            }
        }
        throw new GeneralSecurityException("cannot destroy the primary key");
    }

    @O1.a
    public x i(int v) throws GeneralSecurityException {
        synchronized(this) {
            if(v != this.a.M()) {
                for(int v2 = 0; v2 < this.a.l0(); ++v2) {
                    com.google.crypto.tink.proto.r2.c r2$c0 = this.a.D(v2);
                    if(r2$c0.H() == v) {
                        if(r2$c0.getStatus() != m2.c && r2$c0.getStatus() != m2.d) {
                            throw new GeneralSecurityException("cannot disable key with id " + v);
                        }
                        com.google.crypto.tink.proto.r2.c r2$c1 = (com.google.crypto.tink.proto.r2.c)((com.google.crypto.tink.proto.r2.c.a)r2$c0.C2()).a2(m2.d).B1();
                        this.a.Z1(v2, r2$c1);
                        return this;
                    }
                }
                throw new GeneralSecurityException("key not found: " + v);
            }
        }
        throw new GeneralSecurityException("cannot disable the primary key");
    }

    @O1.a
    public x j(int v) throws GeneralSecurityException {
        synchronized(this) {
            for(int v2 = 0; v2 < this.a.l0(); ++v2) {
                com.google.crypto.tink.proto.r2.c r2$c0 = this.a.D(v2);
                if(r2$c0.H() == v) {
                    m2 m20 = m2.c;
                    if(r2$c0.getStatus() != m20 && r2$c0.getStatus() != m2.d) {
                        throw new GeneralSecurityException("cannot enable key with id " + v);
                    }
                    com.google.crypto.tink.proto.r2.c r2$c1 = (com.google.crypto.tink.proto.r2.c)((com.google.crypto.tink.proto.r2.c.a)r2$c0.C2()).a2(m20).B1();
                    this.a.Z1(v2, r2$c1);
                    return this;
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + v);
    }

    public w k() throws GeneralSecurityException {
        synchronized(this) {
            return w.k(((r2)this.a.B1()));
        }
    }

    private boolean l(int v) {
        synchronized(this) {
            for(Object object0: this.a.R0()) {
                if(((com.google.crypto.tink.proto.r2.c)object0).H() == v) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    private com.google.crypto.tink.proto.r2.c m(n2 n20) throws GeneralSecurityException {
        synchronized(this) {
            return this.f(O.y(n20), n20.y());
        }
    }

    private int n() {
        int v1;
        synchronized(this) {
            do {
                v1 = z.c();
            }
            while(this.l(v1));
            return v1;
        }
    }

    @O1.a
    @l(replacement = "this.setPrimary(keyId)")
    @Deprecated
    public x o(int v) throws GeneralSecurityException {
        synchronized(this) {
            return this.q(v);
        }
    }

    @O1.a
    @Deprecated
    public x p(n2 n20) throws GeneralSecurityException {
        synchronized(this) {
            this.e(n20, true);
            return this;
        }
    }

    @O1.a
    public x q(int v) throws GeneralSecurityException {
        synchronized(this) {
            for(int v2 = 0; v2 < this.a.l0(); ++v2) {
                com.google.crypto.tink.proto.r2.c r2$c0 = this.a.D(v2);
                if(r2$c0.H() == v) {
                    if(!r2$c0.getStatus().equals(m2.c)) {
                        throw new GeneralSecurityException("cannot set key as primary because it\'s not enabled: " + v);
                    }
                    this.a.a2(v);
                    return this;
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + v);
    }

    public static x r() {
        return new x(r2.V2());
    }

    public static x s(w w0) {
        return new x(((b)w0.u().C2()));
    }
}

