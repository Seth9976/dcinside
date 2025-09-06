package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import w4.d;

class zzja implements zzjc {
    protected final zzhy zzu;

    zzja(zzhy zzhy0) {
        Preconditions.checkNotNull(zzhy0);
        this.zzu = zzhy0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    @d
    public Context zza() {
        return this.zzu.zza();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    @d
    public Clock zzb() {
        return this.zzu.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    @d
    public zzab zzd() {
        return this.zzu.zzd();
    }

    @d
    public zzag zze() {
        return this.zzu.zzf();
    }

    @d
    public zzaz zzf() {
        return this.zzu.zzg();
    }

    @d
    public zzgh zzi() {
        return this.zzu.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    @d
    public zzgo zzj() {
        return this.zzu.zzj();
    }

    @d
    public zzha zzk() {
        return this.zzu.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    @d
    public zzhv zzl() {
        return this.zzu.zzl();
    }

    @d
    public zzos zzq() {
        return this.zzu.zzt();
    }

    public void zzr() {
        this.zzu.zzl().zzr();
    }

    public void zzs() {
        this.zzu.zzy();
    }

    public void zzt() {
        this.zzu.zzl().zzt();
    }
}

