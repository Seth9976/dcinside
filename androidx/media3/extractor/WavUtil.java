package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class WavUtil {
    public static final int a = 1380533830;
    public static final int b = 0x57415645;
    public static final int c = 0x666D7420;
    public static final int d = 1684108385;
    public static final int e = 1380333108;
    public static final int f = 0x64733634;
    public static final int g = 1;
    public static final int h = 3;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 17;
    public static final int l = 0xFFFE;

    public static int a(int v, int v1) {
        if(v != 1) {
            switch(v) {
                case 3: {
                    return v1 == 0x20 ? 4 : 0;
                }
                case 0xFFFE: {
                    break;
                }
                default: {
                    return 0;
                }
            }
        }
        return Util.z0(v1);
    }

    public static int b(int v) {
        switch(v) {
            case 4: {
                return 3;
            }
            case 2: 
            case 3: 
            case 21: 
            case 22: {
                return 1;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }
}

