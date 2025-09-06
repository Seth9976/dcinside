package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

public final class zzflk {
    private static final zzflk zza;
    private final ArrayList zzb;
    private final ArrayList zzc;

    static {
        zzflk.zza = new zzflk();
    }

    private zzflk() {
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    public static zzflk zza() {
        return zzflk.zza;
    }

    public final Collection zzb() {
        return DesugarCollections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return DesugarCollections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfkt zzfkt0) {
        this.zzb.add(zzfkt0);
    }

    public final void zze(zzfkt zzfkt0) {
        boolean z = this.zzg();
        this.zzb.remove(zzfkt0);
        this.zzc.remove(zzfkt0);
        if(z && !this.zzg()) {
            zzfls.zzb().zzg();
        }
    }

    public final void zzf(zzfkt zzfkt0) {
        boolean z = this.zzg();
        this.zzc.add(zzfkt0);
        if(!z) {
            zzfls.zzb().zzf();
        }
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}

