package com.bytedance.sdk.component.Zh.PjT.Zh;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

public class cr implements Serializable, Comparable {
    transient int JQp;
    static final char[] PjT;
    public static final cr ReZ;
    public static final Charset Zh;
    final byte[] cr;
    transient String cz;

    static {
        cr.PjT = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        cr.Zh = Charset.forName("UTF-8");
        cr.ReZ = cr.PjT(new byte[0]);
    }

    cr(byte[] arr_b) {
        this.cr = arr_b;
    }

    static int PjT(String s, int v) {
        int v1 = s.length();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; v2 += Character.charCount(v4)) {
            if(v3 == v) {
                return v2;
            }
            int v4 = s.codePointAt(v2);
            if(Character.isISOControl(v4) && v4 != 10 && v4 != 13 || v4 == 0xFFFD) {
                return -1;
            }
            ++v3;
        }
        return s.length();
    }

    public static cr PjT(byte[] arr_b) {
        if(arr_b == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new cr(((byte[])arr_b.clone()));
    }

    public byte PjT(int v) {
        return this.cr[v];
    }

    public int PjT(cr cr0) {
        int v = this.ReZ();
        int v1 = cr0.ReZ();
        int v2 = Math.min(v, v1);
        for(int v3 = 0; v3 < v2; ++v3) {
            int v4 = this.PjT(v3) & 0xFF;
            int v5 = cr0.PjT(v3) & 0xFF;
            if(v4 != v5) {
                return v4 >= v5 ? 1 : -1;
            }
        }
        if(v == v1) {
            return 0;
        }
        return v >= v1 ? 1 : -1;
    }

    public cr PjT(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] arr_b = this.cr;
        if(v1 > arr_b.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.cr.length + ")");
        }
        int v2 = v1 - v;
        if(v2 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if(v == 0 && v1 == arr_b.length) {
            return this;
        }
        byte[] arr_b1 = new byte[v2];
        System.arraycopy(arr_b, v, arr_b1, 0, v2);
        return new cr(arr_b1);
    }

    public String PjT() {
        String s = this.cz;
        if(s != null) {
            return s;
        }
        String s1 = new String(this.cr, cr.Zh);
        this.cz = s1;
        return s1;
    }

    public boolean PjT(int v, cr cr0, int v1, int v2) {
        return cr0.PjT(v1, this.cr, v, v2);
    }

    public boolean PjT(int v, byte[] arr_b, int v1, int v2) {
        return v >= 0 && (v <= this.cr.length - v2 && v1 >= 0 && v1 <= arr_b.length - v2 && SM.PjT(this.cr, v, arr_b, v1, v2));
    }

    public int ReZ() {
        return this.cr.length;
    }

    public String Zh() {
        byte[] arr_b = this.cr;
        char[] arr_c = new char[arr_b.length * 2];
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            int v2 = arr_b[v];
            int v3 = v1 + 1;
            arr_c[v1] = cr.PjT[v2 >> 4 & 15];
            v1 += 2;
            arr_c[v3] = cr.PjT[v2 & 15];
        }
        return new String(arr_c);
    }

    @Override
    public int compareTo(Object object0) {
        return this.PjT(((cr)object0));
    }

    public byte[] cr() {
        return (byte[])this.cr.clone();
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof cr && (((cr)object0).ReZ() == this.cr.length && ((cr)object0).PjT(0, this.cr, 0, this.cr.length));
    }

    @Override
    public int hashCode() {
        int v = this.JQp;
        if(v != 0) {
            return v;
        }
        int v1 = Arrays.hashCode(this.cr);
        this.JQp = v1;
        return v1;
    }

    @Override
    public String toString() {
        if(this.cr.length == 0) {
            return "[size=0]";
        }
        String s = this.PjT();
        int v = cr.PjT(s, 0x40);
        if(v == -1) {
            return this.cr.length > 0x40 ? "[size=" + this.cr.length + " hex=" + this.PjT(0, 0x40).Zh() + "…]" : "[hex=" + this.Zh() + "]";
        }
        String s1 = s.substring(0, v).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        return v >= s.length() ? "[text=" + s1 + "]" : "[size=" + this.cr.length + " text=" + s1 + "…]";
    }
}

