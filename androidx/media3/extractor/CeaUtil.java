package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class CeaUtil {
    private static final String a = "CeaUtil";
    public static final int b = 1195456820;
    public static final int c = 3;
    private static final int d = 4;
    private static final int e = 0xB5;
    private static final int f = 49;
    private static final int g = 0x2F;

    public static void a(long v, ParsableByteArray parsableByteArray0, TrackOutput[] arr_trackOutput) {
        int v9;
        while(parsableByteArray0.a() > 1) {
            int v1 = CeaUtil.c(parsableByteArray0);
            int v2 = CeaUtil.c(parsableByteArray0);
            int v3 = parsableByteArray0.f() + v2;
            if(v2 == -1 || v2 > parsableByteArray0.a()) {
                Log.n("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                v3 = parsableByteArray0.g();
            }
            else if(v1 == 4 && v2 >= 8) {
                int v4 = parsableByteArray0.L();
                int v5 = parsableByteArray0.R();
                int v6 = v5 == 49 ? parsableByteArray0.s() : 0;
                int v7 = parsableByteArray0.L();
                if(v5 == 0x2F) {
                    parsableByteArray0.Z(1);
                }
                int v8 = v4 != 0xB5 || v5 != 0x2F && v5 != 49 || v7 != 3 ? 0 : 1;
                if(v5 == 49) {
                    if(v6 != 1195456820) {
                        v9 = 0;
                    }
                    v8 &= v9;
                }
                if(v8 != 0) {
                    CeaUtil.b(v, parsableByteArray0, arr_trackOutput);
                }
            }
            v9 = 1;
            parsableByteArray0.Y(v3);
        }
    }

    public static void b(long v, ParsableByteArray parsableByteArray0, TrackOutput[] arr_trackOutput) {
        int v1 = parsableByteArray0.L();
        if((v1 & 0x40) != 0) {
            parsableByteArray0.Z(1);
            int v2 = (v1 & 0x1F) * 3;
            int v3 = parsableByteArray0.f();
            for(int v4 = 0; v4 < arr_trackOutput.length; ++v4) {
                TrackOutput trackOutput0 = arr_trackOutput[v4];
                parsableByteArray0.Y(v3);
                trackOutput0.b(parsableByteArray0, v2);
                Assertions.i(v != 0x8000000000000001L);
                trackOutput0.f(v, 1, v2, 0, null);
            }
        }
    }

    private static int c(ParsableByteArray parsableByteArray0) {
        int v = 0;
        do {
            if(parsableByteArray0.a() == 0) {
                return -1;
            }
            int v1 = parsableByteArray0.L();
            v += v1;
        }
        while(v1 == 0xFF);
        return v;
    }
}

