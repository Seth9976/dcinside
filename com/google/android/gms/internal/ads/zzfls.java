package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

public final class zzfls implements zzfll {
    private static zzfls zza;
    private float zzb;
    private zzflg zzc;
    private zzflk zzd;

    public zzfls(zzflh zzflh0, zzflf zzflf0) {
        this.zzb = 0.0f;
    }

    public final float zza() {
        return this.zzb;
    }

    public static zzfls zzb() {
        if(zzfls.zza == null) {
            zzflf zzflf0 = new zzflf();
            zzfls.zza = new zzfls(new zzflh(), zzflf0);
        }
        return zzfls.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfll
    public final void zzc(boolean z) {
        if(z) {
            zzfmu.zzd().zzi();
            return;
        }
        zzfmu.zzd().zzh();
    }

    public final void zzd(Context context0) {
        zzfle zzfle0 = new zzfle();
        this.zzc = new zzflg(new Handler(), context0, zzfle0, this);
    }

    public final void zze(float f) {
        this.zzb = f;
        if(this.zzd == null) {
            this.zzd = zzflk.zza();
        }
        for(Object object0: this.zzd.zzb()) {
            ((zzfkt)object0).zzg().zzl(f);
        }
    }

    public final void zzf() {
        zzflj.zza().zze(this);
        zzflj.zza().zzf();
        zzfmu.zzd().zzi();
        this.zzc.zza();
    }

    public final void zzg() {
        zzfmu.zzd().zzj();
        zzflj.zza().zzg();
        this.zzc.zzb();
    }
}

