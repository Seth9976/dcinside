package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState;
import java.util.ArrayList;
import java.util.List;
import o3.j;

@j
public final class zzn {
    private Bundle zza;
    private List zzb;
    private boolean zzc;
    private int zzd;
    private final Bundle zze;
    private final Bundle zzf;
    private final List zzg;
    private int zzh;
    private String zzi;
    private final List zzj;
    private int zzk;
    private final int zzl;
    private long zzm;

    public zzn() {
        this.zza = new Bundle();
        this.zzb = new ArrayList();
        this.zzc = false;
        this.zzd = -1;
        this.zze = new Bundle();
        this.zzf = new Bundle();
        this.zzg = new ArrayList();
        this.zzh = -1;
        this.zzi = null;
        this.zzj = new ArrayList();
        this.zzk = 60000;
        this.zzl = PublisherPrivacyPersonalizationState.DEFAULT.getValue();
        this.zzm = 0L;
    }

    public final zzm zza() {
        return new zzm(8, -1L, this.zza, -1, this.zzb, this.zzc, this.zzd, false, null, null, null, null, this.zze, this.zzf, this.zzg, null, null, false, null, this.zzh, this.zzi, this.zzj, this.zzk, null, this.zzl, this.zzm);
    }

    public final zzn zzb(Bundle bundle0) {
        this.zza = bundle0;
        return this;
    }

    public final zzn zzc(int v) {
        this.zzk = v;
        return this;
    }

    public final zzn zzd(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzn zze(List list0) {
        this.zzb = list0;
        return this;
    }

    public final zzn zzf(String s) {
        this.zzi = s;
        return this;
    }

    public final zzn zzg(long v) {
        this.zzm = v;
        return this;
    }

    public final zzn zzh(int v) {
        this.zzd = v;
        return this;
    }

    public final zzn zzi(int v) {
        this.zzh = v;
        return this;
    }
}

