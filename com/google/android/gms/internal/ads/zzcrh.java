package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.Collections;
import java.util.List;

public final class zzcrh implements zzegr {
    public final List zza;

    public zzcrh(zzcqz zzcqz0) {
        this.zza = Collections.singletonList(zzgch.zzh(zzcqz0));
    }

    public zzcrh(List list0) {
        this.zza = list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzegr
    public final void zzr() {
        for(Object object0: this.zza) {
            zzgch.zzr(((t0)object0), new zzcrg(this), zzgcz.zzc());
        }
    }
}

