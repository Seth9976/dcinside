package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzac {
    private zzad zza;
    private zzad zzb;
    private List zzc;

    public zzac() {
        this.zza = new zzad("", 0L, null);
        this.zzb = new zzad("", 0L, null);
        this.zzc = new ArrayList();
    }

    private zzac(zzad zzad0) {
        this.zza = zzad0;
        this.zzb = (zzad)zzad0.clone();
        this.zzc = new ArrayList();
    }

    @Override
    public final Object clone() throws CloneNotSupportedException {
        zzac zzac0 = new zzac(((zzad)this.zza.clone()));
        for(Object object0: this.zzc) {
            zzac0.zzc.add(((zzad)((zzad)object0).clone()));
        }
        return zzac0;
    }

    public final zzad zza() {
        return this.zza;
    }

    public final void zza(zzad zzad0) {
        this.zza = zzad0;
        this.zzb = (zzad)zzad0.clone();
        this.zzc.clear();
    }

    public final void zza(String s, long v, Map map0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: map0.keySet()) {
            hashMap0.put(((String)object0), zzad.zza(((String)object0), this.zza.zza(((String)object0)), map0.get(((String)object0))));
        }
        this.zzc.add(new zzad(s, v, hashMap0));
    }

    public final zzad zzb() {
        return this.zzb;
    }

    public final void zzb(zzad zzad0) {
        this.zzb = zzad0;
    }

    public final List zzc() {
        return this.zzc;
    }
}

