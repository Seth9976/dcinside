package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzgzx {
    public static final int zza;
    private static final zzhah zzb;

    static {
        zzgzx.zzb = new zzhaj();
    }

    public static void zzA(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzu(v, list0, z);
        }
    }

    public static void zzB(int v, List list0, zzhaw zzhaw0, zzgzv zzgzv0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ((zzgwx)zzhaw0).zzv(v, list0.get(v1), zzgzv0);
            }
        }
    }

    public static void zzC(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzy(v, list0, z);
        }
    }

    public static void zzD(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzA(v, list0, z);
        }
    }

    public static void zzE(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzC(v, list0, z);
        }
    }

    public static void zzF(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzE(v, list0, z);
        }
    }

    public static void zzG(int v, List list0, zzhaw zzhaw0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzH(v, list0);
        }
    }

    public static void zzH(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzJ(v, list0, z);
        }
    }

    public static void zzI(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzL(v, list0, z);
        }
    }

    // 去混淆评级： 低(20)
    static boolean zzJ(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    static int zza(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzgxs) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzgww.zzE(((zzgxs)list0).zzd(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzgww.zzE(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    static int zzb(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * (zzgww.zzD(v << 3) + 4);
    }

    static int zzc(List list0) {
        return list0.size() * 4;
    }

    static int zzd(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * (zzgww.zzD(v << 3) + 8);
    }

    static int zze(List list0) {
        return list0.size() * 8;
    }

    static int zzf(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzgxs) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzgww.zzE(((zzgxs)list0).zzd(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzgww.zzE(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    static int zzg(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzgyr) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzgww.zzE(((zzgyr)list0).zza(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzgww.zzE(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    static int zzh(int v, Object object0, zzgzv zzgzv0) {
        if(object0 instanceof zzgyn) {
            int v1 = ((zzgyn)object0).zza();
            return zzgww.zzD(v << 3) + (zzgww.zzD(v1) + v1);
        }
        return zzgww.zzD(v << 3) + zzgww.zzA(((zzgzc)object0), zzgzv0);
    }

    static int zzi(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzgxs) {
            v2 = 0;
            while(v1 < v) {
                int v3 = ((zzgxs)list0).zzd(v1);
                v2 += zzgww.zzD(v3 >> 0x1F ^ v3 + v3);
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            int v4 = (int)(((Integer)list0.get(v1)));
            v2 += zzgww.zzD(v4 >> 0x1F ^ v4 + v4);
            ++v1;
        }
        return v2;
    }

    static int zzj(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzgyr) {
            v2 = 0;
            while(v1 < v) {
                long v3 = ((zzgyr)list0).zza(v1);
                v2 += zzgww.zzE(v3 >> 0x3F ^ v3 + v3);
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            long v4 = (long)(((Long)list0.get(v1)));
            v2 += zzgww.zzE(v4 >> 0x3F ^ v4 + v4);
            ++v1;
        }
        return v2;
    }

    static int zzk(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzgxs) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzgww.zzD(((zzgxs)list0).zzd(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzgww.zzD(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    static int zzl(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzgyr) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzgww.zzE(((zzgyr)list0).zza(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzgww.zzE(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static zzhah zzm() {
        return zzgzx.zzb;
    }

    static Object zzn(Object object0, int v, List list0, zzgxx zzgxx0, Object object1, zzhah zzhah0) {
        if(zzgxx0 == null) {
            return object1;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(zzgxx0.zza(v4)) {
                    if(v2 != v3) {
                        list0.set(v3, integer0);
                    }
                    ++v3;
                }
                else {
                    object1 = zzgzx.zzo(object0, v, v4, object1, zzhah0);
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
                if(!zzgxx0.zza(v5)) {
                    object1 = zzgzx.zzo(object0, v, v5, object1, zzhah0);
                    iterator0.remove();
                }
            }
        }
        return object1;
    }

    static Object zzo(Object object0, int v, int v1, Object object1, zzhah zzhah0) {
        if(object1 == null) {
            object1 = zzhah0.zza(object0);
        }
        zzhah0.zzh(object1, v, ((long)v1));
        return object1;
    }

    static void zzp(zzgxc zzgxc0, Object object0, Object object1) {
        if(((zzgxn)object1).zza.zza.isEmpty()) {
            return;
        }
        zzgxn zzgxn0 = (zzgxn)object0;
        throw null;
    }

    static void zzq(zzhah zzhah0, Object object0, Object object1) {
        zzhai zzhai0 = ((zzgxr)object0).zzt;
        zzhai zzhai1 = ((zzgxr)object1).zzt;
        if(!zzhai.zzc().equals(zzhai1)) {
            if(zzhai.zzc().equals(zzhai0)) {
                zzhai0 = zzhai.zze(zzhai0, zzhai1);
            }
            else {
                zzhai0.zzd(zzhai1);
            }
        }
        ((zzgxr)object0).zzt = zzhai0;
    }

    public static void zzr(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzc(v, list0, z);
        }
    }

    public static void zzs(int v, List list0, zzhaw zzhaw0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zze(v, list0);
        }
    }

    public static void zzt(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzg(v, list0, z);
        }
    }

    public static void zzu(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzj(v, list0, z);
        }
    }

    public static void zzv(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzl(v, list0, z);
        }
    }

    public static void zzw(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzn(v, list0, z);
        }
    }

    public static void zzx(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzp(v, list0, z);
        }
    }

    public static void zzy(int v, List list0, zzhaw zzhaw0, zzgzv zzgzv0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ((zzgwx)zzhaw0).zzq(v, list0.get(v1), zzgzv0);
            }
        }
    }

    public static void zzz(int v, List list0, zzhaw zzhaw0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzhaw0.zzs(v, list0, z);
        }
    }
}

