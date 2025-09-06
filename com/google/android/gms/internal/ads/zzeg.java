package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

public final class zzeg implements ThreadFactory {
    public final String zza;

    public zzeg(String s) {
        this.zza = "ExoPlayer:Loader:ProgressiveMediaPeriod";
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return new Thread(runnable0, this.zza);
    }
}

