package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;

@UnstableApi
public final class SmtaAtomUtil {
    private static final int a = -1;
    private static final int b = 0;
    private static final int c = 7;
    private static final int d = 9;
    private static final int e = 12;
    private static final int f = 13;
    private static final int g = 21;
    private static final int h = 22;
    private static final int i = 23;

    private static int a(int v, ParsableByteArray parsableByteArray0, int v1) {
        switch(v) {
            case 12: {
                return 0xF0;
            }
            case 13: {
                return 120;
            }
            case 21: {
                return parsableByteArray0.a() < 8 || parsableByteArray0.f() + 8 > v1 || (parsableByteArray0.s() < 12 || parsableByteArray0.s() != 1936877170) ? 0x80000001 : parsableByteArray0.M();
            }
            default: {
                return 0x80000001;
            }
        }
    }

    @Nullable
    public static Metadata b(ParsableByteArray parsableByteArray0, int v) {
        parsableByteArray0.Z(12);
        while(parsableByteArray0.f() < v) {
            int v1 = parsableByteArray0.f();
            int v2 = parsableByteArray0.s();
            if(parsableByteArray0.s() == 1935766900) {
                if(v2 < 16) {
                    return null;
                }
                parsableByteArray0.Z(4);
                int v3 = -1;
                int v4 = 0;
                for(int v5 = 0; v5 < 2; ++v5) {
                    int v6 = parsableByteArray0.L();
                    int v7 = parsableByteArray0.L();
                    if(v6 == 0) {
                        v3 = v7;
                    }
                    else if(v6 == 1) {
                        v4 = v7;
                    }
                }
                int v8 = SmtaAtomUtil.a(v3, parsableByteArray0, v);
                return v8 == 0x80000001 ? null : new Metadata(new Entry[]{new SmtaMetadataEntry(((float)v8), v4)});
            }
            parsableByteArray0.Y(v1 + v2);
        }
        return null;
    }
}

