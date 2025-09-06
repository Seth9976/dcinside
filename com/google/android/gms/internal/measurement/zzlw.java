package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzlw {
    private static final zzmk zza;

    static {
        zzlw.zza = new zzmm();
    }

    // 去混淆评级： 低(20)
    static int zza(int v, Object object0, zzlu zzlu0) {
        return object0 instanceof zzkk ? zzjc.zzb(v, ((zzkk)object0)) : zzjc.zzc(v, ((zzlc)object0), zzlu0);
    }

    static int zza(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = v1 * zzjc.zzi(v);
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            v3 += zzjc.zzb(((zzik)list0.get(v2)));
        }
        return v3;
    }

    static int zza(int v, List list0, zzlu zzlu0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += zzjc.zzb(v, ((zzlc)list0.get(v2)), zzlu0);
        }
        return v3;
    }

    static int zza(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * zzjc.zzb(v, true);
    }

    static int zza(List list0) {
        return list0.size();
    }

    public static zzmk zza() {
        return zzlw.zza;
    }

    static Object zza(Object object0, int v, int v1, Object object1, zzmk zzmk0) {
        if(object1 == null) {
            object1 = zzmk0.zzc(object0);
        }
        zzmk0.zzb(object1, v, ((long)v1));
        return object1;
    }

    static Object zza(Object object0, int v, List list0, zzjx zzjx0, Object object1, zzmk zzmk0) {
        if(zzjx0 == null) {
            return object1;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(zzjx0.zza(v4)) {
                    if(v2 != v3) {
                        list0.set(v3, integer0);
                    }
                    ++v3;
                }
                else {
                    object1 = zzlw.zza(object0, v, v4, object1, zzmk0);
                }
            }
            if(v3 != v1) {
                list0.subList(v3, v1).clear();
                return object1;
            }
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                int v5 = (int)(((Integer)object2));
                if(!zzjx0.zza(v5)) {
                    object1 = zzlw.zza(object0, v, v5, object1, zzmk0);
                    iterator0.remove();
                }
            }
        }
        return object1;
    }

    public static void zza(int v, List list0, zznb zznb0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zza(v, list0);
        }
    }

    public static void zza(int v, List list0, zznb zznb0, zzlu zzlu0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zza(v, list0, zzlu0);
        }
    }

    public static void zza(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zza(v, list0, z);
        }
    }

    static void zza(zzji zzji0, Object object0, Object object1) {
        zzjm zzjm0 = zzji0.zza(object1);
        if(!zzjm0.zza.isEmpty()) {
            zzji0.zzb(object0).zza(zzjm0);
        }
    }

    static void zza(zzkv zzkv0, Object object0, Object object1, long v) {
        zzml.zza(object0, v, zzkv0.zza(zzml.zze(object0, v), zzml.zze(object1, v)));
    }

    static void zza(zzmk zzmk0, Object object0, Object object1) {
        zzmk0.zzc(object0, zzmk0.zza(zzmk0.zzd(object0), zzmk0.zzd(object1)));
    }

    public static void zza(Class class0) {
    }

    // 去混淆评级： 低(20)
    static boolean zza(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    static int zzb(int v, List list0) {
        int v1 = list0.size();
        int v2 = 0;
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzjc.zzi(v) * v1;
        if(list0 instanceof zzkj) {
            while(v2 < v1) {
                Object object0 = ((zzkj)list0).zza(v2);
                v3 += (object0 instanceof zzik ? zzjc.zzb(((zzik)object0)) : zzjc.zzb(((String)object0)));
                ++v2;
            }
            return v3;
        }
        while(v2 < v1) {
            Object object1 = list0.get(v2);
            v3 += (object1 instanceof zzik ? zzjc.zzb(((zzik)object1)) : zzjc.zzb(((String)object1)));
            ++v2;
        }
        return v3;
    }

    static int zzb(int v, List list0, zzlu zzlu0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzjc.zzi(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            v3 += (object0 instanceof zzkk ? zzjc.zza(((zzkk)object0)) : zzjc.zza(((zzlc)object0), zzlu0));
        }
        return v3;
    }

    static int zzb(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzlw.zzb(list0) + v1 * zzjc.zzi(v);
    }

    static int zzb(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjw) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzjc.zzd(((zzjw)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjc.zzd(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzb(int v, List list0, zznb zznb0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzb(v, list0);
        }
    }

    public static void zzb(int v, List list0, zznb zznb0, zzlu zzlu0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzb(v, list0, zzlu0);
        }
    }

    public static void zzb(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzb(v, list0, z);
        }
    }

    static int zzc(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * zzjc.zzf(v, 0);
    }

    static int zzc(List list0) {
        return list0.size() << 2;
    }

    public static void zzc(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzc(v, list0, z);
        }
    }

    static int zzd(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * zzjc.zzc(v, 0L);
    }

    static int zzd(List list0) {
        return list0.size() << 3;
    }

    public static void zzd(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzd(v, list0, z);
        }
    }

    static int zze(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzlw.zze(list0) + v1 * zzjc.zzi(v);
    }

    static int zze(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjw) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzjc.zzf(((zzjw)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjc.zzf(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zze(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zze(v, list0, z);
        }
    }

    static int zzf(int v, List list0, boolean z) {
        return list0.size() == 0 ? 0 : zzlw.zzf(list0) + list0.size() * zzjc.zzi(v);
    }

    static int zzf(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzkn) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzjc.zzd(((zzkn)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjc.zzd(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzf(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzf(v, list0, z);
        }
    }

    static int zzg(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzlw.zzg(list0) + v1 * zzjc.zzi(v);
    }

    static int zzg(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjw) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzjc.zzh(((zzjw)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjc.zzh(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzg(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzg(v, list0, z);
        }
    }

    static int zzh(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzlw.zzh(list0) + v1 * zzjc.zzi(v);
    }

    static int zzh(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzkn) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzjc.zzf(((zzkn)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjc.zzf(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzh(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzh(v, list0, z);
        }
    }

    static int zzi(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzlw.zzi(list0) + v1 * zzjc.zzi(v);
    }

    static int zzi(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjw) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzjc.zzj(((zzjw)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjc.zzj(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzi(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzi(v, list0, z);
        }
    }

    static int zzj(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzlw.zzj(list0) + v1 * zzjc.zzi(v);
    }

    static int zzj(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzkn) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzjc.zzg(((zzkn)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjc.zzg(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzj(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzj(v, list0, z);
        }
    }

    public static void zzk(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzk(v, list0, z);
        }
    }

    public static void zzl(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzl(v, list0, z);
        }
    }

    public static void zzm(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzm(v, list0, z);
        }
    }

    public static void zzn(int v, List list0, zznb zznb0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zznb0.zzn(v, list0, z);
        }
    }
}

