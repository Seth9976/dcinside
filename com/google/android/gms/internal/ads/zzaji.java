package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

final class zzaji implements zzajo {
    private final zzajn zza;
    private final long zzb;
    private final long zzc;
    private final zzajt zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaji(zzajt zzajt0, long v, long v1, long v2, long v3, boolean z) {
        zzcw.zzd(v >= 0L && v1 > v);
        this.zzd = zzajt0;
        this.zzb = v;
        this.zzc = v1;
        if(v2 == v1 - v || z) {
            this.zzf = v3;
            this.zze = 4;
        }
        else {
            this.zze = 0;
        }
        this.zza = new zzajn();
    }

    @Override  // com.google.android.gms.internal.ads.zzajo
    public final long zzd(zzaco zzaco0) throws IOException {
        long v5;
        switch(this.zze) {
            case 0: {
                long v = zzaco0.zzf();
                this.zzg = v;
                this.zze = 1;
                long v1 = this.zzc - 0xFF1BL;
                if(v1 > v) {
                    return v1;
                }
                goto label_8;
            }
            case 1: {
            label_8:
                this.zza.zza();
                if(!this.zza.zzc(zzaco0, -1L)) {
                    throw new EOFException();
                }
                this.zza.zzb(zzaco0, false);
                zzaco0.zzk(this.zza.zzd + this.zza.zze);
                long v2;
                for(v2 = this.zza.zzb; (this.zza.zza & 4) != 4 && this.zza.zzc(zzaco0, -1L) && zzaco0.zzf() < this.zzc && this.zza.zzb(zzaco0, true) && zzacr.zze(zzaco0, this.zza.zzd + this.zza.zze); v2 = this.zza.zzb) {
                }
                this.zzf = v2;
                this.zze = 4;
                return this.zzg;
            }
            case 2: {
                long v3 = this.zzj;
                if(this.zzi == v3) {
                    v5 = -1L;
                }
                else {
                    long v4 = zzaco0.zzf();
                    if(this.zza.zzc(zzaco0, v3)) {
                        this.zza.zzb(zzaco0, false);
                        zzaco0.zzj();
                        long v6 = this.zza.zzb;
                        long v7 = this.zzh - v6;
                        int v8 = this.zza.zzd + this.zza.zze;
                        int v9 = Long.compare(v7, 0L);
                        if(v9 >= 0 && v7 < 72000L) {
                            v5 = -1L;
                        }
                        else {
                            if(v9 < 0) {
                                this.zzj = v4;
                                this.zzl = v6;
                            }
                            else {
                                this.zzi = ((long)v8) + zzaco0.zzf();
                                this.zzk = v6;
                            }
                            long v10 = this.zzj;
                            long v11 = this.zzi;
                            long v12 = v10 - v11;
                            if(v12 < 100000L) {
                                this.zzj = v11;
                                v5 = v11;
                            }
                            else {
                                v5 = Math.max(v11, Math.min(zzaco0.zzf() - ((long)v8) * (v9 > 0 ? 1L : 2L) + v7 * v12 / (this.zzl - this.zzk), v10 - 1L));
                            }
                        }
                    }
                    else {
                        v5 = this.zzi;
                        if(v5 == v4) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                if(v5 != -1L) {
                    return v5;
                }
                this.zze = 3;
                break;
            }
            case 3: {
                break;
            }
            default: {
                return -1L;
            }
        }
        while(true) {
            this.zza.zzc(zzaco0, -1L);
            this.zza.zzb(zzaco0, false);
            zzajn zzajn0 = this.zza;
            if(zzajn0.zzb > this.zzh) {
                break;
            }
            zzaco0.zzk(zzajn0.zzd + zzajn0.zze);
            this.zzi = zzaco0.zzf();
            this.zzk = this.zza.zzb;
        }
        zzaco0.zzj();
        this.zze = 4;
        return -(this.zzk + 2L);
    }

    @Override  // com.google.android.gms.internal.ads.zzajo
    @Nullable
    public final zzadm zze() {
        return this.zzf != 0L ? new zzajg(this, null) : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzajo
    public final void zzg(long v) {
        this.zzh = Math.max(0L, Math.min(v, this.zzf - 1L));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}

