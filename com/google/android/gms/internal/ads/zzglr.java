package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import o3.h;

public final class zzglr {
    @h
    private ArrayList zza;
    private zzglo zzb;
    @h
    private Integer zzc;

    public zzglr() {
        this.zza = new ArrayList();
        this.zzb = zzglo.zza;
        this.zzc = null;
    }

    public final zzglr zza(zzgdz zzgdz0, int v, String s, String s1) {
        ArrayList arrayList0 = this.zza;
        if(arrayList0 == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList0.add(new zzgls(zzgdz0, v, s, s1, null));
        return this;
    }

    public final zzglr zzb(zzglo zzglo0) {
        if(this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzglo0;
        return this;
    }

    public final zzglr zzc(int v) {
        if(this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = v;
        return this;
    }

    public final zzglu zzd() throws GeneralSecurityException {
        if(this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer integer0 = this.zzc;
        if(integer0 != null) {
            int v = (int)integer0;
            ArrayList arrayList0 = this.zza;
            int v1 = arrayList0.size();
            int v2 = 0;
            while(v2 < v1) {
                int v3 = ((zzgls)arrayList0.get(v2)).zza();
                ++v2;
                if(v3 != v) {
                    continue;
                }
                goto label_13;
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
    label_13:
        zzglu zzglu0 = new zzglu(this.zzb, DesugarCollections.unmodifiableList(this.zza), this.zzc, null);
        this.zza = null;
        return zzglu0;
    }
}

