package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.Objects;
import java.io.IOException;

final class zztm implements zzrb, zzur {
    final zzto zza;
    private final Object zzb;
    private zzuq zzc;
    private zzra zzd;

    public zztm(zzto zzto0, Object object0) {
        this.zza = zzto0;
        super();
        this.zzc = zzto0.zze(null);
        this.zzd = zzto0.zzc(null);
        this.zzb = object0;
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzaf(int v, @Nullable zzug zzug0, zzuc zzuc0) {
        if(this.zzg(0, zzug0)) {
            this.zzc.zzd(this.zzf(zzuc0, zzug0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzag(int v, @Nullable zzug zzug0, zztx zztx0, zzuc zzuc0) {
        if(this.zzg(0, zzug0)) {
            this.zzc.zze(zztx0, this.zzf(zzuc0, zzug0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzah(int v, @Nullable zzug zzug0, zztx zztx0, zzuc zzuc0) {
        if(this.zzg(0, zzug0)) {
            this.zzc.zzf(zztx0, this.zzf(zzuc0, zzug0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzai(int v, @Nullable zzug zzug0, zztx zztx0, zzuc zzuc0, IOException iOException0, boolean z) {
        if(this.zzg(0, zzug0)) {
            this.zzc.zzg(zztx0, this.zzf(zzuc0, zzug0), iOException0, z);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzaj(int v, @Nullable zzug zzug0, zztx zztx0, zzuc zzuc0) {
        if(this.zzg(0, zzug0)) {
            this.zzc.zzh(zztx0, this.zzf(zzuc0, zzug0));
        }
    }

    private final zzuc zzf(zzuc zzuc0, @Nullable zzug zzug0) {
        this.zza.zzx(this.zzb, zzuc0.zzc, zzug0);
        this.zza.zzx(this.zzb, zzuc0.zzd, zzug0);
        return zzuc0;
    }

    private final boolean zzg(int v, @Nullable zzug zzug0) {
        zzug zzug1;
        if(zzug0 == null) {
            zzug1 = null;
        }
        else {
            zzug1 = this.zza.zzy(this.zzb, zzug0);
            if(zzug1 == null) {
                return false;
            }
        }
        this.zza.zzw(this.zzb, 0);
        if(!Objects.equals(this.zzc.zzb, zzug1)) {
            this.zzc = this.zza.zzf(0, zzug1);
        }
        if(!Objects.equals(this.zzd.zzb, zzug1)) {
            this.zzd = this.zza.zzd(0, zzug1);
        }
        return true;
    }
}

