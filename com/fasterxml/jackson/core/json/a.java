package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.format.c;
import com.fasterxml.jackson.core.format.d;
import com.fasterxml.jackson.core.io.g;
import com.fasterxml.jackson.core.io.k;
import com.fasterxml.jackson.core.io.r;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.sym.b;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.util.z;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public final class a {
    private final g a;
    private final InputStream b;
    private final byte[] c;
    private int d;
    private int e;
    private final boolean f;
    private boolean g;
    private int h;
    public static final byte i = -17;
    public static final byte j = -69;
    public static final byte k = -65;
    private static final int l = 0x2000;

    public a(g g0, InputStream inputStream0) {
        this.g = true;
        this.a = g0;
        this.b = inputStream0;
        this.c = g0.k();
        this.d = 0;
        this.e = 0;
        this.f = true;
    }

    public a(g g0, byte[] arr_b, int v, int v1) {
        this.g = true;
        this.a = g0;
        this.b = null;
        this.c = arr_b;
        this.d = v;
        this.e = v + v1;
        this.f = false;
    }

    private boolean a(int v) {
        if((0xFF00 & v) == 0) {
            this.g = true;
        }
        else if((v & 0xFF) == 0) {
            this.g = false;
        }
        else {
            return false;
        }
        this.h = 2;
        return true;
    }

    private boolean b(int v) throws IOException {
        if(v >> 8 == 0) {
            this.g = true;
        }
        else {
            if((0xFFFFFF & v) == 0) {
                this.g = false;
                this.h = 4;
                return true;
            }
            if((0xFF00FFFF & v) == 0) {
                this.i("3412");
            }
            else if((v & 0xFFFF00FF) == 0) {
                this.i("2143");
            }
            else {
                return false;
            }
        }
        this.h = 4;
        return true;
    }

    public n c(int v, u u0, com.fasterxml.jackson.core.sym.a a0, b b0, int v1) throws IOException {
        int v2 = this.d;
        com.fasterxml.jackson.core.g g0 = com.fasterxml.jackson.core.h.a.f.b(v1) ? this.e() : com.fasterxml.jackson.core.g.d;
        int v3 = this.d - v2;
        if(g0 == com.fasterxml.jackson.core.g.d && com.fasterxml.jackson.core.h.a.c.b(v1)) {
            com.fasterxml.jackson.core.sym.a a1 = a0.G(v1);
            return new l(this.a, v, this.b, u0, a1, this.c, this.d, this.e, v3, this.f);
        }
        Reader reader0 = this.d();
        b b1 = b0.r();
        return new i(this.a, v, reader0, u0, b1);
    }

    public Reader d() throws IOException {
        com.fasterxml.jackson.core.g g0 = this.a.L();
        switch(g0.a()) {
            case 8: 
            case 16: {
                InputStream inputStream0 = this.b;
                if(inputStream0 == null) {
                    int v = this.e - this.d;
                    return v <= 0x2000 ? new StringReader(new String(this.c, this.d, v, g0.b())) : new InputStreamReader(new ByteArrayInputStream(this.c, this.d, this.e), g0.b());
                }
                if(this.d < this.e) {
                    inputStream0 = new k(this.a, inputStream0, this.c, this.d, this.e);
                }
                return new InputStreamReader(inputStream0, g0.b());
            }
            case 0x20: {
                int v1 = this.d;
                int v2 = this.e;
                boolean z = this.a.L().c();
                return new r(this.a, this.b, this.c, v1, v2, z);
            }
            default: {
                return (Reader)z.g();
            }
        }
    }

    public com.fasterxml.jackson.core.g e() throws IOException {
        com.fasterxml.jackson.core.g g0;
        if(this.f(4)) {
            int v = this.c[this.d + 3] & 0xFF | (this.c[this.d] << 24 | (this.c[this.d + 1] & 0xFF) << 16 | (this.c[this.d + 2] & 0xFF) << 8);
            if(!this.g(v) && !this.b(v) && !this.a(v >>> 16)) {
                g0 = com.fasterxml.jackson.core.g.d;
            }
            else {
                goto label_6;
            }
        }
        else if(!this.f(2) || !this.a(this.c[this.d + 1] & 0xFF | (this.c[this.d] & 0xFF) << 8)) {
            g0 = com.fasterxml.jackson.core.g.d;
        }
        else {
        label_6:
            switch(this.h) {
                case 1: {
                    g0 = com.fasterxml.jackson.core.g.d;
                    break;
                }
                case 2: {
                    g0 = this.g ? com.fasterxml.jackson.core.g.e : com.fasterxml.jackson.core.g.f;
                    break;
                }
                case 4: {
                    g0 = this.g ? com.fasterxml.jackson.core.g.g : com.fasterxml.jackson.core.g.h;
                    break;
                }
                default: {
                    return (com.fasterxml.jackson.core.g)z.g();
                }
            }
        }
        this.a.l0(g0);
        return g0;
    }

    protected boolean f(int v) throws IOException {
        for(int v1 = this.e - this.d; v1 < v; v1 += v2) {
            int v2 = this.b == null ? -1 : this.b.read(this.c, this.e, this.c.length - this.e);
            if(v2 < 1) {
                return false;
            }
            this.e += v2;
        }
        return true;
    }

    private boolean g(int v) throws IOException {
        if(v == 0xFEFF0000) {
            this.i("3412");
        }
        else {
            switch(v) {
                case 0xFFFE0000: {
                    this.d += 4;
                    this.h = 4;
                    this.g = false;
                    return true;
                }
                case 0xFEFF: {
                    this.g = true;
                    this.d += 4;
                    this.h = 4;
                    return true;
                }
                case 0xFFFE: {
                    this.i("2143");
                }
            }
        }
        switch(v >>> 16) {
            case 0xFEFF: {
                this.d += 2;
                this.h = 2;
                this.g = true;
                return true;
            }
            case 0xFFFE: {
                this.d += 2;
                this.h = 2;
                this.g = false;
                return true;
            }
            default: {
                if(v >>> 8 == 0xEFBBBF) {
                    this.d += 3;
                    this.h = 1;
                    this.g = true;
                    return true;
                }
                return false;
            }
        }
    }

    public static d h(c c0) throws IOException {
        if(!c0.a()) {
            return d.b;
        }
        int v = c0.nextByte();
        if(v == -17) {
            if(!c0.a()) {
                return d.b;
            }
            if(c0.nextByte() != -69) {
                return d.a;
            }
            if(!c0.a()) {
                return d.b;
            }
            if(c0.nextByte() != -65) {
                return d.a;
            }
            if(!c0.a()) {
                return d.b;
            }
            v = c0.nextByte();
        }
        int v1 = a.k(c0, ((byte)v));
        if(v1 < 0) {
            return d.b;
        }
        switch(v1) {
            case 91: {
                return a.j(c0) >= 0 ? d.d : d.b;
            }
            case 0x7B: {
                int v3 = a.j(c0);
                if(v3 < 0) {
                    return d.b;
                }
                return v3 == 34 || v3 == 0x7D ? d.d : d.a;
            }
            default: {
                d d0 = d.c;
                if(v1 == 34) {
                    return d0;
                }
                if(v1 <= 57 && v1 >= 0x30) {
                    return d0;
                }
                switch(v1) {
                    case 45: {
                        int v2 = a.j(c0);
                        if(v2 < 0) {
                            return d.b;
                        }
                        return v2 <= 57 && v2 >= 0x30 ? d0 : d.a;
                    }
                    case 102: {
                        return a.m(c0, "alse", d0);
                    }
                    case 110: {
                        return a.m(c0, "ull", d0);
                    }
                    case 0x74: {
                        return a.m(c0, "rue", d0);
                    }
                    default: {
                        return d.a;
                    }
                }
            }
        }
    }

    private void i(String s) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + s + ") detected");
    }

    private static int j(c c0) throws IOException {
        return c0.a() ? a.k(c0, c0.nextByte()) : -1;
    }

    private static int k(c c0, byte b) throws IOException {
        while(true) {
            if((b & 0xFF) != 9 && (b & 0xFF) != 10 && (b & 0xFF) != 13 && (b & 0xFF) != 0x20) {
                return b & 0xFF;
            }
            if(!c0.a()) {
                return -1;
            }
            b = c0.nextByte();
        }
    }

    public static int l(DataInput dataInput0) throws IOException {
        int v = dataInput0.readUnsignedByte();
        if(v != 0xEF) {
            return v;
        }
        int v1 = dataInput0.readUnsignedByte();
        if(v1 != 0xBB) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(v1) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
        }
        int v2 = dataInput0.readUnsignedByte();
        if(v2 != 0xBF) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(v2) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
        }
        return dataInput0.readUnsignedByte();
    }

    private static d m(c c0, String s, d d0) throws IOException {
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!c0.a()) {
                return d.b;
            }
            if(c0.nextByte() != s.charAt(v1)) {
                return d.a;
            }
        }
        return d0;
    }
}

