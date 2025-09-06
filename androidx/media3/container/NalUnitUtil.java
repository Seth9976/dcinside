package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.Arrays;

@UnstableApi
public final class NalUnitUtil {
    public static final class H265SpsData {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int[] h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final float m;
        public final int n;
        public final int o;
        public final int p;
        public final int q;

        public H265SpsData(int v, boolean z, int v1, int v2, int v3, int v4, int v5, int[] arr_v, int v6, int v7, int v8, int v9, float f, int v10, int v11, int v12, int v13) {
            this.a = v;
            this.b = z;
            this.c = v1;
            this.d = v2;
            this.e = v3;
            this.f = v4;
            this.g = v5;
            this.h = arr_v;
            this.i = v6;
            this.j = v7;
            this.k = v8;
            this.l = v9;
            this.m = f;
            this.n = v10;
            this.o = v11;
            this.p = v12;
            this.q = v13;
        }
    }

    public static final class PpsData {
        public final int a;
        public final int b;
        public final boolean c;

        public PpsData(int v, int v1, boolean z) {
            this.a = v;
            this.b = v1;
            this.c = z;
        }
    }

    public static final class SpsData {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final float h;
        public final int i;
        public final int j;
        public final boolean k;
        public final boolean l;
        public final int m;
        public final int n;
        public final int o;
        public final boolean p;
        public final int q;
        public final int r;
        public final int s;
        public final int t;

        public SpsData(int v, int v1, int v2, int v3, int v4, int v5, int v6, float f, int v7, int v8, boolean z, boolean z1, int v9, int v10, int v11, boolean z2, int v12, int v13, int v14, int v15) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
            this.e = v4;
            this.f = v5;
            this.g = v6;
            this.h = f;
            this.i = v7;
            this.j = v8;
            this.k = z;
            this.l = z1;
            this.m = v9;
            this.n = v10;
            this.o = v11;
            this.p = z2;
            this.q = v12;
            this.r = v13;
            this.s = v14;
            this.t = v15;
        }
    }

    private static final String a = "NalUnitUtil";
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 7;
    public static final int g = 8;
    public static final int h = 9;
    public static final int i = 14;
    public static final byte[] j = null;
    public static final int k = 0xFF;
    public static final float[] l = null;
    private static final int m = 6;
    private static final int n = 7;
    private static final int o = 39;
    private static final Object p;
    private static int[] q;

    static {
        NalUnitUtil.j = new byte[]{0, 0, 0, 1};
        NalUnitUtil.l = new float[]{1.0f, 1.0f, 1.090909f, 0.909091f, 1.454545f, 1.212121f, 2.181818f, 1.818182f, 2.909091f, 2.424242f, 1.636364f, 1.363636f, 1.939394f, 1.616162f, 1.333333f, 1.5f, 2.0f};
        NalUnitUtil.p = new Object();
        NalUnitUtil.q = new int[10];
    }

    public static void a(boolean[] arr_z) {
        arr_z[0] = false;
        arr_z[1] = false;
        arr_z[2] = false;
    }

    public static void b(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.position();
        int v2 = 0;
        for(int v1 = 0; v1 + 1 < v; ++v1) {
            int v3 = byteBuffer0.get(v1) & 0xFF;
            if(v2 == 3) {
                if(v3 == 1 && (byteBuffer0.get(v1 + 1) & 0x1F) == 7) {
                    ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
                    byteBuffer1.position(v1 - 3);
                    byteBuffer1.limit(v);
                    byteBuffer0.position(0);
                    byteBuffer0.put(byteBuffer1);
                    return;
                }
            }
            else if(v3 == 0) {
                ++v2;
            }
            if(v3 != 0) {
                v2 = 0;
            }
        }
        byteBuffer0.clear();
    }

    public static int c(byte[] arr_b, int v, int v1, boolean[] arr_z) {
        boolean z2;
        boolean z1;
        int v2 = v1 - v;
        boolean z = false;
        Assertions.i(v2 >= 0);
        if(v2 == 0) {
            return v1;
        }
        if(arr_z[0]) {
            NalUnitUtil.a(arr_z);
            return v - 3;
        }
        if(v2 > 1 && arr_z[1] && arr_b[v] == 1) {
            NalUnitUtil.a(arr_z);
            return v - 2;
        }
        if(v2 > 2 && arr_z[2] && arr_b[v] == 0 && arr_b[v + 1] == 1) {
            NalUnitUtil.a(arr_z);
            return v - 1;
        }
        for(int v3 = v + 2; v3 < v1 - 1; v3 += 3) {
            int v4 = arr_b[v3];
            if((v4 & 0xFE) == 0) {
                if(arr_b[v3 - 2] == 0 && arr_b[v3 - 1] == 0 && v4 == 1) {
                    NalUnitUtil.a(arr_z);
                    return v3 - 2;
                }
                v3 -= 2;
            }
        }
        if(v2 <= 2) {
            if(v2 != 2) {
                z1 = arr_z[1] && arr_b[v1 - 1] == 1;
            }
            else if(arr_z[2] && arr_b[v1 - 2] == 0 && arr_b[v1 - 1] == 1) {
                z1 = true;
            }
            else {
                z1 = false;
            }
        }
        else if(arr_b[v1 - 3] == 0 && arr_b[v1 - 2] == 0 && arr_b[v1 - 1] == 1) {
            z1 = true;
        }
        else {
            z1 = false;
        }
        arr_z[0] = z1;
        if(v2 <= 1) {
            z2 = arr_z[2] && arr_b[v1 - 1] == 0;
        }
        else if(arr_b[v1 - 2] == 0 && arr_b[v1 - 1] == 0) {
            z2 = true;
        }
        else {
            z2 = false;
        }
        arr_z[1] = z2;
        if(arr_b[v1 - 1] == 0) {
            z = true;
        }
        arr_z[2] = z;
        return v1;
    }

    private static int d(byte[] arr_b, int v, int v1) {
        while(v < v1 - 2) {
            if(arr_b[v] == 0 && arr_b[v + 1] == 0 && arr_b[v + 2] == 3) {
                return v;
            }
            ++v;
        }
        return v1;
    }

    public static int e(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0x7E) >> 1;
    }

    public static int f(byte[] arr_b, int v) {
        return arr_b[v + 3] & 0x1F;
    }

    // 去混淆评级： 低(20)
    public static boolean g(@Nullable String s, byte b) {
        return "video/avc".equals(s) && (b & 0x1F) == 6 || "video/hevc".equals(s) && (b & 0x7E) >> 1 == 39;
    }

    public static H265SpsData h(byte[] arr_b, int v, int v1) {
        return NalUnitUtil.i(arr_b, v + 2, v1);
    }

    public static H265SpsData i(byte[] arr_b, int v, int v1) {
        int v30;
        ParsableNalUnitBitArray parsableNalUnitBitArray0 = new ParsableNalUnitBitArray(arr_b, v, v1);
        parsableNalUnitBitArray0.l(4);
        int v2 = parsableNalUnitBitArray0.e(3);
        parsableNalUnitBitArray0.k();
        int v3 = 2;
        int v4 = parsableNalUnitBitArray0.e(2);
        boolean z = parsableNalUnitBitArray0.d();
        int v5 = parsableNalUnitBitArray0.e(5);
        int v6 = 0;
        for(int v7 = 0; v7 < 0x20; ++v7) {
            if(parsableNalUnitBitArray0.d()) {
                v6 |= 1 << v7;
            }
        }
        int[] arr_v = new int[6];
        for(int v8 = 0; v8 < 6; ++v8) {
            arr_v[v8] = parsableNalUnitBitArray0.e(8);
        }
        int v9 = parsableNalUnitBitArray0.e(8);
        int v11 = 0;
        for(int v10 = 0; v10 < v2; ++v10) {
            if(parsableNalUnitBitArray0.d()) {
                v11 += 89;
            }
            if(parsableNalUnitBitArray0.d()) {
                v11 += 8;
            }
        }
        parsableNalUnitBitArray0.l(v11);
        if(v2 > 0) {
            parsableNalUnitBitArray0.l((8 - v2) * 2);
        }
        int v12 = parsableNalUnitBitArray0.h();
        int v13 = parsableNalUnitBitArray0.h();
        if(v13 == 3) {
            parsableNalUnitBitArray0.k();
        }
        int v14 = parsableNalUnitBitArray0.h();
        int v15 = parsableNalUnitBitArray0.h();
        if(parsableNalUnitBitArray0.d()) {
            v14 -= (v13 == 1 || v13 == 2 ? 2 : 1) * (parsableNalUnitBitArray0.h() + parsableNalUnitBitArray0.h());
            v15 -= (v13 == 1 ? 2 : 1) * (parsableNalUnitBitArray0.h() + parsableNalUnitBitArray0.h());
        }
        int v16 = v15;
        int v17 = parsableNalUnitBitArray0.h();
        int v18 = parsableNalUnitBitArray0.h();
        int v19 = parsableNalUnitBitArray0.h();
        int v20 = -1;
        int v21 = parsableNalUnitBitArray0.d() ? 0 : v2;
        int v22 = -1;
        while(v21 <= v2) {
            parsableNalUnitBitArray0.h();
            v22 = Math.max(parsableNalUnitBitArray0.h(), v22);
            parsableNalUnitBitArray0.h();
            ++v21;
        }
        parsableNalUnitBitArray0.h();
        parsableNalUnitBitArray0.h();
        parsableNalUnitBitArray0.h();
        parsableNalUnitBitArray0.h();
        parsableNalUnitBitArray0.h();
        parsableNalUnitBitArray0.h();
        if(parsableNalUnitBitArray0.d() && parsableNalUnitBitArray0.d()) {
            NalUnitUtil.n(parsableNalUnitBitArray0);
        }
        parsableNalUnitBitArray0.l(2);
        if(parsableNalUnitBitArray0.d()) {
            parsableNalUnitBitArray0.l(8);
            parsableNalUnitBitArray0.h();
            parsableNalUnitBitArray0.h();
            parsableNalUnitBitArray0.k();
        }
        NalUnitUtil.q(parsableNalUnitBitArray0);
        if(parsableNalUnitBitArray0.d()) {
            int v23 = parsableNalUnitBitArray0.h();
            for(int v24 = 0; v24 < v23; ++v24) {
                parsableNalUnitBitArray0.l(v19 + 5);
            }
        }
        parsableNalUnitBitArray0.l(2);
        float f = 1.0f;
        if(parsableNalUnitBitArray0.d()) {
            if(parsableNalUnitBitArray0.d()) {
                int v25 = parsableNalUnitBitArray0.e(8);
                if(v25 == 0xFF) {
                    int v26 = parsableNalUnitBitArray0.e(16);
                    int v27 = parsableNalUnitBitArray0.e(16);
                    if(v26 != 0 && v27 != 0) {
                        f = ((float)v26) / ((float)v27);
                    }
                }
                else {
                    float[] arr_f = NalUnitUtil.l;
                    if(v25 < arr_f.length) {
                        f = arr_f[v25];
                    }
                    else {
                        Log.n("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + v25);
                    }
                }
            }
            if(parsableNalUnitBitArray0.d()) {
                parsableNalUnitBitArray0.k();
            }
            if(parsableNalUnitBitArray0.d()) {
                parsableNalUnitBitArray0.l(3);
                if(parsableNalUnitBitArray0.d()) {
                    v3 = 1;
                }
                if(parsableNalUnitBitArray0.d()) {
                    int v28 = parsableNalUnitBitArray0.e(8);
                    int v29 = parsableNalUnitBitArray0.e(8);
                    parsableNalUnitBitArray0.l(8);
                    v20 = ColorInfo.l(v28);
                    v30 = ColorInfo.m(v29);
                }
                else {
                    v30 = -1;
                }
            }
            else {
                v30 = -1;
                v3 = -1;
            }
            if(parsableNalUnitBitArray0.d()) {
                parsableNalUnitBitArray0.h();
                parsableNalUnitBitArray0.h();
            }
            parsableNalUnitBitArray0.k();
            if(parsableNalUnitBitArray0.d()) {
                v16 *= 2;
            }
            return new H265SpsData(v4, z, v5, v6, v13, v17, v18, arr_v, v9, v12, v14, v16, f, v22, v20, v3, v30);
        }
        return new H265SpsData(v4, z, v5, v6, v13, v17, v18, arr_v, v9, v12, v14, v16, 1.0f, v22, -1, -1, -1);
    }

    public static PpsData j(byte[] arr_b, int v, int v1) {
        return NalUnitUtil.k(arr_b, v + 1, v1);
    }

    public static PpsData k(byte[] arr_b, int v, int v1) {
        ParsableNalUnitBitArray parsableNalUnitBitArray0 = new ParsableNalUnitBitArray(arr_b, v, v1);
        int v2 = parsableNalUnitBitArray0.h();
        int v3 = parsableNalUnitBitArray0.h();
        parsableNalUnitBitArray0.k();
        return new PpsData(v2, v3, parsableNalUnitBitArray0.d());
    }

    public static SpsData l(byte[] arr_b, int v, int v1) {
        return NalUnitUtil.m(arr_b, v + 1, v1);
    }

    public static SpsData m(byte[] arr_b, int v, int v1) {
        int v36;
        int v28;
        int v27;
        boolean z1;
        int v14;
        int v10;
        int v9;
        boolean z;
        int v8;
        ParsableNalUnitBitArray parsableNalUnitBitArray0 = new ParsableNalUnitBitArray(arr_b, v, v1);
        int v2 = 8;
        int v3 = parsableNalUnitBitArray0.e(8);
        int v4 = parsableNalUnitBitArray0.e(8);
        int v5 = parsableNalUnitBitArray0.e(8);
        int v6 = parsableNalUnitBitArray0.h();
        int v7 = 1;
        if(v3 == 44 || v3 == 100 || v3 == 110 || v3 == 0x7A || v3 == 0xF4 || (v3 == 83 || v3 == 86) || (v3 == 0x76 || v3 == 0x80 || v3 == 0x8A)) {
            v8 = parsableNalUnitBitArray0.h();
            z = v8 == 3 ? parsableNalUnitBitArray0.d() : false;
            v9 = parsableNalUnitBitArray0.h();
            v10 = parsableNalUnitBitArray0.h();
            parsableNalUnitBitArray0.k();
            if(parsableNalUnitBitArray0.d()) {
                if(v8 == 3) {
                    v2 = 12;
                }
                for(int v11 = 0; v11 < v2; ++v11) {
                    if(parsableNalUnitBitArray0.d()) {
                        NalUnitUtil.p(parsableNalUnitBitArray0, (v11 >= 6 ? 0x40 : 16));
                    }
                }
            }
        }
        else {
            v8 = 1;
            z = false;
            v9 = 0;
            v10 = 0;
        }
        int v12 = parsableNalUnitBitArray0.h();
        int v13 = parsableNalUnitBitArray0.h();
        if(v13 == 0) {
            v14 = parsableNalUnitBitArray0.h() + 4;
            z1 = false;
        }
        else if(v13 == 1) {
            boolean z2 = parsableNalUnitBitArray0.d();
            parsableNalUnitBitArray0.g();
            parsableNalUnitBitArray0.g();
            long v15 = (long)parsableNalUnitBitArray0.h();
            for(int v16 = 0; ((long)v16) < v15; ++v16) {
                parsableNalUnitBitArray0.h();
            }
            z1 = z2;
            v14 = 0;
        }
        else {
            v14 = 0;
            z1 = false;
        }
        int v17 = parsableNalUnitBitArray0.h();
        parsableNalUnitBitArray0.k();
        int v18 = parsableNalUnitBitArray0.h();
        int v19 = parsableNalUnitBitArray0.h();
        int v20 = parsableNalUnitBitArray0.d();
        if(v20 == 0) {
            parsableNalUnitBitArray0.k();
        }
        parsableNalUnitBitArray0.k();
        int v21 = (v18 + 1) * 16;
        int v22 = (2 - v20) * (v19 + 1) * 16;
        if(parsableNalUnitBitArray0.d()) {
            int v23 = parsableNalUnitBitArray0.h();
            int v24 = parsableNalUnitBitArray0.h();
            int v25 = parsableNalUnitBitArray0.h();
            int v26 = parsableNalUnitBitArray0.h();
            if(v8 == 0) {
                v27 = 2 - v20;
                v28 = 1;
            }
            else {
                v28 = v8 == 3 ? 1 : 2;
                v27 = (v8 == 1 ? 2 : 1) * (2 - v20);
            }
            v21 -= (v23 + v24) * v28;
            v22 -= (v25 + v26) * v27;
        }
        int v29 = v3 != 44 && (v3 != 86 && v3 != 100) && (v3 != 110 && v3 != 0x7A && v3 != 0xF4) || (v4 & 16) == 0 ? 16 : 0;
        int v30 = -1;
        float f = 1.0f;
        if(parsableNalUnitBitArray0.d()) {
            if(parsableNalUnitBitArray0.d()) {
                int v31 = parsableNalUnitBitArray0.e(8);
                if(v31 == 0xFF) {
                    int v32 = parsableNalUnitBitArray0.e(16);
                    int v33 = parsableNalUnitBitArray0.e(16);
                    if(v32 != 0 && v33 != 0) {
                        f = ((float)v32) / ((float)v33);
                    }
                }
                else {
                    float[] arr_f = NalUnitUtil.l;
                    if(v31 < arr_f.length) {
                        f = arr_f[v31];
                    }
                    else {
                        Log.n("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + v31);
                    }
                }
            }
            if(parsableNalUnitBitArray0.d()) {
                parsableNalUnitBitArray0.k();
            }
            if(parsableNalUnitBitArray0.d()) {
                parsableNalUnitBitArray0.l(3);
                if(!parsableNalUnitBitArray0.d()) {
                    v7 = 2;
                }
                if(parsableNalUnitBitArray0.d()) {
                    int v34 = parsableNalUnitBitArray0.e(8);
                    int v35 = parsableNalUnitBitArray0.e(8);
                    parsableNalUnitBitArray0.l(8);
                    v30 = ColorInfo.l(v34);
                    v36 = ColorInfo.m(v35);
                }
                else {
                    v36 = -1;
                }
            }
            else {
                v36 = -1;
                v7 = -1;
            }
            if(parsableNalUnitBitArray0.d()) {
                parsableNalUnitBitArray0.h();
                parsableNalUnitBitArray0.h();
            }
            if(parsableNalUnitBitArray0.d()) {
                parsableNalUnitBitArray0.l(65);
            }
            boolean z3 = parsableNalUnitBitArray0.d();
            if(z3) {
                NalUnitUtil.o(parsableNalUnitBitArray0);
            }
            boolean z4 = parsableNalUnitBitArray0.d();
            if(z4) {
                NalUnitUtil.o(parsableNalUnitBitArray0);
            }
            if(z3 || z4) {
                parsableNalUnitBitArray0.k();
            }
            parsableNalUnitBitArray0.k();
            if(parsableNalUnitBitArray0.d()) {
                parsableNalUnitBitArray0.k();
                parsableNalUnitBitArray0.h();
                parsableNalUnitBitArray0.h();
                parsableNalUnitBitArray0.h();
                parsableNalUnitBitArray0.h();
                v29 = parsableNalUnitBitArray0.h();
                parsableNalUnitBitArray0.h();
            }
            return new SpsData(v3, v4, v5, v6, v17, v21, v22, f, v9, v10, z, ((boolean)v20), v12 + 4, v13, v14, z1, v30, v7, v36, v29);
        }
        return new SpsData(v3, v4, v5, v6, v17, v21, v22, 1.0f, v9, v10, z, ((boolean)v20), v12 + 4, v13, v14, z1, -1, -1, -1, v29);
    }

    private static void n(ParsableNalUnitBitArray parsableNalUnitBitArray0) {
        for(int v = 0; v < 4; ++v) {
            for(int v1 = 0; true; v1 += v2) {
                int v2 = 1;
                if(v1 >= 6) {
                    break;
                }
                if(parsableNalUnitBitArray0.d()) {
                    int v3 = Math.min(0x40, 1 << (v << 1) + 4);
                    if(v > 1) {
                        parsableNalUnitBitArray0.g();
                    }
                    for(int v4 = 0; v4 < v3; ++v4) {
                        parsableNalUnitBitArray0.g();
                    }
                }
                else {
                    parsableNalUnitBitArray0.h();
                }
                if(v == 3) {
                    v2 = 3;
                }
            }
        }
    }

    private static void o(ParsableNalUnitBitArray parsableNalUnitBitArray0) {
        int v = parsableNalUnitBitArray0.h();
        parsableNalUnitBitArray0.l(8);
        for(int v1 = 0; v1 < v + 1; ++v1) {
            parsableNalUnitBitArray0.h();
            parsableNalUnitBitArray0.h();
            parsableNalUnitBitArray0.k();
        }
        parsableNalUnitBitArray0.l(20);
    }

    private static void p(ParsableNalUnitBitArray parsableNalUnitBitArray0, int v) {
        int v1 = 8;
        int v2 = 8;
        for(int v3 = 0; v3 < v; ++v3) {
            if(v1 != 0) {
                v1 = (parsableNalUnitBitArray0.g() + v2 + 0x100) % 0x100;
            }
            if(v1 != 0) {
                v2 = v1;
            }
        }
    }

    private static void q(ParsableNalUnitBitArray parsableNalUnitBitArray0) {
        int v = parsableNalUnitBitArray0.h();
        int[] arr_v = new int[0];
        int[] arr_v1 = new int[0];
        int v1 = -1;
        int v2 = -1;
        for(int v3 = 0; v3 < v; ++v3) {
            if(v3 == 0 || !parsableNalUnitBitArray0.d()) {
                int v17 = parsableNalUnitBitArray0.h();
                int v18 = parsableNalUnitBitArray0.h();
                int[] arr_v5 = new int[v17];
                for(int v19 = 0; v19 < v17; ++v19) {
                    arr_v5[v19] = (v19 <= 0 ? 0 : arr_v5[v19 - 1]) - (parsableNalUnitBitArray0.h() + 1);
                    parsableNalUnitBitArray0.k();
                }
                int[] arr_v6 = new int[v18];
                for(int v20 = 0; v20 < v18; ++v20) {
                    arr_v6[v20] = (v20 <= 0 ? 0 : arr_v6[v20 - 1]) + (parsableNalUnitBitArray0.h() + 1);
                    parsableNalUnitBitArray0.k();
                }
                v1 = v17;
                arr_v = arr_v5;
                v2 = v18;
                arr_v1 = arr_v6;
            }
            else {
                int v4 = v1 + v2;
                int v5 = (1 - parsableNalUnitBitArray0.d() * 2) * (parsableNalUnitBitArray0.h() + 1);
                boolean[] arr_z = new boolean[v4 + 1];
                for(int v6 = 0; v6 <= v4; ++v6) {
                    arr_z[v6] = parsableNalUnitBitArray0.d() ? true : parsableNalUnitBitArray0.d();
                }
                int[] arr_v2 = new int[v4 + 1];
                int[] arr_v3 = new int[v4 + 1];
                int v7 = v2 - 1;
                int v8 = 0;
                while(v7 >= 0) {
                    int v9 = arr_v1[v7] + v5;
                    if(v9 < 0 && arr_z[v1 + v7]) {
                        arr_v2[v8] = v9;
                        ++v8;
                    }
                    --v7;
                }
                if(v5 < 0 && arr_z[v4]) {
                    arr_v2[v8] = v5;
                    ++v8;
                }
                for(int v10 = 0; v10 < v1; ++v10) {
                    int v11 = arr_v[v10] + v5;
                    if(v11 < 0 && arr_z[v10]) {
                        arr_v2[v8] = v11;
                        ++v8;
                    }
                }
                int[] arr_v4 = Arrays.copyOf(arr_v2, v8);
                int v12 = v1 - 1;
                int v13 = 0;
                while(v12 >= 0) {
                    int v14 = arr_v[v12] + v5;
                    if(v14 > 0 && arr_z[v12]) {
                        arr_v3[v13] = v14;
                        ++v13;
                    }
                    --v12;
                }
                if(v5 > 0 && arr_z[v4]) {
                    arr_v3[v13] = v5;
                    ++v13;
                }
                for(int v15 = 0; v15 < v2; ++v15) {
                    int v16 = arr_v1[v15] + v5;
                    if(v16 > 0 && arr_z[v1 + v15]) {
                        arr_v3[v13] = v16;
                        ++v13;
                    }
                }
                arr_v1 = Arrays.copyOf(arr_v3, v13);
                arr_v = arr_v4;
                v1 = v8;
                v2 = v13;
            }
        }
    }

    public static int r(byte[] arr_b, int v) {
        Object object0 = NalUnitUtil.p;
        __monitor_enter(object0);
        int v1 = 0;
        int v2 = 0;
        try {
            while(v1 < v) {
                v1 = NalUnitUtil.d(arr_b, v1, v);
                if(v1 < v) {
                    int[] arr_v = NalUnitUtil.q;
                    if(arr_v.length <= v2) {
                        NalUnitUtil.q = Arrays.copyOf(arr_v, arr_v.length * 2);
                    }
                    NalUnitUtil.q[v2] = v1;
                    v1 += 3;
                    ++v2;
                }
            }
            int v4 = v - v2;
            int v6 = 0;
            int v7 = 0;
            for(int v5 = 0; v5 < v2; ++v5) {
                int v8 = NalUnitUtil.q[v5] - v7;
                System.arraycopy(arr_b, v7, arr_b, v6, v8);
                int v9 = v6 + v8;
                arr_b[v9] = 0;
                v6 = v9 + 2;
                arr_b[v9 + 1] = 0;
                v7 += v8 + 3;
            }
            System.arraycopy(arr_b, v7, arr_b, v6, v4 - v6);
            return v4;
        }
        finally {
            __monitor_exit(object0);
        }
    }
}

