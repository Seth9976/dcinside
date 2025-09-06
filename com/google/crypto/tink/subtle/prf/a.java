package com.google.crypto.tink.subtle.prf;

import O1.j;
import com.google.crypto.tink.subtle.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

@j
public class a implements c {
    static class com.google.crypto.tink.subtle.prf.a.a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.google.crypto.tink.subtle.A.a.values().length];
            com.google.crypto.tink.subtle.prf.a.a.a = arr_v;
            try {
                arr_v[com.google.crypto.tink.subtle.A.a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.subtle.prf.a.a.a[com.google.crypto.tink.subtle.A.a.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.subtle.prf.a.a.a[com.google.crypto.tink.subtle.A.a.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.subtle.prf.a.a.a[com.google.crypto.tink.subtle.A.a.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    class b extends InputStream {
        private final byte[] a;
        private Mac b;
        private byte[] c;
        private ByteBuffer d;
        private int e;
        final a f;

        public b(byte[] arr_b) {
            this.e = -1;
            this.a = Arrays.copyOf(arr_b, arr_b.length);
        }

        private void a() throws GeneralSecurityException, IOException {
            try {
                String s = a.f(a.this.a);
                this.b = (Mac)y.c.a(s);
            }
            catch(GeneralSecurityException generalSecurityException0) {
                throw new IOException("Creating HMac failed", generalSecurityException0);
            }
            if(a.this.c == null || a.this.c.length == 0) {
                this.b.init(new SecretKeySpec(new byte[this.b.getMacLength()], a.f(a.this.a)));
            }
            else {
                this.b.init(new SecretKeySpec(a.this.c, a.f(a.this.a)));
            }
            this.b.update(a.this.b);
            this.c = this.b.doFinal();
            ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
            this.d = byteBuffer0;
            byteBuffer0.mark();
            this.e = 0;
        }

        private void b() throws GeneralSecurityException, IOException {
            this.b.init(new SecretKeySpec(this.c, a.f(a.this.a)));
            this.d.reset();
            this.b.update(this.d);
            this.b.update(this.a);
            int v = this.e + 1;
            this.e = v;
            this.b.update(((byte)v));
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.b.doFinal());
            this.d = byteBuffer0;
            byteBuffer0.mark();
        }

        @Override
        public int read() throws IOException {
            byte[] arr_b = new byte[1];
            int v = this.read(arr_b, 0, 1);
            if(v == 1) {
                return arr_b[0] & 0xFF;
            }
            if(v != -1) {
                throw new IOException("Reading failed");
            }
            return -1;
        }

        @Override
        public int read(byte[] arr_b) throws IOException {
            return this.read(arr_b, 0, arr_b.length);
        }

        @Override
        public int read(byte[] arr_b, int v, int v1) throws IOException {
            try {
                if(this.e == -1) {
                    this.a();
                }
                int v2;
                for(v2 = 0; v2 < v1; v2 += v3) {
                    if(!this.d.hasRemaining()) {
                        if(this.e == 0xFF) {
                            return v2;
                        }
                        this.b();
                    }
                    int v3 = Math.min(v1 - v2, this.d.remaining());
                    this.d.get(arr_b, v, v3);
                    v += v3;
                }
                return v2;
            }
            catch(GeneralSecurityException generalSecurityException0) {
            }
            this.b = null;
            throw new IOException("HkdfInputStream failed", generalSecurityException0);
        }
    }

    private final com.google.crypto.tink.subtle.A.a a;
    private final byte[] b;
    private final byte[] c;

    public a(com.google.crypto.tink.subtle.A.a a$a0, byte[] arr_b, byte[] arr_b1) {
        this.a = a$a0;
        this.b = Arrays.copyOf(arr_b, arr_b.length);
        this.c = Arrays.copyOf(arr_b1, arr_b1.length);
    }

    @Override  // com.google.crypto.tink.subtle.prf.c
    public InputStream a(byte[] arr_b) {
        return new b(this, arr_b);
    }

    private static String f(com.google.crypto.tink.subtle.A.a a$a0) throws GeneralSecurityException {
        switch(a$a0) {
            case 1: {
                return "HmacSha1";
            }
            case 2: {
                return "HmacSha256";
            }
            case 3: {
                return "HmacSha384";
            }
            case 4: {
                return "HmacSha512";
            }
            default: {
                throw new GeneralSecurityException("No getJavaxHmacName for given hash " + a$a0 + " known");
            }
        }
    }
}

