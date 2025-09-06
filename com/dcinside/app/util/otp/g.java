package com.dcinside.app.util.otp;

import j..util.Objects;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;

public class g {
    interface a {
        byte[] a(byte[] arg1) throws GeneralSecurityException;
    }

    private final a a;
    private final int b;
    private static final int c = 9;
    private static final int d = 6;
    private static final int e = 1;
    private static final int[] f;

    static {
        g.f = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    }

    public g(a g$a0) {
        this(g$a0, 6);
    }

    public g(a g$a0, int v) {
        if(v < 0 || v > 9) {
            throw new IllegalArgumentException("PassCodeLength must be between 1 and 9 digits.");
        }
        this.a = g$a0;
        this.b = v;
    }

    public g(Mac mac0) {
        this(mac0, 6);
    }

    public g(Mac mac0, int v) {
        Objects.requireNonNull(mac0);
        this(new com.dcinside.app.util.otp.a(mac0), v);
    }

    public String a(long v) throws GeneralSecurityException {
        return this.c(ByteBuffer.allocate(8).putLong(v).array());
    }

    public String b(long v, byte[] arr_b) throws GeneralSecurityException {
        return arr_b == null ? this.a(v) : this.c(ByteBuffer.allocate(arr_b.length + 8).putLong(v).put(arr_b, 0, arr_b.length).array());
    }

    public String c(byte[] arr_b) throws GeneralSecurityException {
        byte[] arr_b1 = this.a.a(arr_b);
        return this.e((this.d(arr_b1, arr_b1[arr_b1.length - 1] & 15) & 0x7FFFFFFF) % g.f[this.b]);
    }

    private int d(byte[] arr_b, int v) {
        DataInputStream dataInputStream0 = new DataInputStream(new ByteArrayInputStream(arr_b, v, arr_b.length - v));
        try {
            return dataInputStream0.readInt();
        }
        catch(IOException iOException0) {
            throw new IllegalStateException(iOException0);
        }
    }

    private String e(int v) {
        String s = Integer.toString(v);
        for(int v1 = s.length(); v1 < this.b; ++v1) {
            s = "0" + s;
        }
        return s;
    }

    public boolean f(long v, String s) throws GeneralSecurityException {
        return this.b(v, null).equals(s);
    }

    public boolean g(long v, String s) throws GeneralSecurityException {
        return this.h(s, v, 1, 1);
    }

    public boolean h(String s, long v, int v1, int v2) throws GeneralSecurityException {
        int v3 = Math.max(v2, 0);
        for(int v4 = -Math.max(v1, 0); v4 <= v3; ++v4) {
            if(this.b(v - ((long)v4), null).equals(s)) {
                return true;
            }
        }
        return false;
    }
}

