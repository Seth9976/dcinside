package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzdjp implements zzbjp {
    public final zzdjt zza;

    public zzdjp(zzdjt zzdjt0) {
        this.zza = zzdjt0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        ((zzcex)object0).zzN().zzC(new zzdjs(this.zza, map0));
        Object object1 = map0.get("overlayHtml");
        Object object2 = map0.get("baseUrl");
        if(TextUtils.isEmpty(((String)object2))) {
            ((zzcex)object0).loadData(((String)object1), "text/html", "UTF-8");
            return;
        }
        ((zzcex)object0).loadDataWithBaseURL(((String)object2), ((String)object1), "text/html", "UTF-8", null);
    }
}

