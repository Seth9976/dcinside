package com.google.crypto.tink.internal;

import com.google.crypto.tink.E;
import com.google.crypto.tink.P;
import j..util.Objects;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import o3.h;

public final class x {
    static class a {
    }

    public static final class b {
        private final Map a;
        private final Map b;
        private final Map c;
        private final Map d;

        public b() {
            this.a = new HashMap();
            this.b = new HashMap();
            this.c = new HashMap();
            this.d = new HashMap();
        }

        public b(x x0) {
            this.a = new HashMap(x0.a);
            this.b = new HashMap(x0.b);
            this.c = new HashMap(x0.c);
            this.d = new HashMap(x0.d);
        }

        x e() {
            return new x(this, null);
        }

        @O1.a
        public b f(d d0) throws GeneralSecurityException {
            c x$c0 = new c(d0.c(), d0.b(), null);
            if(this.b.containsKey(x$c0)) {
                d d1 = (d)this.b.get(x$c0);
                if(!d1.equals(d0) || !d0.equals(d1)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + x$c0);
                }
            }
            else {
                this.b.put(x$c0, d0);
            }
            return this;
        }

        @O1.a
        public b g(e e0) throws GeneralSecurityException {
            com.google.crypto.tink.internal.x.d x$d0 = new com.google.crypto.tink.internal.x.d(e0.b(), e0.c(), null);
            if(this.a.containsKey(x$d0)) {
                e e1 = (e)this.a.get(x$d0);
                if(!e1.equals(e0) || !e0.equals(e1)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + x$d0);
                }
            }
            else {
                this.a.put(x$d0, e0);
            }
            return this;
        }

        @O1.a
        public b h(o o0) throws GeneralSecurityException {
            c x$c0 = new c(o0.c(), o0.b(), null);
            if(this.d.containsKey(x$c0)) {
                o o1 = (o)this.d.get(x$c0);
                if(!o1.equals(o0) || !o0.equals(o1)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + x$c0);
                }
            }
            else {
                this.d.put(x$c0, o0);
            }
            return this;
        }

        @O1.a
        public b i(p p0) throws GeneralSecurityException {
            com.google.crypto.tink.internal.x.d x$d0 = new com.google.crypto.tink.internal.x.d(p0.b(), p0.c(), null);
            if(this.c.containsKey(x$d0)) {
                p p1 = (p)this.c.get(x$d0);
                if(!p1.equals(p0) || !p0.equals(p1)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + x$d0);
                }
            }
            else {
                this.c.put(x$d0, p0);
            }
            return this;
        }
    }

    static class c {
        private final Class a;
        private final com.google.crypto.tink.util.a b;

        private c(Class class0, com.google.crypto.tink.util.a a0) {
            this.a = class0;
            this.b = a0;
        }

        c(Class class0, com.google.crypto.tink.util.a a0, a x$a0) {
            this(class0, a0);
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof c ? ((c)object0).a.equals(this.a) && ((c)object0).b.equals(this.b) : false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b});
        }

        @Override
        public String toString() {
            return this.a.getSimpleName() + ", object identifier: " + this.b;
        }
    }

    static class com.google.crypto.tink.internal.x.d {
        private final Class a;
        private final Class b;

        private com.google.crypto.tink.internal.x.d(Class class0, Class class1) {
            this.a = class0;
            this.b = class1;
        }

        com.google.crypto.tink.internal.x.d(Class class0, Class class1, a x$a0) {
            this(class0, class1);
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof com.google.crypto.tink.internal.x.d ? ((com.google.crypto.tink.internal.x.d)object0).a.equals(this.a) && ((com.google.crypto.tink.internal.x.d)object0).b.equals(this.b) : false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b});
        }

        @Override
        public String toString() {
            return this.a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
        }
    }

    private final Map a;
    private final Map b;
    private final Map c;
    private final Map d;

    private x(b x$b0) {
        this.a = new HashMap(x$b0.a);
        this.b = new HashMap(x$b0.b);
        this.c = new HashMap(x$b0.c);
        this.d = new HashMap(x$b0.d);
    }

    x(b x$b0, a x$a0) {
        this(x$b0);
    }

    public boolean e(w w0) {
        c x$c0 = new c(w0.getClass(), w0.a(), null);
        return this.b.containsKey(x$c0);
    }

    public boolean f(w w0) {
        c x$c0 = new c(w0.getClass(), w0.a(), null);
        return this.d.containsKey(x$c0);
    }

    public boolean g(com.google.crypto.tink.o o0, Class class0) {
        com.google.crypto.tink.internal.x.d x$d0 = new com.google.crypto.tink.internal.x.d(o0.getClass(), class0, null);
        return this.a.containsKey(x$d0);
    }

    public boolean h(E e0, Class class0) {
        com.google.crypto.tink.internal.x.d x$d0 = new com.google.crypto.tink.internal.x.d(e0.getClass(), class0, null);
        return this.c.containsKey(x$d0);
    }

    public com.google.crypto.tink.o i(w w0, @h P p0) throws GeneralSecurityException {
        c x$c0 = new c(w0.getClass(), w0.a(), null);
        if(!this.b.containsKey(x$c0)) {
            throw new GeneralSecurityException("No Key Parser for requested key type " + x$c0 + " available");
        }
        return ((d)this.b.get(x$c0)).d(w0, p0);
    }

    public E j(w w0) throws GeneralSecurityException {
        c x$c0 = new c(w0.getClass(), w0.a(), null);
        if(!this.d.containsKey(x$c0)) {
            throw new GeneralSecurityException("No Parameters Parser for requested key type " + x$c0 + " available");
        }
        return ((o)this.d.get(x$c0)).d(w0);
    }

    public w k(com.google.crypto.tink.o o0, Class class0, @h P p0) throws GeneralSecurityException {
        com.google.crypto.tink.internal.x.d x$d0 = new com.google.crypto.tink.internal.x.d(o0.getClass(), class0, null);
        if(!this.a.containsKey(x$d0)) {
            throw new GeneralSecurityException("No Key serializer for " + x$d0 + " available");
        }
        return ((e)this.a.get(x$d0)).d(o0, p0);
    }

    public w l(E e0, Class class0) throws GeneralSecurityException {
        com.google.crypto.tink.internal.x.d x$d0 = new com.google.crypto.tink.internal.x.d(e0.getClass(), class0, null);
        if(!this.c.containsKey(x$d0)) {
            throw new GeneralSecurityException("No Key Format serializer for " + x$d0 + " available");
        }
        return ((p)this.c.get(x$d0)).d(e0);
    }
}

