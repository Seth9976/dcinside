package com.google.android.gms.internal.ads;

public final class zzdlm implements zzcgn {
    public final zzcaa zza;

    public zzdlm(zzcaa zzcaa0) {
        this.zza = zzcaa0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zza(boolean z, int v, String s, String s1) {
        zzcaa zzcaa0 = this.zza;
        if(z) {
            zzcaa0.zzb();
            return;
        }
        zzcaa0.zzd(new zzegu(1, "Image Web View failed to load. Error code: " + v + ", Description: " + s + ", Failing URL: " + s1));
    }
}

