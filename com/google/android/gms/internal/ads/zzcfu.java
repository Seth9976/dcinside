package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

final class zzcfu implements zzbjp {
    final zzcfw zza;

    zzcfu(zzcfw zzcfw0) {
        this.zza = zzcfw0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzcex zzcex0 = (zzcex)object0;
        if(map0 != null) {
            String s = (String)map0.get("height");
            if(!TextUtils.isEmpty(s)) {
                try {
                    int v = Integer.parseInt(s);
                    zzcfw zzcfw0 = this.zza;
                    synchronized(zzcfw0) {
                        zzcfw zzcfw1 = this.zza;
                        if(zzcfw1.zzI != v) {
                            zzcfw1.zzI = v;
                            this.zza.requestLayout();
                        }
                    }
                }
                catch(Exception exception0) {
                    zzo.zzk("Exception occurred while getting webview content height", exception0);
                }
            }
        }
    }
}

