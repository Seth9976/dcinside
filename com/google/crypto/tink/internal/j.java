package com.google.crypto.tink.internal;

import O1.j;
import com.google.crypto.tink.E;
import com.google.crypto.tink.proto.F2;
import j..util.Objects;

@j
public final class com.google.crypto.tink.internal.j extends E {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[F2.values().length];
            a.a = arr_v;
            try {
                arr_v[F2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[F2.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[F2.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[F2.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final v a;

    public com.google.crypto.tink.internal.j(v v0) {
        this.a = v0;
    }

    @Override  // com.google.crypto.tink.E
    public boolean a() {
        return this.a.d().y() != F2.e;
    }

    public v b() {
        return this.a;
    }

    private static String c(F2 f20) {
        switch(f20) {
            case 1: {
                return "TINK";
            }
            case 2: {
                return "LEGACY";
            }
            case 3: {
                return "RAW";
            }
            case 4: {
                return "CRUNCHY";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    // 去混淆评级： 低(22)
    @Override
    public boolean equals(Object object0) {
        if(!(object0 instanceof com.google.crypto.tink.internal.j)) {
            return false;
        }
        v v0 = ((com.google.crypto.tink.internal.j)object0).a;
        return this.a.d().y().equals(v0.d().y()) && this.a.d().getValue().equals(v0.d().getValue());
    }

    @Override
    public int hashCode() {
        com.google.crypto.tink.util.a a0 = this.a.a();
        return Objects.hash(new Object[]{this.a.d(), a0});
    }

    @Override
    public String toString() {
        String s = com.google.crypto.tink.internal.j.c(this.a.d().y());
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.a.d().getTypeUrl(), s);
    }
}

