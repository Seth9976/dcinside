package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzfy.zzd.zza;
import com.google.android.gms.internal.measurement.zzfy.zzd;
import com.google.android.gms.internal.measurement.zzfy.zze;
import com.google.android.gms.internal.measurement.zzfy.zzm;
import com.google.android.gms.internal.measurement.zzfy.zzn;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzoe;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzv {
    private String zza;
    private boolean zzb;
    private zzm zzc;
    private BitSet zzd;
    private BitSet zze;
    private Map zzf;
    private Map zzg;
    private final zzt zzh;

    private zzv(zzt zzt0, String s) {
        this.zzh = zzt0;
        super();
        this.zza = s;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new ArrayMap();
        this.zzg = new ArrayMap();
    }

    private zzv(zzt zzt0, String s, zzm zzfy$zzm0, BitSet bitSet0, BitSet bitSet1, Map map0, Map map1) {
        this.zzh = zzt0;
        super();
        this.zza = s;
        this.zzd = bitSet0;
        this.zze = bitSet1;
        this.zzf = map0;
        this.zzg = new ArrayMap();
        if(map1 != null) {
            for(Object object0: map1.keySet()) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(((Long)map1.get(((Integer)object0))));
                this.zzg.put(((Integer)object0), arrayList0);
            }
        }
        this.zzb = false;
        this.zzc = zzfy$zzm0;
    }

    zzv(zzt zzt0, String s, zzm zzfy$zzm0, BitSet bitSet0, BitSet bitSet1, Map map0, Map map1, zzac zzac0) {
        this(zzt0, s, zzfy$zzm0, bitSet0, bitSet1, map0, map1);
    }

    zzv(zzt zzt0, String s, zzac zzac0) {
        this(zzt0, s);
    }

    @NonNull
    final zzd zza(int v) {
        List list0;
        ArrayList arrayList0;
        zza zzfy$zzd$zza0 = zzd.zzb();
        zzfy$zzd$zza0.zza(v);
        zzfy$zzd$zza0.zza(this.zzb);
        zzm zzfy$zzm0 = this.zzc;
        if(zzfy$zzm0 != null) {
            zzfy$zzd$zza0.zza(zzfy$zzm0);
        }
        com.google.android.gms.internal.measurement.zzfy.zzm.zza zzfy$zzm$zza0 = zzm.zze().zzb(zzoo.zza(this.zzd)).zzd(zzoo.zza(this.zze));
        if(this.zzf == null) {
            arrayList0 = null;
        }
        else {
            arrayList0 = new ArrayList(this.zzf.size());
            for(Object object0: this.zzf.keySet()) {
                int v1 = (int)(((Integer)object0));
                Long long0 = (Long)this.zzf.get(((Integer)object0));
                if(long0 != null) {
                    arrayList0.add(((zze)(((zzjt)zze.zzc().zza(v1).zza(((long)long0)).zzai()))));
                }
            }
        }
        if(arrayList0 != null) {
            zzfy$zzm$zza0.zza(arrayList0);
        }
        if(this.zzg == null) {
            list0 = Collections.emptyList();
        }
        else {
            list0 = new ArrayList(this.zzg.size());
            for(Object object1: this.zzg.keySet()) {
                com.google.android.gms.internal.measurement.zzfy.zzn.zza zzfy$zzn$zza0 = zzn.zzc().zza(((int)(((Integer)object1))));
                List list1 = (List)this.zzg.get(((Integer)object1));
                if(list1 != null) {
                    Collections.sort(list1);
                    zzfy$zzn$zza0.zza(list1);
                }
                ((ArrayList)list0).add(((zzn)(((zzjt)zzfy$zzn$zza0.zzai()))));
            }
        }
        zzfy$zzm$zza0.zzc(list0);
        zzfy$zzd$zza0.zza(zzfy$zzm$zza0);
        return (zzd)(((zzjt)zzfy$zzd$zza0.zzai()));
    }

    final void zza(@NonNull zzaa zzaa0) {
        int v = zzaa0.zza();
        Boolean boolean0 = zzaa0.zzc;
        if(boolean0 != null) {
            this.zze.set(v, boolean0.booleanValue());
        }
        Boolean boolean1 = zzaa0.zzd;
        if(boolean1 != null) {
            this.zzd.set(v, boolean1.booleanValue());
        }
        if(zzaa0.zze != null) {
            Long long0 = (Long)this.zzf.get(v);
            long v1 = (long)zzaa0.zze;
            if(long0 == null || v1 / 1000L > ((long)long0)) {
                this.zzf.put(v, ((long)(v1 / 1000L)));
            }
        }
        if(zzaa0.zzf != null) {
            List list0 = (List)this.zzg.get(v);
            if(list0 == null) {
                list0 = new ArrayList();
                this.zzg.put(v, list0);
            }
            if(zzaa0.zzc()) {
                list0.clear();
            }
            if(zzoe.zza() && this.zzh.zze().zzf(this.zza, zzbh.zzbp) && zzaa0.zzb()) {
                list0.clear();
            }
            if(zzoe.zza() && this.zzh.zze().zzf(this.zza, zzbh.zzbp)) {
                long v2 = (long)zzaa0.zzf;
                if(!list0.contains(((long)(v2 / 1000L)))) {
                    list0.add(((long)(v2 / 1000L)));
                }
                return;
            }
            list0.add(((long)(((long)zzaa0.zzf) / 1000L)));
        }
    }
}

