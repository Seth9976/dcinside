package com.google.crypto.tink.subtle;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a extends G {
    class com.google.crypto.tink.subtle.a.a implements T {
        private SecretKeySpec a;
        private SecretKeySpec b;
        private Cipher c;
        private Mac d;
        private byte[] e;
        final a f;
        static final boolean g;

        static {
        }

        @Override  // com.google.crypto.tink.subtle.T
        public void a(ByteBuffer byteBuffer0, byte[] arr_b) throws GeneralSecurityException {
            synchronized(this) {
                if(byteBuffer0.remaining() == a.this.i()) {
                    if(byteBuffer0.get() != a.this.i()) {
                        throw new GeneralSecurityException("Invalid ciphertext");
                    }
                    this.e = new byte[7];
                    byte[] arr_b1 = new byte[a.this.a];
                    byteBuffer0.get(arr_b1);
                    byteBuffer0.get(this.e);
                    byte[] arr_b2 = a.this.y(arr_b1, arr_b);
                    this.a = a.this.z(arr_b2);
                    this.b = a.this.x(arr_b2);
                    this.c = a.w();
                    this.d = a.this.C();
                    return;
                }
            }
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }

        @Override  // com.google.crypto.tink.subtle.T
        public void b(ByteBuffer byteBuffer0, int v, boolean z, ByteBuffer byteBuffer1) throws GeneralSecurityException {
            synchronized(this) {
                int v2 = byteBuffer0.position();
                byte[] arr_b = a.this.F(this.e, ((long)v), z);
                int v3 = byteBuffer0.remaining();
                if(v3 >= a.this.c) {
                    int v4 = v2 + (v3 - a.this.c);
                    ByteBuffer byteBuffer2 = byteBuffer0.duplicate();
                    byteBuffer2.limit(v4);
                    ByteBuffer byteBuffer3 = byteBuffer0.duplicate();
                    byteBuffer3.position(v4);
                    this.d.init(this.b);
                    this.d.update(arr_b);
                    this.d.update(byteBuffer2);
                    byte[] arr_b1 = Arrays.copyOf(this.d.doFinal(), a.this.c);
                    byte[] arr_b2 = new byte[a.this.c];
                    byteBuffer3.get(arr_b2);
                    if(!h.e(arr_b2, arr_b1)) {
                        throw new GeneralSecurityException("Tag mismatch");
                    }
                    byteBuffer0.limit(v4);
                    this.c.init(1, this.a, new IvParameterSpec(arr_b));
                    this.c.doFinal(byteBuffer0, byteBuffer1);
                    return;
                }
            }
            throw new GeneralSecurityException("Ciphertext too short");
        }
    }

    class b implements U {
        private final SecretKeySpec a;
        private final SecretKeySpec b;
        private final Cipher c;
        private final Mac d;
        private final byte[] e;
        private ByteBuffer f;
        private long g;
        final a h;

        public b(byte[] arr_b) throws GeneralSecurityException {
            this.g = 0L;
            this.c = a.w();
            this.d = a0.C();
            this.g = 0L;
            byte[] arr_b1 = a0.H();
            byte[] arr_b2 = a.p(a0);
            this.e = arr_b2;
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(a0.i());
            this.f = byteBuffer0;
            byteBuffer0.put(((byte)a0.i()));
            this.f.put(arr_b1);
            this.f.put(arr_b2);
            this.f.flip();
            byte[] arr_b3 = a0.y(arr_b1, arr_b);
            this.a = a0.z(arr_b3);
            this.b = a0.x(arr_b3);
        }

        @Override  // com.google.crypto.tink.subtle.U
        public void a(ByteBuffer byteBuffer0, boolean z, ByteBuffer byteBuffer1) throws GeneralSecurityException {
            synchronized(this) {
                byte[] arr_b = a.this.F(this.e, this.g, z);
                IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b);
                this.c.init(1, this.a, ivParameterSpec0);
                ++this.g;
                this.c.doFinal(byteBuffer0, byteBuffer1);
                ByteBuffer byteBuffer2 = byteBuffer1.duplicate();
                byteBuffer2.flip();
                byteBuffer2.position(byteBuffer1.position());
                this.d.init(this.b);
                this.d.update(arr_b);
                this.d.update(byteBuffer2);
                byteBuffer1.put(this.d.doFinal(), 0, a.this.c);
            }
        }

        @Override  // com.google.crypto.tink.subtle.U
        public void b(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1, boolean z, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            synchronized(this) {
                byte[] arr_b = a.this.F(this.e, this.g, z);
                IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b);
                this.c.init(1, this.a, ivParameterSpec0);
                ++this.g;
                this.c.update(byteBuffer0, byteBuffer2);
                this.c.doFinal(byteBuffer1, byteBuffer2);
                ByteBuffer byteBuffer3 = byteBuffer2.duplicate();
                byteBuffer3.flip();
                byteBuffer3.position(byteBuffer2.position());
                this.d.init(this.b);
                this.d.update(arr_b);
                this.d.update(byteBuffer3);
                byteBuffer2.put(this.d.doFinal(), 0, a.this.c);
            }
        }

        @Override  // com.google.crypto.tink.subtle.U
        public ByteBuffer j0() {
            return this.f.asReadOnlyBuffer();
        }
    }

    private final int a;
    private final String b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final String g;
    private final byte[] h;
    public static final com.google.crypto.tink.config.internal.c.b i = null;
    private static final int j = 16;
    private static final int k = 7;
    private static final int l = 0x20;

    static {
        a.i = com.google.crypto.tink.config.internal.c.b.a;
    }

    public a(byte[] arr_b, String s, int v, String s1, int v1, int v2, int v3) throws GeneralSecurityException {
        if(!a.i.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        a.I(arr_b.length, v, s1, v1, v2, v3);
        this.h = Arrays.copyOf(arr_b, arr_b.length);
        this.g = s;
        this.a = v;
        this.b = s1;
        this.c = v1;
        this.d = v2;
        this.f = v3;
        this.e = v2 - v1;
    }

    public long A(long v) {
        long v1 = v + ((long)this.f());
        long v2 = v1 / ((long)this.e) * ((long)this.d);
        long v3 = v1 % ((long)this.e);
        return v3 <= 0L ? v2 : v2 + (v3 + ((long)this.c));
    }

    public int B() {
        return this.f;
    }

    private Mac C() throws GeneralSecurityException {
        return (Mac)y.c.a(this.b);
    }

    public com.google.crypto.tink.subtle.a.a D() throws GeneralSecurityException {
        return new com.google.crypto.tink.subtle.a.a(this);
    }

    public b E(byte[] arr_b) throws GeneralSecurityException {
        return new b(this, arr_b);
    }

    private byte[] F(byte[] arr_b, long v, boolean z) throws GeneralSecurityException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(16);
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        byteBuffer0.put(arr_b);
        a0.f(byteBuffer0, v);
        byteBuffer0.put(((byte)z));
        byteBuffer0.putInt(0);
        return byteBuffer0.array();
    }

    // 去混淆评级： 低(20)
    private byte[] G() [...] // 潜在的解密器

    private byte[] H() {
        return L.c(this.a);
    }

    private static void I(int v, int v1, String s, int v2, int v3, int v4) throws InvalidAlgorithmParameterException {
        if(v < 16 || v < v1) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, v1));
        }
        b0.a(v1);
        if(v2 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small " + v2);
        }
        if(s.equals("HmacSha1") && v2 > 20 || s.equals("HmacSha256") && v2 > 0x20 || s.equals("HmacSha512") && v2 > 0x40) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        if(v3 - v4 - v2 - v1 - 8 <= 0) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
    }

    @Override  // com.google.crypto.tink.subtle.G
    public SeekableByteChannel a(SeekableByteChannel seekableByteChannel0, byte[] arr_b) throws GeneralSecurityException, IOException {
        return super.a(seekableByteChannel0, arr_b);
    }

    @Override  // com.google.crypto.tink.subtle.G
    public OutputStream b(OutputStream outputStream0, byte[] arr_b) throws GeneralSecurityException, IOException {
        return super.b(outputStream0, arr_b);
    }

    @Override  // com.google.crypto.tink.subtle.G
    public ReadableByteChannel c(ReadableByteChannel readableByteChannel0, byte[] arr_b) throws GeneralSecurityException, IOException {
        return super.c(readableByteChannel0, arr_b);
    }

    @Override  // com.google.crypto.tink.subtle.G
    public WritableByteChannel d(WritableByteChannel writableByteChannel0, byte[] arr_b) throws GeneralSecurityException, IOException {
        return super.d(writableByteChannel0, arr_b);
    }

    @Override  // com.google.crypto.tink.subtle.G
    public InputStream e(InputStream inputStream0, byte[] arr_b) throws GeneralSecurityException, IOException {
        return super.e(inputStream0, arr_b);
    }

    @Override  // com.google.crypto.tink.subtle.G
    public int f() {
        return this.i() + this.f;
    }

    @Override  // com.google.crypto.tink.subtle.G
    public int g() {
        return this.c;
    }

    @Override  // com.google.crypto.tink.subtle.G
    public int h() {
        return this.d;
    }

    @Override  // com.google.crypto.tink.subtle.G
    public int i() {
        return this.a + 8;
    }

    @Override  // com.google.crypto.tink.subtle.G
    public int j() {
        return this.e;
    }

    @Override  // com.google.crypto.tink.subtle.G
    public T k() throws GeneralSecurityException {
        return this.D();
    }

    @Override  // com.google.crypto.tink.subtle.G
    public U l(byte[] arr_b) throws GeneralSecurityException {
        return this.E(arr_b);
    }

    // 去混淆评级： 低(20)
    static byte[] p(a a0) {
        return new byte[]{(byte)0x84, -8, 104, 82, -30, 11, 26};
    }

    private static Cipher w() throws GeneralSecurityException {
        return (Cipher)y.b.a("AES/CTR/NoPadding");
    }

    private SecretKeySpec x(byte[] arr_b) throws GeneralSecurityException {
        return new SecretKeySpec(arr_b, this.a, 0x20, this.b);
    }

    private byte[] y(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        return D.b(this.g, this.h, arr_b, arr_b1, this.a + 0x20);
    }

    private SecretKeySpec z(byte[] arr_b) throws GeneralSecurityException {
        return new SecretKeySpec(arr_b, 0, this.a, "AES");
    }
}

