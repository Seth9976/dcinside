package com.google.crypto.tink.subtle;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class g {
    static abstract class a {
        public byte[] a;
        public int b;

        public abstract int a(int arg1);

        public abstract boolean b(byte[] arg1, int arg2, int arg3, boolean arg4);
    }

    static class b extends a {
        private int c;
        private int d;
        private final int[] e;
        private static final int[] f = null;
        private static final int[] g = null;
        private static final int h = -1;
        private static final int i = -2;

        static {
            b.f = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 0x3F, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 0x1F, 0x20, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 0x2F, 0x30, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            b.g = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 0x3F, -1, 26, 27, 28, 29, 30, 0x1F, 0x20, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 0x2F, 0x30, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        }

        public b(int v, byte[] arr_b) {
            this.a = arr_b;
            this.e = (v & 8) == 0 ? b.f : b.g;
            this.c = 0;
            this.d = 0;
        }

        @Override  // com.google.crypto.tink.subtle.g$a
        public int a(int v) {
            return v * 3 / 4 + 10;
        }

        @Override  // com.google.crypto.tink.subtle.g$a
        public boolean b(byte[] arr_b, int v, int v1, boolean z) {
            int v2 = this.c;
            if(v2 == 6) {
                return false;
            }
            int v3 = v1 + v;
            byte[] arr_b1 = this.a;
            int[] arr_v = this.e;
            int v4 = this.d;
            int v5 = 0;
            int v6 = v2;
            for(int v7 = v; v7 < v3; ++v7) {
                if(v6 == 0) {
                    while(v7 + 4 <= v3) {
                        v4 = arr_v[arr_b[v7] & 0xFF] << 18 | arr_v[arr_b[v7 + 1] & 0xFF] << 12 | arr_v[arr_b[v7 + 2] & 0xFF] << 6 | arr_v[arr_b[v7 + 3] & 0xFF];
                        if(v4 < 0) {
                            break;
                        }
                        arr_b1[v5 + 2] = (byte)v4;
                        arr_b1[v5 + 1] = (byte)(v4 >> 8);
                        arr_b1[v5] = (byte)(v4 >> 16);
                        v5 += 3;
                        v7 += 4;
                    }
                    if(v7 >= v3) {
                        break;
                    }
                }
                int v8 = arr_v[arr_b[v7] & 0xFF];
                switch(v6) {
                    case 0: {
                        if(v8 >= 0) {
                            v6 = 1;
                            v4 = v8;
                        }
                        else if(v8 != -1) {
                            this.c = 6;
                            return false;
                        }
                        break;
                    }
                    case 1: {
                        if(v8 >= 0) {
                            v6 = 2;
                            v4 = v8 | v4 << 6;
                        }
                        else if(v8 != -1) {
                            this.c = 6;
                            return false;
                        }
                        break;
                    }
                    default: {
                        if(v6 != 2) {
                            switch(v6) {
                                case 3: {
                                    if(v8 >= 0) {
                                        int v9 = v8 | v4 << 6;
                                        arr_b1[v5 + 2] = (byte)v9;
                                        arr_b1[v5 + 1] = (byte)(v9 >> 8);
                                        arr_b1[v5] = (byte)(v9 >> 16);
                                        v5 += 3;
                                        v4 = v9;
                                        v6 = 0;
                                    }
                                    else if(v8 == -2) {
                                        arr_b1[v5 + 1] = (byte)(v4 >> 2);
                                        arr_b1[v5] = (byte)(v4 >> 10);
                                        v5 += 2;
                                        v6 = 5;
                                    }
                                    else if(v8 != -1) {
                                        this.c = 6;
                                        return false;
                                    }
                                    break;
                                }
                                case 4: {
                                    if(v8 == -2) {
                                        v6 = 5;
                                    }
                                    else if(v8 != -1) {
                                        this.c = 6;
                                        return false;
                                    }
                                    break;
                                }
                                case 5: {
                                    if(v8 != -1) {
                                        this.c = 6;
                                        return false;
                                    }
                                }
                            }
                        }
                        else if(v8 >= 0) {
                            v6 = 3;
                            v4 = v8 | v4 << 6;
                        }
                        else if(v8 == -2) {
                            arr_b1[v5] = (byte)(v4 >> 4);
                            ++v5;
                            v6 = 4;
                        }
                        else if(v8 != -1) {
                            this.c = 6;
                            return false;
                        }
                    }
                }
            }
            if(!z) {
                this.c = v6;
                this.d = v4;
                this.b = v5;
                return true;
            }
            switch(v6) {
                case 1: {
                    this.c = 6;
                    return false;
                }
                case 2: {
                    arr_b1[v5] = (byte)(v4 >> 4);
                    ++v5;
                    break;
                }
                case 3: {
                    int v10 = v5 + 1;
                    arr_b1[v5] = (byte)(v4 >> 10);
                    v5 += 2;
                    arr_b1[v10] = (byte)(v4 >> 2);
                    break;
                }
                case 4: {
                    this.c = 6;
                    return false;
                }
            }
            this.c = v6;
            this.b = v5;
            return true;
        }
    }

    static class c extends a {
        private final byte[] c;
        int d;
        private int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        private final byte[] i;
        public static final int j = 19;
        private static final byte[] k;
        private static final byte[] l;
        static final boolean m;

        static {
            c.k = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 0x2F};
            c.l = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 0x5F};
        }

        public c(int v, byte[] arr_b) {
            this.a = arr_b;
            boolean z = true;
            this.f = (v & 1) == 0;
            boolean z1 = (v & 2) == 0;
            this.g = z1;
            if((v & 4) == 0) {
                z = false;
            }
            this.h = z;
            this.i = (v & 8) == 0 ? c.k : c.l;
            this.c = new byte[2];
            this.d = 0;
            this.e = z1 ? 19 : -1;
        }

        @Override  // com.google.crypto.tink.subtle.g$a
        public int a(int v) {
            return v * 8 / 5 + 10;
        }

        @Override  // com.google.crypto.tink.subtle.g$a
        @O1.a
        public boolean b(byte[] arr_b, int v, int v1, boolean z) {
            int v18;
            int v17;
            int v15;
            int v12;
            int v8;
            int v7;
            int v6;
            int v5;
            byte[] arr_b1 = this.i;
            byte[] arr_b2 = this.a;
            int v2 = this.e;
            int v3 = v1 + v;
            int v4 = 0;
            switch(this.d) {
                case 1: {
                    if(v + 2 <= v3) {
                        v5 = v + 2;
                        v6 = arr_b[v + 1] & 0xFF | ((this.c[0] & 0xFF) << 16 | (arr_b[v] & 0xFF) << 8);
                        this.d = 0;
                    }
                    else {
                        v5 = v;
                        v6 = -1;
                    }
                    break;
                }
                case 2: {
                    if(v + 1 <= v3) {
                        v6 = (this.c[1] & 0xFF) << 8 | (this.c[0] & 0xFF) << 16 | arr_b[v] & 0xFF;
                        this.d = 0;
                        v5 = v + 1;
                    }
                    else {
                        v5 = v;
                        v6 = -1;
                    }
                    break;
                }
                default: {
                    v5 = v;
                    v6 = -1;
                }
            }
            if(v6 == -1) {
                v8 = 0;
            }
            else {
                arr_b2[0] = arr_b1[v6 >> 18 & 0x3F];
                arr_b2[1] = arr_b1[v6 >> 12 & 0x3F];
                arr_b2[2] = arr_b1[v6 >> 6 & 0x3F];
                arr_b2[3] = arr_b1[v6 & 0x3F];
                --v2;
                if(v2 == 0) {
                    if(this.h) {
                        arr_b2[4] = 13;
                        v7 = 5;
                    }
                    else {
                        v7 = 4;
                    }
                    v8 = v7 + 1;
                    arr_b2[v7] = 10;
                    v2 = 19;
                }
                else {
                    v8 = 4;
                }
            }
            while(v5 + 3 <= v3) {
                int v9 = (arr_b[v5 + 1] & 0xFF) << 8 | (arr_b[v5] & 0xFF) << 16 | arr_b[v5 + 2] & 0xFF;
                arr_b2[v8] = arr_b1[v9 >> 18 & 0x3F];
                arr_b2[v8 + 1] = arr_b1[v9 >> 12 & 0x3F];
                arr_b2[v8 + 2] = arr_b1[v9 >> 6 & 0x3F];
                arr_b2[v8 + 3] = arr_b1[v9 & 0x3F];
                int v10 = v8 + 4;
                --v2;
                if(v2 == 0) {
                    if(this.h) {
                        arr_b2[v10] = 13;
                        v10 = v8 + 5;
                    }
                    v8 = v10 + 1;
                    arr_b2[v10] = 10;
                    v5 += 3;
                    v2 = 19;
                }
                else {
                    v8 = v10;
                    v5 += 3;
                }
            }
            if(z) {
                int v11 = this.d;
                if(v5 - v11 == v3 - 1) {
                    if(v11 > 0) {
                        v12 = this.c[0];
                        v4 = 1;
                    }
                    else {
                        v12 = arr_b[v5];
                    }
                    int v13 = (v12 & 0xFF) << 4;
                    this.d = v11 - v4;
                    arr_b2[v8] = arr_b1[v13 >> 6 & 0x3F];
                    int v14 = v8 + 2;
                    arr_b2[v8 + 1] = arr_b1[v13 & 0x3F];
                    if(this.f) {
                        arr_b2[v14] = 61;
                        v14 = v8 + 4;
                        arr_b2[v8 + 3] = 61;
                    }
                    if(this.g) {
                        if(this.h) {
                            arr_b2[v14] = 13;
                            ++v14;
                        }
                        arr_b2[v14] = 10;
                        v8 = v14 + 1;
                    }
                    else {
                        v8 = v14;
                    }
                }
                else if(v5 - v11 == v3 - 2) {
                    if(v11 > 1) {
                        v15 = this.c[0];
                        v4 = 1;
                    }
                    else {
                        int v16 = arr_b[v5];
                        ++v5;
                        v15 = v16;
                    }
                    if(v11 > 0) {
                        v17 = v4 + 1;
                        v18 = this.c[v4];
                    }
                    else {
                        v17 = v4;
                        v18 = arr_b[v5];
                    }
                    int v19 = (v15 & 0xFF) << 10 | (v18 & 0xFF) << 2;
                    this.d = v11 - v17;
                    arr_b2[v8] = arr_b1[v19 >> 12 & 0x3F];
                    arr_b2[v8 + 1] = arr_b1[v19 >> 6 & 0x3F];
                    int v20 = v8 + 3;
                    arr_b2[v8 + 2] = arr_b1[v19 & 0x3F];
                    if(this.f) {
                        arr_b2[v20] = 61;
                        v20 = v8 + 4;
                    }
                    if(this.g) {
                        if(this.h) {
                            arr_b2[v20] = 13;
                            ++v20;
                        }
                        arr_b2[v20] = 10;
                        v8 = v20 + 1;
                    }
                    else {
                        v8 = v20;
                    }
                }
                else if(this.g && v8 > 0 && v2 != 19) {
                    if(this.h) {
                        arr_b2[v8] = 13;
                        ++v8;
                    }
                    arr_b2[v8] = 10;
                    ++v8;
                }
            }
            else if(v5 == v3 - 1) {
                int v21 = this.d;
                this.d = v21 + 1;
                this.c[v21] = arr_b[v5];
            }
            else if(v5 == v3 - 2) {
                int v22 = this.d;
                this.d = v22 + 1;
                this.c[v22] = arr_b[v5];
                this.d = v22 + 2;
                this.c[v22 + 1] = arr_b[v5 + 1];
            }
            this.b = v8;
            this.e = v2;
            return true;
        }
    }

    private static final Charset a = null;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;
    public static final int g = 16;
    static final boolean h;

    static {
        g.a = Charset.forName("UTF-8");
    }

    public static byte[] a(String s) {
        return g.b(s, 2);
    }

    public static byte[] b(String s, int v) {
        return g.c(s.getBytes(g.a), v);
    }

    public static byte[] c(byte[] arr_b, int v) {
        return g.d(arr_b, 0, arr_b.length, v);
    }

    public static byte[] d(byte[] arr_b, int v, int v1, int v2) {
        b g$b0 = new b(v2, new byte[v1 * 3 / 4]);
        if(!g$b0.b(arr_b, v, v1, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int v3 = g$b0.b;
        byte[] arr_b1 = g$b0.a;
        if(v3 == arr_b1.length) {
            return arr_b1;
        }
        byte[] arr_b2 = new byte[v3];
        System.arraycopy(arr_b1, 0, arr_b2, 0, v3);
        return arr_b2;
    }

    public static String e(byte[] arr_b) {
        return g.h(arr_b, 2);
    }

    public static byte[] f(byte[] arr_b, int v) {
        return g.g(arr_b, 0, arr_b.length, v);
    }

    public static byte[] g(byte[] arr_b, int v, int v1, int v2) {
        c g$c0 = new c(v2, null);
        int v3 = v1 / 3 * 4;
        int v4 = 2;
        if(!g$c0.f) {
            switch(v1 % 3) {
                case 1: {
                    v3 += 2;
                    break;
                }
                case 2: {
                    v3 += 3;
                }
            }
        }
        else if(v1 % 3 > 0) {
            v3 += 4;
        }
        if(g$c0.g && v1 > 0) {
            if(!g$c0.h) {
                v4 = 1;
            }
            v3 += ((v1 - 1) / 57 + 1) * v4;
        }
        g$c0.a = new byte[v3];
        g$c0.b(arr_b, v, v1, true);
        return g$c0.a;
    }

    public static String h(byte[] arr_b, int v) {
        try {
            return new String(g.f(arr_b, v), "US-ASCII");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new AssertionError(unsupportedEncodingException0);
        }
    }

    public static String i(byte[] arr_b, int v, int v1, int v2) {
        try {
            return new String(g.g(arr_b, v, v1, v2), "US-ASCII");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new AssertionError(unsupportedEncodingException0);
        }
    }

    public static byte[] j(String s) {
        return g.b(s, 11);
    }

    public static String k(byte[] arr_b) {
        return g.h(arr_b, 11);
    }
}

