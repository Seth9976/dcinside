package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

final class zzdje implements zzbfk {
    final zzdkd zza;
    final ViewGroup zzb;

    zzdje(zzdkd zzdkd0, ViewGroup viewGroup0) {
        this.zza = zzdkd0;
        this.zzb = viewGroup0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfk
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfk
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfk
    public final void zzc() {
        zzfxn zzfxn0 = zzdjb.zza;
        Map map0 = this.zza.zzm();
        if(map0 != null) {
            int v = zzfxn0.size();
            int v1 = 0;
            while(v1 < v) {
                Object object0 = map0.get(((String)zzfxn0.get(v1)));
                ++v1;
                if(object0 != null) {
                    this.zza.onClick(this.zzb);
                    return;
                }
                if(false) {
                    break;
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfk
    public final void zzd(MotionEvent motionEvent0) {
        this.zza.onTouch(null, motionEvent0);
    }
}

