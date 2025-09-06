package com.google.android.gms.internal.ads;

import android.os.SystemClock;

final class zzqh implements zzpp {
    final zzqm zza;

    zzqh(zzqm zzqm0, zzql zzql0) {
        this.zza = zzqm0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzpp
    public final void zza(long v) {
        zzdo.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + v);
    }

    @Override  // com.google.android.gms.internal.ads.zzpp
    public final void zzb(long v) {
        zzqm zzqm0 = this.zza;
        if(zzqm0.zzp != null) {
            ((zzqq)zzqm0.zzp).zza.zzc.zzv(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpp
    public final void zzc(long v, long v1, long v2, long v3) {
        zzdo.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + v + ", " + v1 + ", " + v2 + ", " + v3 + ", " + this.zza.zzL() + ", " + this.zza.zzM());
    }

    @Override  // com.google.android.gms.internal.ads.zzpp
    public final void zzd(long v, long v1, long v2, long v3) {
        zzdo.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + v + ", " + v1 + ", " + v2 + ", " + v3 + ", " + this.zza.zzL() + ", " + this.zza.zzM());
    }

    @Override  // com.google.android.gms.internal.ads.zzpp
    public final void zze(int v, long v1) {
        zzqm zzqm0 = this.zza;
        if(zzqm0.zzp != null) {
            long v2 = SystemClock.elapsedRealtime();
            long v3 = zzqm0.zzV;
            ((zzqq)this.zza.zzp).zza.zzc.zzx(v, v1, v2 - v3);
        }
    }
}

