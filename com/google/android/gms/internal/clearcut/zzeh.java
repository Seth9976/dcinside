package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzeh {
    private static final Class zzoh;
    private static final zzex zzoi;
    private static final zzex zzoj;
    private static final zzex zzok;

    static {
        zzeh.zzoh = zzeh.zzdp();
        zzeh.zzoi = zzeh.zzd(false);
        zzeh.zzoj = zzeh.zzd(true);
        zzeh.zzok = new zzez();
    }

    static int zza(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzdc) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzbn.zze(((zzdc)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzbn.zze(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    private static Object zza(int v, int v1, Object object0, zzex zzex0) {
        if(object0 == null) {
            object0 = zzex0.zzdz();
        }
        zzex0.zza(object0, v, ((long)v1));
        return object0;
    }

    static Object zza(int v, List list0, zzck zzck0, Object object0, zzex zzex0) {
        if(zzck0 == null) {
            return object0;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(zzck0.zzb(v4) == null) {
                    object0 = zzeh.zza(v, v4, object0, zzex0);
                }
                else {
                    if(v2 != v3) {
                        list0.set(v3, integer0);
                    }
                    ++v3;
                }
            }
            if(v3 != v1) {
                list0.subList(v3, v1).clear();
                return object0;
            }
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                int v5 = (int)(((Integer)object1));
                if(zzck0.zzb(v5) == null) {
                    object0 = zzeh.zza(v, v5, object0, zzex0);
                    iterator0.remove();
                }
            }
        }
        return object0;
    }

    public static void zza(int v, List list0, zzfr zzfr0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zza(v, list0);
        }
    }

    public static void zza(int v, List list0, zzfr zzfr0, zzef zzef0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zza(v, list0, zzef0);
        }
    }

    public static void zza(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzg(v, list0, z);
        }
    }

    static void zza(zzbu zzbu0, Object object0, Object object1) {
        zzby zzby0 = zzbu0.zza(object1);
        if(!zzby0.isEmpty()) {
            zzbu0.zzb(object0).zza(zzby0);
        }
    }

    static void zza(zzdj zzdj0, Object object0, Object object1, long v) {
        zzfd.zza(object0, v, zzdj0.zzb(zzfd.zzo(object0, v), zzfd.zzo(object1, v)));
    }

    static void zza(zzex zzex0, Object object0, Object object1) {
        zzex0.zze(object0, zzex0.zzg(zzex0.zzq(object0), zzex0.zzq(object1)));
    }

    static int zzb(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzdc) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzbn.zzf(((zzdc)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzbn.zzf(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzb(int v, List list0, zzfr zzfr0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzb(v, list0);
        }
    }

    public static void zzb(int v, List list0, zzfr zzfr0, zzef zzef0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzb(v, list0, zzef0);
        }
    }

    public static void zzb(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzf(v, list0, z);
        }
    }

    // 去混淆评级： 低(20)
    static int zzc(int v, Object object0, zzef zzef0) {
        return object0 instanceof zzcv ? zzbn.zza(v, ((zzcv)object0)) : zzbn.zzb(v, ((zzdo)object0), zzef0);
    }

    static int zzc(int v, List list0) {
        int v1 = list0.size();
        int v2 = 0;
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzbn.zzr(v) * v1;
        if(list0 instanceof zzcx) {
            while(v2 < v1) {
                Object object0 = ((zzcx)list0).getRaw(v2);
                v3 += (object0 instanceof zzbb ? zzbn.zzb(((zzbb)object0)) : zzbn.zzh(((String)object0)));
                ++v2;
            }
            return v3;
        }
        while(v2 < v1) {
            Object object1 = list0.get(v2);
            v3 += (object1 instanceof zzbb ? zzbn.zzb(((zzbb)object1)) : zzbn.zzh(((String)object1)));
            ++v2;
        }
        return v3;
    }

    static int zzc(int v, List list0, zzef zzef0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzbn.zzr(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            v3 += (object0 instanceof zzcv ? zzbn.zza(((zzcv)object0)) : zzbn.zzb(((zzdo)object0), zzef0));
        }
        return v3;
    }

    static int zzc(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzdc) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzbn.zzg(((zzdc)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzbn.zzg(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzc(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzc(v, list0, z);
        }
    }

    public static boolean zzc(int v, int v1, int v2) {
        return v1 >= 40 ? ((long)v1) - ((long)v) + 10L <= 2L * ((long)v2) + 3L + (((long)v2) + 3L) * 3L : true;
    }

    static int zzd(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = v1 * zzbn.zzr(v);
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            v3 += zzbn.zzb(((zzbb)list0.get(v2)));
        }
        return v3;
    }

    static int zzd(int v, List list0, zzef zzef0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += zzbn.zzc(v, ((zzdo)list0.get(v2)), zzef0);
        }
        return v3;
    }

    static int zzd(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzch) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzbn.zzx(((zzch)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzbn.zzx(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    private static zzex zzd(boolean z) {
        try {
            Class class0 = zzeh.zzdq();
            return class0 == null ? null : ((zzex)class0.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z)));
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void zzd(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzd(v, list0, z);
        }
    }

    // 去混淆评级： 低(20)
    static boolean zzd(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    public static zzex zzdm() {
        return zzeh.zzoi;
    }

    public static zzex zzdn() {
        return zzeh.zzoj;
    }

    public static zzex zzdo() {
        return zzeh.zzok;
    }

    private static Class zzdp() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static Class zzdq() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static int zze(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzch) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzbn.zzs(((zzch)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzbn.zzs(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zze(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzn(v, list0, z);
        }
    }

    static int zzf(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzch) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzbn.zzt(((zzch)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzbn.zzt(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzf(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zze(v, list0, z);
        }
    }

    public static void zzf(Class class0) {
        if(!zzcg.class.isAssignableFrom(class0) && (zzeh.zzoh != null && !zzeh.zzoh.isAssignableFrom(class0))) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int zzg(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzch) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzbn.zzu(((zzch)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzbn.zzu(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzg(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzl(v, list0, z);
        }
    }

    static int zzh(List list0) {
        return list0.size() << 2;
    }

    public static void zzh(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zza(v, list0, z);
        }
    }

    static int zzi(List list0) {
        return list0.size() << 3;
    }

    public static void zzi(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzj(v, list0, z);
        }
    }

    static int zzj(List list0) {
        return list0.size();
    }

    public static void zzj(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzm(v, list0, z);
        }
    }

    public static void zzk(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzb(v, list0, z);
        }
    }

    public static void zzl(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzk(v, list0, z);
        }
    }

    public static void zzm(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzh(v, list0, z);
        }
    }

    public static void zzn(int v, List list0, zzfr zzfr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzfr0.zzi(v, list0, z);
        }
    }

    static int zzo(int v, List list0, boolean z) {
        return list0.size() == 0 ? 0 : zzeh.zza(list0) + list0.size() * zzbn.zzr(v);
    }

    static int zzp(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzeh.zzb(list0) + v1 * zzbn.zzr(v);
    }

    static int zzq(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzeh.zzc(list0) + v1 * zzbn.zzr(v);
    }

    static int zzr(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzeh.zzd(list0) + v1 * zzbn.zzr(v);
    }

    static int zzs(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzeh.zze(list0) + v1 * zzbn.zzr(v);
    }

    static int zzt(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzeh.zzf(list0) + v1 * zzbn.zzr(v);
    }

    static int zzu(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzeh.zzg(list0) + v1 * zzbn.zzr(v);
    }

    static int zzv(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * zzbn.zzj(v, 0);
    }

    static int zzw(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * zzbn.zzg(v, 0L);
    }

    static int zzx(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * zzbn.zzc(v, true);
    }
}

