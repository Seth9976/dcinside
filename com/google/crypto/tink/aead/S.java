package com.google.crypto.tink.aead;

import O1.j;
import j..util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.h;

public final class s extends e {
    static class a {
    }

    public static final class b {
        @h
        private Integer a;
        @h
        private Integer b;
        @h
        private Integer c;
        private c d;

        private b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = c.d;
        }

        b(a s$a0) {
        }

        public s a() throws GeneralSecurityException {
            Integer integer0 = this.a;
            if(integer0 == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if(this.d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if(this.b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if(this.c == null) {
                throw new GeneralSecurityException("Tag size is not set");
            }
            return new s(((int)integer0), ((int)this.b), ((int)this.c), this.d, null);
        }

        @O1.a
        public b b(int v) throws GeneralSecurityException {
            if(v <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", v));
            }
            this.b = v;
            return this;
        }

        @O1.a
        public b c(int v) throws GeneralSecurityException {
            if(v != 16 && v != 24 && v != 0x20) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", v));
            }
            this.a = v;
            return this;
        }

        @O1.a
        public b d(int v) throws GeneralSecurityException {
            if(v != 12 && v != 13 && v != 14 && v != 15 && v != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", v));
            }
            this.c = v;
            return this;
        }

        @O1.a
        public b e(c s$c0) {
            this.d = s$c0;
            return this;
        }
    }

    @j
    public static final class c {
        private final String a;
        public static final c b;
        public static final c c;
        public static final c d;

        static {
            c.b = new c("TINK");
            c.c = new c("CRUNCHY");
            c.d = new c("NO_PREFIX");
        }

        private c(String s) {
            this.a = s;
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    private final int a;
    private final int b;
    private final int c;
    private final c d;

    private s(int v, int v1, int v2, c s$c0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = s$c0;
    }

    s(int v, int v1, int v2, c s$c0, a s$a0) {
        this(v, v1, v2, s$c0);
    }

    @Override  // com.google.crypto.tink.E
    public boolean a() {
        return this.d != c.d;
    }

    public static b b() {
        return new b(null);
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.c;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof s ? ((s)object0).d() == this.d() && ((s)object0).c() == this.c() && ((s)object0).e() == this.e() && ((s)object0).f() == this.f() : false;
    }

    public c f() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override
    public String toString() {
        return "AesGcm Parameters (variant: " + this.d + ", " + this.b + "-byte IV, " + this.c + "-byte tag, and " + this.a + "-byte key)";
    }
}

