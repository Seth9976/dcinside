package com.google.android.gms.internal.ads;

public final class zzcwc implements zzdbi {
    public final zzdgb zza;

    public zzcwc(zzdgb zzdgb0) {
        this.zza = zzdgb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbi
    public final void zza(Object object0) {
        String s = this.zza.getMessage();
        if(s == null) {
            s = "Internal show error.";
        }
        ((zzcwj)object0).zzq(zzfdk.zzd(12, s, null));
    }
}

