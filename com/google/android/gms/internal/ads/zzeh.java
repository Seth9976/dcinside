package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

public final class zzeh implements ThreadFactory {
    public final String zza;

    public zzeh(String s) {
        this.zza = "ExoPlayer:AudioTrackReleaseThread";
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return new Thread(runnable0, this.zza);
    }
}

