package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class zzci implements zzch {
    protected zzcf zzb;
    protected zzcf zzc;
    private zzcf zzd;
    private zzcf zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzci() {
        this.zzf = zzch.zza;
        this.zzg = zzch.zza;
        this.zzd = zzcf.zza;
        this.zze = zzcf.zza;
        this.zzb = zzcf.zza;
        this.zzc = zzcf.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final zzcf zza(zzcf zzcf0) throws zzcg {
        this.zzd = zzcf0;
        this.zze = this.zzi(zzcf0);
        return this.zzg() ? this.zze : zzcf.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    @CallSuper
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer0 = this.zzg;
        this.zzg = zzch.zza;
        return byteBuffer0;
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final void zzc() {
        this.zzg = zzch.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        this.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final void zzd() {
        this.zzh = true;
        this.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final void zzf() {
        this.zzc();
        this.zzf = zzch.zza;
        this.zzd = zzcf.zza;
        this.zze = zzcf.zza;
        this.zzb = zzcf.zza;
        this.zzc = zzcf.zza;
        this.zzm();
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    @CallSuper
    public boolean zzg() {
        return this.zze != zzcf.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    @CallSuper
    public boolean zzh() {
        return this.zzh && this.zzg == zzch.zza;
    }

    protected zzcf zzi(zzcf zzcf0) throws zzcg {
        throw null;
    }

    protected final ByteBuffer zzj(int v) {
        if(this.zzf.capacity() < v) {
            this.zzf = ByteBuffer.allocateDirect(v).order(ByteOrder.nativeOrder());
        }
        else {
            this.zzf.clear();
        }
        this.zzg = this.zzf;
        return this.zzf;
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    protected final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}

