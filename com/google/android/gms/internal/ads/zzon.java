package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import j..util.Objects;

public final class zzon {
    private final Context zza;
    private final Handler zzb;
    @Nullable
    private final zzoj zzc;
    private final BroadcastReceiver zzd;
    @Nullable
    private final zzok zze;
    @Nullable
    private zzoi zzf;
    @Nullable
    private zzoo zzg;
    private zze zzh;
    private boolean zzi;
    private final zzpw zzj;

    zzon(Context context0, zzpw zzpw0, zze zze0, @Nullable zzoo zzoo0) {
        Context context1 = context0.getApplicationContext();
        this.zza = context1;
        this.zzj = zzpw0;
        this.zzh = zze0;
        this.zzg = zzoo0;
        zzok zzok0 = null;
        Handler handler0 = new Handler(zzei.zzz(), null);
        this.zzb = handler0;
        this.zzc = zzei.zza < 23 ? null : new zzoj(this, null);
        this.zzd = new zzol(this, null);
        Uri uri0 = zzoi.zza();
        if(uri0 != null) {
            zzok0 = new zzok(this, handler0, context1.getContentResolver(), uri0);
        }
        this.zze = zzok0;
    }

    public final zzoi zzc() {
        if(this.zzi) {
            zzoi zzoi0 = this.zzf;
            zzoi0.getClass();
            return zzoi0;
        }
        this.zzi = true;
        zzok zzok0 = this.zze;
        if(zzok0 != null) {
            zzok0.zza();
        }
        if(zzei.zza >= 23) {
            zzoj zzoj0 = this.zzc;
            if(zzoj0 != null) {
                AudioManager audioManager0 = (AudioManager)this.zza.getSystemService("audio");
                audioManager0.getClass();
                audioManager0.registerAudioDeviceCallback(zzoj0, this.zzb);
            }
        }
        IntentFilter intentFilter0 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Intent intent0 = this.zza.registerReceiver(this.zzd, intentFilter0, null, this.zzb);
        zzoi zzoi1 = zzoi.zzd(this.zza, intent0, this.zzh, this.zzg);
        this.zzf = zzoi1;
        return zzoi1;
    }

    static void zze(zzon zzon0, zzoo zzoo0) {
        zzon0.zzg = null;
    }

    public final void zzg(zze zze0) {
        this.zzh = zze0;
        this.zzj(zzoi.zzc(this.zza, zze0, this.zzg));
    }

    @RequiresApi(23)
    public final void zzh(@Nullable AudioDeviceInfo audioDeviceInfo0) {
        zzoo zzoo0 = null;
        if(Objects.equals(audioDeviceInfo0, (this.zzg == null ? null : this.zzg.zza))) {
            return;
        }
        if(audioDeviceInfo0 != null) {
            zzoo0 = new zzoo(audioDeviceInfo0);
        }
        this.zzg = zzoo0;
        this.zzj(zzoi.zzc(this.zza, this.zzh, zzoo0));
    }

    public final void zzi() {
        if(!this.zzi) {
            return;
        }
        this.zzf = null;
        if(zzei.zza >= 23) {
            zzoj zzoj0 = this.zzc;
            if(zzoj0 != null) {
                AudioManager audioManager0 = (AudioManager)this.zza.getSystemService("audio");
                audioManager0.getClass();
                audioManager0.unregisterAudioDeviceCallback(zzoj0);
            }
        }
        this.zza.unregisterReceiver(this.zzd);
        zzok zzok0 = this.zze;
        if(zzok0 != null) {
            zzok0.zzb();
        }
        this.zzi = false;
    }

    private final void zzj(zzoi zzoi0) {
        if(this.zzi && !zzoi0.equals(this.zzf)) {
            this.zzf = zzoi0;
            this.zzj.zza.zzJ(zzoi0);
        }
    }
}

