package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

public final class zzbg {
    private static volatile zzcy zza;
    private static final Object zzb;

    static {
        zzbg.zza = zzcy.zzc();
        zzbg.zzb = new Object();
    }

    private static boolean zza(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            if((packageManager0.getApplicationInfo("com.google.android.gms", 0).flags & 0x81) != 0) {
                return true;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    public static boolean zza(Context context0, Uri uri0) {
        String s = uri0.getAuthority();
        boolean z = false;
        if(!"com.google.android.gms.phenotype".equals(s)) {
            Log.e("PhenotypeClientHelper", s + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if(zzbg.zza.zza()) {
            return ((Boolean)zzbg.zza.zzb()).booleanValue();
        }
        synchronized(zzbg.zzb) {
            if(zzbg.zza.zza()) {
                return ((Boolean)zzbg.zza.zzb()).booleanValue();
            }
            ProviderInfo providerInfo0 = context0.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
            if(providerInfo0 != null && "com.google.android.gms".equals(providerInfo0.packageName) && zzbg.zza(context0)) {
                z = true;
            }
            zzbg.zza = zzcy.zza(Boolean.valueOf(z));
        }
        return ((Boolean)zzbg.zza.zzb()).booleanValue();
    }
}

