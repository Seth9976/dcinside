package com.google.android.gms.ads.search;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class zzb {
    private final zzeh zza;
    private String zzb;

    public zzb() {
        this.zza = new zzeh();
    }

    public final zzb zzb(Class class0, Bundle bundle0) {
        this.zza.zzo(class0, bundle0);
        return this;
    }

    public final zzb zzc(NetworkExtras networkExtras0) {
        this.zza.zzs(networkExtras0);
        return this;
    }

    public final zzb zzd(Class class0, Bundle bundle0) {
        this.zza.zzr(class0, bundle0);
        return this;
    }

    public final zzb zze(String s) {
        this.zzb = s;
        return this;
    }
}

