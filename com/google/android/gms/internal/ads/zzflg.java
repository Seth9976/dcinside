package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings.System;

public final class zzflg extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private float zzc;
    private final zzfls zzd;

    public zzflg(Handler handler0, Context context0, zzfle zzfle0, zzfls zzfls0) {
        super(handler0);
        this.zza = context0;
        this.zzb = (AudioManager)context0.getSystemService("audio");
        this.zzd = zzfls0;
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float f = this.zzc();
        if(f != this.zzc) {
            this.zzc = f;
            this.zzd();
        }
    }

    public final void zza() {
        this.zzc = this.zzc();
        this.zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }

    private final float zzc() {
        int v = this.zzb.getStreamVolume(3);
        int v1 = this.zzb.getStreamMaxVolume(3);
        if(v1 > 0 && v > 0) {
            float f = ((float)v) / ((float)v1);
            return f > 1.0f ? 1.0f : f;
        }
        return 0.0f;
    }

    private final void zzd() {
        this.zzd.zze(this.zzc);
    }
}

