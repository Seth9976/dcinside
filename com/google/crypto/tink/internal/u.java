package com.google.crypto.tink.internal;

import O1.j;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.k2.c;
import com.google.crypto.tink.util.a;
import java.security.GeneralSecurityException;
import o3.h;

@j
public final class u implements w {
    private final String a;
    private final a b;
    private final com.google.crypto.tink.shaded.protobuf.u c;
    private final c d;
    private final F2 e;
    @h
    private final Integer f;

    private u(String s, com.google.crypto.tink.shaded.protobuf.u u0, c k2$c0, F2 f20, @h Integer integer0) {
        this.a = s;
        this.b = z.e(s);
        this.c = u0;
        this.d = k2$c0;
        this.e = f20;
        this.f = integer0;
    }

    @Override  // com.google.crypto.tink.internal.w
    public a a() {
        return this.b;
    }

    public static u b(String s, com.google.crypto.tink.shaded.protobuf.u u0, c k2$c0, F2 f20, @h Integer integer0) throws GeneralSecurityException {
        if(f20 == F2.e) {
            if(integer0 != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        }
        else if(integer0 == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new u(s, u0, k2$c0, f20, integer0);
    }

    @h
    public Integer c() {
        return this.f;
    }

    public c d() {
        return this.d;
    }

    public F2 e() {
        return this.e;
    }

    public String f() {
        return this.a;
    }

    public com.google.crypto.tink.shaded.protobuf.u g() {
        return this.c;
    }
}

