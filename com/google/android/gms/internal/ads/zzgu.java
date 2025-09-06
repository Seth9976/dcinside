package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzgu {
    private static final Pattern zza;
    private static final Pattern zzb;

    static {
        zzgu.zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
        zzgu.zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
    }

    public static long zza(@Nullable String s, @Nullable String s1) {
        long v = -1L;
        if(!TextUtils.isEmpty(s)) {
            try {
                v = Long.parseLong(s);
            }
            catch(NumberFormatException unused_ex) {
                zzdo.zzc("HttpUtil", "Unexpected Content-Length [" + s + "]");
            }
        }
        if(!TextUtils.isEmpty(s1)) {
            Matcher matcher0 = zzgu.zza.matcher(s1);
            if(matcher0.matches()) {
                try {
                    String s2 = matcher0.group(2);
                    if(s2 == null) {
                        throw null;
                    }
                    long v1 = Long.parseLong(s2);
                    String s3 = matcher0.group(1);
                    if(s3 == null) {
                        throw null;
                    }
                    long v2 = v1 - Long.parseLong(s3) + 1L;
                    if(Long.compare(v, 0L) < 0) {
                        return v2;
                    }
                    if(v != v2) {
                        zzdo.zzf("HttpUtil", "Inconsistent headers [" + s + "] [" + s1 + "]");
                        return Math.max(v, v2);
                    }
                }
                catch(NumberFormatException unused_ex) {
                    zzdo.zzc("HttpUtil", "Unexpected Content-Range [" + s1 + "]");
                }
            }
        }
        return v;
    }

    public static long zzb(@Nullable String s) {
        if(!TextUtils.isEmpty(s)) {
            Matcher matcher0 = zzgu.zzb.matcher(s);
            if(matcher0.matches()) {
                String s1 = matcher0.group(1);
                s1.getClass();
                return Long.parseLong(s1);
            }
        }
        return -1L;
    }
}

