package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public final class zzaes implements zzacn {
    private final byte[] zza;
    private final zzdy zzb;
    private final zzact zzc;
    private zzacq zzd;
    private zzadt zze;
    private int zzf;
    @Nullable
    private zzay zzg;
    private zzacy zzh;
    private int zzi;
    private int zzj;
    private zzaer zzk;
    private int zzl;
    private long zzm;

    public zzaes() {
        throw null;
    }

    public zzaes(int v) {
        this.zza = new byte[42];
        this.zzb = new zzdy(new byte[0x8000], 0);
        this.zzc = new zzact();
        this.zzf = 0;
    }

    private final long zza(zzdy zzdy0, boolean z) {
        this.zzh.getClass();
        int v;
        for(v = zzdy0.zzd(); v <= zzdy0.zze() - 16; ++v) {
            zzdy0.zzL(v);
            if(zzacu.zzc(zzdy0, this.zzh, this.zzj, this.zzc)) {
                zzdy0.zzL(v);
                return this.zzc.zza;
            }
        }
        if(z) {
            while(v <= zzdy0.zze() - this.zzi) {
                zzdy0.zzL(v);
                try {
                    boolean z1 = false;
                    z1 = zzacu.zzc(zzdy0, this.zzh, this.zzj, this.zzc);
                }
                catch(IndexOutOfBoundsException unused_ex) {
                }
                if(zzdy0.zzd() <= zzdy0.zze() && z1) {
                    zzdy0.zzL(v);
                    return this.zzc.zza;
                }
                ++v;
            }
            zzdy0.zzL(zzdy0.zze());
            return -1L;
        }
        zzdy0.zzL(v);
        return -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        zzadm zzadm0;
        int v = this.zzf;
        boolean z = true;
        switch(v) {
            case 0: {
                zzaco0.zzj();
                long v12 = zzaco0.zze();
                zzay zzay0 = zzacv.zza(zzaco0, true);
                zzaco0.zzk(((int)(zzaco0.zze() - v12)));
                this.zzg = zzay0;
                this.zzf = 1;
                return 0;
            }
            case 1: {
                zzaco0.zzh(this.zza, 0, 42);
                zzaco0.zzj();
                this.zzf = 2;
                return 0;
            }
            case 2: {
                zzdy zzdy4 = new zzdy(4);
                zzaco0.zzi(zzdy4.zzN(), 0, 4);
                if(zzdy4.zzu() != 0x664C6143L) {
                    throw zzbc.zza("Failed to read FLAC stream marker.", null);
                }
                this.zzf = 3;
                return 0;
            }
            case 3: {
                zzacy zzacy2 = this.zzh;
                while(true) {
                    zzaco0.zzj();
                    zzdx zzdx0 = new zzdx(new byte[4], 4);
                    zzaco0.zzh(zzdx0.zza, 0, 4);
                    boolean z1 = zzdx0.zzp();
                    int v13 = zzdx0.zzd(7);
                    int v14 = zzdx0.zzd(24) + 4;
                    if(v13 == 0) {
                        byte[] arr_b = new byte[38];
                        zzaco0.zzi(arr_b, 0, 38);
                        zzacy2 = new zzacy(arr_b, 4);
                    }
                    else {
                        if(zzacy2 == null) {
                            break;
                        }
                        if(v13 == 3) {
                            zzdy zzdy5 = new zzdy(v14);
                            zzaco0.zzi(zzdy5.zzN(), 0, v14);
                            zzacy2 = zzacy2.zzf(zzacv.zzb(zzdy5));
                        }
                        else if(v13 == 4) {
                            zzdy zzdy6 = new zzdy(v14);
                            zzaco0.zzi(zzdy6.zzN(), 0, v14);
                            zzdy6.zzM(4);
                            zzacy2 = zzacy2.zzg(Arrays.asList(zzadz.zzc(zzdy6, false, false).zza));
                        }
                        else if(v13 == 6) {
                            zzdy zzdy7 = new zzdy(v14);
                            zzaco0.zzi(zzdy7.zzN(), 0, v14);
                            zzdy7.zzM(4);
                            zzacy2 = zzacy2.zze(zzfxn.zzo(zzafn.zzb(zzdy7)));
                        }
                        else {
                            zzaco0.zzk(v14);
                        }
                    }
                    this.zzh = zzacy2;
                    if(z1) {
                        zzacy2.getClass();
                        this.zzi = Math.max(zzacy2.zzc, 6);
                        this.zze.zzm(this.zzh.zzc(this.zza, this.zzg));
                        this.zzf = 4;
                        return 0;
                    }
                }
                throw new IllegalArgumentException();
            }
            default: {
                if(v != 4) {
                    this.zze.getClass();
                    zzacy zzacy0 = this.zzh;
                    zzacy0.getClass();
                    zzaer zzaer0 = this.zzk;
                    if(zzaer0 != null && zzaer0.zze()) {
                        return zzaer0.zza(zzaco0, zzadj0);
                    }
                    if(this.zzm == -1L) {
                        this.zzm = zzacu.zzb(zzaco0, zzacy0);
                        return 0;
                    }
                    zzdy zzdy0 = this.zzb;
                    int v1 = zzdy0.zze();
                    if(v1 < 0x8000) {
                        int v2 = zzaco0.zza(zzdy0.zzN(), v1, 0x8000 - v1);
                        if(v2 != -1) {
                            z = false;
                            this.zzb.zzK(v1 + v2);
                        }
                        else if(this.zzb.zzb() == 0) {
                            this.zzg();
                            return -1;
                        }
                    }
                    else {
                        z = false;
                    }
                    zzdy zzdy1 = this.zzb;
                    int v3 = zzdy1.zzd();
                    int v4 = this.zzl;
                    int v5 = this.zzi;
                    if(v4 < v5) {
                        zzdy1.zzM(Math.min(v5 - v4, zzdy1.zzb()));
                    }
                    long v6 = this.zza(this.zzb, z);
                    int v7 = this.zzb.zzd() - v3;
                    this.zzb.zzL(v3);
                    this.zze.zzr(this.zzb, v7);
                    this.zzl += v7;
                    if(v6 != -1L) {
                        this.zzg();
                        this.zzl = 0;
                        this.zzm = v6;
                    }
                    zzdy zzdy2 = this.zzb;
                    if(zzdy2.zzb() >= 16) {
                        return 0;
                    }
                    int v8 = zzdy2.zzb();
                    System.arraycopy(zzdy2.zzN(), zzdy2.zzd(), zzdy2.zzN(), 0, v8);
                    this.zzb.zzL(0);
                    this.zzb.zzK(v8);
                    return 0;
                }
                zzaco0.zzj();
                zzdy zzdy3 = new zzdy(2);
                zzaco0.zzh(zzdy3.zzN(), 0, 2);
                int v9 = zzdy3.zzq();
                if(v9 >> 2 == 0x3FFE) {
                    zzaco0.zzj();
                    this.zzj = v9;
                    zzacq zzacq0 = this.zzd;
                    long v10 = zzaco0.zzf();
                    long v11 = zzaco0.zzd();
                    zzacy zzacy1 = this.zzh;
                    zzacy1.getClass();
                    if(zzacy1.zzk != null) {
                        zzadm0 = new zzacw(zzacy1, v10);
                    }
                    else if(v11 == -1L || zzacy1.zzj <= 0L) {
                        zzadm0 = new zzadl(zzacy1.zza(), 0L);
                    }
                    else {
                        zzaer zzaer1 = new zzaer(zzacy1, this.zzj, v10, v11);
                        this.zzk = zzaer1;
                        zzadm0 = zzaer1.zzb();
                    }
                    zzacq0.zzO(zzadm0);
                    this.zzf = 5;
                    return 0;
                }
                zzaco0.zzj();
                throw zzbc.zza("First frame does not start with sync code.", null);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final zzacn zzc() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final List zzd() {
        return zzfxn.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacq0) {
        this.zzd = zzacq0;
        this.zze = zzacq0.zzw(0, 1);
        zzacq0.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        long v2 = 0L;
        if(v == 0L) {
            this.zzf = 0;
        }
        else {
            zzaer zzaer0 = this.zzk;
            if(zzaer0 != null) {
                zzaer0.zzd(v1);
            }
        }
        if(v1 != 0L) {
            v2 = -1L;
        }
        this.zzm = v2;
        this.zzl = 0;
        this.zzb.zzI(0);
    }

    private final void zzg() {
        this.zze.zzt(this.zzm * 1000000L / ((long)this.zzh.zze), 1, this.zzl, 0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        zzacv.zza(zzaco0, false);
        zzdy zzdy0 = new zzdy(4);
        ((zzacc)zzaco0).zzm(zzdy0.zzN(), 0, 4, false);
        return zzdy0.zzu() == 0x664C6143L;
    }
}

