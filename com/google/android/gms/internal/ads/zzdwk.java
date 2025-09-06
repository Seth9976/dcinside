package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.Callable;

public final class zzdwk implements Callable {
    public final CookieManager zza;

    public zzdwk(CookieManager cookieManager0) {
        this.zza = cookieManager0;
    }

    @Override
    public final Object call() {
        return this.zza == null ? "" : this.zza.getCookie(((String)zzbe.zzc().zza(zzbcl.zzaY)));
    }
}

