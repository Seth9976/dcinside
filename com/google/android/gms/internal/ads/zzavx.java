package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

final class zzavx implements zzfph {
    private final zzfnk zza;
    private final zzfob zzb;
    private final zzawk zzc;
    private final zzavw zzd;
    private final zzavg zze;
    private final zzawm zzf;
    private final zzawe zzg;
    private final zzavv zzh;

    zzavx(@NonNull zzfnk zzfnk0, @NonNull zzfob zzfob0, @NonNull zzawk zzawk0, @NonNull zzavw zzavw0, @Nullable zzavg zzavg0, @Nullable zzawm zzawm0, @Nullable zzawe zzawe0, @Nullable zzavv zzavv0) {
        this.zza = zzfnk0;
        this.zzb = zzfob0;
        this.zzc = zzawk0;
        this.zzd = zzavw0;
        this.zze = zzavg0;
        this.zzf = zzawm0;
        this.zzg = zzawe0;
        this.zzh = zzavv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfph
    public final Map zza() {
        Map map0 = this.zze();
        map0.put("lts", this.zzc.zza());
        return map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfph
    public final Map zzb() {
        Map map0 = this.zze();
        zzasy zzasy0 = this.zzb.zza();
        map0.put("gai", Boolean.valueOf(this.zza.zzh()));
        map0.put("did", zzasy0.zzg());
        map0.put("dst", ((int)(zzasy0.zzal() - 1)));
        map0.put("doo", Boolean.valueOf(zzasy0.zzai()));
        return map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfph
    public final Map zzc() {
        zzavv zzavv0 = this.zzh;
        Map map0 = this.zze();
        if(zzavv0 != null) {
            map0.put("vst", zzavv0.zza());
        }
        return map0;
    }

    final void zzd(View view0) {
        this.zzc.zzd(view0);
    }

    private final Map zze() {
        Map map0 = new HashMap();
        zzasy zzasy0 = this.zzb.zzb();
        map0.put("v", this.zza.zzd());
        map0.put("gms", Boolean.valueOf(this.zza.zzg()));
        map0.put("int", zzasy0.zzh());
        map0.put("attts", zzasy0.zzf().zza());
        map0.put("att", zzasy0.zzf().zzd());
        map0.put("attkid", zzasy0.zzf().zzf());
        map0.put("up", Boolean.valueOf(this.zzd.zza()));
        map0.put("t", new Throwable());
        zzawe zzawe0 = this.zzg;
        if(zzawe0 != null) {
            map0.put("tcq", zzawe0.zzc());
            map0.put("tpq", this.zzg.zzg());
            map0.put("tcv", this.zzg.zzd());
            map0.put("tpv", this.zzg.zzh());
            map0.put("tchv", this.zzg.zzb());
            map0.put("tphv", this.zzg.zzf());
            map0.put("tcc", this.zzg.zza());
            map0.put("tpc", this.zzg.zze());
            zzavg zzavg0 = this.zze;
            if(zzavg0 != null) {
                map0.put("nt", zzavg0.zza());
            }
            zzawm zzawm0 = this.zzf;
            if(zzawm0 != null) {
                map0.put("vs", zzawm0.zzc());
                map0.put("vf", this.zzf.zzb());
            }
        }
        return map0;
    }
}

