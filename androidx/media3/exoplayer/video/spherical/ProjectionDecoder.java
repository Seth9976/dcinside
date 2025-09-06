package androidx.media3.exoplayer.video.spherical;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.zip.Inflater;

final class ProjectionDecoder {
    private static final int a = 0x79746D70;
    private static final int b = 0x6D736870;
    private static final int c = 0x72617720;
    private static final int d = 0x64666C38;
    private static final int e = 0x6D657368;
    private static final int f = 0x70726F6A;
    private static final int g = 10000;
    private static final int h = 32000;
    private static final int i = 0x1F400;

    @Nullable
    public static Projection a(byte[] arr_b, int v) {
        ArrayList arrayList0;
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(arr_b);
        try {
            arrayList0 = ProjectionDecoder.c(parsableByteArray0) ? ProjectionDecoder.f(parsableByteArray0) : ProjectionDecoder.e(parsableByteArray0);
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            arrayList0 = null;
        }
        if(arrayList0 == null) {
            return null;
        }
        switch(arrayList0.size()) {
            case 1: {
                return new Projection(((Mesh)arrayList0.get(0)), v);
            }
            case 2: {
                return new Projection(((Mesh)arrayList0.get(0)), ((Mesh)arrayList0.get(1)), v);
            }
            default: {
                return null;
            }
        }
    }

    private static int b(int v) {
        return -(v & 1) ^ v >> 1;
    }

    private static boolean c(ParsableByteArray parsableByteArray0) {
        parsableByteArray0.Z(4);
        int v = parsableByteArray0.s();
        parsableByteArray0.Y(0);
        return v == 0x70726F6A;
    }

    @Nullable
    private static Mesh d(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.s();
        if(v > 10000) {
            return null;
        }
        float[] arr_f = new float[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_f[v1] = parsableByteArray0.r();
        }
        int v2 = parsableByteArray0.s();
        if(v2 > 32000) {
            return null;
        }
        int v3 = (int)Math.ceil(Math.log(((double)v) * 2.0) / 0.693147);
        ParsableBitArray parsableBitArray0 = new ParsableBitArray(parsableByteArray0.e());
        parsableBitArray0.q(parsableByteArray0.f() * 8);
        float[] arr_f1 = new float[v2 * 5];
        int[] arr_v = new int[5];
        int v4 = 0;
        int v5 = 0;
        while(v4 < v2) {
            int v6 = 0;
            while(v6 < 5) {
                int v7 = arr_v[v6] + ProjectionDecoder.b(parsableBitArray0.h(v3));
                if(v7 < v && v7 >= 0) {
                    arr_f1[v5] = arr_f[v7];
                    arr_v[v6] = v7;
                    ++v6;
                    ++v5;
                    continue;
                }
                return null;
            }
            ++v4;
        }
        parsableBitArray0.q(parsableBitArray0.e() + 7 & -8);
        int v8 = parsableBitArray0.h(0x20);
        SubMesh[] arr_projection$SubMesh = new SubMesh[v8];
        int v9 = 0;
        while(v9 < v8) {
            int v10 = parsableBitArray0.h(8);
            int v11 = parsableBitArray0.h(8);
            int v12 = parsableBitArray0.h(0x20);
            if(v12 > 0x1F400) {
                return null;
            }
            int v13 = (int)Math.ceil(Math.log(((double)v2) * 2.0) / 0.693147);
            float[] arr_f2 = new float[v12 * 3];
            float[] arr_f3 = new float[v12 * 2];
            int v14 = 0;
            int v15 = 0;
            while(v14 < v12) {
                v15 += ProjectionDecoder.b(parsableBitArray0.h(v13));
                if(v15 >= 0 && v15 < v2) {
                    arr_f2[v14 * 3] = arr_f1[v15 * 5];
                    arr_f2[v14 * 3 + 1] = arr_f1[v15 * 5 + 1];
                    arr_f2[v14 * 3 + 2] = arr_f1[v15 * 5 + 2];
                    arr_f3[v14 * 2] = arr_f1[v15 * 5 + 3];
                    arr_f3[v14 * 2 + 1] = arr_f1[v15 * 5 + 4];
                    ++v14;
                    continue;
                }
                return null;
            }
            arr_projection$SubMesh[v9] = new SubMesh(v10, arr_f2, arr_f3, v11);
            ++v9;
        }
        return new Mesh(arr_projection$SubMesh);
    }

    @Nullable
    private static ArrayList e(ParsableByteArray parsableByteArray0) {
        if(parsableByteArray0.L() != 0) {
            return null;
        }
        parsableByteArray0.Z(7);
        int v = parsableByteArray0.s();
        if(v == 0x64666C38) {
            ParsableByteArray parsableByteArray1 = new ParsableByteArray();
            Inflater inflater0 = new Inflater(true);
            try {
                if(!Util.Z0(parsableByteArray0, parsableByteArray1, inflater0)) {
                    return null;
                }
            }
            finally {
                inflater0.end();
            }
            return ProjectionDecoder.g(parsableByteArray1);
        }
        return v == 0x72617720 ? ProjectionDecoder.g(parsableByteArray0) : null;
    }

    @Nullable
    private static ArrayList f(ParsableByteArray parsableByteArray0) {
        parsableByteArray0.Z(8);
        int v = parsableByteArray0.f();
        int v1 = parsableByteArray0.g();
        while(v < v1) {
            int v2 = parsableByteArray0.s() + v;
            if(v2 <= v || v2 > v1) {
                break;
            }
            switch(parsableByteArray0.s()) {
                case 0x6D736870: 
                case 0x79746D70: {
                    parsableByteArray0.X(v2);
                    return ProjectionDecoder.e(parsableByteArray0);
                }
            }
            parsableByteArray0.Y(v2);
            v = v2;
        }
        return null;
    }

    @Nullable
    private static ArrayList g(ParsableByteArray parsableByteArray0) {
        ArrayList arrayList0 = new ArrayList();
        int v = parsableByteArray0.f();
        int v1 = parsableByteArray0.g();
        while(v < v1) {
            int v2 = parsableByteArray0.s() + v;
            if(v2 > v && v2 <= v1) {
                if(parsableByteArray0.s() == 0x6D657368) {
                    Mesh projection$Mesh0 = ProjectionDecoder.d(parsableByteArray0);
                    if(projection$Mesh0 == null) {
                        return null;
                    }
                    arrayList0.add(projection$Mesh0);
                }
                parsableByteArray0.Y(v2);
                v = v2;
                continue;
            }
            return null;
        }
        return arrayList0;
    }
}

