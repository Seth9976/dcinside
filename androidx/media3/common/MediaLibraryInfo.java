package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import java.util.HashSet;

@UnstableApi
public final class MediaLibraryInfo {
    public static final String a = "AndroidXMedia3";
    public static final String b = "1.4.1";
    public static final String c = "AndroidXMedia3/1.4.1";
    public static final int d = 1004001300;
    public static final boolean e = true;
    public static final boolean f = true;
    private static final HashSet g;
    private static String h;

    static {
        MediaLibraryInfo.g = new HashSet();
        MediaLibraryInfo.h = "media3.common";
    }

    public static void a(String s) {
        synchronized(MediaLibraryInfo.class) {
            if(MediaLibraryInfo.g.add(s)) {
                MediaLibraryInfo.h = "media3.common, " + s;
            }
        }
    }

    public static String b() [...] // 潜在的解密器
}

