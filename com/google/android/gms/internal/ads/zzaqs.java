package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

final class zzaqs implements zzaqh {
    final Context zza;
    private File zzb;

    zzaqs(Context context0) {
        this.zza = context0;
        super();
        this.zzb = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqh
    public final File zza() {
        if(this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}

