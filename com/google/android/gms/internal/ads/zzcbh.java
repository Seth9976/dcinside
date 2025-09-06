package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

public final class zzcbh {
    private final Context zza;
    private final zzcbs zzb;
    private final ViewGroup zzc;
    private zzcbg zzd;

    public zzcbh(Context context0, ViewGroup viewGroup0, zzcex zzcex0) {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.zza = context0;
        this.zzc = viewGroup0;
        this.zzb = zzcex0;
        this.zzd = null;
    }

    public final zzcbg zza() {
        return this.zzd;
    }

    @Nullable
    public final Integer zzb() {
        return this.zzd == null ? null : this.zzd.zzl();
    }

    public final void zzc(int v, int v1, int v2, int v3) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcbg zzcbg0 = this.zzd;
        if(zzcbg0 != null) {
            zzcbg0.zzF(v, v1, v2, v3);
        }
    }

    public final void zzd(int v, int v1, int v2, int v3, int v4, boolean z, zzcbr zzcbr0) {
        if(this.zzd != null) {
            return;
        }
        zzbcs.zza(this.zzb.zzm().zza(), this.zzb.zzk(), new String[]{"vpr2"});
        zzbda zzbda0 = this.zzb.zzm().zza();
        zzcbg zzcbg0 = new zzcbg(this.zza, this.zzb, v4, z, zzbda0, zzcbr0);
        this.zzd = zzcbg0;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -1);
        this.zzc.addView(zzcbg0, 0, viewGroup$LayoutParams0);
        this.zzd.zzF(v, v1, v2, v3);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcbg zzcbg0 = this.zzd;
        if(zzcbg0 != null) {
            zzcbg0.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcbg zzcbg0 = this.zzd;
        if(zzcbg0 != null) {
            zzcbg0.zzu();
        }
    }

    public final void zzg(int v) {
        zzcbg zzcbg0 = this.zzd;
        if(zzcbg0 != null) {
            zzcbg0.zzC(v);
        }
    }
}

