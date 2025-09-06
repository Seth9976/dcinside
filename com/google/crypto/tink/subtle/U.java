package com.google.crypto.tink.subtle;

import com.google.crypto.tink.M;
import com.google.crypto.tink.config.internal.c.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class u implements M {
    public static final class a {
        private final byte[] a;
        private final byte[] b;

        private a(byte[] arr_b, byte[] arr_b1) {
            this.a = arr_b;
            this.b = arr_b1;
        }

        public byte[] a() {
            return Arrays.copyOf(this.b, this.b.length);
        }

        public byte[] b() {
            return Arrays.copyOf(this.a, this.a.length);
        }

        // 去混淆评级： 低(20)
        public static a c() throws GeneralSecurityException {
            return a.d(new byte[]{2, -38, 4, -87, 87, -92, 44, 8, -73, (byte)0x83, -87, 39, -20, -23, 35, 0, 56, 77, 16, -104, 5, -30, 103, -39, (byte)0x8C, -99, -15, (byte)0x81, 0x7D, (byte)0xE0, 110, -57});
        }

        public static a d(byte[] arr_b) throws GeneralSecurityException {
            if(arr_b.length != 0x20) {
                throw new IllegalArgumentException("Given secret seed length is not 32");
            }
            return new a(s.u(s.j(arr_b)), arr_b);
        }
    }

    private final byte[] a;
    private final byte[] b;
    public static final b c = null;
    public static final int d = 0x20;

    static {
        u.c = b.a;
    }

    public u(byte[] arr_b) throws GeneralSecurityException {
        if(!u.c.a()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if(arr_b.length != 0x20) {
            throw new IllegalArgumentException("Given private key\'s length is not 32");
        }
        byte[] arr_b1 = s.j(arr_b);
        this.a = arr_b1;
        this.b = s.u(arr_b1);
    }

    @Override  // com.google.crypto.tink.M
    public byte[] a(byte[] arr_b) throws GeneralSecurityException {
        return s.w(arr_b, this.b, this.a);
    }
}

