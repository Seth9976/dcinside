package com.google.android.gms.internal.ads;

import h4.m;
import java.io.IOException;
import java.util.List;

public final class zzaeu implements zzacn {
    private final zzdy zza;
    private final zzdy zzb;
    private final zzdy zzc;
    private final zzdy zzd;
    private final zzaev zze;
    private zzacq zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaet zzo;
    private zzaey zzp;

    public zzaeu() {
        this.zza = new zzdy(4);
        this.zzb = new zzdy(9);
        this.zzc = new zzdy(11);
        this.zzd = new zzdy();
        this.zze = new zzaev();
        this.zzg = 1;
    }

    private final zzdy zza(zzaco zzaco0) throws IOException {
        if(this.zzl > this.zzd.zzc()) {
            int v = this.zzd.zzc();
            this.zzd.zzJ(new byte[Math.max(v + v, this.zzl)], 0);
        }
        else {
            this.zzd.zzL(0);
        }
        this.zzd.zzK(this.zzl);
        zzaco0.zzi(this.zzd.zzN(), 0, this.zzl);
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        boolean z1;
        boolean z;
        long v2;
        zzcw.zzb(this.zzf);
        while(true) {
            int v = this.zzg;
            int v1 = 8;
            if(v != 1) {
                switch(v) {
                    case 2: {
                        zzaco0.zzk(this.zzj);
                        this.zzj = 0;
                        this.zzg = 3;
                        continue;
                    }
                    case 3: {
                        if(!zzaco0.zzn(this.zzc.zzN(), 0, 11, true)) {
                            return -1;
                        }
                        this.zzc.zzL(0);
                        this.zzk = this.zzc.zzm();
                        this.zzl = this.zzc.zzo();
                        this.zzm = (long)this.zzc.zzo();
                        this.zzm = (((long)(this.zzc.zzm() << 24)) | this.zzm) * 1000L;
                        this.zzc.zzM(3);
                        this.zzg = 4;
                        continue;
                    }
                    case 4: {
                        if(this.zzh) {
                            v2 = this.zzi + this.zzm;
                        }
                        else {
                            v2 = this.zze.zzc() == 0x8000000000000001L ? 0L : this.zzm;
                        }
                        int v3 = this.zzk;
                        if(v3 != 8) {
                            v1 = v3;
                        }
                        else if(this.zzo != null) {
                            this.zzg();
                            z = this.zzo.zzf(this.zza(zzaco0), v2);
                            z1 = true;
                            goto label_51;
                        }
                        if(v1 != 9) {
                            if(v1 == 18 && !this.zzn) {
                                zzdy zzdy0 = this.zza(zzaco0);
                                z = this.zze.zzf(zzdy0, v2);
                                zzaev zzaev0 = this.zze;
                                long v4 = zzaev0.zzc();
                                if(v4 != 0x8000000000000001L) {
                                    this.zzf.zzO(new zzade(zzaev0.zzd(), zzaev0.zze(), v4));
                                    this.zzn = true;
                                }
                                z1 = true;
                            }
                        }
                        else if(this.zzp != null) {
                            this.zzg();
                            z = this.zzp.zzf(this.zza(zzaco0), v2);
                            z1 = true;
                        }
                        else {
                            zzaco0.zzk(this.zzl);
                            z = false;
                            z1 = false;
                        }
                    label_51:
                        if(!this.zzh && z) {
                            this.zzh = true;
                            this.zzi = this.zze.zzc() == 0x8000000000000001L ? -this.zzm : 0L;
                        }
                        this.zzj = 4;
                        this.zzg = 2;
                        if(!z1) {
                            continue;
                        }
                        return 0;
                    }
                    default: {
                        throw new IllegalStateException();
                    }
                }
            }
            if(!zzaco0.zzn(this.zzb.zzN(), 0, 9, true)) {
                return -1;
            }
            this.zzb.zzL(0);
            this.zzb.zzM(4);
            int v5 = this.zzb.zzm();
            if((v5 & 4) != 0 && this.zzo == null) {
                this.zzo = new zzaet(this.zzf.zzw(8, 1));
            }
            if((v5 & 1) != 0 && this.zzp == null) {
                this.zzp = new zzaey(this.zzf.zzw(9, 2));
            }
            this.zzf.zzD();
            this.zzj = this.zzb.zzg() - 5;
            this.zzg = 2;
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
        this.zzf = zzacq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        if(v == 0L) {
            this.zzg = 1;
            this.zzh = false;
        }
        else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @m({"extractorOutput"})
    private final void zzg() {
        if(!this.zzn) {
            this.zzf.zzO(new zzadl(0x8000000000000001L, 0L));
            this.zzn = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        ((zzacc)zzaco0).zzm(this.zza.zzN(), 0, 3, false);
        this.zza.zzL(0);
        if(this.zza.zzo() != 4607062) {
            return false;
        }
        ((zzacc)zzaco0).zzm(this.zza.zzN(), 0, 2, false);
        this.zza.zzL(0);
        if((this.zza.zzq() & 0xFA) != 0) {
            return false;
        }
        ((zzacc)zzaco0).zzm(this.zza.zzN(), 0, 4, false);
        this.zza.zzL(0);
        int v = this.zza.zzg();
        zzaco0.zzj();
        ((zzacc)zzaco0).zzl(v, false);
        ((zzacc)zzaco0).zzm(this.zza.zzN(), 0, 4, false);
        this.zza.zzL(0);
        return this.zza.zzg() == 0;
    }
}

