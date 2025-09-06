package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil.SpsData;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public final class AvcConfig {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    @Nullable
    public final String l;

    private AvcConfig(List list0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, float f, @Nullable String s) {
        this.a = list0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = v6;
        this.i = v7;
        this.j = v8;
        this.k = f;
        this.l = s;
    }

    private static byte[] a(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.R();
        parsableByteArray0.Z(v);
        return CodecSpecificDataUtil.d(parsableByteArray0.e(), parsableByteArray0.f(), v);
    }

    public static AvcConfig b(ParsableByteArray parsableByteArray0) throws ParserException {
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        int v7;
        float f;
        int v6;
        int v5;
        String s;
        try {
            parsableByteArray0.Z(4);
            int v = (parsableByteArray0.L() & 3) + 1;
            if(v == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList0 = new ArrayList();
            int v1 = parsableByteArray0.L();
            for(int v2 = 0; v2 < (v1 & 0x1F); ++v2) {
                arrayList0.add(AvcConfig.a(parsableByteArray0));
            }
            int v3 = parsableByteArray0.L();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList0.add(AvcConfig.a(parsableByteArray0));
            }
            if((v1 & 0x1F) > 0) {
                byte[] arr_b = (byte[])arrayList0.get(0);
                SpsData nalUnitUtil$SpsData0 = NalUnitUtil.l(((byte[])arrayList0.get(0)), v, arr_b.length);
                s = CodecSpecificDataUtil.a(nalUnitUtil$SpsData0.a, nalUnitUtil$SpsData0.b, nalUnitUtil$SpsData0.c);
                v5 = nalUnitUtil$SpsData0.s;
                v6 = nalUnitUtil$SpsData0.t;
                f = nalUnitUtil$SpsData0.h;
                v7 = nalUnitUtil$SpsData0.j + 8;
                v8 = nalUnitUtil$SpsData0.q;
                v9 = nalUnitUtil$SpsData0.r;
                v10 = nalUnitUtil$SpsData0.f;
                v11 = nalUnitUtil$SpsData0.g;
                v12 = nalUnitUtil$SpsData0.i + 8;
            }
            else {
                s = null;
                v10 = -1;
                v11 = -1;
                v12 = -1;
                v7 = -1;
                v8 = -1;
                v9 = -1;
                v5 = -1;
                v6 = 16;
                f = 1.0f;
            }
            return new AvcConfig(arrayList0, v, v10, v11, v12, v7, v8, v9, v5, v6, f, s);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
        }
        throw ParserException.a("Error parsing AVC config", arrayIndexOutOfBoundsException0);
    }
}

