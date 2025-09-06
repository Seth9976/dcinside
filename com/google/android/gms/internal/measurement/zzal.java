package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class zzal implements zzak, zzaq {
    protected final String zza;
    protected final Map zzb;

    public zzal(String s) {
        this.zzb = new HashMap();
        this.zza = s;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzal)) {
            return false;
        }
        return this.zza == null ? false : this.zza.equals(((zzal)object0).zza);
    }

    @Override
    public int hashCode() {
        return this.zza == null ? 0 : this.zza.hashCode();
    }

    public abstract zzaq zza(zzh arg1, List arg2);

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.measurement.zzak
    public final zzaq zza(String s) {
        return this.zzb.containsKey(s) ? ((zzaq)this.zzb.get(s)) : zzaq.zzc;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String s, zzh zzh0, List list0) {
        return "toString".equals(s) ? new zzas(this.zza) : zzan.zza(this, new zzas(s), zzh0, list0);
    }

    public final String zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.measurement.zzak
    public final void zza(String s, zzaq zzaq0) {
        if(zzaq0 == null) {
            this.zzb.remove(s);
            return;
        }
        this.zzb.put(s, zzaq0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public zzaq zzc() {
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzak
    public final boolean zzc(String s) {
        return this.zzb.containsKey(s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return NaN;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Iterator zzh() {
        return zzan.zza(this.zzb);
    }
}

