package com.google.common.hash;

import O1.j;
import com.google.common.base.H;
import java.io.Serializable;
import java.util.zip.Checksum;

@j
@k
final class i extends c implements Serializable {
    static class a {
    }

    final class b extends com.google.common.hash.a {
        private final Checksum b;
        final i c;

        private b(Checksum checksum0) {
            this.b = (Checksum)H.E(checksum0);
        }

        b(Checksum checksum0, a i$a0) {
            this(checksum0);
        }

        @Override  // com.google.common.hash.s
        public p n() {
            long v = this.b.getValue();
            return i.this.b == 0x20 ? p.i(((int)v)) : p.j(v);
        }

        @Override  // com.google.common.hash.a
        protected void q(byte b) {
            this.b.update(((int)b));
        }

        @Override  // com.google.common.hash.a
        protected void t(byte[] arr_b, int v, int v1) {
            this.b.update(arr_b, v, v1);
        }
    }

    private final x a;
    private final int b;
    private final String c;
    private static final long d;

    i(x x0, int v, String s) {
        this.a = (x)H.E(x0);
        H.k(v == 0x20 || v == 0x40, "bits (%s) must be either 32 or 64", v);
        this.b = v;
        this.c = (String)H.E(s);
    }

    @Override  // com.google.common.hash.q
    public int h() {
        return this.b;
    }

    @Override  // com.google.common.hash.q
    public s i() {
        return new b(this, ((Checksum)this.a.get()), null);
    }

    @Override
    public String toString() {
        return this.c;
    }
}

