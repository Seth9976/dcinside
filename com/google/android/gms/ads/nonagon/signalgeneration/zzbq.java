package com.google.android.gms.ads.nonagon.signalgeneration;

import java.util.concurrent.Callable;

public final class zzbq implements Callable {
    public final TaggingLibraryJsInterface zza;
    public final String zzb;

    public zzbq(TaggingLibraryJsInterface taggingLibraryJsInterface0, String s) {
        this.zza = taggingLibraryJsInterface0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        return this.zza.getClickSignals(this.zzb);
    }
}

