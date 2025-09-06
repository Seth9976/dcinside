package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public final class zzacy {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    @Nullable
    public final zzacx zzk;
    @Nullable
    private final zzay zzl;

    private zzacy(int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7, @Nullable zzacx zzacx0, @Nullable zzay zzay0) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = v4;
        this.zzf = zzacy.zzi(v4);
        this.zzg = v5;
        this.zzh = v6;
        this.zzi = zzacy.zzh(v6);
        this.zzj = v7;
        this.zzk = zzacx0;
        this.zzl = zzay0;
    }

    public zzacy(byte[] arr_b, int v) {
        zzdx zzdx0 = new zzdx(arr_b, arr_b.length);
        zzdx0.zzl(v * 8);
        this.zza = zzdx0.zzd(16);
        this.zzb = zzdx0.zzd(16);
        this.zzc = zzdx0.zzd(24);
        this.zzd = zzdx0.zzd(24);
        int v1 = zzdx0.zzd(20);
        this.zze = v1;
        this.zzf = zzacy.zzi(v1);
        this.zzg = zzdx0.zzd(3) + 1;
        int v2 = zzdx0.zzd(5);
        this.zzh = v2 + 1;
        this.zzi = zzacy.zzh(v2 + 1);
        this.zzj = zzdx0.zze(36);
        this.zzk = null;
        this.zzl = null;
    }

    public final long zza() {
        return this.zzj == 0L ? 0x8000000000000001L : this.zzj * 1000000L / ((long)this.zze);
    }

    public final long zzb(long v) {
        return Math.max(0L, Math.min(v * ((long)this.zze) / 1000000L, this.zzj - 1L));
    }

    public final zzab zzc(byte[] arr_b, @Nullable zzay zzay0) {
        arr_b[4] = (byte)0x80;
        zzay zzay1 = this.zzd(zzay0);
        zzz zzz0 = new zzz();
        zzz0.zzaa("audio/flac");
        zzz0.zzR((this.zzd > 0 ? this.zzd : -1));
        zzz0.zzz(this.zzg);
        zzz0.zzab(this.zze);
        zzz0.zzU(zzei.zzn(this.zzh));
        zzz0.zzN(Collections.singletonList(arr_b));
        zzz0.zzT(zzay1);
        return zzz0.zzag();
    }

    @Nullable
    public final zzay zzd(@Nullable zzay zzay0) {
        return this.zzl == null ? zzay0 : this.zzl.zzd(zzay0);
    }

    public final zzacy zze(List list0) {
        zzay zzay0 = this.zzd(new zzay(list0));
        return new zzacy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzay0);
    }

    public final zzacy zzf(@Nullable zzacx zzacx0) {
        return new zzacy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzacx0, this.zzl);
    }

    public final zzacy zzg(List list0) {
        zzay zzay0 = this.zzd(zzadz.zzb(list0));
        return new zzacy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzay0);
    }

    private static int zzh(int v) {
        switch(v) {
            case 8: {
                return 1;
            }
            case 12: {
                return 2;
            }
            case 16: {
                return 4;
            }
            case 20: {
                return 5;
            }
            case 24: {
                return 6;
            }
            default: {
                return -1;
            }
        }
    }

    private static int zzi(int v) {
        switch(v) {
            case 8000: {
                return 4;
            }
            case 16000: {
                return 5;
            }
            case 22050: {
                return 6;
            }
            case 24000: {
                return 7;
            }
            case 32000: {
                return 8;
            }
            case 44100: {
                return 9;
            }
            case 48000: {
                return 10;
            }
            case 88200: {
                return 1;
            }
            case 96000: {
                return 11;
            }
            case 176400: {
                return 2;
            }
            case 192000: {
                return 3;
            }
            default: {
                return -1;
            }
        }
    }
}

