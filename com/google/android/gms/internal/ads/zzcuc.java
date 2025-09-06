package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;

public final class zzcuc implements zzcyq, zzdee {
    private final Context zza;
    private final zzfcj zzb;
    private final VersionInfoParcel zzc;
    private final zzg zzd;
    private final zzdua zze;
    private final zzfhk zzf;

    public zzcuc(Context context0, zzfcj zzfcj0, VersionInfoParcel versionInfoParcel0, zzg zzg0, zzdua zzdua0, zzfhk zzfhk0) {
        this.zza = context0;
        this.zzb = zzfcj0;
        this.zzc = versionInfoParcel0;
        this.zzd = zzg0;
        this.zze = zzdua0;
        this.zzf = zzfhk0;
    }

    private final void zzc() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeb)).booleanValue()) {
            zzbzg zzbzg0 = this.zzd.zzg();
            zzv.zza().zzc(this.zza, this.zzc, this.zzb.zzf, zzbzg0, this.zzf);
        }
        this.zze.zzr();
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvk0) {
        this.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfca0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable zzbk zzbk0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzec)).booleanValue()) {
            this.zzc();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String s) {
    }
}

