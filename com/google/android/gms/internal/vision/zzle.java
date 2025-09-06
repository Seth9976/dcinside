package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzle {
    private static final Class zza;
    private static final zzlu zzb;
    private static final zzlu zzc;
    private static final zzlu zzd;

    static {
        zzle.zza = zzle.zzd();
        zzle.zzb = zzle.zza(false);
        zzle.zzc = zzle.zza(true);
        zzle.zzd = new zzlw();
    }

    // 去混淆评级： 低(20)
    static int zza(int v, Object object0, zzlc zzlc0) {
        return object0 instanceof zzjt ? zzii.zza(v, ((zzjt)object0)) : zzii.zzb(v, ((zzkk)object0), zzlc0);
    }

    static int zza(int v, List list0) {
        int v1 = list0.size();
        int v2 = 0;
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzii.zze(v) * v1;
        if(list0 instanceof zzjv) {
            while(v2 < v1) {
                Object object0 = ((zzjv)list0).zzb(v2);
                v3 += (object0 instanceof zzht ? zzii.zzb(((zzht)object0)) : zzii.zzb(((String)object0)));
                ++v2;
            }
            return v3;
        }
        while(v2 < v1) {
            Object object1 = list0.get(v2);
            v3 += (object1 instanceof zzht ? zzii.zzb(((zzht)object1)) : zzii.zzb(((String)object1)));
            ++v2;
        }
        return v3;
    }

    static int zza(int v, List list0, zzlc zzlc0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzii.zze(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            v3 += (object0 instanceof zzjt ? zzii.zza(((zzjt)object0)) : zzii.zza(((zzkk)object0), zzlc0));
        }
        return v3;
    }

    static int zza(int v, List list0, boolean z) {
        return list0.size() == 0 ? 0 : zzle.zza(list0) + list0.size() * zzii.zze(v);
    }

    static int zza(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjy) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzii.zzd(((zzjy)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzii.zzd(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static zzlu zza() {
        return zzle.zzb;
    }

    private static zzlu zza(boolean z) {
        try {
            Class class0 = zzle.zze();
            return class0 == null ? null : ((zzlu)class0.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z)));
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static Object zza(int v, int v1, Object object0, zzlu zzlu0) {
        if(object0 == null) {
            object0 = zzlu0.zza();
        }
        zzlu0.zza(object0, v, ((long)v1));
        return object0;
    }

    static Object zza(int v, List list0, zzjg zzjg0, Object object0, zzlu zzlu0) {
        if(zzjg0 == null) {
            return object0;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(zzjg0.zza(v4)) {
                    if(v2 != v3) {
                        list0.set(v3, integer0);
                    }
                    ++v3;
                }
                else {
                    object0 = zzle.zza(v, v4, object0, zzlu0);
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
                if(!zzjg0.zza(v5)) {
                    object0 = zzle.zza(v, v5, object0, zzlu0);
                    iterator0.remove();
                }
            }
        }
        return object0;
    }

    public static void zza(int v, List list0, zzmr zzmr0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zza(v, list0);
        }
    }

    public static void zza(int v, List list0, zzmr zzmr0, zzlc zzlc0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zza(v, list0, zzlc0);
        }
    }

    public static void zza(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzg(v, list0, z);
        }
    }

    static void zza(zziq zziq0, Object object0, Object object1) {
        zziu zziu0 = zziq0.zza(object1);
        if(!zziu0.zza.isEmpty()) {
            zziq0.zzb(object0).zza(zziu0);
        }
    }

    static void zza(zzkh zzkh0, Object object0, Object object1, long v) {
        zzma.zza(object0, v, zzkh0.zza(zzma.zzf(object0, v), zzma.zzf(object1, v)));
    }

    static void zza(zzlu zzlu0, Object object0, Object object1) {
        zzlu0.zza(object0, zzlu0.zzc(zzlu0.zzb(object0), zzlu0.zzb(object1)));
    }

    public static void zza(Class class0) {
        if(!zzjb.class.isAssignableFrom(class0) && (zzle.zza != null && !zzle.zza.isAssignableFrom(class0))) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    // 去混淆评级： 低(20)
    static boolean zza(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    static int zzb(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = v1 * zzii.zze(v);
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            v3 += zzii.zzb(((zzht)list0.get(v2)));
        }
        return v3;
    }

    static int zzb(int v, List list0, zzlc zzlc0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += zzii.zzc(v, ((zzkk)list0.get(v2)), zzlc0);
        }
        return v3;
    }

    static int zzb(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzle.zzb(list0) + v1 * zzii.zze(v);
    }

    static int zzb(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjy) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzii.zze(((zzjy)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzii.zze(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static zzlu zzb() {
        return zzle.zzc;
    }

    public static void zzb(int v, List list0, zzmr zzmr0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzb(v, list0);
        }
    }

    public static void zzb(int v, List list0, zzmr zzmr0, zzlc zzlc0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzb(v, list0, zzlc0);
        }
    }

    public static void zzb(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzf(v, list0, z);
        }
    }

    static int zzc(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzle.zzc(list0) + v1 * zzii.zze(v);
    }

    static int zzc(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjy) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzii.zzf(((zzjy)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzii.zzf(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static zzlu zzc() {
        return zzle.zzd;
    }

    public static void zzc(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzc(v, list0, z);
        }
    }

    static int zzd(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzle.zzd(list0) + v1 * zzii.zze(v);
    }

    static int zzd(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjd) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzii.zzk(((zzjd)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzii.zzk(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    private static Class zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void zzd(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzd(v, list0, z);
        }
    }

    static int zze(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzle.zze(list0) + v1 * zzii.zze(v);
    }

    static int zze(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjd) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzii.zzf(((zzjd)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzii.zzf(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    private static Class zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void zze(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzn(v, list0, z);
        }
    }

    static int zzf(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzle.zzf(list0) + v1 * zzii.zze(v);
    }

    static int zzf(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjd) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzii.zzg(((zzjd)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzii.zzg(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzf(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zze(v, list0, z);
        }
    }

    static int zzg(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzle.zzg(list0) + v1 * zzii.zze(v);
    }

    static int zzg(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof zzjd) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzii.zzh(((zzjd)list0).zzb(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzii.zzh(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void zzg(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzl(v, list0, z);
        }
    }

    static int zzh(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * zzii.zzi(v, 0);
    }

    static int zzh(List list0) {
        return list0.size() << 2;
    }

    public static void zzh(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zza(v, list0, z);
        }
    }

    static int zzi(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * zzii.zzg(v, 0L);
    }

    static int zzi(List list0) {
        return list0.size() << 3;
    }

    public static void zzi(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzj(v, list0, z);
        }
    }

    static int zzj(int v, List list0, boolean z) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : v1 * zzii.zzb(v, true);
    }

    static int zzj(List list0) {
        return list0.size();
    }

    public static void zzj(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzm(v, list0, z);
        }
    }

    public static void zzk(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzb(v, list0, z);
        }
    }

    public static void zzl(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzk(v, list0, z);
        }
    }

    public static void zzm(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzh(v, list0, z);
        }
    }

    public static void zzn(int v, List list0, zzmr zzmr0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            zzmr0.zzi(v, list0, z);
        }
    }
}

