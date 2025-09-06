package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class DolbyVisionConfig {
    public final int a;
    public final int b;
    public final String c;

    private DolbyVisionConfig(int v, int v1, String s) {
        this.a = v;
        this.b = v1;
        this.c = s;
    }

    @Nullable
    public static DolbyVisionConfig a(ParsableByteArray parsableByteArray0) {
        String s;
        parsableByteArray0.Z(2);
        int v = parsableByteArray0.L();
        int v1 = parsableByteArray0.L() >> 3 & 0x1F | (v & 1) << 5;
        if(v >> 1 == 4 || v >> 1 == 5) {
            s = "dvhe";
        }
        else {
            switch(v >> 1) {
                case 7: {
                    s = "dvhe";
                    break;
                }
                case 8: {
                    s = "hev1";
                    break;
                }
                case 9: {
                    s = "avc3";
                    break;
                }
                default: {
                    return null;
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        String s1 = ".0";
        stringBuilder0.append(".0");
        stringBuilder0.append(v >> 1);
        if(v1 >= 10) {
            s1 = ".";
        }
        stringBuilder0.append(s1);
        stringBuilder0.append(v1);
        return new DolbyVisionConfig(v >> 1, v1, stringBuilder0.toString());
    }
}

