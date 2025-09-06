package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.io.IOException;

public abstract class zzhr implements zzlj, zzlm {
    private final Object zza;
    private final int zzb;
    private final zzke zzc;
    @Nullable
    private zzln zzd;
    private int zze;
    private zzog zzf;
    private zzcx zzg;
    private int zzh;
    @Nullable
    private zzvy zzi;
    @Nullable
    private zzab[] zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private zzbq zzp;
    @GuardedBy("lock")
    @Nullable
    private zzll zzq;

    public zzhr(int v) {
        this.zza = new Object();
        this.zzb = v;
        this.zzc = new zzke();
        this.zzm = 0x8000000000000000L;
        this.zzp = zzbq.zza;
    }

    protected void zzA() {
    }

    protected final void zzB() {
        zzll zzll0;
        synchronized(this.zza) {
            zzll0 = this.zzq;
        }
        if(zzll0 != null) {
            zzll0.zza(this);
        }
    }

    protected void zzC() {
    }

    protected void zzD() throws zzib {
    }

    protected void zzE() {
    }

    protected void zzF(zzab[] arr_zzab, long v, long v1, zzug zzug0) throws zzib {
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final void zzG() {
        zzcw.zzf(this.zzh == 0);
        this.zzA();
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final void zzH(zzab[] arr_zzab, zzvy zzvy0, long v, long v1, zzug zzug0) throws zzib {
        zzcw.zzf(!this.zzn);
        this.zzi = zzvy0;
        if(this.zzm == 0x8000000000000000L) {
            this.zzm = v;
        }
        this.zzj = arr_zzab;
        this.zzk = v1;
        this.zzF(arr_zzab, v, v1, zzug0);
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final void zzI() {
        zzcw.zzf(this.zzh == 0);
        this.zzc.zzb = null;
        this.zzc.zza = null;
        this.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final void zzJ(long v) throws zzib {
        this.zzZ(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final void zzK() {
        this.zzn = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzlm
    public final void zzL(zzll zzll0) {
        synchronized(this.zza) {
            this.zzq = zzll0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public void zzM(float f, float f1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final void zzN(zzbq zzbq0) {
        if(!Objects.equals(this.zzp, zzbq0)) {
            this.zzp = zzbq0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final void zzO() throws zzib {
        zzcw.zzf(this.zzh == 1);
        this.zzh = 2;
        this.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final void zzP() {
        zzcw.zzf(this.zzh == 2);
        this.zzh = 1;
        this.zzE();
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final boolean zzQ() {
        return this.zzm == 0x8000000000000000L;
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final boolean zzR() {
        return this.zzn;
    }

    protected final boolean zzS() {
        if(this.zzQ()) {
            return this.zzn;
        }
        zzvy zzvy0 = this.zzi;
        zzvy0.getClass();
        return zzvy0.zze();
    }

    protected final zzab[] zzT() {
        zzab[] arr_zzab = this.zzj;
        arr_zzab.getClass();
        return arr_zzab;
    }

    private final void zzZ(long v, boolean z) throws zzib {
        this.zzn = false;
        this.zzl = v;
        this.zzm = v;
        this.zzz(v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzlj, com.google.android.gms.internal.ads.zzlm
    public final int zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final int zzcT() {
        return this.zzh;
    }

    protected final int zzcU(zzke zzke0, zzhh zzhh0, int v) {
        zzvy zzvy0 = this.zzi;
        zzvy0.getClass();
        int v1 = zzvy0.zza(zzke0, zzhh0, v);
        if(v1 == -4) {
            if(zzhh0.zzf()) {
                this.zzm = 0x8000000000000000L;
                return this.zzn ? -4 : -3;
            }
            long v2 = zzhh0.zze + this.zzk;
            zzhh0.zze = v2;
            this.zzm = Math.max(this.zzm, v2);
            return -4;
        }
        if(v1 == -5) {
            zzab zzab0 = zzke0.zza;
            zzab0.getClass();
            long v3 = zzab0.zzt;
            if(v3 != 0x7FFFFFFFFFFFFFFFL) {
                zzz zzz0 = zzab0.zzb();
                zzz0.zzae(v3 + this.zzk);
                zzke0.zza = zzz0.zzag();
                return -5;
            }
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final long zzcV() {
        return this.zzm;
    }

    protected final zzib zzcW(Throwable throwable0, @Nullable zzab zzab0, boolean z, int v) {
        int v2;
        if(zzab0 != null && !this.zzo) {
            try {
                this.zzo = true;
                v2 = this.zzY(zzab0);
            }
            catch(zzib unused_ex) {
                this.zzo = false;
                return zzib.zzb(throwable0, this.zzU(), this.zze, zzab0, 4, z, v);
            }
            finally {
                this.zzo = false;
            }
            return zzib.zzb(throwable0, this.zzU(), this.zze, zzab0, v2 & 7, z, v);
        }
        return zzib.zzb(throwable0, this.zzU(), this.zze, zzab0, 4, z, v);
    }

    protected final int zzd(long v) {
        zzvy zzvy0 = this.zzi;
        zzvy0.getClass();
        return zzvy0.zzb(v - this.zzk);
    }

    @Override  // com.google.android.gms.internal.ads.zzlm
    public int zze() throws zzib {
        return 0;
    }

    protected final long zzf() {
        return this.zzl;
    }

    protected final zzbq zzh() {
        return this.zzp;
    }

    protected final zzcx zzi() {
        zzcx zzcx0 = this.zzg;
        zzcx0.getClass();
        return zzcx0;
    }

    protected final zzke zzk() {
        this.zzc.zzb = null;
        this.zzc.zza = null;
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    @Nullable
    public zzkk zzl() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final zzlm zzm() {
        return this;
    }

    protected final zzln zzn() {
        zzln zzln0 = this.zzd;
        zzln0.getClass();
        return zzln0;
    }

    protected final zzog zzo() {
        zzog zzog0 = this.zzf;
        zzog0.getClass();
        return zzog0;
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    @Nullable
    public final zzvy zzp() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzlm
    public final void zzq() {
        synchronized(this.zza) {
            this.zzq = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final void zzr() {
        zzcw.zzf(this.zzh == 1);
        this.zzc.zzb = null;
        this.zzc.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        this.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final void zzs(zzln zzln0, zzab[] arr_zzab, zzvy zzvy0, long v, boolean z, boolean z1, long v1, long v2, zzug zzug0) throws zzib {
        zzcw.zzf(this.zzh == 0);
        this.zzd = zzln0;
        this.zzh = 1;
        this.zzy(z, z1);
        this.zzH(arr_zzab, zzvy0, v1, v2, zzug0);
        this.zzZ(v1, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public void zzt() {
    }

    @Override  // com.google.android.gms.internal.ads.zzle
    public void zzu(int v, @Nullable Object object0) throws zzib {
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final void zzv(int v, zzog zzog0, zzcx zzcx0) {
        this.zze = v;
        this.zzf = zzog0;
        this.zzg = zzcx0;
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public final void zzw() throws IOException {
        zzvy zzvy0 = this.zzi;
        zzvy0.getClass();
        zzvy0.zzd();
    }

    protected void zzx() {
        throw null;
    }

    protected void zzy(boolean z, boolean z1) throws zzib {
    }

    protected void zzz(long v, boolean z) throws zzib {
        throw null;
    }
}

