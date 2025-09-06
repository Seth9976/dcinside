package kotlin.io.encoding;

import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

@h0(version = "1.8")
@f
public class a {
    public static final class kotlin.io.encoding.a.a extends a {
        private kotlin.io.encoding.a.a() {
            super(false, false, null);
        }

        public kotlin.io.encoding.a.a(w w0) {
        }

        @l
        public final a G() {
            return a.m;
        }

        // 去混淆评级： 低(20)
        @l
        public final byte[] H() [...] // 潜在的解密器

        @l
        public final a I() {
            return a.l;
        }
    }

    private final boolean a;
    private final boolean b;
    @l
    public static final kotlin.io.encoding.a.a c = null;
    private static final int d = 8;
    private static final int e = 6;
    public static final int f = 3;
    public static final int g = 4;
    public static final byte h = 61;
    public static final int i = 76;
    private static final int j = 19;
    @l
    private static final byte[] k;
    @l
    private static final a l;
    @l
    private static final a m;

    static {
        a.c = new kotlin.io.encoding.a.a(null);
        a.k = new byte[]{13, 10};
        a.l = new a(true, false);
        a.m = new a(false, true);
    }

    private a(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
        if(z && z1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public a(boolean z, boolean z1, w w0) {
        this(z, z1);
    }

    public static byte[] A(a a0, byte[] arr_b, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_b.length;
        }
        return a0.z(arr_b, v, v1);
    }

    @l
    public final byte[] B(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "source");
        this.g(arr_b.length, v, v1);
        byte[] arr_b1 = new byte[this.w(v1 - v)];
        this.v(arr_b, arr_b1, 0, v, v1);
        return arr_b1;
    }

    private final int C(byte[] arr_b, int v, int v1, int v2) {
        switch(v2) {
            case -8: {
                throw new IllegalArgumentException("Redundant pad character at index " + v);
            }
            case -4: {
                v = this.F(arr_b, v + 1, v1);
                if(v == v1 || arr_b[v] != 61) {
                    throw new IllegalArgumentException("Missing one pad character at index " + v);
                }
                break;
            }
            case -6: 
            case -2: {
                break;
            }
            default: {
                throw new IllegalStateException("Unreachable");
            }
        }
        return v + 1;
    }

    public final boolean D() {
        return this.b;
    }

    public final boolean E() {
        return this.a;
    }

    private final int F(byte[] arr_b, int v, int v1) {
        if(!this.b) {
            return v;
        }
        while(v < v1 && c.b[arr_b[v] & 0xFF] == -1) {
            ++v;
        }
        return v;
    }

    public static final byte[] b() [...] // 潜在的解密器

    @l
    public final String d(@l byte[] arr_b) {
        L.p(arr_b, "source");
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length);
        for(int v = 0; v < arr_b.length; ++v) {
            stringBuilder0.append(((char)arr_b[v]));
        }
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }

    @l
    public final byte[] e(@l CharSequence charSequence0, int v, int v1) {
        L.p(charSequence0, "source");
        this.g(charSequence0.length(), v, v1);
        byte[] arr_b = new byte[v1 - v];
        int v2 = 0;
        while(v < v1) {
            int v3 = charSequence0.charAt(v);
            arr_b[v2] = v3 <= 0xFF ? ((byte)v3) : 0x3F;
            ++v2;
            ++v;
        }
        return arr_b;
    }

    private final void f(int v, int v1, int v2) {
        if(v1 < 0 || v1 > v) {
            throw new IndexOutOfBoundsException("destination offset: " + v1 + ", destination size: " + v);
        }
        if(v1 + v2 < 0 || v1 + v2 > v) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + v1 + ", destination size: " + v + ", capacity needed: " + v2);
        }
    }

    public final void g(int v, int v1, int v2) {
        kotlin.collections.c.a.a(v1, v2, v);
    }

    @l
    public final byte[] h(@l CharSequence charSequence0, int v, int v1) {
        L.p(charSequence0, "source");
        if(charSequence0 instanceof String) {
            this.g(charSequence0.length(), v, v1);
            String s = ((String)charSequence0).substring(v, v1);
            L.o(s, "substring(...)");
            L.n(s, "null cannot be cast to non-null type java.lang.String");
            byte[] arr_b = s.getBytes(kotlin.text.f.g);
            L.o(arr_b, "getBytes(...)");
            return a.k(this, arr_b, 0, 0, 6, null);
        }
        return a.k(this, this.e(charSequence0, v, v1), 0, 0, 6, null);
    }

    @l
    public final byte[] i(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "source");
        this.g(arr_b.length, v, v1);
        int v2 = this.q(arr_b, v, v1);
        byte[] arr_b1 = new byte[v2];
        if(this.l(arr_b, arr_b1, 0, v, v1) != v2) {
            throw new IllegalStateException("Check failed.");
        }
        return arr_b1;
    }

    public static byte[] j(a a0, CharSequence charSequence0, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = charSequence0.length();
        }
        return a0.h(charSequence0, v, v1);
    }

    public static byte[] k(a a0, byte[] arr_b, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_b.length;
        }
        return a0.i(arr_b, v, v1);
    }

    private final int l(byte[] arr_b, byte[] arr_b1, int v, int v1, int v2) {
        int[] arr_v = this.a ? c.d : c.b;
        int v3 = v;
        int v4 = v1;
        int v5 = 0;
        int v6 = -8;
        while(v4 < v2) {
            if(v6 == -8 && v4 + 3 < v2) {
                int v7 = arr_v[arr_b[v4] & 0xFF] << 18 | arr_v[arr_b[v4 + 1] & 0xFF] << 12 | arr_v[arr_b[v4 + 2] & 0xFF] << 6 | arr_v[arr_b[v4 + 3] & 0xFF];
                if(v7 >= 0) {
                    arr_b1[v3] = (byte)(v7 >> 16);
                    int v8 = v3 + 2;
                    arr_b1[v3 + 1] = (byte)(v7 >> 8);
                    v3 += 3;
                    arr_b1[v8] = (byte)v7;
                    v4 += 4;
                    continue;
                }
            }
            int v9 = arr_b[v4] & 0xFF;
            int v10 = arr_v[v9];
            if(v10 < 0) {
                if(v10 == -2) {
                    v4 = this.C(arr_b, v4, v2, v6);
                    break;
                }
                if(this.b) {
                    ++v4;
                    continue;
                }
                String s = Integer.toString(v9, kotlin.text.c.a(8));
                L.o(s, "toString(...)");
                throw new IllegalArgumentException("Invalid symbol \'" + ((char)v9) + "\'(" + s + ") at index " + v4);
            }
            ++v4;
            v5 = v5 << 6 | v10;
            if(v6 + 6 >= 0) {
                arr_b1[v3] = (byte)(v5 >>> v6 + 6);
                v5 &= (1 << v6 + 6) - 1;
                v6 -= 2;
                ++v3;
            }
            else {
                v6 += 6;
            }
        }
        if(v6 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        int v11 = this.F(arr_b, v4, v2);
        if(v11 >= v2) {
            return v3 - v;
        }
        int v12 = arr_b[v11] & 0xFF;
        String s1 = Integer.toString(v12, kotlin.text.c.a(8));
        L.o(s1, "toString(...)");
        throw new IllegalArgumentException("Symbol \'" + ((char)v12) + "\'(" + s1 + ") at index " + (v11 - 1) + " is prohibited after the pad character");
    }

    public final int m(@l CharSequence charSequence0, @l byte[] arr_b, int v, int v1, int v2) {
        L.p(charSequence0, "source");
        L.p(arr_b, "destination");
        if(charSequence0 instanceof String) {
            this.g(charSequence0.length(), v1, v2);
            String s = ((String)charSequence0).substring(v1, v2);
            L.o(s, "substring(...)");
            L.n(s, "null cannot be cast to non-null type java.lang.String");
            byte[] arr_b1 = s.getBytes(kotlin.text.f.g);
            L.o(arr_b1, "getBytes(...)");
            return a.p(this, arr_b1, arr_b, v, 0, 0, 24, null);
        }
        return a.p(this, this.e(charSequence0, v1, v2), arr_b, v, 0, 0, 24, null);
    }

    public final int n(@l byte[] arr_b, @l byte[] arr_b1, int v, int v1, int v2) {
        L.p(arr_b, "source");
        L.p(arr_b1, "destination");
        this.g(arr_b.length, v1, v2);
        int v3 = this.q(arr_b, v1, v2);
        this.f(arr_b1.length, v, v3);
        return this.l(arr_b, arr_b1, v, v1, v2);
    }

    public static int o(a a0, CharSequence charSequence0, byte[] arr_b, int v, int v1, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if((v3 & 16) != 0) {
            v2 = charSequence0.length();
        }
        return a0.m(charSequence0, arr_b, ((v3 & 4) == 0 ? v : 0), ((v3 & 8) == 0 ? v1 : 0), v2);
    }

    public static int p(a a0, byte[] arr_b, byte[] arr_b1, int v, int v1, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if((v3 & 16) != 0) {
            v2 = arr_b.length;
        }
        return a0.n(arr_b, arr_b1, ((v3 & 4) == 0 ? v : 0), ((v3 & 8) == 0 ? v1 : 0), v2);
    }

    private final int q(byte[] arr_b, int v, int v1) {
        int v2 = v1 - v;
        if(v2 == 0) {
            return 0;
        }
        if(v2 == 1) {
            throw new IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: " + v + ", endIndex: " + v1);
        }
        if(this.b) {
            while(v < v1) {
                int v3 = c.b[arr_b[v] & 0xFF];
                if(v3 < 0) {
                    if(v3 == -2) {
                        return (int)(((long)(v2 - (v1 - v))) * 6L / 8L);
                    }
                    --v2;
                }
                ++v;
            }
            return (int)(((long)v2) * 6L / 8L);
        }
        if(arr_b[v1 - 1] == 61) {
            if(arr_b[v1 - 2] == 61) {
                return (int)(((long)(v2 - 2)) * 6L / 8L);
            }
            --v2;
        }
        return (int)(((long)v2) * 6L / 8L);
    }

    @l
    public final String r(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "source");
        return new String(this.B(arr_b, v, v1), kotlin.text.f.g);
    }

    public static String s(a a0, byte[] arr_b, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_b.length;
        }
        return a0.r(arr_b, v, v1);
    }

    public final int t(@l byte[] arr_b, @l byte[] arr_b1, int v, int v1, int v2) {
        L.p(arr_b, "source");
        L.p(arr_b1, "destination");
        return this.v(arr_b, arr_b1, v, v1, v2);
    }

    public static int u(a a0, byte[] arr_b, byte[] arr_b1, int v, int v1, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if((v3 & 16) != 0) {
            v2 = arr_b.length;
        }
        return a0.t(arr_b, arr_b1, ((v3 & 4) == 0 ? v : 0), ((v3 & 8) == 0 ? v1 : 0), v2);
    }

    public final int v(@l byte[] arr_b, @l byte[] arr_b1, int v, int v1, int v2) {
        L.p(arr_b, "source");
        L.p(arr_b1, "destination");
        this.g(arr_b.length, v1, v2);
        int v3 = this.w(v2 - v1);
        this.f(arr_b1.length, v, v3);
        byte[] arr_b2 = this.a ? new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 0x5F} : new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 0x2F};
        int v4 = this.b ? 19 : 0x7FFFFFFF;
        int v5 = v;
        while(v1 + 2 < v2) {
            int v6 = Math.min((v2 - v1) / 3, v4);
            for(int v7 = 0; v7 < v6; ++v7) {
                int v8 = arr_b[v1] & 0xFF;
                int v9 = v1 + 2;
                int v10 = arr_b[v1 + 1] & 0xFF;
                v1 += 3;
                int v11 = v10 << 8 | v8 << 16 | arr_b[v9] & 0xFF;
                arr_b1[v5] = arr_b2[v11 >>> 18];
                arr_b1[v5 + 1] = arr_b2[v11 >>> 12 & 0x3F];
                int v12 = v5 + 3;
                arr_b1[v5 + 2] = arr_b2[v11 >>> 6 & 0x3F];
                v5 += 4;
                arr_b1[v12] = arr_b2[v11 & 0x3F];
            }
            if(v6 == v4 && v1 != v2) {
                int v13 = v5 + 1;
                arr_b1[v5] = a.k[0];
                v5 += 2;
                arr_b1[v13] = a.k[1];
            }
        }
        switch(v2 - v1) {
            case 1: {
                int v14 = (arr_b[v1] & 0xFF) << 4;
                arr_b1[v5] = arr_b2[v14 >>> 6];
                arr_b1[v5 + 1] = arr_b2[v14 & 0x3F];
                int v15 = v5 + 3;
                arr_b1[v5 + 2] = 61;
                v5 += 4;
                arr_b1[v15] = 61;
                ++v1;
                break;
            }
            case 2: {
                int v16 = v1 + 1;
                int v17 = arr_b[v1] & 0xFF;
                v1 += 2;
                int v18 = (arr_b[v16] & 0xFF) << 2 | v17 << 10;
                arr_b1[v5] = arr_b2[v18 >>> 12];
                arr_b1[v5 + 1] = arr_b2[v18 >>> 6 & 0x3F];
                int v19 = v5 + 3;
                arr_b1[v5 + 2] = arr_b2[v18 & 0x3F];
                v5 += 4;
                arr_b1[v19] = 61;
            }
        }
        if(v1 != v2) {
            throw new IllegalStateException("Check failed.");
        }
        return v5 - v;
    }

    private final int w(int v) {
        int v1 = (v + 2) / 3;
        int v2 = v1 * 4 + (this.b ? (v1 - 1) / 19 : 0) * 2;
        if(v2 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        return v2;
    }

    @l
    public final Appendable x(@l byte[] arr_b, @l Appendable appendable0, int v, int v1) {
        L.p(arr_b, "source");
        L.p(appendable0, "destination");
        appendable0.append(new String(this.B(arr_b, v, v1), kotlin.text.f.g));
        return appendable0;
    }

    public static Appendable y(a a0, byte[] arr_b, Appendable appendable0, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = arr_b.length;
        }
        return a0.x(arr_b, appendable0, v, v1);
    }

    @l
    public final byte[] z(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "source");
        return this.B(arr_b, v, v1);
    }
}

