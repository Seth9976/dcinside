package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
import androidx.annotation.Nullable;

public abstract class zzcay extends TextureView implements zzcbv {
    protected final zzcbm zza;
    protected final zzcbw zzb;

    public zzcay(Context context0) {
        super(context0);
        this.zza = new zzcbm();
        this.zzb = new zzcbw(context0, this);
    }

    public void zzA(int v) {
    }

    public void zzB(int v) {
    }

    public void zzC(@Nullable String s, @Nullable String[] arr_s, @Nullable Integer integer0) {
        this.zzs(s);
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract int zzc();

    public abstract int zzd();

    public abstract int zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract long zzh();

    public abstract String zzj();

    @Override  // com.google.android.gms.internal.ads.zzcbv
    public abstract void zzn();

    public abstract void zzo();

    public abstract void zzp();

    public abstract void zzq(int arg1);

    public abstract void zzr(zzcax arg1);

    public abstract void zzs(@Nullable String arg1);

    public abstract void zzt();

    public abstract void zzu(float arg1, float arg2);

    @Nullable
    public Integer zzw() {
        return null;
    }

    public void zzx(int v) {
    }

    public void zzy(int v) {
    }

    public void zzz(int v) {
    }
}

