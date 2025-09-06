package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class zzapd {
    private final Executor zza;

    public zzapd(Handler handler0) {
        this.zza = new zzapb(this, handler0);
    }

    public final void zza(zzapm zzapm0, zzapv zzapv0) {
        zzapm0.zzm("post-error");
        zzapc zzapc0 = new zzapc(zzapm0, zzaps.zza(zzapv0), null);
        ((zzapb)this.zza).zza.post(zzapc0);
    }

    public final void zzb(zzapm zzapm0, zzaps zzaps0, Runnable runnable0) {
        zzapm0.zzq();
        zzapm0.zzm("post-response");
        zzapc zzapc0 = new zzapc(zzapm0, zzaps0, runnable0);
        ((zzapb)this.zza).zza.post(zzapc0);
    }
}

