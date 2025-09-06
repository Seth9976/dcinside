package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzdcr extends zzdbj implements zzdct {
    public zzdcr(Set set0) {
        super(set0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdct
    public final void zza(String s) {
        this.zzq(new zzdcl("MalformedJson"));
    }

    @Override  // com.google.android.gms.internal.ads.zzdct
    public final void zzb(String s, String s1) {
        this.zzq(new zzdco(s, s1));
    }

    @Override  // com.google.android.gms.internal.ads.zzdct
    public final void zzc(String s) {
        this.zzq(new zzdcn(s));
    }

    @Override  // com.google.android.gms.internal.ads.zzdct
    public final void zzd(String s) {
        this.zzq(new zzdcp(s));
    }

    @Override  // com.google.android.gms.internal.ads.zzdct
    public final void zze() {
        this.zzq(new zzdcq());
    }

    @Override  // com.google.android.gms.internal.ads.zzdct
    public final void zzf() {
        this.zzq(new zzdcm());
    }
}

