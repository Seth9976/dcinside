package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzg {
    public static double zza(double f) [...] // 潜在的解密器

    public static int zza(zzh zzh0) {
        int v = zzg.zzb(((double)zzh0.zza("runtime.counter").zze()) + 1.0);
        if(v > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        zzh0.zzc("runtime.counter", new zzai(((double)v)));
        return v;
    }

    public static zzbv zza(String s) {
        zzbv zzbv0 = s == null || s.isEmpty() ? null : zzbv.zza(Integer.parseInt(s));
        if(zzbv0 == null) {
            throw new IllegalArgumentException(String.format("Unsupported commandId %s", s));
        }
        return zzbv0;
    }

    public static Object zza(zzaq zzaq0) {
        if(zzaq.zzd.equals(zzaq0)) {
            return null;
        }
        if(zzaq.zzc.equals(zzaq0)) {
            return "";
        }
        if(zzaq0 instanceof zzap) {
            return zzg.zza(((zzap)zzaq0));
        }
        if(zzaq0 instanceof zzaf) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: ((zzaf)zzaq0)) {
                Object object1 = zzg.zza(((zzaq)object0));
                if(object1 != null) {
                    arrayList0.add(object1);
                }
            }
            return arrayList0;
        }
        return !zzaq0.zze().isNaN() ? zzaq0.zze() : zzaq0.zzf();
    }

    public static Map zza(zzap zzap0) {
        Map map0 = new HashMap();
        for(Object object0: zzap0.zza()) {
            String s = (String)object0;
            Object object1 = zzg.zza(zzap0.zza(s));
            if(object1 != null) {
                map0.put(s, object1);
            }
        }
        return map0;
    }

    public static void zza(zzbv zzbv0, int v, List list0) {
        zzg.zza(zzbv0.name(), v, list0);
    }

    public static void zza(String s, int v, List list0) {
        if(list0.size() != v) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", s, v, list0.size()));
        }
    }

    public static boolean zza(zzaq zzaq0, zzaq zzaq1) {
        if(!zzaq0.getClass().equals(zzaq1.getClass())) {
            return false;
        }
        if(!(zzaq0 instanceof zzax) && !(zzaq0 instanceof zzao)) {
            if(zzaq0 instanceof zzai) {
                return Double.isNaN(((double)zzaq0.zze())) || Double.isNaN(((double)zzaq1.zze())) ? false : zzaq0.zze().equals(zzaq1.zze());
            }
            if(zzaq0 instanceof zzas) {
                return zzaq0.zzf().equals(zzaq1.zzf());
            }
            return zzaq0 instanceof zzag ? zzaq0.zzd().equals(zzaq1.zzd()) : zzaq0 == zzaq1;
        }
        return true;
    }

    public static int zzb(double f) {
        if(!Double.isNaN(f) && !Double.isInfinite(f)) {
            int v = Double.compare(f, 0.0);
            if(v != 0) {
                return v <= 0 ? ((int)(((long)(-1.0 * Math.floor(Math.abs(f)) % 4294967296.0)))) : ((int)(((long)(1.0 * Math.floor(Math.abs(f)) % 4294967296.0))));
            }
        }
        return 0;
    }

    public static void zzb(zzbv zzbv0, int v, List list0) {
        zzg.zzb(zzbv0.name(), v, list0);
    }

    public static void zzb(String s, int v, List list0) {
        if(list0.size() < v) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", s, v, list0.size()));
        }
    }

    public static boolean zzb(zzaq zzaq0) {
        if(zzaq0 == null) {
            return false;
        }
        Double double0 = zzaq0.zze();
        return !double0.isNaN() && ((double)double0) >= 0.0 && double0.equals(Math.floor(((double)double0)));
    }

    public static long zzc(double f) {
        return ((long)zzg.zzb(f)) & 0xFFFFFFFFL;
    }

    public static void zzc(String s, int v, List list0) {
        if(list0.size() > v) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", s, v, list0.size()));
        }
    }
}

