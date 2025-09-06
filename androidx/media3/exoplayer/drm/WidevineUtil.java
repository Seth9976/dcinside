package androidx.media3.exoplayer.drm;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Map;

@UnstableApi
public final class WidevineUtil {
    public static final String a = "LicenseDurationRemaining";
    public static final String b = "PlaybackDurationRemaining";

    private static long a(Map map0, String s) {
        if(map0 != null) {
            try {
                String s1 = (String)map0.get(s);
                return s1 == null ? 0x8000000000000001L : Long.parseLong(s1);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return 0x8000000000000001L;
    }

    @Nullable
    public static Pair b(DrmSession drmSession0) {
        Map map0 = drmSession0.c();
        return map0 == null ? null : new Pair(WidevineUtil.a(map0, "LicenseDurationRemaining"), WidevineUtil.a(map0, "PlaybackDurationRemaining"));
    }
}

