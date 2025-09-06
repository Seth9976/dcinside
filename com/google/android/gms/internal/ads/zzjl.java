package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.TextureView.SurfaceTextureListener;
import androidx.annotation.Nullable;

final class zzjl implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabc, zzhk, zzhp, zzpf, zzte, zzwm {
    final zzjp zza;
    public static final int zzb;

    zzjl(zzjp zzjp0, zzjo zzjo0) {
        this.zza = zzjp0;
        super();
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        zzjp.zzK(this.zza, surfaceTexture0);
        this.zza.zzZ(v, v1);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        zzjp.zzL(this.zza, null);
        this.zza.zzZ(0, 0);
        return true;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        this.zza.zzZ(v, v1);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
        this.zza.zzZ(v1, v2);
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder0) {
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
        this.zza.zzZ(0, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpf
    public final void zza(Exception exception0) {
        this.zza.zzq.zzv(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpf
    public final void zzb(String s, long v, long v1) {
        this.zza.zzq.zzw(s, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzpf
    public final void zzc(String s) {
        this.zza.zzq.zzx(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzpf
    public final void zzd(zzhs zzhs0) {
        this.zza.zzq.zzy(zzhs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpf
    public final void zze(zzhs zzhs0) {
        this.zza.zzq.zzz(zzhs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpf
    public final void zzf(zzab zzab0, @Nullable zzht zzht0) {
        this.zza.zzq.zzA(zzab0, zzht0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpf
    public final void zzg(long v) {
        this.zza.zzq.zzB(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzpf
    public final void zzh(Exception exception0) {
        this.zza.zzq.zzC(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpf
    public final void zzi(zzpg zzpg0) {
        this.zza.zzq.zzD(zzpg0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpf
    public final void zzj(zzpg zzpg0) {
        this.zza.zzq.zzE(zzpg0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpf
    public final void zzk(int v, long v1, long v2) {
        this.zza.zzq.zzF(v, v1, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzabc
    public final void zzl(int v, long v1) {
        this.zza.zzq.zzG(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzabc
    public final void zzm(Object object0, long v) {
        this.zza.zzq.zzH(object0, v);
        zzjp zzjp0 = this.zza;
        if(zzjp0.zzF == object0) {
            zzdn zzdn0 = zzjp0.zzl;
            zzdn0.zzd(26, new zzjk());
            zzdn0.zzc();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpf
    public final void zzn(boolean z) {
        zzjp zzjp0 = this.zza;
        if(zzjp0.zzM == z) {
            return;
        }
        zzjp0.zzM = z;
        zzdn zzdn0 = this.zza.zzl;
        zzdn0.zzd(23, new zzji(z));
        zzdn0.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzabc
    public final void zzo(Exception exception0) {
        this.zza.zzq.zzJ(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzabc
    public final void zzp(String s, long v, long v1) {
        this.zza.zzq.zzK(s, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzabc
    public final void zzq(String s) {
        this.zza.zzq.zzL(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzabc
    public final void zzr(zzhs zzhs0) {
        this.zza.zzq.zzM(zzhs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzabc
    public final void zzs(zzhs zzhs0) {
        this.zza.zzq.zzN(zzhs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzabc
    public final void zzt(long v, int v1) {
        this.zza.zzq.zzO(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzabc
    public final void zzu(zzab zzab0, @Nullable zzht zzht0) {
        this.zza.zzq.zzP(zzab0, zzht0);
    }

    @Override  // com.google.android.gms.internal.ads.zzabc
    public final void zzv(zzcd zzcd0) {
        zzdn zzdn0 = this.zza.zzl;
        zzdn0.zzd(25, new zzjj(zzcd0));
        zzdn0.zzc();
    }
}

