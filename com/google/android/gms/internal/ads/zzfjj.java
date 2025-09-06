package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzch;
import java.util.List;

public final class zzfjj extends zzch {
    private final zzfjv zza;

    zzfjj(zzfjv zzfjv0) {
        this.zza = zzfjv0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final zzbad zze(String s) {
        return this.zza.zza(s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final zzby zzf(String s) {
        return this.zza.zzb(s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final zzbwp zzg(String s) {
        return this.zza.zzc(s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(zzbpe zzbpe0) {
        this.zza.zzi(zzbpe0);
        this.zza.zzh();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zzi(List list0, zzcf zzcf0) {
        this.zza.zzj(list0, zzcf0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(String s) {
        return this.zza.zzk(s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(String s) {
        return this.zza.zzl(s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(String s) {
        return this.zza.zzm(s);
    }
}

