package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

public final class zzty implements zzud, zzue {
    public final zzug zza;
    private final long zzb;
    private zzui zzc;
    private zzue zzd;
    @Nullable
    private zzud zze;
    private long zzf;
    private final zzyk zzg;

    public zzty(zzug zzug0, zzyk zzyk0, long v) {
        this.zza = zzug0;
        this.zzg = zzyk0;
        this.zzb = v;
        this.zzf = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zza(long v, zzlp zzlp0) {
        return this.zzd.zza(v, zzlp0);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzb() {
        return this.zzd.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzc() {
        return this.zzd.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        return this.zzd.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zze(long v) {
        return this.zzd.zze(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzf(zzxv[] arr_zzxv, boolean[] arr_z, zzvy[] arr_zzvy, boolean[] arr_z1, long v) {
        long v1 = this.zzf == 0x8000000000000001L || v != this.zzb ? v : this.zzf;
        this.zzf = 0x8000000000000001L;
        return this.zzd.zzf(arr_zzxv, arr_z, arr_zzvy, arr_z1, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzvz
    public final void zzg(zzwa zzwa0) {
        zzue zzue0 = (zzue)zzwa0;
        this.zze.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final zzwj zzh() {
        return this.zzd.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzud
    public final void zzi(zzue zzue0) {
        this.zze.zzi(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzj(long v, boolean z) {
        this.zzd.zzj(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws IOException {
        zzue zzue0 = this.zzd;
        if(zzue0 != null) {
            zzue0.zzk();
            return;
        }
        zzui zzui0 = this.zzc;
        if(zzui0 != null) {
            zzui0.zzz();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzl(zzud zzud0, long v) {
        this.zze = zzud0;
        zzue zzue0 = this.zzd;
        if(zzue0 != null) {
            zzue0.zzl(this, this.zzv(this.zzb));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzm(long v) {
        this.zzd.zzm(v);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final boolean zzo(zzkj zzkj0) {
        return this.zzd != null && this.zzd.zzo(zzkj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final boolean zzp() {
        return this.zzd != null && this.zzd.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzug zzug0) {
        long v = this.zzv(this.zzb);
        zzui zzui0 = this.zzc;
        zzui0.getClass();
        zzue zzue0 = zzui0.zzI(zzug0, this.zzg, v);
        this.zzd = zzue0;
        if(this.zze != null) {
            zzue0.zzl(this, v);
        }
    }

    public final void zzs(long v) {
        this.zzf = v;
    }

    public final void zzt() {
        zzue zzue0 = this.zzd;
        if(zzue0 != null) {
            zzui zzui0 = this.zzc;
            zzui0.getClass();
            zzui0.zzG(zzue0);
        }
    }

    public final void zzu(zzui zzui0) {
        zzcw.zzf(this.zzc == null);
        this.zzc = zzui0;
    }

    private final long zzv(long v) {
        return this.zzf == 0x8000000000000001L ? v : this.zzf;
    }
}

