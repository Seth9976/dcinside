package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcl;
import java.util.concurrent.Callable;

public final class zzk implements Callable {
    public final WebSettings zza;
    public final Context zzb;

    public zzk(WebSettings webSettings0, Context context0) {
        this.zza = webSettings0;
        this.zzb = context0;
    }

    @Override
    public final Object call() {
        String s = this.zzb.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
        WebSettings webSettings0 = this.zza;
        webSettings0.setDatabasePath(s);
        webSettings0.setDatabaseEnabled(true);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setDisplayZoomControls(false);
        webSettings0.setBuiltInZoomControls(true);
        webSettings0.setSupportZoom(true);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzaV)).booleanValue()) {
            webSettings0.setTextZoom(100);
        }
        webSettings0.setAllowContentAccess(false);
        return true;
    }
}

