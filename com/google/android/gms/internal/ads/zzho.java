package com.google.android.gms.internal.ads;

import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;

final class zzho implements AudioManager.OnAudioFocusChangeListener {
    final zzhq zza;
    private final Handler zzb;

    public zzho(zzhq zzhq0, Handler handler0) {
        this.zza = zzhq0;
        super();
        this.zzb = handler0;
    }

    @Override  // android.media.AudioManager$OnAudioFocusChangeListener
    public final void onAudioFocusChange(int v) {
        zzhn zzhn0 = new zzhn(this, v);
        this.zzb.post(zzhn0);
    }
}

