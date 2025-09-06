package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

public final class zzcct implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzcbs zzcbs0 = (zzcbs)object0;
        zzcfz zzcfz0 = zzcbs0.zzq();
        try {
            if(zzcfz0 == null) {
                zzcfz zzcfz1 = new zzcfz(zzcbs0, Float.parseFloat(((String)map0.get("duration"))), "1".equals(map0.get("customControlsAllowed")), "1".equals(map0.get("clickToExpandAllowed")));
                zzcbs0.zzC(zzcfz1);
                zzcfz0 = zzcfz1;
            }
            float f = Float.parseFloat(((String)map0.get("duration")));
            boolean z = "1".equals(map0.get("muted"));
            float f1 = Float.parseFloat(((String)map0.get("currentTime")));
            int v = Integer.parseInt(((String)map0.get("playbackState")));
            int v1 = v < 0 || v > 3 ? 0 : v;
            String s = (String)map0.get("aspectRatio");
            float f2 = TextUtils.isEmpty(s) ? 0.0f : Float.parseFloat(s);
            if(zzo.zzm(3)) {
                zzo.zze(("Video Meta GMSG: currentTime : " + f1 + " , duration : " + f + " , isMuted : " + z + " , playbackState : " + v1 + " , aspectRatio : " + s));
            }
            zzcfz0.zzc(f1, f, v1, z, f2);
            return;
        }
        catch(NullPointerException | NumberFormatException nullPointerException0) {
        }
        zzo.zzh("Unable to parse videoMeta message.", nullPointerException0);
        zzv.zzp().zzw(nullPointerException0, "VideoMetaGmsgHandler.onGmsg");
    }
}

