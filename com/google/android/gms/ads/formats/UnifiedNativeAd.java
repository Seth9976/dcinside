package com.google.android.gms.ads.formats;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

@Deprecated
public abstract class UnifiedNativeAd {
    @KeepForSdk
    public abstract void performClick(@NonNull Bundle arg1);

    @KeepForSdk
    public abstract boolean recordImpression(@NonNull Bundle arg1);

    @KeepForSdk
    public abstract void reportTouchEvent(@NonNull Bundle arg1);

    @NonNull
    @Deprecated
    public abstract VideoController zza();

    @NonNull
    public abstract Image zzb();

    @NonNull
    public abstract Double zzc();

    @NonNull
    public abstract Object zzd();

    @NonNull
    public abstract String zze();

    @NonNull
    public abstract String zzf();

    @NonNull
    public abstract String zzg();

    @NonNull
    public abstract String zzh();

    @NonNull
    public abstract String zzi();

    @NonNull
    public abstract String zzj();

    @NonNull
    public abstract List zzk();
}

