package com.google.crypto.tink.internal;

import L1.a;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.t.b;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@a
public abstract class h {
    public static abstract class com.google.crypto.tink.internal.h.a {
        public static final class com.google.crypto.tink.internal.h.a.a {
            public Object a;
            public b b;

            public com.google.crypto.tink.internal.h.a.a(Object object0, b t$b0) {
                this.a = object0;
                this.b = t$b0;
            }
        }

        private final Class a;

        public com.google.crypto.tink.internal.h.a(Class class0) {
            this.a = class0;
        }

        public abstract R0 a(R0 arg1) throws GeneralSecurityException;

        public R0 b(R0 r00, InputStream inputStream0) throws GeneralSecurityException {
            throw new GeneralSecurityException("deriveKey not implemented for key of type " + this.a);
        }

        public final Class c() {
            return this.a;
        }

        public Map d() throws GeneralSecurityException {
            return Collections.emptyMap();
        }

        public abstract R0 e(u arg1) throws y0;

        protected static void f(InputStream inputStream0, byte[] arr_b) throws IOException, GeneralSecurityException {
            for(int v = 0; v < arr_b.length; v += v1) {
                int v1 = inputStream0.read(arr_b, v, arr_b.length - v);
                if(v1 == -1) {
                    throw new GeneralSecurityException("Not enough pseudorandomness provided");
                }
            }
        }

        public abstract void g(R0 arg1) throws GeneralSecurityException;
    }

    private final Class a;
    private final Map b;
    private final Class c;

    @SafeVarargs
    protected h(Class class0, r[] arr_r) {
        this.a = class0;
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v < arr_r.length; ++v) {
            r r0 = arr_r[v];
            if(hashMap0.containsKey(r0.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r0.b().getCanonicalName());
            }
            hashMap0.put(r0.b(), r0);
        }
        this.c = arr_r.length > 0 ? arr_r[0].b() : Void.class;
        this.b = DesugarCollections.unmodifiableMap(hashMap0);
    }

    public com.google.crypto.tink.config.internal.c.b a() {
        return com.google.crypto.tink.config.internal.c.b.a;
    }

    public final Class b() {
        return this.c;
    }

    public final Class c() {
        return this.a;
    }

    public abstract String d();

    public final Object e(R0 r00, Class class0) throws GeneralSecurityException {
        r r0 = (r)this.b.get(class0);
        if(r0 == null) {
            throw new IllegalArgumentException("Requested primitive class " + class0.getCanonicalName() + " not supported.");
        }
        return r0.a(r00);
    }

    public abstract int f();

    public com.google.crypto.tink.internal.h.a g() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract c h();

    public abstract R0 i(u arg1) throws y0;

    public final Set j() {
        return this.b.keySet();
    }

    public abstract void k(R0 arg1) throws GeneralSecurityException;
}

