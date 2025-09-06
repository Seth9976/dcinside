package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.util.concurrent.t0;
import o3.j;
import org.json.JSONObject;

@j
public final class zzbok implements zzbnw {
    private final zzbny zza;
    private final zzbnz zzb;
    private final zzbns zzc;
    private final String zzd;

    zzbok(zzbns zzbns0, String s, zzbnz zzbnz0, zzbny zzbny0) {
        this.zzc = zzbns0;
        this.zzd = s;
        this.zzb = zzbnz0;
        this.zza = zzbny0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(@Nullable Object object0) throws Exception {
        return this.zzb(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbnw
    public final t0 zzb(Object object0) {
        t0 t00 = new zzcab();
        zzbnm zzbnm0 = this.zzc.zzb(null);
        zze.zza("callJs > getEngine: Promise created");
        zzbnm0.zzj(new zzboh(this, zzbnm0, object0, ((zzcab)t00)), new zzboi(this, ((zzcab)t00), zzbnm0));
        return t00;
    }

    static void zzd(zzbok zzbok0, zzbnm zzbnm0, zzbnt zzbnt0, Object object0, zzcab zzcab0) {
        try {
            zzboj zzboj0 = new zzboj(zzbok0, zzbnm0, zzcab0);
            zzbjo.zzo.zzc("97b838fa-9860-491e-9941-6f76de16f324", zzboj0);
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("id", "97b838fa-9860-491e-9941-6f76de16f324");
            jSONObject0.put("args", zzbok0.zzb.zzb(object0));
            zzbnt0.zzl(zzbok0.zzd, jSONObject0);
        }
        catch(Exception unused_ex) {
            try {
                zzcab0.zzd(exception0);
                zzo.zzh("Unable to invokeJavascript", exception0);
            }
            finally {
                zzbnm0.zzb();
            }
        }
    }
}

