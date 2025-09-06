package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;

public final class zzanj implements zzacn {
    private final zzef zza;
    private final SparseArray zzb;
    private final zzdy zzc;
    private final zzanh zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    @Nullable
    private zzang zzi;
    private zzacq zzj;
    private boolean zzk;

    public zzanj() {
        zzef zzef0 = new zzef(0L);
        super();
        this.zza = zzef0;
        this.zzc = new zzdy(0x1000);
        this.zzb = new SparseArray();
        this.zzd = new zzanh();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        zzamb zzamb1;
        zzcw.zzb(this.zzj);
        long v = zzaco0.zzd();
        int v1 = Long.compare(v, -1L);
        if(v1 != 0) {
            zzanh zzanh0 = this.zzd;
            if(!zzanh0.zze()) {
                return zzanh0.zza(zzaco0, zzadj0);
            }
        }
        if(!this.zzk) {
            this.zzk = true;
            zzanh zzanh1 = this.zzd;
            if(zzanh1.zzb() == 0x8000000000000001L) {
                this.zzj.zzO(new zzadl(zzanh1.zzb(), 0L));
            }
            else {
                zzang zzang0 = new zzang(zzanh1.zzd(), zzanh1.zzb(), v);
                this.zzi = zzang0;
                this.zzj.zzO(zzang0.zzb());
            }
        }
        zzang zzang1 = this.zzi;
        if(zzang1 != null && zzang1.zze()) {
            return zzang1.zza(zzaco0, zzadj0);
        }
        zzaco0.zzj();
        long v2 = v1 == 0 ? -1L : v - zzaco0.zze();
        if(v2 != -1L && v2 < 4L) {
            return -1;
        }
        if(!zzaco0.zzm(this.zzc.zzN(), 0, 4, true)) {
            return -1;
        }
        this.zzc.zzL(0);
        int v3 = this.zzc.zzg();
        if(v3 == 441) {
            return -1;
        }
        switch(v3) {
            case 442: {
                zzaco0.zzh(this.zzc.zzN(), 0, 10);
                this.zzc.zzL(9);
                zzaco0.zzk((this.zzc.zzm() & 7) + 14);
                return 0;
            }
            case 443: {
                zzaco0.zzh(this.zzc.zzN(), 0, 2);
                this.zzc.zzL(0);
                zzaco0.zzk(this.zzc.zzq() + 6);
                return 0;
            }
            default: {
                if(v3 >> 8 != 1) {
                    zzaco0.zzk(1);
                    return 0;
                }
                zzamb zzamb0 = null;
                zzani zzani0 = (zzani)this.zzb.get(v3 & 0xFF);
                if(!this.zze) {
                    if(zzani0 == null) {
                        if((v3 & 0xFF) == 0xBD) {
                            zzamb1 = new zzamb(null, 0);
                            this.zzf = true;
                            this.zzh = zzaco0.zzf();
                            zzamb0 = zzamb1;
                        }
                        else if((v3 & 0xE0) == 0xC0) {
                            zzamb1 = new zzamv(null, 0);
                            this.zzf = true;
                            this.zzh = zzaco0.zzf();
                            zzamb0 = zzamb1;
                        }
                        else if((v3 & 0xF0) == 0xE0) {
                            zzamb1 = new zzaml(null);
                            this.zzg = true;
                            this.zzh = zzaco0.zzf();
                            zzamb0 = zzamb1;
                        }
                        if(zzamb0 != null) {
                            zzanx zzanx0 = new zzanx(0x80000000, v3 & 0xFF, 0x100);
                            zzamb0.zzb(this.zzj, zzanx0);
                            zzani0 = new zzani(zzamb0, this.zza);
                            this.zzb.put(v3 & 0xFF, zzani0);
                        }
                    }
                    long v4 = !this.zzf || !this.zzg ? 0x100000L : this.zzh + 0x2000L;
                    if(zzaco0.zzf() > v4) {
                        this.zze = true;
                        this.zzj.zzD();
                    }
                }
                zzaco0.zzh(this.zzc.zzN(), 0, 2);
                this.zzc.zzL(0);
                int v5 = this.zzc.zzq();
                if(zzani0 == null) {
                    zzaco0.zzk(v5 + 6);
                    return 0;
                }
                this.zzc.zzI(v5 + 6);
                zzaco0.zzi(this.zzc.zzN(), 0, v5 + 6);
                this.zzc.zzL(6);
                zzani0.zza(this.zzc);
                this.zzc.zzK(this.zzc.zzc());
                return 0;
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
        this.zzj = zzacq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        zzef zzef0 = this.zza;
        if(zzef0.zzf() == 0x8000000000000001L) {
            zzef0.zzi(v1);
        }
        else {
            long v2 = zzef0.zzd();
            if(v2 != 0x8000000000000001L && v2 != 0L && v2 != v1) {
                zzef0.zzi(v1);
            }
        }
        zzang zzang0 = this.zzi;
        if(zzang0 != null) {
            zzang0.zzd(v1);
        }
        for(int v3 = 0; v3 < this.zzb.size(); ++v3) {
            ((zzani)this.zzb.valueAt(v3)).zzb();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        byte[] arr_b = new byte[14];
        ((zzacc)zzaco0).zzm(arr_b, 0, 14, false);
        if(((arr_b[0] & 0xFF) << 24 | (arr_b[1] & 0xFF) << 16 | (arr_b[2] & 0xFF) << 8 | arr_b[3] & 0xFF) != 442) {
            return false;
        }
        if((arr_b[4] & 0xC4) != 68) {
            return false;
        }
        if((arr_b[6] & 4) != 4) {
            return false;
        }
        if((arr_b[8] & 4) != 4) {
            return false;
        }
        if((arr_b[9] & 1) != 1) {
            return false;
        }
        if((arr_b[12] & 3) != 3) {
            return false;
        }
        ((zzacc)zzaco0).zzl(arr_b[13] & 7, false);
        ((zzacc)zzaco0).zzm(arr_b, 0, 3, false);
        return ((arr_b[0] & 0xFF) << 16 | (arr_b[1] & 0xFF) << 8 | arr_b[2] & 0xFF) == 1;
    }
}

