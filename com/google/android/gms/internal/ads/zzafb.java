package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;

final class zzafb implements zzacn {
    private final zzdy zza;
    private zzacq zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    @Nullable
    private zzagv zzg;
    private zzaco zzh;
    private zzafe zzi;
    @Nullable
    private zzaiv zzj;

    public zzafb() {
        this.zza = new zzdy(6);
        this.zzf = -1L;
    }

    private final int zza(zzaco zzaco0) throws IOException {
        this.zza.zzI(2);
        ((zzacc)zzaco0).zzm(this.zza.zzN(), 0, 2, false);
        return this.zza.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        zzagv zzagv0;
        long v9;
        int v = this.zzc;
        switch(v) {
            case 0: {
                this.zza.zzI(2);
                zzaco0.zzi(this.zza.zzN(), 0, 2);
                int v1 = this.zza.zzq();
                this.zzd = v1;
                if(v1 == 0xFFDA) {
                    if(this.zzf != -1L) {
                        this.zzc = 4;
                        return 0;
                    }
                    this.zzg();
                    return 0;
                }
                if((v1 < 0xFFD0 || v1 > 0xFFD9) && v1 != 0xFF01) {
                    this.zzc = 1;
                    return 0;
                }
                return 0;
            }
            case 1: {
                this.zza.zzI(2);
                zzaco0.zzi(this.zza.zzN(), 0, 2);
                this.zze = this.zza.zzq() - 2;
                this.zzc = 2;
                return 0;
            }
            case 2: {
                if(this.zzd == 0xFFE1) {
                    zzdy zzdy0 = new zzdy(this.zze);
                    zzaco0.zzi(zzdy0.zzN(), 0, this.zze);
                    if(this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzdy0.zzy('\u0000'))) {
                        String s = zzdy0.zzy('\u0000');
                        if(s != null) {
                            long v2 = zzaco0.zzd();
                            if(v2 == -1L) {
                                zzagv0 = null;
                            }
                            else {
                                zzafd zzafd0 = zzafh.zza(s);
                                if(zzafd0 == null || zzafd0.zzb.size() < 2) {
                                    zzagv0 = null;
                                }
                                else {
                                    int v3 = zzafd0.zzb.size() - 1;
                                    long v4 = -1L;
                                    long v5 = -1L;
                                    long v6 = -1L;
                                    long v7 = -1L;
                                    boolean z = false;
                                    while(v3 >= 0) {
                                        zzafc zzafc0 = (zzafc)zzafd0.zzb.get(v3);
                                        int v8 = "video/mp4".equals(zzafc0.zza) | z;
                                        if(v3 == 0) {
                                            v2 -= zzafc0.zzc;
                                            v9 = 0L;
                                        }
                                        else {
                                            v9 = v2 - zzafc0.zzb;
                                        }
                                        long v10 = v2;
                                        v2 = v9;
                                        long v11 = v10;
                                        if(v8 == 0 || v2 == v11) {
                                            z = v8;
                                        }
                                        else {
                                            v7 = v11 - v2;
                                            v6 = v2;
                                            z = false;
                                        }
                                        if(v3 == 0) {
                                            v5 = v11;
                                        }
                                        if(v3 == 0) {
                                            v4 = v2;
                                        }
                                        --v3;
                                    }
                                    zzagv0 = v6 == -1L || v7 == -1L || v4 == -1L || v5 == -1L ? null : new zzagv(v4, v5, zzafd0.zza, v6, v7);
                                }
                            }
                            this.zzg = zzagv0;
                            if(zzagv0 != null) {
                                this.zzf = zzagv0.zzd;
                            }
                        }
                    }
                }
                else {
                    zzaco0.zzk(this.zze);
                }
                this.zzc = 0;
                return 0;
            }
            case 4: {
                long v12 = zzaco0.zzf();
                long v13 = this.zzf;
                if(v12 == v13) {
                    if(!zzaco0.zzm(this.zza.zzN(), 0, 1, true)) {
                        this.zzg();
                        return 0;
                    }
                    zzaco0.zzj();
                    if(this.zzj == null) {
                        this.zzj = new zzaiv(zzakd.zza, 8);
                    }
                    zzafe zzafe0 = new zzafe(zzaco0, this.zzf);
                    this.zzi = zzafe0;
                    if(this.zzj.zzi(zzafe0)) {
                        zzaiv zzaiv0 = this.zzj;
                        long v14 = this.zzf;
                        zzacq zzacq0 = this.zzb;
                        zzacq0.getClass();
                        zzaiv0.zze(new zzafg(v14, zzacq0));
                        zzagv zzagv1 = this.zzg;
                        zzagv1.getClass();
                        zzacq zzacq1 = this.zzb;
                        zzacq1.getClass();
                        zzadt zzadt0 = zzacq1.zzw(0x400, 4);
                        zzz zzz0 = new zzz();
                        zzz0.zzC("image/jpeg");
                        zzz0.zzT(new zzay(0x8000000000000001L, new zzax[]{zzagv1}));
                        zzadt0.zzm(zzz0.zzag());
                        this.zzc = 5;
                        return 0;
                    }
                    this.zzg();
                    return 0;
                }
                zzadj0.zza = v13;
                return 1;
            }
            case 5: {
                if(this.zzi == null || zzaco0 != this.zzh) {
                    this.zzh = zzaco0;
                    this.zzi = new zzafe(zzaco0, this.zzf);
                }
                zzaiv zzaiv1 = this.zzj;
                zzaiv1.getClass();
                int v15 = zzaiv1.zzb(this.zzi, zzadj0);
                if(v15 == 1) {
                    zzadj0.zza += this.zzf;
                }
                return v15;
            }
            default: {
                if(v != 6) {
                    throw new IllegalStateException();
                }
                return -1;
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
        this.zzb = zzacq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        if(v == 0L) {
            this.zzc = 0;
            this.zzj = null;
            return;
        }
        if(this.zzc == 5) {
            zzaiv zzaiv0 = this.zzj;
            zzaiv0.getClass();
            zzaiv0.zzf(v, v1);
        }
    }

    private final void zzg() {
        zzacq zzacq0 = this.zzb;
        zzacq0.getClass();
        zzacq0.zzD();
        this.zzb.zzO(new zzadl(0x8000000000000001L, 0L));
        this.zzc = 6;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        if(this.zza(zzaco0) != 0xFFD8) {
            return false;
        }
        int v = this.zza(zzaco0);
        this.zzd = v;
        if(v == 0xFFE0) {
            this.zza.zzI(2);
            ((zzacc)zzaco0).zzm(this.zza.zzN(), 0, 2, false);
            ((zzacc)zzaco0).zzl(this.zza.zzq() - 2, false);
            v = this.zza(zzaco0);
            this.zzd = v;
        }
        if(v == 0xFFE1) {
            ((zzacc)zzaco0).zzl(2, false);
            this.zza.zzI(6);
            ((zzacc)zzaco0).zzm(this.zza.zzN(), 0, 6, false);
            return this.zza.zzu() == 1165519206L && this.zza.zzq() == 0;
        }
        return false;
    }
}

