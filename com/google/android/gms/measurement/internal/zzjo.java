package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdw;

@VisibleForTesting
public final class zzjo {
    final Context zza;
    @Nullable
    String zzb;
    @Nullable
    String zzc;
    @Nullable
    String zzd;
    @Nullable
    Boolean zze;
    long zzf;
    @Nullable
    zzdw zzg;
    boolean zzh;
    @Nullable
    Long zzi;
    @Nullable
    String zzj;

    @VisibleForTesting
    public zzjo(Context context0, @Nullable zzdw zzdw0, @Nullable Long long0) {
        this.zzh = true;
        Preconditions.checkNotNull(context0);
        Context context1 = context0.getApplicationContext();
        Preconditions.checkNotNull(context1);
        this.zza = context1;
        this.zzi = long0;
        if(zzdw0 != null) {
            this.zzg = zzdw0;
            this.zzb = zzdw0.zzf;
            this.zzc = zzdw0.zze;
            this.zzd = zzdw0.zzd;
            this.zzh = zzdw0.zzc;
            this.zzf = zzdw0.zzb;
            this.zzj = zzdw0.zzh;
            Bundle bundle0 = zzdw0.zzg;
            if(bundle0 != null) {
                this.zze = Boolean.valueOf(bundle0.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

