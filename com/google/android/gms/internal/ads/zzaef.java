package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public final class zzaef implements zzacn {
    private final zzdy zza;
    private final zzaed zzb;
    private final boolean zzc;
    private final zzakd zzd;
    private int zze;
    private zzacq zzf;
    private zzaeg zzg;
    private long zzh;
    private zzaei[] zzi;
    private long zzj;
    @Nullable
    private zzaei zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaef() {
        this(1, zzakd.zza);
    }

    public zzaef(int v, zzakd zzakd0) {
        this.zzd = zzakd0;
        this.zzc = 1 == (v ^ 1);
        this.zza = new zzdy(12);
        this.zzb = new zzaed(null);
        this.zzf = new zzadh();
        this.zzi = new zzaei[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        long v22;
        int v14;
        zzaei zzaei2;
        int v11;
        boolean z;
        long v = this.zzj;
        if(v == -1L) {
            z = false;
        }
        else {
            long v1 = zzaco0.zzf();
            if(v < v1 || v > v1 + 0x40000L) {
                zzadj0.zza = v;
                z = true;
            }
            else {
                zzaco0.zzk(((int)(v - v1)));
                z = false;
            }
        }
        this.zzj = -1L;
        if(z) {
            return 1;
        }
        int v2 = 12;
        switch(this.zze) {
            case 0: {
                if(!this.zzi(zzaco0)) {
                    throw zzbc.zza("AVI Header List not found", null);
                }
                zzaco0.zzk(12);
                this.zze = 1;
                return 0;
            }
            case 1: {
                zzaco0.zzi(this.zza.zzN(), 0, 12);
                this.zza.zzL(0);
                zzaed zzaed0 = this.zzb;
                zzdy zzdy0 = this.zza;
                zzaed0.zza(zzdy0);
                int v5 = zzaed0.zza;
                if(v5 != 0x5453494C) {
                    throw zzbc.zza(("LIST expected, found: " + v5), null);
                }
                zzaed0.zzc = zzdy0.zzi();
                zzaed zzaed1 = this.zzb;
                int v6 = zzaed1.zzc;
                if(v6 != 0x6C726468) {
                    throw zzbc.zza(("hdrl expected, found: " + v6), null);
                }
                this.zzl = zzaed1.zzb;
                this.zze = 2;
                return 0;
            }
            case 2: {
                int v7 = this.zzl - 4;
                zzdy zzdy1 = new zzdy(v7);
                zzaco0.zzi(zzdy1.zzN(), 0, v7);
                zzaej zzaej0 = zzaej.zzc(0x6C726468, zzdy1);
                if(zzaej0.zza() != 0x6C726468) {
                    throw zzbc.zza(("Unexpected header list type " + zzaej0.zza()), null);
                }
                zzaeg zzaeg0 = (zzaeg)zzaej0.zzb(zzaeg.class);
                if(zzaeg0 == null) {
                    throw zzbc.zza("AviHeader not found", null);
                }
                this.zzg = zzaeg0;
                this.zzh = ((long)zzaeg0.zzc) * ((long)zzaeg0.zza);
                ArrayList arrayList0 = new ArrayList();
                zzfxn zzfxn0 = zzaej0.zza;
                int v8 = zzfxn0.size();
                int v9 = 0;
                int v10 = 0;
                while(v9 < v8) {
                    zzaeb zzaeb0 = (zzaeb)zzfxn0.get(v9);
                    if(zzaeb0.zza() == 1819440243) {
                        zzaeh zzaeh0 = (zzaeh)((zzaej)zzaeb0).zzb(zzaeh.class);
                        zzaek zzaek0 = (zzaek)((zzaej)zzaeb0).zzb(zzaek.class);
                        if(zzaeh0 == null) {
                            zzdo.zzf("AviExtractor", "Missing Stream Header");
                            v11 = v9;
                            zzaei2 = null;
                        }
                        else if(zzaek0 == null) {
                            zzdo.zzf("AviExtractor", "Missing Stream Format");
                            v11 = v9;
                            zzaei2 = null;
                        }
                        else {
                            zzab zzab0 = zzaek0.zza;
                            v11 = v9;
                            long v12 = zzei.zzu(zzaeh0.zzd, ((long)zzaeh0.zzb) * 1000000L, zzaeh0.zzc, RoundingMode.DOWN);
                            zzz zzz0 = zzab0.zzb();
                            zzz0.zzL(v10);
                            int v13 = zzaeh0.zze;
                            if(v13 != 0) {
                                zzz0.zzR(v13);
                            }
                            zzael zzael0 = (zzael)((zzaej)zzaeb0).zzb(zzael.class);
                            if(zzael0 != null) {
                                zzz0.zzO(zzael0.zza);
                            }
                            switch(zzbb.zzb(zzab0.zzo)) {
                                case 1: {
                                    v14 = 1;
                                    goto label_115;
                                }
                                case 2: {
                                    v14 = 2;
                                label_115:
                                    zzadt zzadt0 = this.zzf.zzw(v10, v14);
                                    zzadt0.zzm(zzz0.zzag());
                                    zzaei2 = new zzaei(v10, v14, v12, zzaeh0.zzd, zzadt0);
                                    this.zzh = Math.max(this.zzh, v12);
                                    break;
                                }
                                default: {
                                    zzaei2 = null;
                                }
                            }
                        }
                        if(zzaei2 != null) {
                            arrayList0.add(zzaei2);
                        }
                        ++v10;
                    }
                    else {
                        v11 = v9;
                    }
                    v9 = v11 + 1;
                }
                this.zzi = (zzaei[])arrayList0.toArray(new zzaei[0]);
                this.zzf.zzD();
                this.zze = 3;
                return 0;
            }
            case 3: {
                long v15 = this.zzm;
                if(v15 != -1L && zzaco0.zzf() != v15) {
                    this.zzj = v15;
                    return 0;
                }
                zzaco0.zzh(this.zza.zzN(), 0, 12);
                zzaco0.zzj();
                this.zza.zzL(0);
                this.zzb.zza(this.zza);
                int v16 = this.zza.zzi();
                int v17 = this.zzb.zza;
                if(v17 == 1179011410) {
                    zzaco0.zzk(12);
                    return 0;
                }
                if(v17 == 0x5453494C && v16 == 0x69766F6D) {
                    long v18 = zzaco0.zzf();
                    this.zzm = v18;
                    long v19 = v18 + ((long)this.zzb.zzb) + 8L;
                    this.zzn = v19;
                    if(!this.zzp) {
                        zzaeg zzaeg1 = this.zzg;
                        zzaeg1.getClass();
                        if((zzaeg1.zzb & 16) != 16) {
                            this.zzf.zzO(new zzadl(this.zzh, 0L));
                            this.zzp = true;
                            this.zzj = zzaco0.zzf() + 12L;
                            this.zze = 6;
                            return 0;
                        }
                        this.zze = 4;
                        this.zzj = v19;
                        return 0;
                    }
                    this.zzj = zzaco0.zzf() + 12L;
                    this.zze = 6;
                    return 0;
                }
                this.zzj = zzaco0.zzf() + ((long)this.zzb.zzb) + 8L;
                return 0;
            }
            case 4: {
                zzaco0.zzi(this.zza.zzN(), 0, 8);
                this.zza.zzL(0);
                int v20 = this.zza.zzi();
                int v21 = this.zza.zzi();
                if(v20 == 829973609) {
                    this.zze = 5;
                    this.zzo = v21;
                    return 0;
                }
                this.zzj = zzaco0.zzf() + ((long)v21);
                return 0;
            }
            case 5: {
                zzdy zzdy2 = new zzdy(this.zzo);
                zzaco0.zzi(zzdy2.zzN(), 0, this.zzo);
                if(zzdy2.zzb() < 16) {
                    v22 = 0L;
                }
                else {
                    zzdy2.zzM(8);
                    v22 = ((long)zzdy2.zzi()) <= this.zzm ? this.zzm + 8L : 0L;
                    zzdy2.zzL(zzdy2.zzd());
                }
                while(zzdy2.zzb() >= 16) {
                    int v23 = zzdy2.zzi();
                    int v24 = zzdy2.zzi();
                    long v25 = ((long)zzdy2.zzi()) + v22;
                    zzdy2.zzi();
                    zzaei zzaei3 = this.zzg(v23);
                    if(zzaei3 != null) {
                        zzaei3.zzb(v25, (v24 & 16) == 16);
                    }
                }
                zzaei[] arr_zzaei = this.zzi;
                for(int v26 = 0; v26 < arr_zzaei.length; ++v26) {
                    arr_zzaei[v26].zzc();
                }
                this.zzp = true;
                this.zzf.zzO(new zzaec(this, this.zzh));
                this.zze = 6;
                this.zzj = this.zzm;
                return 0;
            }
            default: {
                if(zzaco0.zzf() >= this.zzn) {
                    return -1;
                }
                zzaei zzaei0 = this.zzk;
                if(zzaei0 == null) {
                    if((zzaco0.zzf() & 1L) == 1L) {
                        zzaco0.zzk(1);
                    }
                    zzaco0.zzh(this.zza.zzN(), 0, 12);
                    this.zza.zzL(0);
                    int v3 = this.zza.zzi();
                    if(v3 == 0x5453494C) {
                        this.zza.zzL(8);
                        if(this.zza.zzi() != 0x69766F6D) {
                            v2 = 8;
                        }
                        zzaco0.zzk(v2);
                        zzaco0.zzj();
                        return 0;
                    }
                    int v4 = this.zza.zzi();
                    if(v3 == 0x4B4E554A) {
                        this.zzj = zzaco0.zzf() + ((long)v4) + 8L;
                        return 0;
                    }
                    zzaco0.zzk(8);
                    zzaco0.zzj();
                    zzaei zzaei1 = this.zzg(v3);
                    if(zzaei1 == null) {
                        this.zzj = zzaco0.zzf() + ((long)v4);
                        return 0;
                    }
                    zzaei1.zzd(v4);
                    this.zzk = zzaei1;
                }
                else if(zzaei0.zzg(zzaco0)) {
                    this.zzk = null;
                    return 0;
                }
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
        this.zze = 0;
        if(this.zzc) {
            zzacq0 = new zzakg(zzacq0, this.zzd);
        }
        this.zzf = zzacq0;
        this.zzj = -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        this.zzj = -1L;
        this.zzk = null;
        zzaei[] arr_zzaei = this.zzi;
        int v2 = 0;
        for(int v3 = 0; v3 < arr_zzaei.length; ++v3) {
            arr_zzaei[v3].zze(v);
        }
        if(v == 0L) {
            if(this.zzi.length != 0) {
                v2 = 3;
            }
            this.zze = v2;
            return;
        }
        this.zze = 6;
    }

    @Nullable
    private final zzaei zzg(int v) {
        zzaei[] arr_zzaei = this.zzi;
        for(int v1 = 0; v1 < arr_zzaei.length; ++v1) {
            zzaei zzaei0 = arr_zzaei[v1];
            if(zzaei0.zzf(v)) {
                return zzaei0;
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        zzaco0.zzh(this.zza.zzN(), 0, 12);
        this.zza.zzL(0);
        if(this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzM(4);
        return this.zza.zzi() == 0x20495641;
    }
}

