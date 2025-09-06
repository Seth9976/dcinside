package com.google.crypto.tink.internal;

import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.o;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

public final class m {
    private final AtomicReference a;
    private static m b;

    static {
        m.b = new m();
    }

    m() {
        this.a = new AtomicReference(new b().c());
    }

    public Class a(Class class0) throws GeneralSecurityException {
        return ((s)this.a.get()).c(class0);
    }

    public Object b(o o0, Class class0) throws GeneralSecurityException {
        return ((s)this.a.get()).d(o0, class0);
    }

    public static m c() {
        return m.b;
    }

    public void d(q q0) throws GeneralSecurityException {
        synchronized(this) {
            s s0 = new b(((s)this.a.get())).d(q0).c();
            this.a.set(s0);
        }
    }

    public void e(H h0) throws GeneralSecurityException {
        synchronized(this) {
            s s0 = new b(((s)this.a.get())).e(h0).c();
            this.a.set(s0);
        }
    }

    public static void f() {
        m.b = new m();
    }

    public Object g(G g0, Class class0) throws GeneralSecurityException {
        return ((s)this.a.get()).e(g0, class0);
    }
}

