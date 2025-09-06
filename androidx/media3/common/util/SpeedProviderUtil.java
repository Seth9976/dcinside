package androidx.media3.common.util;

import androidx.media3.common.audio.SpeedProvider;

@UnstableApi
public class SpeedProviderUtil {
    public static long a(SpeedProvider speedProvider0, long v) {
        double f = 0.0;
        for(long v1 = 0L; v1 < v; v1 = v2) {
            long v2 = speedProvider0.a(v1);
            if(v2 == 0x8000000000000001L) {
                v2 = 0x7FFFFFFFFFFFFFFFL;
            }
            f += ((double)(Math.min(v2, v) - v1)) / ((double)speedProvider0.b(v1));
        }
        return Math.round(f);
    }
}

