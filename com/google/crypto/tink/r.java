package com.google.crypto.tink;

import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.proto.k2;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import j..util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

final class r {
    interface d {
        Class a();

        Class b();

        R0 c(u arg1) throws GeneralSecurityException, y0;

        p d(Class arg1) throws GeneralSecurityException;

        Set e();

        p f();
    }

    private final ConcurrentMap a;
    private static final Logger b;

    static {
        r.b = Logger.getLogger("com.google.crypto.tink.r");
    }

    r() {
        this.a = new ConcurrentHashMap();
    }

    r(r r0) {
        this.a = new ConcurrentHashMap(r0.a);
    }

    private static Object a(Object object0) {
        object0.getClass();
        return object0;
    }

    private static d b(p p0) {
        class a implements d {
            final p a;

            a(p p0) {
            }

            @Override  // com.google.crypto.tink.r$d
            public Class a() {
                return null;
            }

            @Override  // com.google.crypto.tink.r$d
            public Class b() {
                return this.a.getClass();
            }

            @Override  // com.google.crypto.tink.r$d
            public R0 c(u u0) throws GeneralSecurityException, y0 {
                return null;
            }

            @Override  // com.google.crypto.tink.r$d
            public p d(Class class0) throws GeneralSecurityException {
                if(!this.a.b().equals(class0)) {
                    throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
                }
                return this.a;
            }

            @Override  // com.google.crypto.tink.r$d
            public Set e() {
                return Collections.singleton(this.a.b());
            }

            @Override  // com.google.crypto.tink.r$d
            public p f() {
                return this.a;
            }
        }

        return new a(p0);
    }

    private static d c(h h0) {
        class b implements d {
            final h a;

            b(h h0) {
            }

            @Override  // com.google.crypto.tink.r$d
            public Class a() {
                return null;
            }

            @Override  // com.google.crypto.tink.r$d
            public Class b() {
                return this.a.getClass();
            }

            @Override  // com.google.crypto.tink.r$d
            public R0 c(u u0) throws GeneralSecurityException, y0 {
                R0 r00 = this.a.i(u0);
                this.a.k(r00);
                return r00;
            }

            @Override  // com.google.crypto.tink.r$d
            public p d(Class class0) throws GeneralSecurityException {
                try {
                    return new q(this.a, class0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    throw new GeneralSecurityException("Primitive type not supported", illegalArgumentException0);
                }
            }

            @Override  // com.google.crypto.tink.r$d
            public Set e() {
                return this.a.j();
            }

            @Override  // com.google.crypto.tink.r$d
            public p f() {
                Class class0 = this.a.b();
                return new q(this.a, class0);
            }
        }

        return new b(h0);
    }

    private static d d(t t0, h h0) {
        class c implements d {
            final t a;
            final h b;

            c(t t0, h h0) {
                this.b = h0;
                super();
            }

            @Override  // com.google.crypto.tink.r$d
            public Class a() {
                return this.b.getClass();
            }

            @Override  // com.google.crypto.tink.r$d
            public Class b() {
                return this.a.getClass();
            }

            @Override  // com.google.crypto.tink.r$d
            public R0 c(u u0) throws GeneralSecurityException, y0 {
                R0 r00 = this.a.i(u0);
                this.a.k(r00);
                return r00;
            }

            @Override  // com.google.crypto.tink.r$d
            public p d(Class class0) throws GeneralSecurityException {
                try {
                    return new K(this.a, this.b, class0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    throw new GeneralSecurityException("Primitive type not supported", illegalArgumentException0);
                }
            }

            @Override  // com.google.crypto.tink.r$d
            public Set e() {
                return this.a.j();
            }

            @Override  // com.google.crypto.tink.r$d
            public p f() {
                return new K(this.a, this.b, this.a.b());
            }
        }

        return new c(t0, h0);
    }

    @Deprecated
    p e(String s) throws GeneralSecurityException {
        return this.h(s, null);
    }

    p f(String s, Class class0) throws GeneralSecurityException {
        return this.h(s, ((Class)r.a(class0)));
    }

    private d g(String s) throws GeneralSecurityException {
        synchronized(this) {
            if(this.a.containsKey(s)) {
                return (d)this.a.get(s);
            }
        }
        throw new GeneralSecurityException("No key manager found for key type " + s);
    }

    private p h(String s, Class class0) throws GeneralSecurityException {
        d r$d0 = this.g(s);
        if(class0 == null) {
            return r$d0.f();
        }
        if(!r$d0.e().contains(class0)) {
            throw new GeneralSecurityException("Primitive type " + class0.getName() + " not supported by key manager of type " + r$d0.b() + ", supported primitives: " + r.p(r$d0.e()));
        }
        return r$d0.d(class0);
    }

    p i(String s) throws GeneralSecurityException {
        return this.g(s).f();
    }

    boolean j() {
        return this.a.isEmpty();
    }

    R0 k(k2 k20) throws GeneralSecurityException, y0 {
        return this.g(k20.getTypeUrl()).c(k20.getValue());
    }

    void l(t t0, h h0) throws GeneralSecurityException {
        synchronized(this) {
            com.google.crypto.tink.config.internal.c.b c$b0 = t0.a();
            com.google.crypto.tink.config.internal.c.b c$b1 = h0.a();
            if(c$b0.a()) {
                if(!c$b1.a()) {
                    throw new GeneralSecurityException("failed to register key manager " + h0.getClass() + " as it is not FIPS compatible.");
                }
                String s = t0.d();
                String s1 = h0.d();
                if(this.a.containsKey(s) && ((d)this.a.get(s)).a() != null) {
                    Class class0 = ((d)this.a.get(s)).a();
                    if(class0 != null && !class0.getName().equals(h0.getClass().getName())) {
                        r.b.warning("Attempted overwrite of a registered key manager for key type " + s + " with inconsistent public key type " + s1);
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", t0.getClass().getName(), class0.getName(), h0.getClass().getName()));
                    }
                }
                this.o(r.d(t0, h0), true);
                this.o(r.c(h0), false);
                return;
            }
        }
        throw new GeneralSecurityException("failed to register key manager " + t0.getClass() + " as it is not FIPS compatible.");
    }

    void m(p p0) throws GeneralSecurityException {
        synchronized(this) {
            if(com.google.crypto.tink.config.internal.c.b.a.a()) {
                this.o(r.b(p0), false);
                return;
            }
        }
        throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
    }

    void n(h h0) throws GeneralSecurityException {
        synchronized(this) {
            if(h0.a().a()) {
                this.o(r.c(h0), false);
                return;
            }
        }
        throw new GeneralSecurityException("failed to register key manager " + h0.getClass() + " as it is not FIPS compatible.");
    }

    private void o(d r$d0, boolean z) throws GeneralSecurityException {
        synchronized(this) {
            String s = r$d0.f().h();
            d r$d1 = (d)this.a.get(s);
            if(r$d1 != null && !r$d1.b().equals(r$d0.b())) {
                r.b.warning("Attempted overwrite of a registered key manager for key type " + s);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", s, r$d1.b().getName(), r$d0.b().getName()));
            }
            if(z) {
                this.a.put(s, r$d0);
            }
            else {
                this.a.putIfAbsent(s, r$d0);
            }
        }
    }

    private static String p(Set set0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        boolean z = true;
        for(Object object0: set0) {
            if(!z) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((Class)object0).getCanonicalName());
            z = false;
        }
        return stringBuilder0.toString();
    }

    boolean q(String s) {
        return this.a.containsKey(s);
    }
}

