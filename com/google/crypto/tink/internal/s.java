package com.google.crypto.tink.internal;

import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.o;
import j..util.Objects;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public class s {
    static class a {
    }

    public static final class b {
        private final Map a;
        private final Map b;

        public b() {
            this.a = new HashMap();
            this.b = new HashMap();
        }

        public b(s s0) {
            this.a = new HashMap(s0.a);
            this.b = new HashMap(s0.b);
        }

        s c() {
            return new s(this, null);
        }

        @O1.a
        public b d(q q0) throws GeneralSecurityException {
            if(q0 == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c s$c0 = new c(q0.c(), q0.d(), null);
            if(this.a.containsKey(s$c0)) {
                q q1 = (q)this.a.get(s$c0);
                if(!q1.equals(q0) || !q0.equals(q1)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + s$c0);
                }
            }
            else {
                this.a.put(s$c0, q0);
            }
            return this;
        }

        @O1.a
        public b e(H h0) throws GeneralSecurityException {
            if(h0 == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class class0 = h0.b();
            if(this.b.containsKey(class0)) {
                H h1 = (H)this.b.get(class0);
                if(!h1.equals(h0) || !h0.equals(h1)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + class0);
                }
            }
            else {
                this.b.put(class0, h0);
            }
            return this;
        }
    }

    static final class c {
        private final Class a;
        private final Class b;

        private c(Class class0, Class class1) {
            this.a = class0;
            this.b = class1;
        }

        c(Class class0, Class class1, a s$a0) {
            this(class0, class1);
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
            return this.a.getSimpleName() + " with primitive type: " + this.b.getSimpleName();
        }
    }

    private final Map a;
    private final Map b;

    private s(b s$b0) {
        this.a = new HashMap(s$b0.a);
        this.b = new HashMap(s$b0.b);
    }

    s(b s$b0, a s$a0) {
        this(s$b0);
    }

    public Class c(Class class0) throws GeneralSecurityException {
        if(!this.b.containsKey(class0)) {
            throw new GeneralSecurityException("No input primitive class for " + class0 + " available");
        }
        return ((H)this.b.get(class0)).a();
    }

    public Object d(o o0, Class class0) throws GeneralSecurityException {
        c s$c0 = new c(o0.getClass(), class0, null);
        if(!this.a.containsKey(s$c0)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + s$c0 + " available");
        }
        return ((q)this.a.get(s$c0)).a(o0);
    }

    public Object e(G g0, Class class0) throws GeneralSecurityException {
        if(!this.b.containsKey(class0)) {
            throw new GeneralSecurityException("No wrapper found for " + class0);
        }
        H h0 = (H)this.b.get(class0);
        if(!g0.h().equals(h0.a()) || !h0.a().equals(g0.h())) {
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn\'t match the type of primitives in the provided PrimitiveSet");
        }
        return h0.c(g0);
    }
}

