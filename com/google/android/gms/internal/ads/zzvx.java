package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.io.IOException;

public final class zzvx implements zzadt {
    private boolean zzA;
    @Nullable
    private zzrg zzB;
    private final zzvr zza;
    private final zzvt zzb;
    private final zzwe zzc;
    @Nullable
    private final zzrf zzd;
    @Nullable
    private final zzra zze;
    @Nullable
    private zzvv zzf;
    @Nullable
    private zzab zzg;
    private int zzh;
    private long[] zzi;
    private long[] zzj;
    private int[] zzk;
    private int[] zzl;
    private long[] zzm;
    private zzads[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    @Nullable
    private zzab zzy;
    private boolean zzz;

    protected zzvx(zzyk zzyk0, @Nullable zzrf zzrf0, @Nullable zzra zzra0) {
        this.zzd = zzrf0;
        this.zze = zzra0;
        this.zza = new zzvr(zzyk0);
        this.zzb = new zzvt();
        this.zzh = 1000;
        this.zzi = new long[1000];
        this.zzj = new long[1000];
        this.zzm = new long[1000];
        this.zzl = new int[1000];
        this.zzk = new int[1000];
        this.zzn = new zzads[1000];
        this.zzc = new zzwe(new zzvs());
        this.zzs = 0x8000000000000000L;
        this.zzt = 0x8000000000000000L;
        this.zzu = 0x8000000000000000L;
        this.zzx = true;
        this.zzw = true;
        this.zzz = true;
    }

    public final boolean zzA(long v, boolean z) {
        int v4;
        synchronized(this) {
            this.zzK();
            int v2 = this.zzr;
            int v3 = this.zzC(v2);
            if(this.zzL() && v >= this.zzm[v3]) {
                if(v <= this.zzu) {
                label_9:
                    if(this.zzz) {
                        v4 = this.zzo - v2;
                        int v5 = 0;
                        while(v5 < v4) {
                            if(this.zzm[v3] < v) {
                                ++v3;
                                v3 = v3 == this.zzh ? 0 : v3 + 1;
                                ++v5;
                                continue;
                            }
                            v4 = v5;
                            goto label_24;
                        }
                        if(!z) {
                            v4 = -1;
                        }
                    }
                    else {
                        v4 = this.zzB(v3, this.zzo - v2, v, true);
                    }
                label_24:
                    if(v4 != -1) {
                        this.zzs = v;
                        this.zzr += v4;
                        return true;
                    }
                }
                else if(z) {
                    z = true;
                    goto label_9;
                }
            }
            return false;
        }
    }

    private final int zzB(int v, int v1, long v2, boolean z) {
        int v3 = -1;
        int v4 = 0;
        while(v4 < v1) {
            int v5 = Long.compare(this.zzm[v], v2);
            if(v5 > 0) {
                break;
            }
            if(!z || (this.zzl[v] & 1) != 0) {
                v3 = v4;
                if(v5 != 0) {
                    goto label_8;
                }
                break;
            }
        label_8:
            ++v;
            v = v == this.zzh ? 0 : v + 1;
            ++v4;
        }
        return v3;
    }

    private final int zzC(int v) {
        int v1 = this.zzq + v;
        return v1 >= this.zzh ? v1 - this.zzh : v1;
    }

    private final int zzD(zzke zzke0, zzhh zzhh0, boolean z, boolean z1, zzvt zzvt0) {
        synchronized(this) {
            zzhh0.zzd = false;
            if(!this.zzL()) {
                if(!z1 && !this.zzv) {
                    zzab zzab0 = this.zzy;
                    if(zzab0 != null && (z || zzab0 != this.zzg)) {
                        this.zzI(zzab0, zzke0);
                        return -5;
                    }
                    return -3;
                }
                zzhh0.zzc(4);
                zzhh0.zze = 0x8000000000000000L;
                return -4;
            }
            zzab zzab1 = ((zzvu)this.zzc.zza(this.zzp + this.zzr)).zza;
            if(!z && zzab1 == this.zzg) {
                int v1 = this.zzC(this.zzr);
                if(!this.zzM(v1)) {
                    zzhh0.zzd = true;
                    return -3;
                }
                zzhh0.zzc(this.zzl[v1]);
                if(this.zzr == this.zzo - 1 && (z1 || this.zzv)) {
                    zzhh0.zza(0x20000000);
                }
                zzhh0.zze = this.zzm[v1];
                zzvt0.zza = this.zzk[v1];
                zzvt0.zzb = this.zzj[v1];
                zzvt0.zzc = this.zzn[v1];
                return -4;
            }
            this.zzI(zzab1, zzke0);
            return -5;
        }
    }

    private final long zzE(long v, boolean z, boolean z1) {
        synchronized(this) {
            int v2 = this.zzo;
            if(v2 != 0) {
                int v3 = this.zzq;
                if(v >= this.zzm[v3]) {
                    if(z1) {
                        int v4 = this.zzr;
                        if(v4 != v2) {
                            v2 = v4 + 1;
                        }
                    }
                    int v5 = this.zzB(v3, v2, v, false);
                    if(v5 != -1) {
                        return this.zzG(v5);
                    }
                }
            }
            return -1L;
        }
    }

    private final long zzF() {
        synchronized(this) {
            int v1 = this.zzo;
            return v1 == 0 ? -1L : this.zzG(v1);
        }
    }

    @GuardedBy("this")
    private final long zzG(int v) {
        long v1 = this.zzt;
        long v2 = 0x8000000000000000L;
        if(v != 0) {
            int v3 = this.zzC(v - 1);
            for(int v4 = 0; v4 < v; ++v4) {
                v2 = Math.max(v2, this.zzm[v3]);
                if((this.zzl[v3] & 1) != 0) {
                    break;
                }
                --v3;
                v3 = v3 == -1 ? this.zzh - 1 : v3 - 1;
            }
        }
        this.zzt = Math.max(v1, v2);
        this.zzo -= v;
        int v5 = this.zzp + v;
        this.zzp = v5;
        int v6 = this.zzq + v;
        this.zzq = v6;
        int v7 = this.zzh;
        if(v6 >= v7) {
            this.zzq = v6 - v7;
        }
        int v8 = this.zzr - v;
        this.zzr = v8;
        if(v8 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(v5);
        if(this.zzo == 0) {
            int v9 = this.zzq == 0 ? this.zzh : this.zzq;
            return this.zzj[v9 - 1] + ((long)this.zzk[v9 - 1]);
        }
        return this.zzj[this.zzq];
    }

    private final void zzH(long v, int v1, long v2, int v3, @Nullable zzads zzads0) {
        synchronized(this) {
            int v5 = this.zzo;
            if(v5 > 0) {
                int v6 = this.zzC(v5 - 1);
                zzcw.zzd(this.zzj[v6] + ((long)this.zzk[v6]) <= v2);
            }
            this.zzv = (0x20000000 & v1) != 0;
            this.zzu = Math.max(this.zzu, v);
            int v7 = this.zzC(this.zzo);
            this.zzm[v7] = v;
            this.zzj[v7] = v2;
            this.zzk[v7] = v3;
            this.zzl[v7] = v1;
            this.zzn[v7] = zzads0;
            this.zzi[v7] = 0L;
            if(this.zzc.zzf() || !((zzvu)this.zzc.zzb()).zza.equals(this.zzy)) {
                zzab zzab0 = this.zzy;
                if(zzab0 == null) {
                    throw null;
                }
                zzre zzre0 = this.zzd.zzb(this.zze, zzab0);
                int v8 = this.zzp + this.zzo;
                zzvu zzvu0 = new zzvu(zzab0, zzre0, null);
                this.zzc.zzc(v8, zzvu0);
            }
            int v9 = this.zzo + 1;
            this.zzo = v9;
            int v10 = this.zzh;
            if(v9 == v10) {
                long[] arr_v = new long[v10 + 1000];
                long[] arr_v1 = new long[v10 + 1000];
                long[] arr_v2 = new long[v10 + 1000];
                int[] arr_v3 = new int[v10 + 1000];
                int[] arr_v4 = new int[v10 + 1000];
                zzads[] arr_zzads = new zzads[v10 + 1000];
                int v11 = v10 - this.zzq;
                System.arraycopy(this.zzj, this.zzq, arr_v1, 0, v11);
                System.arraycopy(this.zzm, this.zzq, arr_v2, 0, v11);
                System.arraycopy(this.zzl, this.zzq, arr_v3, 0, v11);
                System.arraycopy(this.zzk, this.zzq, arr_v4, 0, v11);
                System.arraycopy(this.zzn, this.zzq, arr_zzads, 0, v11);
                System.arraycopy(this.zzi, this.zzq, arr_v, 0, v11);
                int v12 = this.zzq;
                System.arraycopy(this.zzj, 0, arr_v1, v11, v12);
                System.arraycopy(this.zzm, 0, arr_v2, v11, v12);
                System.arraycopy(this.zzl, 0, arr_v3, v11, v12);
                System.arraycopy(this.zzk, 0, arr_v4, v11, v12);
                System.arraycopy(this.zzn, 0, arr_zzads, v11, v12);
                System.arraycopy(this.zzi, 0, arr_v, v11, v12);
                this.zzj = arr_v1;
                this.zzm = arr_v2;
                this.zzl = arr_v3;
                this.zzk = arr_v4;
                this.zzn = arr_zzads;
                this.zzi = arr_v;
                this.zzq = 0;
                this.zzh = v10 + 1000;
            }
        }
    }

    private final void zzI(zzab zzab0, zzke zzke0) {
        zzab zzab1 = this.zzg;
        this.zzg = zzab0;
        zzke0.zza = zzab0.zzc(this.zzd.zza(zzab0));
        zzke0.zzb = this.zzB;
        if(zzab1 != null && Objects.equals((zzab1 == null ? null : zzab1.zzs), zzab0.zzs)) {
            return;
        }
        zzrg zzrg0 = this.zzd.zzc(this.zze, zzab0);
        this.zzB = zzrg0;
        zzke0.zzb = zzrg0;
    }

    private final void zzJ() {
        if(this.zzB != null) {
            this.zzB = null;
            this.zzg = null;
        }
    }

    private final void zzK() {
        synchronized(this) {
            this.zzr = 0;
            this.zza.zzg();
        }
    }

    private final boolean zzL() {
        return this.zzr != this.zzo;
    }

    private final boolean zzM(int v) {
        if(this.zzB != null) {
            return (this.zzl[v] & 0x40000000) == 0 ? false : false;
        }
        return true;
    }

    private final boolean zzN(zzab zzab0) {
        synchronized(this) {
            this.zzx = false;
            if(Objects.equals(zzab0, this.zzy)) {
                return false;
            }
            this.zzy = this.zzc.zzf() || !((zzvu)this.zzc.zzb()).zza.equals(zzab0) ? zzab0 : ((zzvu)this.zzc.zzb()).zza;
            this.zzz &= zzbb.zzf(this.zzy.zzo, this.zzy.zzk);
            this.zzA = false;
            return true;
        }
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final int zzc(long v, boolean z) {
        synchronized(this) {
            int v2 = this.zzr;
            int v3 = this.zzC(v2);
            if(this.zzL() && v >= this.zzm[v3]) {
                if(v > this.zzu && z) {
                    return this.zzo - v2;
                }
                int v4 = this.zzB(v3, this.zzo - v2, v, true);
                return v4 == -1 ? 0 : v4;
            }
            return 0;
        }
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    @CallSuper
    public final int zze(zzke zzke0, zzhh zzhh0, int v, boolean z) {
        int v1 = this.zzD(zzke0, zzhh0, (v & 2) != 0, z, this.zzb);
        if(v1 == -4) {
            if(!zzhh0.zzf()) {
                boolean z1 = false;
                if((v & 4) == 0) {
                    z1 = true;
                    if((v & 1) != 0) {
                        this.zza.zzd(zzhh0, this.zzb);
                        return -4;
                    }
                    this.zza.zze(zzhh0, this.zzb);
                }
                else if((v & 1) == 0) {
                    z1 = true;
                }
                if(z1) {
                    ++this.zzr;
                    return -4;
                }
            }
            return -4;
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final int zzf(zzl zzl0, int v, boolean z) {
        return zzadr.zza(this, zzl0, v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final int zzg(zzl zzl0, int v, boolean z, int v1) throws IOException {
        return this.zza.zza(zzl0, v, z);
    }

    public final long zzh() {
        synchronized(this) {
        }
        return this.zzu;
    }

    @Nullable
    public final zzab zzi() {
        synchronized(this) {
            if(this.zzx) {
                return null;
            }
        }
        return this.zzy;
    }

    public final void zzj(long v, boolean z, boolean z1) {
        long v1 = this.zzE(v, false, z1);
        this.zza.zzc(v1);
    }

    public final void zzk() {
        long v = this.zzF();
        this.zza.zzc(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzl(long v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzm(zzab zzab0) {
        boolean z = this.zzN(zzab0);
        zzvv zzvv0 = this.zzf;
        if(zzvv0 != null && z) {
            zzvv0.zzM(zzab0);
        }
    }

    @CallSuper
    public final void zzn() throws IOException {
        zzrg zzrg0 = this.zzB;
        if(zzrg0 != null) {
            throw zzrg0.zza();
        }
    }

    @CallSuper
    public final void zzo() {
        this.zzk();
        this.zzJ();
    }

    @CallSuper
    public final void zzp() {
        this.zzq(true);
        this.zzJ();
    }

    @CallSuper
    public final void zzq(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = 0x8000000000000000L;
        this.zzt = 0x8000000000000000L;
        this.zzu = 0x8000000000000000L;
        this.zzv = false;
        this.zzc.zzd();
        if(z) {
            this.zzy = null;
            this.zzx = true;
            this.zzz = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzr(zzdy zzdy0, int v) {
        zzadr.zzb(this, zzdy0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzs(zzdy zzdy0, int v, int v1) {
        this.zza.zzh(zzdy0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzt(long v, int v1, int v2, int v3, @Nullable zzads zzads0) {
        if(this.zzw) {
            if((v1 & 1) == 0) {
                return;
            }
            this.zzw = false;
        }
        if(this.zzz) {
            if(v < this.zzs) {
                return;
            }
            if((v1 & 1) == 0) {
                if(!this.zzA) {
                    zzdo.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.zzy);
                    this.zzA = true;
                }
                v1 |= 1;
            }
        }
        this.zzH(v, v1, this.zza.zzb() - ((long)v2) - ((long)v3), v2, zzads0);
    }

    public final void zzu(long v) {
        this.zzs = v;
    }

    public final void zzv(@Nullable zzvv zzvv0) {
        this.zzf = zzvv0;
    }

    public final void zzw(int v) {
        boolean z = false;
        synchronized(this) {
            if(v >= 0 && this.zzr + v <= this.zzo) {
                z = true;
            }
            zzcw.zzd(z);
            this.zzr += v;
        }
    }

    public final boolean zzx() {
        synchronized(this) {
        }
        return this.zzv;
    }

    @CallSuper
    public final boolean zzy(boolean z) {
        boolean z1 = true;
        synchronized(this) {
            if(!this.zzL()) {
                if(!z && !this.zzv) {
                    zzab zzab0 = this.zzy;
                    if(zzab0 == null) {
                        z1 = false;
                    }
                    else if(zzab0 == this.zzg) {
                        return false;
                    }
                }
                return z1;
            }
            return ((zzvu)this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg ? true : this.zzM(this.zzC(this.zzr));
        }
    }

    public final boolean zzz(int v) {
        synchronized(this) {
            this.zzK();
            int v2 = this.zzp;
            if(v >= v2 && v <= this.zzo + v2) {
                this.zzs = 0x8000000000000000L;
                this.zzr = v - v2;
                return true;
            }
            return false;
        }
    }
}

