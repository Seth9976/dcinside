package com.google.android.gms.internal.ads;

import android.media.AudioTrack.StreamEventCallback;
import android.media.AudioTrack;

final class zzqj extends AudioTrack.StreamEventCallback {
    final zzqk zza;

    zzqj(zzqk zzqk0) {
        this.zza = zzqk0;
        super();
    }

    @Override  // android.media.AudioTrack$StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack0, int v) {
        audioTrack0.equals(this.zza.zza.zzt);
    }

    @Override  // android.media.AudioTrack$StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack0) {
        if(!audioTrack0.equals(this.zza.zza.zzt)) {
            return;
        }
        zzqm.zzH(this.zza.zza, true);
    }

    @Override  // android.media.AudioTrack$StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack0) {
        audioTrack0.equals(this.zza.zza.zzt);
    }
}

