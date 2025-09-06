package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzs {
    public static Context zza(Context context0) throws zzr {
        return zzs.zzc(context0).getModuleContext();
    }

    public static Object zzb(Context context0, String s, zzq zzq0) throws zzr {
        try {
            return zzq0.zza(zzs.zzc(context0).instantiate(s));
        }
        catch(Exception exception0) {
            throw new zzr(exception0);
        }
    }

    private static DynamiteModule zzc(Context context0) throws zzr {
        try {
            return DynamiteModule.load(context0, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite");
        }
        catch(Exception exception0) {
            throw new zzr(exception0);
        }
    }
}

