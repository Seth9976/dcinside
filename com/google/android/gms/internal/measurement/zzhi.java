package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.common.base.C;

public final class zzhi {
    private static volatile C zza;
    private static final Object zzb;

    static {
        zzhi.zza = C.a();
        zzhi.zzb = new Object();
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
        if(zzhi.zza.e()) {
            return ((Boolean)zzhi.zza.d()).booleanValue();
        }
        synchronized(zzhi.zzb) {
            if(zzhi.zza.e()) {
                return ((Boolean)zzhi.zza.d()).booleanValue();
            }
            ProviderInfo providerInfo0 = context0.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", (Build.VERSION.SDK_INT >= 29 ? 0x10000000 : 0));
            if(providerInfo0 != null && "com.google.android.gms".equals(providerInfo0.packageName) && zzhi.zza(context0)) {
                z = true;
            }
            zzhi.zza = C.f(Boolean.valueOf(z));
        }
        return ((Boolean)zzhi.zza.d()).booleanValue();
    }
}

