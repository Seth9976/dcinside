package com.bytedance.sdk.component.Zh.PjT.Zh;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class PjT implements ReZ, Zh, Cloneable, ByteChannel {
    JQp PjT;
    private static final byte[] ReZ;
    long Zh;

    static {
        PjT.ReZ = new byte[]{0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    }

    public final cr JQp() {
        long v = this.Zh;
        if(v > 0x7FFFFFFFL) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.Zh);
        }
        return this.cr(((int)v));
    }

    public int PjT(byte[] arr_b, int v, int v1) {
        SM.PjT(arr_b.length, v, v1);
        JQp jQp0 = this.PjT;
        if(jQp0 == null) {
            return -1;
        }
        int v2 = Math.min(v1, jQp0.ReZ - jQp0.Zh);
        System.arraycopy(jQp0.PjT, jQp0.Zh, arr_b, v, v2);
        int v3 = jQp0.Zh + v2;
        jQp0.Zh = v3;
        this.Zh -= (long)v2;
        if(v3 == jQp0.ReZ) {
            this.PjT = jQp0.Zh();
            cz.PjT(jQp0);
        }
        return v2;
    }

    public PjT PjT(int v) {
        if(v < 0x80) {
            this.Zh(v);
            return this;
        }
        if(v < 0x800) {
            this.Zh(v >> 6 | 0xC0);
            this.Zh(v & 0x3F | 0x80);
            return this;
        }
        if(v < 0x10000) {
            if(v >= 0xD800 && v <= 0xDFFF) {
                this.Zh(0x3F);
                return this;
            }
            this.Zh(v >> 12 | 0xE0);
            this.Zh(v >> 6 & 0x3F | 0x80);
            this.Zh(v & 0x3F | 0x80);
            return this;
        }
        if(v > 0x10FFFF) {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(v));
        }
        this.Zh(v >> 18 | 0xF0);
        this.Zh(v >> 12 & 0x3F | 0x80);
        this.Zh(v >> 6 & 0x3F | 0x80);
        this.Zh(v & 0x3F | 0x80);
        return this;
    }

    public PjT PjT(String s) {
        return this.PjT(s, 0, s.length());
    }

    public PjT PjT(String s, int v, int v1) {
        if(s == null) {
            throw new IllegalArgumentException("string == null");
        }
        if(v < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + v);
        }
        if(v1 < v) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + v1 + " < " + v);
        }
        if(v1 > s.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + v1 + " > " + s.length());
        }
        while(v < v1) {
            int v2 = s.charAt(v);
            if(v2 < 0x80) {
                JQp jQp0 = this.ReZ(1);
                byte[] arr_b = jQp0.PjT;
                int v3 = jQp0.ReZ - v;
                int v4 = Math.min(v1, 0x2000 - v3);
                int v5 = v + 1;
                arr_b[v + v3] = (byte)v2;
                while(true) {
                    v = v5;
                    if(v >= v4) {
                        break;
                    }
                    int v6 = s.charAt(v);
                    if(v6 >= 0x80) {
                        break;
                    }
                    v5 = v + 1;
                    arr_b[v + v3] = (byte)v6;
                }
                int v7 = v3 + v - jQp0.ReZ;
                jQp0.ReZ += v7;
                this.Zh += (long)v7;
            }
            else {
                if(v2 < 0x800) {
                    this.Zh(v2 >> 6 | 0xC0);
                    this.Zh(v2 & 0x3F | 0x80);
                }
                else if(v2 < 0xD800 || v2 > 0xDFFF) {
                    this.Zh(v2 >> 12 | 0xE0);
                    this.Zh(v2 >> 6 & 0x3F | 0x80);
                    this.Zh(v2 & 0x3F | 0x80);
                }
                else {
                    int v8 = v + 1 >= v1 ? 0 : s.charAt(v + 1);
                    if(v2 > 0xDBFF || v8 < 0xDC00 || v8 > 0xDFFF) {
                        this.Zh(0x3F);
                        ++v;
                    }
                    else {
                        int v9 = ((v2 & 0xFFFF27FF) << 10 | 0xFFFF23FF & v8) + 0x10000;
                        this.Zh(v9 >> 18 | 0xF0);
                        this.Zh(v9 >> 12 & 0x3F | 0x80);
                        this.Zh(v9 >> 6 & 0x3F | 0x80);
                        this.Zh(v9 & 0x3F | 0x80);
                        v += 2;
                    }
                    continue;
                }
                ++v;
            }
        }
        return this;
    }

    public PjT PjT(String s, int v, int v1, Charset charset0) {
        if(s == null) {
            throw new IllegalArgumentException("string == null");
        }
        if(v < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + v);
        }
        if(v1 < v) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + v1 + " < " + v);
        }
        if(v1 > s.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + v1 + " > " + s.length());
        }
        if(charset0 == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if(charset0.equals(SM.PjT)) {
            return this.PjT(s, v, v1);
        }
        byte[] arr_b = s.substring(v, v1).getBytes(charset0);
        return this.Zh(arr_b, 0, arr_b.length);
    }

    public String PjT(long v, Charset charset0) throws EOFException {
        SM.PjT(this.Zh, 0L, v);
        if(charset0 == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if(v > 0x7FFFFFFFL) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + v);
        }
        if(v == 0L) {
            return "";
        }
        JQp jQp0 = this.PjT;
        int v1 = jQp0.Zh;
        if(((long)v1) + v > ((long)jQp0.ReZ)) {
            return new String(this.PjT(v), charset0);
        }
        String s = new String(jQp0.PjT, v1, ((int)v), charset0);
        int v2 = (int)(((long)jQp0.Zh) + v);
        jQp0.Zh = v2;
        this.Zh -= v;
        if(v2 == jQp0.ReZ) {
            this.PjT = jQp0.Zh();
            cz.PjT(jQp0);
        }
        return s;
    }

    public void PjT(byte[] arr_b) throws EOFException {
        for(int v = 0; v < arr_b.length; v += v1) {
            int v1 = this.PjT(arr_b, v, arr_b.length - v);
            if(v1 == -1) {
                throw new EOFException();
            }
        }
    }

    public boolean PjT() {
        return this.Zh == 0L;
    }

    public byte[] PjT(long v) throws EOFException {
        SM.PjT(this.Zh, 0L, v);
        if(v > 0x7FFFFFFFL) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + v);
        }
        byte[] arr_b = new byte[((int)v)];
        this.PjT(arr_b);
        return arr_b;
    }

    JQp ReZ(int v) {
        if(v <= 0 || v > 0x2000) {
            throw new IllegalArgumentException();
        }
        JQp jQp0 = this.PjT;
        if(jQp0 == null) {
            JQp jQp1 = cz.PjT();
            this.PjT = jQp1;
            jQp1.XX = jQp1;
            jQp1.cz = jQp1;
            return jQp1;
        }
        return jQp0.XX.ReZ + v <= 0x2000 && jQp0.XX.JQp ? jQp0.XX : jQp0.XX.PjT(cz.PjT());
    }

    public String ReZ() [...] // 潜在的解密器

    public byte Zh() {
        long v = this.Zh;
        if(v == 0L) {
            throw new IllegalStateException("size == 0");
        }
        JQp jQp0 = this.PjT;
        int v1 = jQp0.ReZ;
        int v2 = jQp0.Zh + 1;
        byte b = jQp0.PjT[jQp0.Zh];
        this.Zh = v - 1L;
        if(v2 == v1) {
            this.PjT = jQp0.Zh();
            cz.PjT(jQp0);
            return b;
        }
        jQp0.Zh = v2;
        return b;
    }

    public PjT Zh(int v) {
        JQp jQp0 = this.ReZ(1);
        int v1 = jQp0.ReZ;
        jQp0.ReZ = v1 + 1;
        jQp0.PjT[v1] = (byte)v;
        ++this.Zh;
        return this;
    }

    public PjT Zh(long v) {
        if(v == 0L) {
            return this.Zh(0x30);
        }
        int v1 = Long.numberOfTrailingZeros(Long.highestOneBit(v)) / 4 + 1;
        JQp jQp0 = this.ReZ(v1);
        byte[] arr_b = jQp0.PjT;
        int v2 = jQp0.ReZ;
        for(int v3 = v2 + v1 - 1; v3 >= v2; --v3) {
            arr_b[v3] = PjT.ReZ[((int)(15L & v))];
            v >>>= 4;
        }
        jQp0.ReZ += v1;
        this.Zh += (long)v1;
        return this;
    }

    public PjT Zh(byte[] arr_b, int v, int v1) {
        if(arr_b == null) {
            throw new IllegalArgumentException("source == null");
        }
        SM.PjT(arr_b.length, v, v1);
        int v2 = v1 + v;
        while(v < v2) {
            JQp jQp0 = this.ReZ(1);
            int v3 = Math.min(v2 - v, 0x2000 - jQp0.ReZ);
            System.arraycopy(arr_b, v, jQp0.PjT, jQp0.ReZ, v3);
            v += v3;
            jQp0.ReZ += v3;
        }
        this.Zh += (long)v1;
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.cr();
    }

    @Override
    public void close() {
    }

    public PjT cr() {
        PjT pjT0 = new PjT();
        if(this.Zh == 0L) {
            return pjT0;
        }
        JQp jQp0 = this.PjT.PjT();
        pjT0.PjT = jQp0;
        jQp0.XX = jQp0;
        jQp0.cz = jQp0;
        JQp jQp1 = this.PjT;
        while(true) {
            jQp1 = jQp1.cz;
            if(jQp1 == this.PjT) {
                break;
            }
            pjT0.PjT.XX.PjT(jQp1.PjT());
        }
        pjT0.Zh = this.Zh;
        return pjT0;
    }

    public final cr cr(int v) {
        return v == 0 ? cr.ReZ : new XX(this, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PjT)) {
            return false;
        }
        long v1 = this.Zh;
        if(v1 != ((PjT)object0).Zh) {
            return false;
        }
        if(v1 == 0L) {
            return true;
        }
        JQp jQp0 = this.PjT;
        JQp jQp1 = ((PjT)object0).PjT;
        int v2 = jQp0.Zh;
        int v3 = jQp1.Zh;
        for(long v = 0L; v < this.Zh; v += v4) {
            long v4 = (long)Math.min(jQp0.ReZ - v2, jQp1.ReZ - v3);
            int v5 = 0;
            while(((long)v5) < v4) {
                if(jQp0.PjT[v2] != jQp1.PjT[v3]) {
                    return false;
                }
                ++v5;
                ++v2;
                ++v3;
            }
            if(v2 == jQp0.ReZ) {
                jQp0 = jQp0.cz;
                v2 = jQp0.Zh;
            }
            if(v3 == jQp1.ReZ) {
                jQp1 = jQp1.cz;
                v3 = jQp1.Zh;
            }
        }
        return true;
    }

    @Override
    public void flush() {
    }

    @Override
    public int hashCode() {
        JQp jQp0 = this.PjT;
        if(jQp0 == null) {
            return 0;
        }
        int v = 1;
        do {
            int v1 = jQp0.Zh;
            int v2 = jQp0.ReZ;
            while(v1 < v2) {
                v = v * 0x1F + jQp0.PjT[v1];
                ++v1;
            }
            jQp0 = jQp0.cz;
        }
        while(jQp0 != this.PjT);
        return v;
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @Override
    public int read(ByteBuffer byteBuffer0) throws IOException {
        JQp jQp0 = this.PjT;
        if(jQp0 == null) {
            return -1;
        }
        int v = Math.min(byteBuffer0.remaining(), jQp0.ReZ - jQp0.Zh);
        byteBuffer0.put(jQp0.PjT, jQp0.Zh, v);
        int v1 = jQp0.Zh + v;
        jQp0.Zh = v1;
        this.Zh -= (long)v;
        if(v1 == jQp0.ReZ) {
            this.PjT = jQp0.Zh();
            cz.PjT(jQp0);
        }
        return v;
    }

    @Override
    public String toString() {
        return this.JQp().toString();
    }

    @Override
    public int write(ByteBuffer byteBuffer0) throws IOException {
        if(byteBuffer0 == null) {
            throw new IllegalArgumentException("source == null");
        }
        int v = byteBuffer0.remaining();
        int v1 = v;
        while(v1 > 0) {
            JQp jQp0 = this.ReZ(1);
            int v2 = Math.min(v1, 0x2000 - jQp0.ReZ);
            byteBuffer0.get(jQp0.PjT, jQp0.ReZ, v2);
            v1 -= v2;
            jQp0.ReZ += v2;
        }
        this.Zh += (long)v;
        return v;
    }
}

