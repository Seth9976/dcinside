package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzdyi;
import com.google.android.gms.internal.ads.zzgbo;
import com.google.android.gms.internal.ads.zzgch;
import com.google.common.util.concurrent.t0;
import java.io.InputStreamReader;
import org.json.JSONException;

public final class zzbh implements zzgbo {
    public final zzbvk zza;

    public zzbh(zzbvk zzbvk0) {
        this.zza = zzbvk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        zzbk zzbk0 = new zzbk(new JsonReader(new InputStreamReader(((zzdyi)object0).zzb())), ((zzdyi)object0).zza());
        zzbvk zzbvk0 = this.zza;
        try {
            zzbk0.zzb = zzbc.zzb().zzi(zzbvk0.zza).toString();
        }
        catch(JSONException unused_ex) {
            zzbk0.zzb = "{}";
        }
        if(!zzbvk0.zzn.isEmpty()) {
            try {
                zzbk0.zzc = zzbc.zzb().zzi(zzbvk0.zzn).toString();
            }
            catch(JSONException unused_ex) {
            }
        }
        return zzgch.zzh(zzbk0);
    }
}

