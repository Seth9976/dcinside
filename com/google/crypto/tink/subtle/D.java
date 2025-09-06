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
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class d extends G {
    class a implements T {
        private SecretKeySpec a;
        private Cipher b;
        private byte[] c;
        final d d;

        @Override  // com.google.crypto.tink.subtle.T
        public void a(ByteBuffer byteBuffer0, byte[] arr_b) throws GeneralSecurityException {
            synchronized(this) {
                if(byteBuffer0.remaining() == d.this.i()) {
                    if(byteBuffer0.get() != d.this.i()) {
                        throw new GeneralSecurityException("Invalid ciphertext");
                    }
                    this.c = new byte[7];
                    byte[] arr_b1 = new byte[d.this.a];
                    byteBuffer0.get(arr_b1);
                    byteBuffer0.get(this.c);
                    this.a = d.this.t(arr_b1, arr_b);
                    this.b = d.s();
                    return;
                }
            }
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }

        @Override  // com.google.crypto.tink.subtle.T
        public void b(ByteBuffer byteBuffer0, int v, boolean z, ByteBuffer byteBuffer1) throws GeneralSecurityException {
            synchronized(this) {
                GCMParameterSpec gCMParameterSpec0 = d.y(this.c, ((long)v), z);
                this.b.init(2, this.a, gCMParameterSpec0);
                this.b.doFinal(byteBuffer0, byteBuffer1);
            }
        }
    }

    class b implements U {
        private final SecretKeySpec a;
        private final Cipher b;
        private final byte[] c;
        private final ByteBuffer d;
        private long e;
        final d f;

        public b(byte[] arr_b) throws GeneralSecurityException {
            this.e = 0L;
            this.b = d.s();
            this.e = 0L;
            byte[] arr_b1 = d0.A();
            byte[] arr_b2 = {-19, 38, 0x74, -59, 20, 83, 14};
            this.c = arr_b2;
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(d0.i());
            this.d = byteBuffer0;
            byteBuffer0.put(((byte)d0.i()));
            byteBuffer0.put(arr_b1);
            byteBuffer0.put(arr_b2);
            byteBuffer0.flip();
            this.a = d0.t(arr_b1, arr_b);
        }

        @Override  // com.google.crypto.tink.subtle.U
        public void a(ByteBuffer byteBuffer0, boolean z, ByteBuffer byteBuffer1) throws GeneralSecurityException {
            synchronized(this) {
                GCMParameterSpec gCMParameterSpec0 = d.y(this.c, this.e, z);
                this.b.init(1, this.a, gCMParameterSpec0);
                ++this.e;
                this.b.doFinal(byteBuffer0, byteBuffer1);
            }
        }

        @Override  // com.google.crypto.tink.subtle.U
        public void b(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1, boolean z, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            synchronized(this) {
                GCMParameterSpec gCMParameterSpec0 = d.y(this.c, this.e, z);
                this.b.init(1, this.a, gCMParameterSpec0);
                ++this.e;
                if(byteBuffer1.hasRemaining()) {
                    this.b.update(byteBuffer0, byteBuffer2);
                    this.b.doFinal(byteBuffer1, byteBuffer2);
                }
                else {
                    this.b.doFinal(byteBuffer0, byteBuffer2);
                }
            }
        }

        @Override  // com.google.crypto.tink.subtle.U
        public ByteBuffer j0() {
            return this.d.asReadOnlyBuffer();
        }
    }

    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final String e;
    private final byte[] f;
    private static final int g = 12;
    private static final int h = 7;
    private static final int i = 16;

    public d(byte[] arr_b, String s, int v, int v1, int v2) throws InvalidAlgorithmParameterException {
        if(arr_b.length < 16 || arr_b.length < v) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, v));
        }
        b0.a(v);
        if(v1 <= this.i() + v2 + 16) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.f = Arrays.copyOf(arr_b, arr_b.length);
        this.e = s;
        this.a = v;
        this.b = v1;
        this.d = v2;
        this.c = v1 - 16;
    }

    private byte[] A() {
        return L.c(this.a);
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
        return this.i() + this.d;
    }

    @Override  // com.google.crypto.tink.subtle.G
    public int g() {
        return 16;
    }

    @Override  // com.google.crypto.tink.subtle.G
    public int h() {
        return this.b;
    }

    @Override  // com.google.crypto.tink.subtle.G
    public int i() {
        return this.a + 8;
    }

    @Override  // com.google.crypto.tink.subtle.G
    public int j() {
        return this.c;
    }

    @Override  // com.google.crypto.tink.subtle.G
    public T k() throws GeneralSecurityException {
        return this.w();
    }

    @Override  // com.google.crypto.tink.subtle.G
    public U l(byte[] arr_b) throws GeneralSecurityException {
        return this.x(arr_b);
    }

    // 去混淆评级： 低(20)
    static byte[] o() [...] // 潜在的解密器

    private static Cipher s() throws GeneralSecurityException {
        return (Cipher)y.b.a("AES/GCM/NoPadding");
    }

    private SecretKeySpec t(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        return new SecretKeySpec(D.b(this.e, this.f, arr_b, arr_b1, this.a), "AES");
    }

    public long u(long v) {
        long v1 = v + ((long)this.f());
        long v2 = v1 / ((long)this.c) * ((long)this.b);
        long v3 = v1 % ((long)this.c);
        return v3 <= 0L ? v2 : v2 + (v3 + 16L);
    }

    public int v() {
        return this.d;
    }

    public a w() throws GeneralSecurityException {
        return new a(this);
    }

    public b x(byte[] arr_b) throws GeneralSecurityException {
        return new b(this, arr_b);
    }

    private static GCMParameterSpec y(byte[] arr_b, long v, boolean z) throws GeneralSecurityException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(12);
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        byteBuffer0.put(arr_b);
        a0.f(byteBuffer0, v);
        byteBuffer0.put(((byte)z));
        return new GCMParameterSpec(0x80, byteBuffer0.array());
    }

    // 去混淆评级： 低(20)
    private static byte[] z() [...] // 潜在的解密器
}

