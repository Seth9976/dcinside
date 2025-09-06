package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;

final class zzdlo implements zzgcd {
    final zzcab zza;

    zzdlo(zzdlp zzdlp0, zzcab zzcab0) {
        this.zza = zzcab0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        zzo.zzg("Failed to load media data due to video view load failure.");
        this.zza.zzd(throwable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        if(((zzcex)object0) != null) {
            ((zzcex)object0).zzag("/video", new zzccq(new zzdln(this.zza)));
            ((zzcex)object0).zzaa();
            return;
        }
        zzegu zzegu0 = new zzegu(1, "Missing webview from video view future.");
        this.zza.zzd(zzegu0);
    }
}

