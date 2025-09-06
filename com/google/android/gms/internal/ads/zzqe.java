package com.google.android.gms.internal.ads;

import android.media.AudioRouting.OnRoutingChangedListener;
import android.media.AudioRouting;

public final class zzqe implements AudioRouting.OnRoutingChangedListener {
    public final zzqf zza;

    public zzqe(zzqf zzqf0) {
        this.zza = zzqf0;
    }

    @Override  // android.media.AudioRouting$OnRoutingChangedListener
    public final void onRoutingChanged(AudioRouting audioRouting0) {
        zzqf.zza(this.zza, audioRouting0);
    }
}

