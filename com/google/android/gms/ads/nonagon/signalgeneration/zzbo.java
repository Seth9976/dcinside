package com.google.android.gms.ads.nonagon.signalgeneration;

import java.util.concurrent.Callable;

public final class zzbo implements Callable {
    public final TaggingLibraryJsInterface zza;

    public zzbo(TaggingLibraryJsInterface taggingLibraryJsInterface0) {
        this.zza = taggingLibraryJsInterface0;
    }

    @Override
    public final Object call() {
        return this.zza.getViewSignals();
    }
}

