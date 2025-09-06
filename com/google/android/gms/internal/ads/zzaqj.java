package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public final class zzaqj {
    public static long zza(String s) {
        try {
            return zzaqj.zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(s).getTime();
        }
        catch(ParseException parseException0) {
            if(!"0".equals(s) && !"-1".equals(s)) {
                zzapy.zzc(parseException0, "Unable to parse dateStr: %s, falling back to 0", new Object[]{s});
                return 0L;
            }
            zzapy.zzd("Unable to parse dateStr: %s, falling back to 0", new Object[]{s});
            return 0L;
        }
    }

    @Nullable
    public static zzaov zzb(zzapi zzapi0) {
        long v8;
        long v4;
        long v3;
        boolean z;
        long v = System.currentTimeMillis();
        Map map0 = zzapi0.zzc;
        if(map0 != null) {
            String s = (String)map0.get("Date");
            long v1 = s == null ? 0L : zzaqj.zza(s);
            String s1 = (String)map0.get("Cache-Control");
            int v2 = 0;
            if(s1 == null) {
                z = false;
                v3 = 0L;
                v4 = 0L;
            }
            else {
                String[] arr_s = s1.split(",", 0);
                z = false;
                v3 = 0L;
                v4 = 0L;
                while(v2 < arr_s.length) {
                    String s2 = arr_s[v2].trim();
                    if(s2.equals("no-cache") || s2.equals("no-store")) {
                        return null;
                    }
                    if(s2.startsWith("max-age=")) {
                        try {
                            v4 = Long.parseLong(s2.substring(8));
                            goto label_23;
                        label_18:
                            if(s2.startsWith("stale-while-revalidate=")) {
                                v3 = Long.parseLong(s2.substring(23));
                            }
                            else if(s2.equals("must-revalidate") || s2.equals("proxy-revalidate")) {
                                z = true;
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                    else {
                        goto label_18;
                    }
                label_23:
                    ++v2;
                }
                v2 = 1;
            }
            String s3 = (String)map0.get("Expires");
            long v5 = s3 == null ? 0L : zzaqj.zza(s3);
            String s4 = (String)map0.get("Last-Modified");
            long v6 = s4 == null ? 0L : zzaqj.zza(s4);
            long v7 = 0L;
            String s5 = (String)map0.get("ETag");
            if(v2 != 0) {
                v8 = v + v4 * 1000L;
                v7 = z ? v8 : v3 * 1000L + v8;
            }
            else if(v1 <= 0L || v5 < v1) {
                v8 = 0L;
            }
            else {
                v8 = v + (v5 - v1);
                v7 = v8;
            }
            zzaov zzaov0 = new zzaov();
            zzaov0.zza = zzapi0.zzb;
            zzaov0.zzb = s5;
            zzaov0.zzf = v8;
            zzaov0.zze = v7;
            zzaov0.zzc = v1;
            zzaov0.zzd = v6;
            zzaov0.zzg = map0;
            zzaov0.zzh = zzapi0.zzd;
            return zzaov0;
        }
        return null;
    }

    static String zzc(long v) {
        return zzaqj.zzd("EEE, dd MMM yyyy HH:mm:ss \'GMT\'").format(new Date(v));
    }

    private static SimpleDateFormat zzd(String s) {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s, Locale.US);
        simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat0;
    }
}

