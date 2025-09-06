package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil.H265SpsData;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

@UnstableApi
public final class HevcConfig {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final int k;
    @Nullable
    public final String l;
    private static final int m = 33;

    private HevcConfig(List list0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, float f, int v8, @Nullable String s) {
        this.a = list0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = v6;
        this.i = v7;
        this.j = f;
        this.k = v8;
        this.l = s;
    }

    public static HevcConfig a(ParsableByteArray parsableByteArray0) throws ParserException {
        int v24;
        int v23;
        try {
            parsableByteArray0.Z(21);
            int v = parsableByteArray0.L();
            int v1 = parsableByteArray0.L();
            int v2 = parsableByteArray0.f();
            int v4 = 0;
            for(int v3 = 0; v3 < v1; ++v3) {
                parsableByteArray0.Z(1);
                int v5 = parsableByteArray0.R();
                for(int v6 = 0; v6 < v5; ++v6) {
                    int v7 = parsableByteArray0.R();
                    v4 += v7 + 4;
                    parsableByteArray0.Z(v7);
                }
            }
            parsableByteArray0.Y(v2);
            byte[] arr_b = new byte[v4];
            String s = null;
            int v9 = 0;
            int v10 = -1;
            int v11 = -1;
            int v12 = -1;
            int v13 = -1;
            int v14 = -1;
            int v15 = -1;
            int v16 = -1;
            float f = 1.0f;
            int v17 = -1;
            for(int v8 = 0; v8 < v1; ++v8) {
                int v18 = parsableByteArray0.L() & 0x3F;
                int v19 = parsableByteArray0.R();
                int v20 = 0;
                while(v20 < v19) {
                    int v21 = parsableByteArray0.R();
                    System.arraycopy(NalUnitUtil.j, 0, arr_b, v9, NalUnitUtil.j.length);
                    int v22 = v9 + NalUnitUtil.j.length;
                    System.arraycopy(parsableByteArray0.e(), parsableByteArray0.f(), arr_b, v22, v21);
                    if(v18 != 33 || v20 != 0) {
                        v23 = v18;
                        v24 = v19;
                    }
                    else {
                        H265SpsData nalUnitUtil$H265SpsData0 = NalUnitUtil.h(arr_b, v22, v22 + v21);
                        v11 = nalUnitUtil$H265SpsData0.l;
                        v12 = nalUnitUtil$H265SpsData0.f + 8;
                        v13 = nalUnitUtil$H265SpsData0.g + 8;
                        v23 = 33;
                        v24 = v19;
                        String s1 = CodecSpecificDataUtil.c(nalUnitUtil$H265SpsData0.a, nalUnitUtil$H265SpsData0.b, nalUnitUtil$H265SpsData0.c, nalUnitUtil$H265SpsData0.d, nalUnitUtil$H265SpsData0.h, nalUnitUtil$H265SpsData0.i);
                        v10 = nalUnitUtil$H265SpsData0.k;
                        s = s1;
                        v15 = nalUnitUtil$H265SpsData0.p;
                        v14 = nalUnitUtil$H265SpsData0.o;
                        v17 = nalUnitUtil$H265SpsData0.n;
                        f = nalUnitUtil$H265SpsData0.m;
                        v16 = nalUnitUtil$H265SpsData0.q;
                    }
                    v9 = v22 + v21;
                    parsableByteArray0.Z(v21);
                    ++v20;
                    v18 = v23;
                    v19 = v24;
                }
            }
            return new HevcConfig((v4 == 0 ? Collections.emptyList() : Collections.singletonList(arr_b)), (v & 3) + 1, v10, v11, v12, v13, v14, v15, v16, f, v17, s);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
        }
        throw ParserException.a("Error parsing HEVC config", arrayIndexOutOfBoundsException0);
    }
}

