package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzapm;
import com.google.android.gms.internal.ads.zzaps;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzcab;
import java.util.Map;

public final class zzbm extends zzapm {
    private final zzcab zza;
    private final zzl zzb;

    public zzbm(String s, Map map0, zzcab zzcab0) {
        super(0, s, new zzbl(zzcab0));
        this.zza = zzcab0;
        zzl zzl0 = new zzl(null);
        this.zzb = zzl0;
        zzl0.zzd(s, "GET", null, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzapm
    protected final zzaps zzh(zzapi zzapi0) {
        return zzaps.zzb(zzapi0, zzaqj.zzb(zzapi0));
    }

    @Override  // com.google.android.gms.internal.ads.zzapm
    protected final void zzo(Object object0) {
        this.zzb.zzf(((zzapi)object0).zzc, ((zzapi)object0).zza);
        byte[] arr_b = ((zzapi)object0).zzb;
        if(zzl.zzk() && arr_b != null) {
            this.zzb.zzh(arr_b);
        }
        this.zza.zzc(((zzapi)object0));
    }
}

