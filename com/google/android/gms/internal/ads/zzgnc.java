package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzgnc {
    private final Class zza;
    private Map zzb;
    private final List zzc;
    private zzgnd zzd;
    private zzglo zze;

    zzgnc(Class class0, zzgne zzgne0) {
        this.zzb = new HashMap();
        this.zzc = new ArrayList();
        this.zza = class0;
        this.zze = zzglo.zza;
    }

    public final zzgnc zza(Object object0, zzgdx zzgdx0, zzgsv zzgsv0) throws GeneralSecurityException {
        this.zze(object0, zzgdx0, zzgsv0, false);
        return this;
    }

    public final zzgnc zzb(Object object0, zzgdx zzgdx0, zzgsv zzgsv0) throws GeneralSecurityException {
        this.zze(object0, zzgdx0, zzgsv0, true);
        return this;
    }

    public final zzgnc zzc(zzglo zzglo0) {
        if(this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzglo0;
        return this;
    }

    public final zzgnf zzd() throws GeneralSecurityException {
        Map map0 = this.zzb;
        if(map0 == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzgnf zzgnf0 = new zzgnf(map0, this.zzc, this.zzd, this.zze, this.zza, null);
        this.zzb = null;
        return zzgnf0;
    }

    private final zzgnc zze(Object object0, zzgdx zzgdx0, zzgsv zzgsv0, boolean z) throws GeneralSecurityException {
        byte[] arr_b;
        if(this.zzb == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if(object0 == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if(zzgsv0.zzk() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int v = zzgsv0.zzf().ordinal();
        if(v == 1) {
            arr_b = zzgml.zzb(zzgsv0.zza()).zzc();
        }
        else {
            switch(v) {
                case 2: {
                    arr_b = zzgml.zza(zzgsv0.zza()).zzc();
                    break;
                }
                case 3: {
                    arr_b = zzgds.zza;
                    break;
                }
                default: {
                    if(v != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    arr_b = zzgml.zza(zzgsv0.zza()).zzc();
                }
            }
        }
        zzgnd zzgnd0 = new zzgnd(object0, zzgvo.zzb(arr_b), zzgsv0.zzk(), zzgsv0.zzf(), zzgsv0.zza(), zzgsv0.zzb().zzg(), zzgdx0, null);
        Map map0 = this.zzb;
        List list0 = this.zzc;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(zzgnd0);
        List list1 = (List)map0.put(zzgnd0.zzb, DesugarCollections.unmodifiableList(arrayList0));
        if(list1 != null) {
            ArrayList arrayList1 = new ArrayList();
            arrayList1.addAll(list1);
            arrayList1.add(zzgnd0);
            map0.put(zzgnd0.zzb, DesugarCollections.unmodifiableList(arrayList1));
        }
        list0.add(zzgnd0);
        if(z) {
            if(this.zzd != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.zzd = zzgnd0;
            return this;
        }
        return this;
    }
}

