package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

public final class zzbkh implements zzbjp {
    private final zzbkg zza;

    public zzbkh(zzbkg zzbkg0) {
        this.zza = zzbkg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzbwi zzbwi0;
        String s = (String)map0.get("action");
        if("grant".equals(s)) {
            try {
                zzbwi0 = null;
                int v = Integer.parseInt(((String)map0.get("amount")));
                String s1 = (String)map0.get("type");
                if(!TextUtils.isEmpty(s1)) {
                    zzbwi0 = new zzbwi(s1, v);
                }
            }
            catch(NumberFormatException numberFormatException0) {
                zzo.zzk("Unable to parse reward amount.", numberFormatException0);
            }
            this.zza.zza(zzbwi0);
            return;
        }
        if("video_start".equals(s)) {
            this.zza.zzc();
            return;
        }
        if("video_complete".equals(s)) {
            this.zza.zzb();
        }
    }

    public static void zzb(zzcex zzcex0, zzbkg zzbkg0) {
        zzcex0.zzag("/reward", new zzbkh(zzbkg0));
    }
}

