package com.google.crypto.tink.internal;

import com.google.crypto.tink.E;
import com.google.crypto.tink.P;
import com.google.crypto.tink.o;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import o3.h;

public final class n {
    private final AtomicReference a;
    private static final n b;

    static {
        n.b = new n();
    }

    public n() {
        this.a = new AtomicReference(new b().e());
    }

    public static n a() {
        return n.b;
    }

    public boolean b(w w0) {
        return ((x)this.a.get()).e(w0);
    }

    public boolean c(w w0) {
        return ((x)this.a.get()).f(w0);
    }

    public boolean d(o o0, Class class0) {
        return ((x)this.a.get()).g(o0, class0);
    }

    public boolean e(E e0, Class class0) {
        return ((x)this.a.get()).h(e0, class0);
    }

    public o f(w w0, @h P p0) throws GeneralSecurityException {
        return ((x)this.a.get()).i(w0, p0);
    }

    public o g(u u0, P p0) throws GeneralSecurityException {
        if(p0 == null) {
            throw new NullPointerException("access cannot be null");
        }
        if(!this.b(u0)) {
            try {
                return new i(u0, p0);
            }
            catch(GeneralSecurityException generalSecurityException0) {
                throw new y("Creating a LegacyProtoKey failed", generalSecurityException0);
            }
        }
        return this.f(u0, p0);
    }

    public E h(w w0) throws GeneralSecurityException {
        return ((x)this.a.get()).j(w0);
    }

    public E i(v v0) {
        try {
            return this.h(v0);
        }
        catch(GeneralSecurityException unused_ex) {
            return new j(v0);
        }
    }

    public void j(d d0) throws GeneralSecurityException {
        synchronized(this) {
            x x0 = new b(((x)this.a.get())).f(d0).e();
            this.a.set(x0);
        }
    }

    public void k(e e0) throws GeneralSecurityException {
        synchronized(this) {
            x x0 = new b(((x)this.a.get())).g(e0).e();
            this.a.set(x0);
        }
    }

    public void l(com.google.crypto.tink.internal.o o0) throws GeneralSecurityException {
        synchronized(this) {
            x x0 = new b(((x)this.a.get())).h(o0).e();
            this.a.set(x0);
        }
    }

    public void m(p p0) throws GeneralSecurityException {
        synchronized(this) {
            x x0 = new b(((x)this.a.get())).i(p0).e();
            this.a.set(x0);
        }
    }

    public w n(o o0, Class class0, @h P p0) throws GeneralSecurityException {
        return ((x)this.a.get()).k(o0, class0, p0);
    }

    public w o(E e0, Class class0) throws GeneralSecurityException {
        return ((x)this.a.get()).l(e0, class0);
    }
}

