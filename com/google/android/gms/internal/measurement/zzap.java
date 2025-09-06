package com.google.android.gms.internal.measurement;

import J1.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class zzap implements zzak, zzaq {
    @e
    private final Map zza;

    public zzap() {
        this.zza = new HashMap();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzap ? this.zza.equals(((zzap)object0).zza) : false;
    }

    @Override
    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override
    public String toString() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.measurement.zzak
    public final zzaq zza(String s) {
        return this.zza.containsKey(s) ? ((zzaq)this.zza.get(s)) : zzaq.zzc;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public zzaq zza(String s, zzh zzh0, List list0) {
        return "toString".equals(s) ? new zzas("{}") : zzan.zza(this, new zzas(s), zzh0, list0);
    }

    public final List zza() {
        return new ArrayList(this.zza.keySet());
    }

    @Override  // com.google.android.gms.internal.measurement.zzak
    public final void zza(String s, zzaq zzaq0) {
        if(zzaq0 == null) {
            this.zza.remove(s);
            return;
        }
        this.zza.put(s, zzaq0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        zzaq zzaq0 = new zzap();
        for(Object object0: this.zza.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(map$Entry0.getValue() instanceof zzak) {
                String s = (String)map$Entry0.getKey();
                zzaq zzaq1 = (zzaq)map$Entry0.getValue();
                zzaq0.zza.put(s, zzaq1);
            }
            else {
                String s1 = (String)map$Entry0.getKey();
                zzaq zzaq2 = ((zzaq)map$Entry0.getValue()).zzc();
                zzaq0.zza.put(s1, zzaq2);
            }
        }
        return zzaq0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzak
    public final boolean zzc(String s) {
        return this.zza.containsKey(s);
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
        return "[object Object]";
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Iterator zzh() {
        return zzan.zza(this.zza);
    }
}

