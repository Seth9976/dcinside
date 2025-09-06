package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

final class zzboj implements zzbke {
    final zzbok zza;
    private final zzbnm zzb;
    private final zzcab zzc;

    public zzboj(zzbok zzbok0, zzbnm zzbnm0, zzcab zzcab0) {
        this.zza = zzbok0;
        super();
        this.zzb = zzbnm0;
        this.zzc = zzcab0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbke
    public final void zza(@Nullable String s) {
        try {
            if(s == null) {
                zzbnv zzbnv0 = new zzbnv();
                this.zzc.zzd(zzbnv0);
            }
            else {
                zzbnv zzbnv1 = new zzbnv(s);
                this.zzc.zzd(zzbnv1);
            }
        }
        catch(IllegalStateException unused_ex) {
        }
        finally {
            this.zzb.zzb();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbke
    public final void zzb(JSONObject jSONObject0) {
        try {
            Object object0 = this.zza.zza.zza(jSONObject0);
            this.zzc.zzc(object0);
        }
        catch(IllegalStateException jSONException0) {
            this.zzc.zzd(jSONException0);
        }
        catch(JSONException unused_ex) {
        }
        finally {
            this.zzb.zzb();
        }
    }
}

