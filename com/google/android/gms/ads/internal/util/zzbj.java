package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.internal.ads.zzaou;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapr;
import com.google.android.gms.internal.ads.zzaqr;
import java.util.Collections;
import java.util.Map;

final class zzbj extends zzaqr {
    final byte[] zza;
    final Map zzb;
    final zzl zzc;

    zzbj(zzbo zzbo0, int v, String s, zzapr zzapr0, zzapq zzapq0, byte[] arr_b, Map map0, zzl zzl0) {
        this.zza = arr_b;
        this.zzb = map0;
        this.zzc = zzl0;
        super(v, s, zzapr0, zzapq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzapm
    public final Map zzl() throws zzaou {
        return this.zzb == null ? Collections.emptyMap() : this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqr
    protected final void zzo(Object object0) {
        this.zzz(((String)object0));
    }

    @Override  // com.google.android.gms.internal.ads.zzapm
    public final byte[] zzx() throws zzaou {
        return this.zza == null ? null : this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqr
    protected final void zzz(String s) {
        this.zzc.zzg(s);
        super.zzz(s);
    }
}

