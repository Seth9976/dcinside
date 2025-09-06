package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo.zzb;
import com.google.android.gms.internal.measurement.zzfo.zze;
import com.google.android.gms.internal.measurement.zzfy.zzd;
import com.google.android.gms.internal.measurement.zzfy.zzf;
import com.google.android.gms.internal.measurement.zzfy.zzm;
import com.google.android.gms.internal.measurement.zzfy.zzn;
import com.google.android.gms.internal.measurement.zzfy.zzo;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zzoe;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzt extends zznr {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzt(zznv zznv0) {
        super(zznv0);
    }

    private final zzv zza(Integer integer0) {
        if(this.zzc.containsKey(integer0)) {
            return (zzv)this.zzc.get(integer0);
        }
        zzv zzv0 = new zzv(this, this.zza, null);
        this.zzc.put(integer0, zzv0);
        return zzv0;
    }

    private final void zza(List list0) {
        if(list0.isEmpty()) {
            return;
        }
        ArrayMap arrayMap0 = new ArrayMap();
        for(Object object0: list0) {
            zzo zzfy$zzo0 = (zzo)object0;
            Map map0 = (Map)arrayMap0.get("");
            if(map0 == null) {
                map0 = this.zzh().zzg(this.zza, "");
                arrayMap0.put("", map0);
            }
            Iterator iterator1 = map0.keySet().iterator();
        label_12:
            if(!iterator1.hasNext()) {
                continue;
            }
            Object object1 = iterator1.next();
            Integer integer0 = (Integer)object1;
            int v = (int)integer0;
            if(this.zzb.contains(integer0)) {
                this.zzj().zzp().zza("Skipping failed audience ID", integer0);
                continue;
            }
            boolean z = true;
            for(Object object2: ((List)map0.get(integer0))) {
                zze zzfo$zze0 = (zze)object2;
                Integer integer1 = null;
                if(this.zzj().zza(2)) {
                    this.zzj().zzp().zza("Evaluating filter. audience, filter, property", integer0, (zzfo$zze0.zzi() ? zzfo$zze0.zza() : null), this.zzi().zzc(""));
                    this.zzj().zzp().zza("Filter definition", this.g_().zza(zzfo$zze0));
                }
                if(zzfo$zze0.zzi() && zzfo$zze0.zza() <= 0x100) {
                    zzz zzz0 = new zzz(this, this.zza, v, zzfo$zze0);
                    z = zzz0.zza(this.zzd, this.zze, zzfy$zzo0, this.zza(v, zzfo$zze0.zza()));
                    if(z) {
                        this.zza(integer0).zza(zzz0);
                        continue;
                    }
                    this.zzb.add(integer0);
                    break;
                }
                zzgq zzgq0 = this.zzj().zzu();
                Object object3 = zzgo.zza(this.zza);
                if(zzfo$zze0.zzi()) {
                    integer1 = zzfo$zze0.zza();
                }
                zzgq0.zza("Invalid property filter ID. appId, id", object3, String.valueOf(integer1));
                z = false;
                break;
            }
            if(z) {
                goto label_12;
            }
            this.zzb.add(integer0);
            goto label_12;
        }
    }

    private final void zza(List list0, boolean z) {
        long v2;
        Map map2;
        Integer integer1;
        zzy zzy1;
        zzbb zzbb1;
        if(list0.isEmpty()) {
            return;
        }
        zzy zzy0 = new zzy(this, null);
        ArrayMap arrayMap0 = new ArrayMap();
        for(Object object0: list0) {
            zzf zzfy$zzf0 = (zzf)object0;
            zzf zzfy$zzf1 = zzy0.zza(this.zza, zzfy$zzf0);
            if(zzfy$zzf1 != null) {
                zzal zzal0 = this.zzh();
                String s = this.zza;
                zzbb zzbb0 = zzal0.zzd(s, "");
                if(zzbb0 == null) {
                    zzal0.zzj().zzu().zza("Event aggregate wasn\'t created during raw event logging. appId, event", zzgo.zza(s), zzal0.zzi().zza(""));
                    zzbb1 = new zzbb(s, "", 1L, 1L, 1L, zzfy$zzf0.zzd(), 0L, null, null, null, null);
                }
                else {
                    zzbb1 = new zzbb(zzbb0.zza, zzbb0.zzb, zzbb0.zzc + 1L, zzbb0.zzd + 1L, zzbb0.zze + 1L, zzbb0.zzf, zzbb0.zzg, zzbb0.zzh, zzbb0.zzi, zzbb0.zzj, zzbb0.zzk);
                }
                zzbb zzbb2 = zzbb1;
                this.zzh().zza(zzbb2);
                if(!zznm.zza() || !this.zze().zzf(null, zzbh.zzcy) || !z) {
                    long v = zzbb2.zzc;
                    Map map0 = (Map)arrayMap0.get("");
                    if(map0 == null) {
                        map0 = this.zzh().zzf(this.zza, "");
                        arrayMap0.put("", map0);
                    }
                    Map map1 = map0;
                    for(Object object1: map1.keySet()) {
                        Integer integer0 = (Integer)object1;
                        int v1 = (int)integer0;
                        if(this.zzb.contains(integer0)) {
                            this.zzj().zzp().zza("Skipping failed audience ID", integer0);
                        }
                        else {
                            boolean z1 = true;
                            for(Object object2: ((List)map1.get(integer0))) {
                                zzx zzx0 = new zzx(this, this.zza, v1, ((zzb)object2));
                                zzx zzx1 = zzx0;
                                zzy1 = zzy0;
                                integer1 = integer0;
                                map2 = map1;
                                v2 = v;
                                z1 = zzx0.zza(this.zzd, this.zze, zzfy$zzf1, v, zzbb2, this.zza(v1, ((zzb)object2).zzb()));
                                if(z1) {
                                    this.zza(integer1).zza(zzx1);
                                    integer0 = integer1;
                                    zzy0 = zzy1;
                                    map1 = map2;
                                    v = v2;
                                    continue;
                                }
                                this.zzb.add(integer1);
                                goto label_59;
                            }
                            zzy1 = zzy0;
                            integer1 = integer0;
                            map2 = map1;
                            v2 = v;
                        label_59:
                            if(!z1) {
                                this.zzb.add(integer1);
                            }
                            zzy0 = zzy1;
                            map1 = map2;
                            v = v2;
                        }
                    }
                }
            }
        }
    }

    private final boolean zza(int v, int v1) {
        zzv zzv0 = (zzv)this.zzc.get(v);
        return zzv0 == null ? false : zzv0.zzd.get(v1);
    }

    @WorkerThread
    final List zza(String s, List list0, List list1, Long long0, Long long1) {
        return this.zza(s, list0, list1, long0, long1, false);
    }

    @WorkerThread
    final List zza(String s, List list0, List list1, Long long0, Long long1, boolean z) {
        Iterator iterator5;
        Map map3;
        Iterator iterator4;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(list0);
        Preconditions.checkNotNull(list1);
        this.zza = s;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = long0;
        this.zze = long1;
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
        boolean z1 = zzoe.zza() && this.zze().zzf(this.zza, zzbh.zzbp);
        boolean z2 = zzoe.zza() && this.zze().zzf(this.zza, zzbh.zzbo);
        Map map0 = Collections.emptyMap();
        if(z2 && z1) {
            map0 = this.zzh().zzn(this.zza);
        }
        Map map1 = this.zzh().zzm(this.zza);
        if(!map1.isEmpty()) {
            Map map2 = map1;
            Iterator iterator1 = new HashSet(map1.keySet()).iterator();
            while(iterator1.hasNext()) {
                Object object0 = iterator1.next();
                Integer integer0 = (Integer)object0;
                integer0.intValue();
                zzm zzfy$zzm0 = (zzm)map2.get(integer0);
                BitSet bitSet0 = new BitSet();
                BitSet bitSet1 = new BitSet();
                ArrayMap arrayMap0 = new ArrayMap();
                if(zzfy$zzm0 != null && zzfy$zzm0.zza() != 0) {
                    for(Object object1: zzfy$zzm0.zzh()) {
                        com.google.android.gms.internal.measurement.zzfy.zze zzfy$zze0 = (com.google.android.gms.internal.measurement.zzfy.zze)object1;
                        if(zzfy$zze0.zzf()) {
                            arrayMap0.put(zzfy$zze0.zza(), (zzfy$zze0.zze() ? zzfy$zze0.zzb() : null));
                        }
                    }
                }
                ArrayMap arrayMap1 = new ArrayMap();
                if(zzfy$zzm0 != null && zzfy$zzm0.zzc() != 0) {
                    Iterator iterator3 = zzfy$zzm0.zzj().iterator();
                    while(iterator3.hasNext()) {
                        Object object2 = iterator3.next();
                        zzn zzfy$zzn0 = (zzn)object2;
                        if(!zzfy$zzn0.zzf() || zzfy$zzn0.zza() <= 0) {
                            iterator4 = iterator3;
                            map3 = map2;
                        }
                        else {
                            iterator4 = iterator3;
                            map3 = map2;
                            arrayMap1.put(zzfy$zzn0.zzb(), zzfy$zzn0.zza(zzfy$zzn0.zza() - 1));
                        }
                        iterator3 = iterator4;
                        map2 = map3;
                    }
                }
                if(zzfy$zzm0 != null) {
                    int v = 0;
                    while(v < zzfy$zzm0.zzd() << 6) {
                        if(zzoo.zza(zzfy$zzm0.zzk(), v)) {
                            iterator5 = iterator1;
                            this.zzj().zzp().zza("Filter already evaluated. audience ID, filter ID", integer0, v);
                            bitSet1.set(v);
                            if(zzoo.zza(zzfy$zzm0.zzi(), v)) {
                                bitSet0.set(v);
                                goto label_65;
                            }
                        }
                        else {
                            iterator5 = iterator1;
                        }
                        arrayMap0.remove(v);
                    label_65:
                        ++v;
                        iterator1 = iterator5;
                    }
                }
                Object object3 = map1.get(integer0);
                if(z2 && z1) {
                    List list2 = (List)map0.get(integer0);
                    if(list2 != null && this.zze != null && this.zzd != null) {
                        for(Object object4: list2) {
                            int v1 = ((zzb)object4).zzb();
                            long v2 = ((long)this.zze) / 1000L;
                            if(((zzb)object4).zzi()) {
                                v2 = ((long)this.zzd) / 1000L;
                            }
                            if(arrayMap0.containsKey(v1)) {
                                arrayMap0.put(v1, v2);
                            }
                            if(arrayMap1.containsKey(v1)) {
                                arrayMap1.put(v1, v2);
                            }
                        }
                    }
                }
                zzv zzv0 = new zzv(this, this.zza, ((zzm)object3), bitSet0, bitSet1, arrayMap0, arrayMap1, null);
                this.zzc.put(integer0, zzv0);
            }
        }
        if(zznm.zza() && this.zze().zzf(null, zzbh.zzcy)) {
            this.zza(list0, z);
            if(z) {
                return new ArrayList();
            }
            this.zza(list1);
            return this.zzu();
        }
        this.zza(list0, true);
        this.zza(list1);
        return this.zzu();
    }

    @Override  // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    @NonNull
    private final List zzu() {
        List list0 = new ArrayList();
        Set set0 = this.zzc.keySet();
        set0.removeAll(this.zzb);
        for(Object object0: set0) {
            zzv zzv0 = (zzv)this.zzc.get(((Integer)object0));
            Preconditions.checkNotNull(zzv0);
            zzd zzfy$zzd0 = zzv0.zza(((int)(((Integer)object0))));
            list0.add(zzfy$zzd0);
            zzal zzal0 = this.zzh();
            String s = this.zza;
            zzm zzfy$zzm0 = zzfy$zzd0.zzd();
            zzal0.zzal();
            zzal0.zzt();
            Preconditions.checkNotEmpty(s);
            Preconditions.checkNotNull(zzfy$zzm0);
            byte[] arr_b = zzfy$zzm0.zzca();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("app_id", s);
            contentValues0.put("audience_id", ((Integer)object0));
            contentValues0.put("current_results", arr_b);
            try {
                if(zzal0.e_().insertWithOnConflict("audience_filter_values", null, contentValues0, 5) != -1L) {
                    continue;
                }
                zzal0.zzj().zzg().zza("Failed to insert filter results (got -1). appId", zzgo.zza(s));
            }
            catch(SQLiteException sQLiteException0) {
                zzal0.zzj().zzg().zza("Error storing filter results. appId", zzgo.zza(s), sQLiteException0);
            }
        }
        return list0;
    }
}

