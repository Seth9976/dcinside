package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.c;
import java.io.Serializable;
import java.util.Arrays;

public final class a implements Serializable {
    public static enum com.fasterxml.jackson.core.a.a {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED;

    }

    private final transient int[] a;
    private final transient char[] b;
    private final transient byte[] c;
    final String d;
    private final char e;
    private final int f;
    private final boolean g;
    private final com.fasterxml.jackson.core.a.a h;
    private static final int i = 0x20;
    private static final long j = 1L;
    protected static final char k = '\u0000';
    public static final int l = -1;
    public static final int m = -2;

    private a(a a0, com.fasterxml.jackson.core.a.a a$a0) {
        this(a0, a0.d, a0.g, a0.e, a$a0, a0.f);
    }

    public a(a a0, String s, int v) {
        this(a0, s, a0.g, a0.e, v);
    }

    public a(a a0, String s, boolean z, char c, int v) {
        this(a0, s, z, c, a0.h, v);
    }

    private a(a a0, String s, boolean z, char c, com.fasterxml.jackson.core.a.a a$a0, int v) {
        int[] arr_v = new int[0x80];
        this.a = arr_v;
        char[] arr_c = new char[0x40];
        this.b = arr_c;
        byte[] arr_b = new byte[0x40];
        this.c = arr_b;
        this.d = s;
        System.arraycopy(a0.c, 0, arr_b, 0, a0.c.length);
        System.arraycopy(a0.b, 0, arr_c, 0, a0.b.length);
        System.arraycopy(a0.a, 0, arr_v, 0, a0.a.length);
        this.g = z;
        this.e = c;
        this.f = v;
        this.h = a$a0;
    }

    public a(String s, String s1, boolean z, char c, int v) {
        int[] arr_v = new int[0x80];
        this.a = arr_v;
        this.b = new char[0x40];
        this.c = new byte[0x40];
        this.d = s;
        this.g = z;
        this.e = c;
        this.f = v;
        int v1 = s1.length();
        if(v1 != 0x40) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + v1 + ")");
        }
        Arrays.fill(arr_v, -1);
        for(int v2 = 0; v2 < 0x40; ++v2) {
            int v3 = this.b[v2];
            this.c[v2] = (byte)v3;
            this.a[v3] = v2;
        }
        if(z) {
            this.a[c] = -2;
        }
        this.h = z ? com.fasterxml.jackson.core.a.a.b : com.fasterxml.jackson.core.a.a.a;
    }

    public com.fasterxml.jackson.core.a.a A() {
        return this.h;
    }

    protected Object B() {
        a a0 = b.b(this.d);
        return this.g != a0.g || this.e != a0.e || this.h != a0.h || this.f != a0.f || this.g != a0.g ? new a(a0, this.d, this.g, this.e, this.h, this.f) : a0;
    }

    public boolean C() {
        return this.h == com.fasterxml.jackson.core.a.a.b;
    }

    protected String D() {
        return String.format("Unexpected end of base64-encoded String: base64 variant \'%s\' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", this.getName());
    }

    public boolean E() {
        return this.g;
    }

    public boolean F(char c) {
        return c == this.e;
    }

    public boolean G(int v) {
        return v == this.e;
    }

    public a H() {
        return this.K(com.fasterxml.jackson.core.a.a.c);
    }

    public a I() {
        return this.K(com.fasterxml.jackson.core.a.a.a);
    }

    public a J() {
        return this.K(com.fasterxml.jackson.core.a.a.b);
    }

    public a K(com.fasterxml.jackson.core.a.a a$a0) {
        return a$a0 == this.h ? this : new a(this, a$a0);
    }

    public a L(boolean z) {
        return z == this.g ? this : new a(this, this.d, z, this.e, this.f);
    }

    protected void a() throws IllegalArgumentException {
        throw new IllegalArgumentException(this.z());
    }

    protected void b() throws IllegalArgumentException {
        throw new IllegalArgumentException(this.D());
    }

    protected void c(char c, int v, String s) throws IllegalArgumentException {
        String s1;
        if(c <= 0x20) {
            s1 = "Illegal white space character (code 0x" + Integer.toHexString(c) + ") as character #" + (v + 1) + " of 4-char base64 unit: can only used between units";
        }
        else if(this.F(c)) {
            s1 = "Unexpected padding character (\'" + this.y() + "\') as character #" + (v + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        }
        else {
            s1 = !Character.isDefined(c) || Character.isISOControl(c) ? "Illegal character (code 0x" + Integer.toHexString(c) + ") in base64 content" : "Illegal character \'" + c + "\' (code 0x" + Integer.toHexString(c) + ") in base64 content";
        }
        if(s != null) {
            s1 = s1 + ": " + s;
        }
        throw new IllegalArgumentException(s1);
    }

    public boolean d() {
        return this.h != com.fasterxml.jackson.core.a.a.a;
    }

    public void e(String s, c c0) throws IllegalArgumentException {
        int v = s.length();
        int v1 = 0;
        while(v1 < v) {
            int v2 = s.charAt(v1);
            if(v2 > 0x20) {
                int v3 = this.h(((char)v2));
                if(v3 < 0) {
                    this.c(((char)v2), 0, null);
                }
                if(v1 + 1 >= v) {
                    this.a();
                }
                int v4 = s.charAt(v1 + 1);
                int v5 = this.h(((char)v4));
                if(v5 < 0) {
                    this.c(((char)v4), 1, null);
                }
                int v6 = v3 << 6 | v5;
                if(v1 + 2 >= v) {
                    if(!this.C()) {
                        c0.b(v6 >> 4);
                        return;
                    }
                    this.a();
                }
                int v7 = v1 + 3;
                int v8 = s.charAt(v1 + 2);
                int v9 = this.h(((char)v8));
                if(v9 < 0) {
                    if(v9 != -2) {
                        this.c(((char)v8), 2, null);
                    }
                    if(!this.d()) {
                        this.b();
                    }
                    if(v7 >= v) {
                        this.a();
                    }
                    v1 += 4;
                    int v10 = s.charAt(v7);
                    if(!this.F(((char)v10))) {
                        this.c(((char)v10), 3, "expected padding character \'" + this.y() + "\'");
                    }
                    c0.b(v6 >> 4);
                }
                else {
                    int v11 = v6 << 6 | v9;
                    if(v7 >= v) {
                        if(!this.C()) {
                            c0.f(v11 >> 2);
                            return;
                        }
                        this.a();
                    }
                    v1 += 4;
                    int v12 = s.charAt(v7);
                    int v13 = this.h(((char)v12));
                    if(v13 < 0) {
                        if(v13 != -2) {
                            this.c(((char)v12), 3, null);
                        }
                        if(!this.d()) {
                            this.b();
                        }
                        c0.f(v11 >> 2);
                    }
                    else {
                        c0.e(v11 << 6 | v13);
                    }
                }
            }
            else {
                ++v1;
            }
        }
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object object0) {
        return object0 == this ? true : object0 != null && object0.getClass() == a.class && (((a)object0).e == this.e && ((a)object0).f == this.f && ((a)object0).g == this.g && ((a)object0).h == this.h && this.d.equals(((a)object0).d));
    }

    public byte[] f(String s) throws IllegalArgumentException {
        this.e(s, new c());
        return new byte[0];
    }

    public int g(byte b) {
        return b >= 0 ? this.a[b] : -1;
    }

    public String getName() {
        return this.d;
    }

    public int h(char c) {
        return c > 0x7F ? -1 : this.a[c];
    }

    @Override
    public int hashCode() {
        return this.d.hashCode();
    }

    public int i(int v) {
        return v > 0x7F ? -1 : this.a[v];
    }

    public String j(byte[] arr_b) {
        return this.k(arr_b, false);
    }

    public String k(byte[] arr_b, boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder((arr_b.length >> 2) + arr_b.length + (arr_b.length >> 3));
        if(z) {
            stringBuilder0.append('\"');
        }
        int v = this.w() >> 2;
        int v1 = arr_b.length - 3;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + 2;
            int v4 = (arr_b[v2 + 1] & 0xFF | arr_b[v2] << 8) << 8;
            v2 += 3;
            this.q(stringBuilder0, v4 | arr_b[v3] & 0xFF);
            if(v - 1 > 0) {
                --v;
            }
            else {
                stringBuilder0.append('\\');
                stringBuilder0.append('n');
                v = this.w() >> 2;
            }
        }
        int v5 = arr_b.length - v2;
        if(v5 > 0) {
            int v6 = arr_b[v2] << 16;
            if(v5 == 2) {
                v6 |= (arr_b[v2 + 1] & 0xFF) << 8;
            }
            this.u(stringBuilder0, v6, v5);
        }
        if(z) {
            stringBuilder0.append('\"');
        }
        return stringBuilder0.toString();
    }

    public String l(byte[] arr_b, boolean z, String s) {
        StringBuilder stringBuilder0 = new StringBuilder((arr_b.length >> 2) + arr_b.length + (arr_b.length >> 3));
        if(z) {
            stringBuilder0.append('\"');
        }
        int v = this.w() >> 2;
        int v1 = arr_b.length - 3;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + 2;
            int v4 = (arr_b[v2 + 1] & 0xFF | arr_b[v2] << 8) << 8;
            v2 += 3;
            this.q(stringBuilder0, v4 | arr_b[v3] & 0xFF);
            if(v - 1 > 0) {
                --v;
            }
            else {
                stringBuilder0.append(s);
                v = this.w() >> 2;
            }
        }
        int v5 = arr_b.length - v2;
        if(v5 > 0) {
            int v6 = arr_b[v2] << 16;
            if(v5 == 2) {
                v6 |= (arr_b[v2 + 1] & 0xFF) << 8;
            }
            this.u(stringBuilder0, v6, v5);
        }
        if(z) {
            stringBuilder0.append('\"');
        }
        return stringBuilder0.toString();
    }

    public byte m(int v) {
        return this.c[v];
    }

    public char n(int v) {
        return this.b[v];
    }

    public int o(int v, byte[] arr_b, int v1) {
        arr_b[v1] = this.c[v >> 18 & 0x3F];
        arr_b[v1 + 1] = this.c[v >> 12 & 0x3F];
        arr_b[v1 + 2] = this.c[v >> 6 & 0x3F];
        arr_b[v1 + 3] = this.c[v & 0x3F];
        return v1 + 4;
    }

    public int p(int v, char[] arr_c, int v1) {
        arr_c[v1] = this.b[v >> 18 & 0x3F];
        arr_c[v1 + 1] = this.b[v >> 12 & 0x3F];
        arr_c[v1 + 2] = this.b[v >> 6 & 0x3F];
        arr_c[v1 + 3] = this.b[v & 0x3F];
        return v1 + 4;
    }

    public void q(StringBuilder stringBuilder0, int v) {
        stringBuilder0.append(this.b[v >> 18 & 0x3F]);
        stringBuilder0.append(this.b[v >> 12 & 0x3F]);
        stringBuilder0.append(this.b[v >> 6 & 0x3F]);
        stringBuilder0.append(this.b[v & 0x3F]);
    }

    public int r(int v, int v1, byte[] arr_b, int v2) {
        arr_b[v2] = this.c[v >> 18 & 0x3F];
        arr_b[v2 + 1] = this.c[v >> 12 & 0x3F];
        if(this.E()) {
            arr_b[v2 + 2] = v1 == 2 ? this.c[v >> 6 & 0x3F] : ((byte)this.e);
            arr_b[v2 + 3] = (byte)this.e;
            return v2 + 4;
        }
        if(v1 == 2) {
            arr_b[v2 + 2] = this.c[v >> 6 & 0x3F];
            return v2 + 3;
        }
        return v2 + 2;
    }

    public int s(int v, int v1, char[] arr_c, int v2) {
        arr_c[v2] = this.b[v >> 18 & 0x3F];
        arr_c[v2 + 1] = this.b[v >> 12 & 0x3F];
        if(this.E()) {
            arr_c[v2 + 2] = v1 == 2 ? this.b[v >> 6 & 0x3F] : this.e;
            arr_c[v2 + 3] = this.e;
            return v2 + 4;
        }
        if(v1 == 2) {
            arr_c[v2 + 2] = this.b[v >> 6 & 0x3F];
            return v2 + 3;
        }
        return v2 + 2;
    }

    @Override
    public String toString() {
        return this.d;
    }

    public void u(StringBuilder stringBuilder0, int v, int v1) {
        stringBuilder0.append(this.b[v >> 18 & 0x3F]);
        stringBuilder0.append(this.b[v >> 12 & 0x3F]);
        if(this.E()) {
            stringBuilder0.append((v1 == 2 ? this.b[v >> 6 & 0x3F] : this.e));
            stringBuilder0.append(this.e);
            return;
        }
        if(v1 == 2) {
            stringBuilder0.append(this.b[v >> 6 & 0x3F]);
        }
    }

    public int w() {
        return this.f;
    }

    public byte x() {
        return (byte)this.e;
    }

    public char y() {
        return this.e;
    }

    public String z() {
        return String.format("Unexpected end of base64-encoded String: base64 variant \'%s\' expects padding (one or more \'%c\' characters) at the end. This Base64Variant might have been incorrectly configured", this.getName(), Character.valueOf(this.y()));
    }
}

