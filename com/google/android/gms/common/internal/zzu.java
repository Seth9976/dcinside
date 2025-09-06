package com.google.android.gms.common.internal;

import android.net.Uri;

public final class zzu {
    public static final int zza;
    private static final Uri zzb;
    private static final Uri zzc;

    static {
        Uri uri0 = Uri.parse("https://plus.google.com/");
        zzu.zzb = uri0;
        zzu.zzc = uri0.buildUpon().appendPath("circles").appendPath("find").build();
    }
}

