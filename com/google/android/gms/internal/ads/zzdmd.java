package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzdmd implements zzayk {
    public final zzcex zza;

    public zzdmd(zzcex zzcex0) {
        this.zza = zzcex0;
    }

    @Override  // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayj0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("isVisible", (zzayj0.zzj ? "1" : "0"));
        this.zza.zzd("onAdVisibilityChanged", hashMap0);
    }
}

