package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.File;
import java.util.Collections;
import java.util.Map;

public class zzcgf extends zzcff {
    public zzcgf(zzcex zzcex0, zzbbj zzbbj0, boolean z, @Nullable zzebv zzebv0) {
        super(zzcex0, zzbbj0, z, new zzbsh(zzcex0, zzcex0.zzE(), new zzbbt(zzcex0.getContext())), null, zzebv0);
    }

    @Nullable
    protected final WebResourceResponse zzW(WebView webView0, String s, @Nullable Map map0) {
        String s1;
        if(!(webView0 instanceof zzcex)) {
            zzo.zzj("Tried to intercept request from a WebView that wasn\'t an AdWebView.");
            return null;
        }
        zzbxu zzbxu0 = this.zza;
        if(zzbxu0 != null) {
            zzbxu0.zzd(s, map0, 1);
        }
        if(!"mraid.js".equalsIgnoreCase(new File(s).getName())) {
            if(map0 == null) {
                map0 = Collections.emptyMap();
            }
            return super.zzc(s, map0);
        }
        if(((zzcex)webView0).zzN() != null) {
            ((zzcex)webView0).zzN().zzH();
        }
        if(((zzcex)webView0).zzO().zzi()) {
            s1 = (String)zzbe.zzc().zza(zzbcl.zzaa);
            return zzs.zzy(((zzcex)webView0).getContext(), ((zzcex)webView0).zzn().afmaVersion, s1);
        }
        if(((zzcex)webView0).zzaF()) {
            s1 = (String)zzbe.zzc().zza(zzbcl.zzZ);
            return zzs.zzy(((zzcex)webView0).getContext(), ((zzcex)webView0).zzn().afmaVersion, s1);
        }
        s1 = (String)zzbe.zzc().zza(zzbcl.zzY);
        return zzs.zzy(((zzcex)webView0).getContext(), ((zzcex)webView0).zzn().afmaVersion, s1);
    }
}

