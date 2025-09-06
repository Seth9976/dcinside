package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzcho implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcho(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    @Nullable
    public final Object zzb() {
        Context context0 = ((zzche)this.zza).zza();
        ApplicationInfo applicationInfo0 = (ApplicationInfo)this.zzb.zzb();
        try {
            return Wrappers.packageManager(context0).getPackageInfo(applicationInfo0.packageName, 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }
}

