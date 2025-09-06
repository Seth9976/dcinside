package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class zzck implements zzch {
    private int zzb;
    private float zzc;
    private float zzd;
    private zzcf zze;
    private zzcf zzf;
    private zzcf zzg;
    private zzcf zzh;
    private boolean zzi;
    @Nullable
    private zzcj zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzck() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzcf.zza;
        this.zzf = zzcf.zza;
        this.zzg = zzcf.zza;
        this.zzh = zzcf.zza;
        this.zzk = zzch.zza;
        this.zzl = zzch.zza.asShortBuffer();
        this.zzm = zzch.zza;
        this.zzb = -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final zzcf zza(zzcf zzcf0) throws zzcg {
        if(zzcf0.zzd != 2) {
            throw new zzcg("Unhandled input format:", zzcf0);
        }
        this.zze = zzcf0;
        zzcf zzcf1 = new zzcf((this.zzb == -1 ? zzcf0.zzb : this.zzb), zzcf0.zzc, 2);
        this.zzf = zzcf1;
        this.zzi = true;
        return zzcf1;
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final ByteBuffer zzb() {
        zzcj zzcj0 = this.zzj;
        if(zzcj0 != null) {
            int v = zzcj0.zza();
            if(v > 0) {
                if(this.zzk.capacity() < v) {
                    ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(v).order(ByteOrder.nativeOrder());
                    this.zzk = byteBuffer0;
                    this.zzl = byteBuffer0.asShortBuffer();
                }
                else {
                    this.zzk.clear();
                    this.zzl.clear();
                }
                zzcj0.zzd(this.zzl);
                this.zzo += (long)v;
                this.zzk.limit(v);
                this.zzm = this.zzk;
            }
        }
        ByteBuffer byteBuffer1 = this.zzm;
        this.zzm = zzch.zza;
        return byteBuffer1;
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final void zzc() {
        if(this.zzg()) {
            zzcf zzcf0 = this.zze;
            this.zzg = zzcf0;
            zzcf zzcf1 = this.zzf;
            this.zzh = zzcf1;
            if(this.zzi) {
                this.zzj = new zzcj(zzcf0.zzb, zzcf0.zzc, this.zzc, this.zzd, zzcf1.zzb);
            }
            else {
                zzcj zzcj0 = this.zzj;
                if(zzcj0 != null) {
                    zzcj0.zzc();
                }
            }
        }
        this.zzm = zzch.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final void zzd() {
        zzcj zzcj0 = this.zzj;
        if(zzcj0 != null) {
            zzcj0.zze();
        }
        this.zzp = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final void zze(ByteBuffer byteBuffer0) {
        if(!byteBuffer0.hasRemaining()) {
            return;
        }
        zzcj zzcj0 = this.zzj;
        zzcj0.getClass();
        ShortBuffer shortBuffer0 = byteBuffer0.asShortBuffer();
        int v = byteBuffer0.remaining();
        this.zzn += (long)v;
        zzcj0.zzf(shortBuffer0);
        byteBuffer0.position(byteBuffer0.position() + v);
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzcf.zza;
        this.zzf = zzcf.zza;
        this.zzg = zzcf.zza;
        this.zzh = zzcf.zza;
        this.zzk = zzch.zza;
        this.zzl = zzch.zza.asShortBuffer();
        this.zzm = zzch.zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzch
    public final boolean zzg() {
        return this.zzf.zzb != -1 && (Math.abs(this.zzc - 1.0f) >= 0.0001f || Math.abs(this.zzd - 1.0f) >= 0.0001f || this.zzf.zzb != this.zze.zzb);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzch
    public final boolean zzh() {
        return this.zzp && (this.zzj == null || this.zzj.zza() == 0);
    }

    public final long zzi(long v) {
        long v1 = this.zzo;
        if(v1 >= 0x400L) {
            long v2 = this.zzn;
            zzcj zzcj0 = this.zzj;
            zzcj0.getClass();
            long v3 = v2 - ((long)zzcj0.zzb());
            int v4 = this.zzh.zzb;
            int v5 = this.zzg.zzb;
            return v4 == v5 ? zzei.zzu(v, v3, v1, RoundingMode.DOWN) : zzei.zzu(v, v3 * ((long)v4), v1 * ((long)v5), RoundingMode.DOWN);
        }
        return (long)(((double)this.zzc) * ((double)v));
    }

    public final void zzj(float f) {
        if(this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if(this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}

