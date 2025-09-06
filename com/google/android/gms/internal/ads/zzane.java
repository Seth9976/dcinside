package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzane implements zzabx {
    private final zzef zza;
    private final zzdy zzb;

    zzane(zzef zzef0, zzanf zzanf0) {
        this.zza = zzef0;
        this.zzb = new zzdy();
    }

    @Override  // com.google.android.gms.internal.ads.zzabx
    public final zzabw zza(zzaco zzaco0, long v) throws IOException {
        long v1 = zzaco0.zzf();
        int v2 = (int)Math.min(20000L, zzaco0.zzd() - v1);
        this.zzb.zzI(v2);
        zzaco0.zzh(this.zzb.zzN(), 0, v2);
        int v3 = -1;
        long v4 = 0x8000000000000001L;
        int v5 = -1;
        while(true) {
            zzdy zzdy0 = this.zzb;
            if(zzdy0.zzb() < 4) {
                break;
            }
            if(zzang.zzh(zzdy0.zzN(), zzdy0.zzd()) == 442) {
                zzdy0.zzM(4);
                long v6 = zzanh.zzc(zzdy0);
                if(v6 != 0x8000000000000001L) {
                    long v7 = this.zza.zzb(v6);
                    if(v7 > v) {
                        return v4 == 0x8000000000000001L ? zzabw.zzd(v7, v1) : zzabw.zze(v1 + ((long)v5));
                    }
                    if(v7 + 100000L > v) {
                        return zzabw.zze(v1 + ((long)zzdy0.zzd()));
                    }
                    v5 = zzdy0.zzd();
                    v4 = v7;
                }
                int v8 = zzdy0.zze();
                if(zzdy0.zzb() < 10) {
                    zzdy0.zzL(v8);
                }
                else {
                    zzdy0.zzM(9);
                    int v9 = zzdy0.zzm() & 7;
                    if(zzdy0.zzb() < v9) {
                        zzdy0.zzL(v8);
                    }
                    else {
                        zzdy0.zzM(v9);
                        if(zzdy0.zzb() < 4) {
                            zzdy0.zzL(v8);
                        }
                        else {
                            if(zzang.zzh(zzdy0.zzN(), zzdy0.zzd()) == 443) {
                                zzdy0.zzM(4);
                                int v10 = zzdy0.zzq();
                                if(zzdy0.zzb() < v10) {
                                    zzdy0.zzL(v8);
                                    goto label_51;
                                }
                                else {
                                    zzdy0.zzM(v10);
                                }
                            }
                            while(zzdy0.zzb() >= 4) {
                                int v11 = zzang.zzh(zzdy0.zzN(), zzdy0.zzd());
                                if(v11 == 442 || v11 == 441 || v11 >>> 8 != 1) {
                                    break;
                                }
                                zzdy0.zzM(4);
                                if(zzdy0.zzb() < 2) {
                                    zzdy0.zzL(v8);
                                    break;
                                }
                                zzdy0.zzL(Math.min(zzdy0.zze(), zzdy0.zzd() + zzdy0.zzq()));
                            }
                        }
                    }
                }
            label_51:
                v3 = zzdy0.zzd();
            }
            else {
                zzdy0.zzM(1);
            }
        }
        return v4 == 0x8000000000000001L ? zzabw.zza : zzabw.zzf(v4, v1 + ((long)v3));
    }

    @Override  // com.google.android.gms.internal.ads.zzabx
    public final void zzb() {
        this.zzb.zzJ(zzei.zzf, 0);
    }
}

