package com.google.android.gms.internal.ads;

import android.util.SparseArray;

final class zzamp {
    private final zzadt zza;
    private final SparseArray zzb;
    private final SparseArray zzc;
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzamp(zzadt zzadt0, boolean z, boolean z1) {
        this.zza = zzadt0;
        this.zzb = new SparseArray();
        this.zzc = new SparseArray();
        byte[] arr_b = new byte[0x80];
        this.zzd = arr_b;
        new zzfl(arr_b, 0, 0);
        this.zzh = false;
    }

    public final void zza(long v) {
        this.zzh();
        this.zzf = v;
        this.zzg(0);
        this.zzh = false;
    }

    public final void zzb(zzfi zzfi0) {
        this.zzc.append(zzfi0.zza, zzfi0);
    }

    public final void zzc(zzfj zzfj0) {
        this.zzb.append(zzfj0.zzd, zzfj0);
    }

    public final void zzd() {
        this.zzh = false;
    }

    public final void zze(long v, int v1, long v2, boolean z) {
        this.zze = v1;
        this.zzg = v2;
        this.zzf = v;
        this.zzl = z;
    }

    public final boolean zzf(long v, int v1, boolean z) {
        if(this.zze == 9) {
            if(z && this.zzh) {
                this.zzg(v1 + ((int)(v - this.zzf)));
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        this.zzh();
        return this.zzk;
    }

    private final void zzg(int v) {
        long v1 = this.zzj;
        if(v1 == 0x8000000000000001L) {
            return;
        }
        this.zza.zzt(v1, ((int)this.zzk), ((int)(this.zzf - this.zzi)), v, null);
    }

    private final void zzh() {
        this.zzk |= this.zze == 5 || this.zzl && this.zze == 1;
    }
}

