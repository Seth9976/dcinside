package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

public final class zzbr implements Runnable {
    public final TaggingLibraryJsInterface zza;
    public final Bundle zzb;
    public final QueryInfoGenerationCallback zzc;

    public zzbr(TaggingLibraryJsInterface taggingLibraryJsInterface0, Bundle bundle0, QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        this.zza = taggingLibraryJsInterface0;
        this.zzb = bundle0;
        this.zzc = queryInfoGenerationCallback0;
    }

    @Override
    public final void run() {
        this.zza.zze(this.zzb, this.zzc);
    }
}

