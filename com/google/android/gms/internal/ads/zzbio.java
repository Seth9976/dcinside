package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzbio implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzid)).booleanValue()) {
            zzo.zzj("canOpenAppGmsgHandler disabled.");
            return;
        }
        String s = (String)map0.get("package_name");
        if(TextUtils.isEmpty(s)) {
            zzo.zzj("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap0 = new HashMap();
        Boolean boolean0 = Boolean.valueOf(((zzcge)object0).getContext().getPackageManager().getLaunchIntentForPackage(s) != null);
        hashMap0.put(s, boolean0);
        zze.zza(("/canOpenApp;" + s + ";" + boolean0));
        ((zzbmk)(((zzcge)object0))).zzd("openableApp", hashMap0);
    }
}

