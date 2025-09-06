package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

public final class zzhm implements zzfvf {
    public final Context zza;

    public zzhm(Context context0) {
        this.zza = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        AudioManager audioManager0 = (AudioManager)this.zza.getApplicationContext().getSystemService("audio");
        audioManager0.getClass();
        return audioManager0;
    }
}

