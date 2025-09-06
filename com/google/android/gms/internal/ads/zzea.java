package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

public final class zzea implements zzcx {
    @Override  // com.google.android.gms.internal.ads.zzcx
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override  // com.google.android.gms.internal.ads.zzcx
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override  // com.google.android.gms.internal.ads.zzcx
    public final long zzc() {
        return System.nanoTime();
    }

    @Override  // com.google.android.gms.internal.ads.zzcx
    public final zzdh zzd(Looper looper0, @Nullable Handler.Callback handler$Callback0) {
        return new zzed(new Handler(looper0, handler$Callback0));
    }
}

