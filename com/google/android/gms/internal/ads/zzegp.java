package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;

final class zzegp {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    @Nullable
    final Integer zze;

    zzegp(String s, String s1, int v, long v1, @Nullable Integer integer0) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        this.zzd = v1;
        this.zze = integer0;
    }

    @Override
    public final String toString() {
        String s = this.zza + "." + this.zzc + "." + this.zzd;
        s = TextUtils.isEmpty(this.zzb) ? this.zza + "." + this.zzc + "." + this.zzd : s + "." + this.zzb;
        return !((Boolean)zzbe.zzc().zza(zzbcl.zzbK)).booleanValue() || this.zze == null || TextUtils.isEmpty(this.zzb) ? s : s + "." + this.zze;
    }
}

