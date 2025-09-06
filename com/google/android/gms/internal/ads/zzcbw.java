package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioManager;

public final class zzcbw implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzcbv zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf;

    public zzcbw(Context context0, zzcbv zzcbv0) {
        this.zzf = 1.0f;
        this.zza = (AudioManager)context0.getSystemService("audio");
        this.zzb = zzcbv0;
    }

    @Override  // android.media.AudioManager$OnAudioFocusChangeListener
    public final void onAudioFocusChange(int v) {
        this.zzc = v > 0;
        this.zzb.zzn();
    }

    // 去混淆评级： 低(40)
    public final float zza() {
        return this.zzc ? (this.zze ? 0.0f : this.zzf) : 0.0f;
    }

    public final void zzb() {
        this.zzd = true;
        this.zzf();
    }

    public final void zzc() {
        this.zzd = false;
        this.zzf();
    }

    public final void zzd(boolean z) {
        this.zze = z;
        this.zzf();
    }

    public final void zze(float f) {
        this.zzf = f;
        this.zzf();
    }

    private final void zzf() {
        boolean z = false;
        if(this.zzd && !this.zze && this.zzf > 0.0f) {
            if(!this.zzc) {
                AudioManager audioManager0 = this.zza;
                if(audioManager0 != null) {
                    if(audioManager0.requestAudioFocus(this, 3, 2) == 1) {
                        z = true;
                    }
                    this.zzc = z;
                }
                this.zzb.zzn();
            }
        }
        else if(this.zzc) {
            AudioManager audioManager1 = this.zza;
            if(audioManager1 != null) {
                if(audioManager1.abandonAudioFocus(this) == 0) {
                    z = true;
                }
                this.zzc = z;
            }
            this.zzb.zzn();
        }
    }
}

