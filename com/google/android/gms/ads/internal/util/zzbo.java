package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzaou;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzapr;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzcab;
import com.google.common.util.concurrent.t0;
import java.util.Map;
import o3.j;

@j
public final class zzbo {
    private static zzapp zza;
    private static final Object zzb;

    static {
        zzbo.zzb = new Object();
    }

    public zzbo(Context context0) {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        synchronized(zzbo.zzb) {
            if(zzbo.zza == null) {
                zzbcl.zza(context0);
                zzbo.zza = ((Boolean)zzbe.zzc().zza(zzbcl.zzew)).booleanValue() ? zzaz.zzb(context0) : zzaqt.zza(context0, null);
            }
        }
    }

    public final t0 zza(String s) {
        t0 t00 = new zzcab();
        zzbo.zza.zza(new zzbm(s, null, ((zzcab)t00)));
        return t00;
    }

    public final t0 zzb(int v, String s, @Nullable Map map0, @Nullable byte[] arr_b) {
        t0 t00 = new zzbk(null);
        zzbi zzbi0 = new zzbi(this, s, ((zzbk)t00));
        zzl zzl0 = new zzl(null);
        zzbj zzbj0 = new zzbj(this, v, s, ((zzapr)t00), zzbi0, arr_b, map0, zzl0);
        if(zzl.zzk()) {
            try {
                zzl0.zzd(s, "GET", zzbj0.zzl(), zzbj0.zzx());
            }
            catch(zzaou zzaou0) {
                zzo.zzj(zzaou0.getMessage());
            }
        }
        zzbo.zza.zza(zzbj0);
        return t00;
    }
}

