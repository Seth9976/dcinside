package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

public final class zzgi {
    public static final Uri zza;
    public static final Uri zzb;
    public static final Pattern zzc;
    public static final Pattern zzd;

    static {
        zzgi.zza = Uri.parse("content://com.google.android.gsf.gservices");
        zzgi.zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        zzgi.zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        zzgi.zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}

