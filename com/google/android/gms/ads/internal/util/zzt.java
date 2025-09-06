package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzebv;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
public class zzt extends zzaa {
    public zzt() {
        super(null);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    @Nullable
    public final CookieManager zza(Context context0) {
        if(zzs.zzG()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        }
        catch(Throwable throwable0) {
            zzo.zzh("Failed to obtain CookieManager.", throwable0);
            zzv.zzp().zzv(throwable0, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final WebResourceResponse zzb(String s, String s1, int v, String s2, Map map0, InputStream inputStream0) {
        return new WebResourceResponse(s, s1, v, s2, map0, inputStream0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final zzcff zzc(zzcex zzcex0, zzbbj zzbbj0, boolean z, @Nullable zzebv zzebv0) {
        return new zzcgg(zzcex0, zzbbj0, z, zzebv0);
    }
}

