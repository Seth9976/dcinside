package com.google.android.gms.internal.measurement;

import com.google.common.collect.a3;
import java.util.HashMap;
import java.util.Map;

public final class zzad {
    private static final a3 zza;
    private String zzb;
    private long zzc;
    private Map zzd;

    static {
        zzad.zza = a3.E("_syn", "_err", "_el");
    }

    public zzad(String s, long v, Map map0) {
        this.zzb = s;
        this.zzc = v;
        HashMap hashMap0 = new HashMap();
        this.zzd = hashMap0;
        if(map0 != null) {
            hashMap0.putAll(map0);
        }
    }

    @Override
    public final Object clone() throws CloneNotSupportedException {
        return new zzad(this.zzb, this.zzc, new HashMap(this.zzd));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzad)) {
            return false;
        }
        if(this.zzc != ((zzad)object0).zzc) {
            return false;
        }
        return this.zzb.equals(((zzad)object0).zzb) ? this.zzd.equals(((zzad)object0).zzd) : false;
    }

    @Override
    public final int hashCode() {
        return (this.zzb.hashCode() * 0x1F + ((int)(this.zzc ^ this.zzc >>> 0x20))) * 0x1F + this.zzd.hashCode();
    }

    @Override
    public final String toString() {
        return "Event{name=\'" + this.zzb + "\', timestamp=" + this.zzc + ", params=" + this.zzd + "}";
    }

    public static Object zza(String s, Object object0, Object object1) {
        if(zzad.zza.contains(s) && object1 instanceof Double) {
            return Math.round(((double)(((Double)object1))));
        }
        if(s.startsWith("_")) {
            if(object0 instanceof String) {
                return object1;
            }
            return object0 == null ? object1 : object0;
        }
        if(object0 instanceof Double) {
            return object1;
        }
        if(object0 instanceof Long) {
            return Math.round(((double)(((Double)object1))));
        }
        return object0 instanceof String ? object1.toString() : object1;
    }

    public final long zza() {
        return this.zzc;
    }

    // 去混淆评级： 低(20)
    public final Object zza(String s) {
        return this.zzd.containsKey(s) ? this.zzd.get(s) : null;
    }

    public final void zza(String s, Object object0) {
        if(object0 == null) {
            this.zzd.remove(s);
            return;
        }
        Object object1 = zzad.zza(s, this.zzd.get(s), object0);
        this.zzd.put(s, object1);
    }

    public final String zzb() {
        return this.zzb;
    }

    public final void zzb(String s) {
        this.zzb = s;
    }

    public final Map zzc() {
        return this.zzd;
    }
}

