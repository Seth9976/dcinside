package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

public final class zzdao implements zzdbi {
    public final String zza;
    public final String zzb;

    public zzdao(String s, String s1) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbi
    public final void zza(Object object0) {
        ((AppEventListener)object0).onAppEvent(this.zza, this.zzb);
    }
}

