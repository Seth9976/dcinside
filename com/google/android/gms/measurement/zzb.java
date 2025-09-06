package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzhy;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzon;
import java.util.List;
import java.util.Map;

final class zzb extends zza {
    private final zzhy zza;
    private final zzjq zzb;

    public zzb(@NonNull zzhy zzhy0) {
        super(null);
        Preconditions.checkNotNull(zzhy0);
        this.zza = zzhy0;
        this.zzb = zzhy0.zzp();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final int zza(String s) {
        return zzjq.zza(s);
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Boolean zza() {
        return this.zzb.zzac();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final Object zza(int v) {
        switch(v) {
            case 0: {
                return this.zze();
            }
            case 1: {
                return this.zzd();
            }
            case 2: {
                return this.zzb();
            }
            case 3: {
                return this.zzc();
            }
            case 4: {
                return this.zza();
            }
            default: {
                return null;
            }
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final List zza(String s, String s1) {
        return this.zzb.zza(s, s1);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final Map zza(String s, String s1, boolean z) {
        return this.zzb.zza(s, s1, z);
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Map zza(boolean z) {
        List list0 = this.zzb.zza(z);
        Map map0 = new ArrayMap(list0.size());
        for(Object object0: list0) {
            zzon zzon0 = (zzon)object0;
            Object object1 = zzon0.zza();
            if(object1 != null) {
                map0.put(zzon0.zza, object1);
            }
        }
        return map0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zza(Bundle bundle0) {
        this.zzb.zzb(bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zza(zzjl zzjl0) {
        this.zzb.zza(zzjl0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zza(zzjm zzjm0) {
        this.zzb.zza(zzjm0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zza(String s, String s1, Bundle bundle0) {
        this.zza.zzp().zza(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zza(String s, String s1, Bundle bundle0, long v) {
        this.zzb.zza(s, s1, bundle0, v);
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Double zzb() {
        return this.zzb.zzad();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zzb(zzjl zzjl0) {
        this.zzb.zzb(zzjl0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zzb(String s) {
        this.zza.zze().zza(s, this.zza.zzb().elapsedRealtime());
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zzb(String s, String s1, Bundle bundle0) {
        this.zzb.zzb(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Integer zzc() {
        return this.zzb.zzae();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zzc(String s) {
        this.zza.zze().zzb(s, this.zza.zzb().elapsedRealtime());
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final Long zzd() {
        return this.zzb.zzaf();
    }

    @Override  // com.google.android.gms.measurement.AppMeasurement$zza
    public final String zze() {
        return this.zzb.zzak();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final long zzf() {
        return this.zza.zzt().zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final String zzg() {
        return this.zzb.zzag();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final String zzh() {
        return this.zzb.zzah();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final String zzi() {
        return this.zzb.zzai();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final String zzj() {
        return this.zzb.zzag();
    }
}

