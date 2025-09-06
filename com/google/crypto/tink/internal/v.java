package com.google.crypto.tink.internal;

import O1.j;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.util.a;

@j
public final class v implements w {
    private final a a;
    private final n2 b;

    private v(n2 n20) {
        this.b = n20;
        this.a = z.e(n20.getTypeUrl());
    }

    @Override  // com.google.crypto.tink.internal.w
    public a a() {
        return this.a;
    }

    public static v b(n2 n20) {
        return new v(n20);
    }

    public static v c(String s, F2 f20, R0 r00) {
        return v.b(((n2)n2.Q2().V1(s).T1(f20).X1(r00.toByteString()).B1()));
    }

    public n2 d() {
        return this.b;
    }
}

