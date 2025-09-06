package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

final class zzbix implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzcex zzcex0 = (zzcex)object0;
        if(TextUtils.isEmpty(((CharSequence)map0.get("appId")))) {
            zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfsx zzfsx0 = zzfsy.zzl();
        zzfsx0.zzb(((String)map0.get("appId")));
        zzfsx0.zzh(zzcex0.getWidth());
        zzfsx0.zzg(zzcex0.zzF().getWindowToken());
        if(!map0.containsKey("gravityX") || !map0.containsKey("gravityY")) {
            zzfsx0.zzd(81);
        }
        else {
            int v = Integer.parseInt(((String)map0.get("gravityY")));
            zzfsx0.zzd(Integer.parseInt(((String)map0.get("gravityX"))) | v);
        }
        if(map0.containsKey("verticalMargin")) {
            zzfsx0.zze(Float.parseFloat(((String)map0.get("verticalMargin"))));
        }
        else {
            zzfsx0.zze(0.02f);
        }
        if(map0.containsKey("enifd")) {
            zzfsx0.zza(((String)map0.get("enifd")));
        }
        try {
            zzv.zzk().zzj(zzcex0, zzfsx0.zzi());
        }
        catch(NullPointerException nullPointerException0) {
            zzv.zzp().zzw(nullPointerException0, "DefaultGmsgHandlers.ShowLMDOverlay");
            zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}

