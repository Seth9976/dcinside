package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public final class zzant implements zzacn {
    private final int zza;
    private final List zzb;
    private final zzdy zzc;
    private final SparseIntArray zzd;
    private final zzanw zze;
    private final zzakd zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzanq zzj;
    private zzanp zzk;
    private zzacq zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzant() {
        zzef zzef0 = new zzef(0L);
        zzamg zzamg0 = new zzamg(0);
        this(1, 1, zzakd.zza, zzef0, zzamg0, 112800);
    }

    public zzant(int v, int v1, zzakd zzakd0, zzef zzef0, zzanw zzanw0, int v2) {
        this.zze = zzanw0;
        this.zza = v1;
        this.zzf = zzakd0;
        this.zzb = Collections.singletonList(zzef0);
        this.zzc = new zzdy(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray0 = new SparseBooleanArray();
        this.zzh = sparseBooleanArray0;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray0 = new SparseArray();
        this.zzg = sparseArray0;
        this.zzd = new SparseIntArray();
        this.zzj = new zzanq(112800);
        this.zzl = zzacq.zza;
        this.zzr = -1;
        sparseBooleanArray0.clear();
        sparseArray0.clear();
        SparseArray sparseArray1 = zzanw0.zza();
        int v3 = sparseArray1.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = sparseArray1.keyAt(v4);
            zzany zzany0 = (zzany)sparseArray1.valueAt(v4);
            this.zzg.put(v5, zzany0);
        }
        zzanl zzanl0 = new zzanl(new zzanr(this));
        this.zzg.put(0, zzanl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        zzdy zzdy1;
        long v = zzaco0.zzd();
        if(this.zzn) {
            if(v != -1L) {
                zzanq zzanq0 = this.zzj;
                if(!zzanq0.zzd()) {
                    return zzanq0.zza(zzaco0, zzadj0, this.zzr);
                }
            }
            if(!this.zzo) {
                this.zzo = true;
                zzanq zzanq1 = this.zzj;
                if(zzanq1.zzb() == 0x8000000000000001L) {
                    this.zzl.zzO(new zzadl(zzanq1.zzb(), 0L));
                }
                else {
                    zzanp zzanp0 = new zzanp(zzanq1.zzc(), zzanq1.zzb(), v, this.zzr, 112800);
                    this.zzk = zzanp0;
                    this.zzl.zzO(zzanp0.zzb());
                }
            }
            if(this.zzp) {
                this.zzp = false;
                this.zzf(0L, 0L);
                if(zzaco0.zzf() != 0L) {
                    zzadj0.zza = 0L;
                    return 1;
                }
            }
            zzanp zzanp1 = this.zzk;
            if(zzanp1 != null && zzanp1.zze()) {
                return zzanp1.zza(zzaco0, zzadj0);
            }
        }
        zzdy zzdy0 = this.zzc;
        byte[] arr_b = zzdy0.zzN();
        if(9400 - zzdy0.zzd() < 0xBC) {
            int v1 = zzdy0.zzb();
            if(v1 > 0) {
                System.arraycopy(arr_b, zzdy0.zzd(), arr_b, 0, v1);
            }
            this.zzc.zzJ(arr_b, v1);
        }
        while(true) {
            zzdy1 = this.zzc;
            if(zzdy1.zzb() >= 0xBC) {
                break;
            }
            int v2 = zzdy1.zze();
            int v3 = zzaco0.zza(arr_b, v2, 9400 - v2);
            if(v3 == -1) {
                for(int v4 = 0; v4 < this.zzg.size(); ++v4) {
                    zzany zzany0 = (zzany)this.zzg.valueAt(v4);
                    if(zzany0 instanceof zzand && ((zzand)zzany0).zzd(false)) {
                        ((zzand)zzany0).zza(new zzdy(), 1);
                    }
                }
                return -1;
            }
            this.zzc.zzK(v2 + v3);
        }
        int v5 = zzdy1.zzd();
        int v6 = zzdy1.zze();
        int v7 = zzanz.zza(zzdy1.zzN(), v5, v6);
        this.zzc.zzL(v7);
        if(v7 + 0xBC > v6) {
            this.zzq += v7 - v5;
        }
        else {
            this.zzq = 0;
        }
        zzdy zzdy2 = this.zzc;
        int v8 = zzdy2.zze();
        if(v7 + 0xBC > v8) {
            return 0;
        }
        int v9 = zzdy2.zzg();
        if((0x800000 & v9) != 0) {
            this.zzc.zzL(v7 + 0xBC);
            return 0;
        }
        int v10 = (0x400000 & v9) == 0 ? 0 : 1;
        int v11 = v9 >> 8 & 0x1FFF;
        zzany zzany1 = (v9 & 16) == 0 ? null : ((zzany)this.zzg.get(v11));
        if(zzany1 == null) {
            this.zzc.zzL(v7 + 0xBC);
            return 0;
        }
        int v12 = this.zzd.get(v11, (v9 & 15) - 1);
        this.zzd.put(v11, v9 & 15);
        if(v12 == (v9 & 15)) {
            this.zzc.zzL(v7 + 0xBC);
            return 0;
        }
        if((v9 & 15) != (v12 + 1 & 15)) {
            zzany1.zzc();
        }
        if((v9 & 0x20) != 0) {
            int v13 = this.zzc.zzm();
            v10 |= ((this.zzc.zzm() & 0x40) == 0 ? 0 : 2);
            this.zzc.zzM(v13 - 1);
        }
        boolean z = this.zzn;
        if(!z && this.zzi.get(v11, false)) {
        label_85:
            if(this.zzn && v != -1L) {
                this.zzp = true;
            }
        }
        else {
            this.zzc.zzK(v7 + 0xBC);
            zzany1.zza(this.zzc, v10);
            this.zzc.zzK(v8);
            if(!z) {
                goto label_85;
            }
        }
        this.zzc.zzL(v7 + 0xBC);
        return 0;
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
        if(this.zza == 0) {
            zzacq0 = new zzakg(zzacq0, this.zzf);
        }
        this.zzl = zzacq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        int v2 = this.zzb.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            zzef zzef0 = (zzef)this.zzb.get(v3);
            if(zzef0.zzf() == 0x8000000000000001L) {
                zzef0.zzi(v1);
            }
            else {
                long v4 = zzef0.zzd();
                if(v4 != 0x8000000000000001L && v4 != 0L && v4 != v1) {
                    zzef0.zzi(v1);
                }
            }
        }
        if(v1 != 0L) {
            zzanp zzanp0 = this.zzk;
            if(zzanp0 != null) {
                zzanp0.zzd(v1);
            }
        }
        this.zzc.zzI(0);
        this.zzd.clear();
        for(int v5 = 0; v5 < this.zzg.size(); ++v5) {
            ((zzany)this.zzg.valueAt(v5)).zzc();
        }
        this.zzq = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        byte[] arr_b = this.zzc.zzN();
        ((zzacc)zzaco0).zzm(arr_b, 0, 940, false);
        int v = 0;
    label_3:
        while(v < 0xBC) {
            int v1 = 0;
            while(v1 < 5) {
                if(arr_b[v1 * 0xBC + v] == 71) {
                    ++v1;
                    continue;
                }
                ++v;
                continue label_3;
            }
            ((zzacc)zzaco0).zzo(v, false);
            return true;
        }
        return false;
    }

    static void zzp(zzant zzant0, boolean z) {
        zzant0.zzn = true;
    }
}

