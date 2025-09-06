package com.google.android.gms.ads.nonagon.signalgeneration;

public final class zzbp implements Runnable {
    public final TaggingLibraryJsInterface zza;
    public final String zzb;

    public zzbp(TaggingLibraryJsInterface taggingLibraryJsInterface0, String s) {
        this.zza = taggingLibraryJsInterface0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzf(this.zzb);
    }
}

