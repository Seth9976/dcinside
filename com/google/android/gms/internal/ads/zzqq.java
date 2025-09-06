package com.google.android.gms.internal.ads;

final class zzqq implements zzpj {
    final zzqs zza;

    zzqq(zzqs zzqs0, zzqr zzqr0) {
        this.zza = zzqs0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzpj
    public final void zza(Exception exception0) {
        zzdo.zzd("MediaCodecAudioRenderer", "Audio sink error", exception0);
        this.zza.zzc.zzb(exception0);
    }
}

