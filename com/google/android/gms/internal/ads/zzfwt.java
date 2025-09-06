package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzfwt extends zzfwh {
    final zzfww zza;
    private final Object zzb;
    private int zzc;

    zzfwt(zzfww zzfww0, int v) {
        this.zza = zzfww0;
        super();
        this.zzb = zzfww.zzg(zzfww0, v);
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwh
    public final Object getKey() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwh
    public final Object getValue() {
        Map map0 = this.zza.zzl();
        if(map0 != null) {
            return map0.get(this.zzb);
        }
        this.zza();
        return this.zzc == -1 ? null : zzfww.zzj(this.zza, this.zzc);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwh
    public final Object setValue(Object object0) {
        Map map0 = this.zza.zzl();
        if(map0 != null) {
            return map0.put(this.zzb, object0);
        }
        this.zza();
        int v = this.zzc;
        if(v == -1) {
            this.zza.put(this.zzb, object0);
            return null;
        }
        Object object1 = zzfww.zzj(this.zza, v);
        zzfww.zzn(this.zza, this.zzc, object0);
        return object1;
    }

    private final void zza() {
        if(this.zzc != -1 && this.zzc < this.zza.size()) {
            Object object0 = zzfww.zzg(this.zza, this.zzc);
            if(zzfuk.zza(this.zzb, object0)) {
                return;
            }
        }
        this.zzc = this.zza.zzw(this.zzb);
    }
}

