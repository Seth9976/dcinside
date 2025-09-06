package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

public final class zzcva {
    private Context zza;
    private zzfcj zzb;
    private Bundle zzc;
    @Nullable
    private zzfcb zzd;
    @Nullable
    private zzcut zze;
    @Nullable
    private zzedb zzf;
    private int zzg;

    public zzcva() {
        this.zzg = 0;
    }

    public final zzcva zze(@Nullable zzedb zzedb0) {
        this.zzf = zzedb0;
        return this;
    }

    public final zzcva zzf(Context context0) {
        this.zza = context0;
        return this;
    }

    public final zzcva zzg(Bundle bundle0) {
        this.zzc = bundle0;
        return this;
    }

    public final zzcva zzh(@Nullable zzcut zzcut0) {
        this.zze = zzcut0;
        return this;
    }

    public final zzcva zzi(int v) {
        this.zzg = v;
        return this;
    }

    public final zzcva zzj(zzfcb zzfcb0) {
        this.zzd = zzfcb0;
        return this;
    }

    public final zzcva zzk(zzfcj zzfcj0) {
        this.zzb = zzfcj0;
        return this;
    }

    public final zzcvc zzl() {
        return new zzcvc(this, null);
    }
}

