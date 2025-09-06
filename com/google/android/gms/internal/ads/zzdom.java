package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

public final class zzdom implements zzcgn {
    public final Bundle zza;
    public final zzcab zzb;

    public zzdom(Bundle bundle0, zzcab zzcab0) {
        this.zza = bundle0;
        this.zzb = zzcab0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zza(boolean z, int v, String s, String s1) {
        zzcab zzcab0 = this.zzb;
        if(z) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
                long v1 = zzv.zzC().currentTimeMillis();
                this.zza.putLong("rendering-webview-load-html-end", v1);
            }
            zzcab0.zzc(null);
            return;
        }
        zzcab0.zzd(new Exception("Ad Web View failed to load. Error code: " + v + ", Description: " + s + ", Failing URL: " + s1));
    }
}

