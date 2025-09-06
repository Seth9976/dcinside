package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

final class zzdms implements zzbfk {
    final String zza;
    final zzdmt zzb;

    zzdms(zzdmt zzdmt0, String s) {
        this.zza = "_videoMediaView";
        this.zzb = zzdmt0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfk
    public final JSONObject zza() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfk
    public final JSONObject zzb() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfk
    public final void zzc() {
        zzdmt zzdmt0 = this.zzb;
        if(zzdmt0.zzd != null) {
            zzdmt0.zzd.zzF(this.zza);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfk
    public final void zzd(MotionEvent motionEvent0) {
    }
}

