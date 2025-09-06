package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;

public final class zzaoe implements zzacn {
    private zzacq zza;
    private zzadt zzb;
    private int zzc;
    private long zzd;
    private zzaoc zze;
    private int zzf;
    private long zzg;

    public zzaoe() {
        this.zzc = 0;
        this.zzd = -1L;
        this.zzf = -1;
        this.zzg = -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        int v6;
        long v = -1L;
        zzcw.zzb(this.zzb);
        boolean z = true;
        switch(this.zzc) {
            case 0: {
                zzcw.zzf(zzaco0.zzf() == 0L);
                int v3 = this.zzf;
                if(v3 != -1) {
                    zzaco0.zzk(v3);
                    this.zzc = 4;
                    return 0;
                }
                if(!zzaoh.zzc(zzaco0)) {
                    throw zzbc.zza("Unsupported or unrecognized wav file type.", null);
                }
                zzaco0.zzk(((int)(zzaco0.zze() - zzaco0.zzf())));
                this.zzc = 1;
                return 0;
            }
            case 1: {
                zzdy zzdy0 = new zzdy(8);
                zzaog zzaog0 = zzaog.zza(zzaco0, zzdy0);
                if(zzaog0.zza == 0x64733634) {
                    zzaco0.zzg(8);
                    zzdy0.zzL(0);
                    zzaco0.zzh(zzdy0.zzN(), 0, 8);
                    v = zzdy0.zzr();
                    zzaco0.zzk(((int)zzaog0.zzb) + 8);
                }
                else {
                    zzaco0.zzj();
                }
                this.zzd = v;
                this.zzc = 2;
                return 0;
            }
            case 2: {
                zzaof zzaof0 = zzaoh.zzb(zzaco0);
                int v4 = zzaof0.zza;
                if(v4 == 17) {
                    this.zze = new zzaob(this.zza, this.zzb, zzaof0);
                }
                else {
                    switch(v4) {
                        case 6: {
                            this.zze = new zzaod(this.zza, this.zzb, zzaof0, "audio/g711-alaw", -1);
                            break;
                        }
                        case 7: {
                            this.zze = new zzaod(this.zza, this.zzb, zzaof0, "audio/g711-mlaw", -1);
                            break;
                        }
                        default: {
                            int v5 = zzaof0.zze;
                            switch(v4) {
                                case 1: {
                                    v6 = zzei.zzn(v5);
                                    break;
                                }
                                case 3: {
                                    v6 = v5 == 0x20 ? 4 : 0;
                                    break;
                                }
                                default: {
                                    v6 = v4 == 0xFFFE ? zzei.zzn(v5) : 0;
                                }
                            }
                            if(v6 == 0) {
                                throw zzbc.zzc(("Unsupported WAV format type: " + v4));
                            }
                            this.zze = new zzaod(this.zza, this.zzb, zzaof0, "audio/raw", v6);
                            break;
                        }
                    }
                }
                this.zzc = 3;
                return 0;
            }
            case 3: {
                Pair pair0 = zzaoh.zza(zzaco0);
                this.zzf = ((Long)pair0.first).intValue();
                long v7 = (long)(((Long)pair0.second));
                long v8 = this.zzd;
                if(v8 != -1L && v7 == 0xFFFFFFFFL) {
                    v7 = v8;
                }
                long v9 = ((long)this.zzf) + v7;
                this.zzg = v9;
                long v10 = zzaco0.zzd();
                if(v10 != -1L && v9 > v10) {
                    zzdo.zzf("WavExtractor", "Data exceeds input length: " + v9 + ", " + v10);
                    this.zzg = v10;
                    v9 = v10;
                }
                zzaoc zzaoc1 = this.zze;
                zzaoc1.getClass();
                zzaoc1.zza(this.zzf, v9);
                this.zzc = 4;
                return 0;
            }
            default: {
                if(this.zzg == -1L) {
                    z = false;
                }
                zzcw.zzf(z);
                long v1 = this.zzg;
                long v2 = zzaco0.zzf();
                zzaoc zzaoc0 = this.zze;
                zzaoc0.getClass();
                return zzaoc0.zzc(zzaco0, v1 - v2) ? -1 : 0;
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
        this.zza = zzacq0;
        this.zzb = zzacq0.zzw(0, 1);
        zzacq0.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        this.zzc = v == 0L ? 0 : 4;
        zzaoc zzaoc0 = this.zze;
        if(zzaoc0 != null) {
            zzaoc0.zzb(v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        return zzaoh.zzc(zzaco0);
    }
}

